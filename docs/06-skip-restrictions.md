# Ad skipping and playback restrictions

## Ad-specific skip metadata

`ContextTrack.Metadata` defines:

```text
KEY_IS_AD_SKIPPABLE   = "ad.is_skippable"
KEY_SKIPPABLE_AD_DELAY = "ad.skippable_ad_delay"
```

Source:

`decompiled/sources/com/spotify/player/model/ContextTrack.java`

The delay is consumed by reconstructed code in:

`decompiled/sources/p204p/sc11.java`

The value is parsed and converted to milliseconds.

This confirms Spotify explicitly models ads that become skippable after a delay.

## Generic player restriction model

Independent of those ad metadata fields, the player exposes:

`Restrictions.disallowSkippingNextReasons()`

A next-skip is considered allowed by many client code paths when that set is empty.

## Command object

The actual generic command model is:

`com.spotify.player.model.command.SkipToNextTrackCommand`

Representative call sites:

- `p204p/wx7.java`
- `p204p/l8k.java`
- `p204p/i2v.java`

## Representative guarded skip

`p204p/l8k.java` checks current player state and:

```java
playerState.restrictions()
    .disallowSkippingNextReasons()
    .isEmpty()
```

before dispatching a `SkipToNextTrackCommand`.

This establishes at least one enforcement layer above the player command.

## MediaSession skip

Spotify also accepts Android media-button / MediaSession "next" actions through its Android integration.

An external app can call:

```text
MediaController.TransportControls.skipToNext()
```

but that does not imply unrestricted ad skipping. Spotify controls which actions are exported and the player can reject/disallow the resulting operation.

## Practical skip strategy for spotify-muter

A low-risk extension would be:

```text
ad detected
   |
   v
is ACTION_SKIP_TO_NEXT currently exposed?
   |
   +-- yes --> request skipToNext()
   |             |
   |             +--> if playback advances, done
   |
   +-- no  --> mute
```

This uses Spotify's own currently available control rather than bypassing its player restriction state.

## Why non-skippable ads are different

Changing only UI state would not necessarily be sufficient because:

1. `Restrictions` is part of `PlayerState`.
2. multiple command call sites consult restriction sets.
3. the command is then submitted to the player core.
4. deeper/native/server checks may still exist.

Therefore "make every ad skippable" is substantially more invasive and more version-dependent than the current MediaSession muter.

## Useful research targets

- where `ad.is_skippable` is populated
- relationship between `ad.skippable_ad_delay` and `Restrictions`
- MediaSession action mask generation
- command failure/error mapping for restricted skip
- whether Connect devices expose separate restrictions
