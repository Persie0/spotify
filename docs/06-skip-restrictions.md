# Ad skipping and playback restrictions

Spotify models **skip timing**, **skip permission**, and **Android transport capability** as related but separate pieces of state.

## Ad-specific skip metadata

`ContextTrack.Metadata` defines:

```text
KEY_IS_AD_SKIPPABLE     = "ad.is_skippable"
KEY_SKIPPABLE_AD_DELAY  = "ad.skippable_ad_delay"
```

Source:

`decompiled/sources/com/spotify/player/model/ContextTrack.java`

An APK-wide search found active readers for `ad.skippable_ad_delay`, while `ad.is_skippable` survives primarily as a model key in this build.

## The delay is presentation/countdown data

`decompiled/sources/p204p/sc11.java`, synthetic case 27:

1. reads the current `ContextTrack`
2. reads `"ad.skippable_ad_delay"`
3. parses the numeric string
4. multiplies it by 1000
5. emits a millisecond value through a Flow path

So the metadata value is stored in seconds and exposed to UI/state consumers as milliseconds in that path.

A second, clearer consumer was recovered from smali:

`analysis/smali-targets/fzg1.smali`

Method:

```text
fzg1.e(PlayerState, Resources)
```

It independently reads:

```text
PlayerState.restrictions().disallowSkippingNextReasons().isEmpty()
```

and:

```text
ContextTrack.metadata()["ad.skippable_ad_delay"]
```

The method then builds the advertisement UI text.

The resources confirm the purpose of the numeric delay:

`resources/res/values/plurals.xml`

contains strings such as:

```text
"%1$d second to skip ad, timer"
"Skip after %1$ds"
"Advertisement • Skip after %1$ds"
```

## The restriction set is the current permission

The generic player exposes:

`Restrictions.disallowSkippingNextReasons()`

A next-skip is treated as allowed by many client paths when this set is empty.

Representative consumers:

- `p204p/l8k.java`
- `p204p/wej0.java`
- `p204p/pvn0.java`
- `p204p/di91.java`
- `p204p/td0.java`

For example, `l8k.java` only dispatches a `SkipToNextTrackCommand` when:

```java
playerState.restrictions()
    .disallowSkippingNextReasons()
    .isEmpty()
```

## Restrictions arrive as real player state

The Esperanto player schema contains:

`com.spotify.player.esperanto.proto.EsRestrictions$Restrictions`

with:

```text
DISALLOW_SKIPPING_NEXT_REASONS_FIELD_NUMBER = 7
```

and `EsContextPlayerState$ContextPlayerState` contains both:

```text
restrictions_
contextRestrictions_
```

as `EsRestrictions$Restrictions`.

The Cosmos model also serializes/deserializes:

`disallow_skipping_next_reasons`

This supports the conclusion that restrictions are transported player state, not a UI-only value derived from the countdown metadata.

## No local delay -> Restrictions mutation found

A full source/string search plus targeted smali extraction found **no Android Java/Kotlin path that takes `ad.skippable_ad_delay` and writes/removes entries in `Restrictions.disallowSkippingNextReasons`**.

Instead, the observed design is:

```text
ContextTrack metadata
  ad.skippable_ad_delay = N
        |
        +--> countdown / descriptive UI

PlayerState
  Restrictions.disallowSkippingNextReasons
        |
        +--> actual current permission
        +--> available player commands
        +--> MediaSession action mask
```

Strong inference:

A deeper player/native/backend layer updates `PlayerState.restrictions` when skipping actually becomes legal. The Android UI merely displays the delay and observes the new player state when it arrives.

That deeper transition remains the next unresolved layer.

## Exact MediaSession ACTION_SKIP_TO_NEXT generation

JADX failed to reconstruct the relevant `pqd0` method, so its DEX was decoded to smali and retained under:

`analysis/smali-targets/pqd0.smali`

Method:

```text
pqd0.b(pdp0) -> PlaybackStateCompat
```

This method reads Spotify/Media3's current command set and maps internal command IDs into Android `PlaybackStateCompat` action bits.

The important mapping is:

```text
internal command 8 -> 0x20
internal command 9 -> 0x20
```

Android action bit:

```text
0x20 = ACTION_SKIP_TO_NEXT
```

So Android only sees skip-next when one of those internal next commands is currently available.

## Exact onSkipToNext dispatch

The same smali class contains:

`pqd0.onSkipToNext()`

Its control flow is:

```text
onSkipToNext()
     |
     v
is internal command 9 available?
     |
     +-- YES --> dispatch command 9
     |
     +-- NO  --> dispatch command 8
```

The dispatch callbacks are reconstructed in:

`decompiled/sources/p204p/xpd0.java`

- selector 8 calls `pdp0.mo43884f0()`
- selector 9 calls `pdp0.mo43854Q()`

The underlying behavior in `p204p/ox8.java` shows that both are "next" operations with slightly different Media3/timeline semantics.

## Complete Android capability flow

```text
PlayerState / player core
        |
        v
available command set (b7p0)
        |
        +-- command 8?
        +-- command 9?
        |
        v
pqd0.b(...)
        |
        +-- map 8/9 -> 0x20
        |
        v
PlaybackStateCompat.setActions(...)
        |
        v
platform PlaybackState
        |
        v
MediaController sees ACTION_SKIP_TO_NEXT
        |
        v
TransportControls.skipToNext()
        |
        v
pqd0.onSkipToNext()
        |
        +-- prefer cmd 9
        +-- otherwise cmd 8
```

## Practical consequence for spotify-muter

The safest automatic-skip strategy remains:

```text
ad detected
   |
   v
ACTION_SKIP_TO_NEXT currently exposed?
   |
   +-- yes --> request skipToNext()
   |             |
   |             +--> if playback advances, done
   |
   +-- no  --> mute
```

This follows Spotify's actual exported capability instead of trying to override restrictions.

## Why forcing non-skippable ads is different

Changing countdown text or `ad.is_skippable` would not necessarily enable skipping because:

1. the delay is read for presentation
2. the authoritative state is `Restrictions`
3. the current player command set is derived from player capability/state
4. MediaSession only exports skip-next when command 8/9 exists
5. deeper player/native/backend validation can still reject operations

For the complete bytecode trace, see [14-deep-trace-ad-events-media-skip.md](14-deep-trace-ad-events-media-skip.md).
