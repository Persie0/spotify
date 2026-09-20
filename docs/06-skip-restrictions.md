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

Targeted smali extraction closes the conversion chain. In:

`analysis/smali-targets/f5x0.smali`

the protocol mapper calls:

```text
EsRestrictions$Restrictions.x0()
    -> Set
    -> Restrictions.Builder.disallowSkippingNextReasons(...)
```

The resulting `Restrictions` object is installed by:

`analysis/smali-targets/p4h1.smali`

through:

```text
EsContextPlayerState.N()
    -> f5x0.a(EsRestrictions)
    -> PlayerState.Builder.restrictions(...)
```

The same mapper separately converts context restrictions.

This confirms that the public skip restriction is transported player state, not a UI-only value derived from the countdown metadata.

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

The state source can now be traced one layer deeper.

`decompiled/sources/p204p/lrw.java` opens a streaming Esperanto call:

```text
spotify.player.esperanto.proto.ContextPlayer / GetState
```

and maps each streamed `EsContextPlayerState` through `p4h1` into the public `PlayerState`.

Therefore the Android/domain layer does **not** count down and edit the skip restriction itself. A changed `disallowSkippingNextReasons` set arrives in a later ContextPlayer state update.

The remaining uncertainty is below that boundary: whether the native player computes the expiry locally, or receives/derives an already-updated restriction from deeper player/backend state.

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

## Restricted-command error path

`lrw.java` also streams:

```text
spotify.player.esperanto.proto.ContextPlayer / GetError
```

`p204p/g2h1.java` maps the protocol error to `ErrorType.SKIP_TO_NEXT_RESTRICTED`.

Observed reason strings include two distinct concepts:

- `mft_disallow` / `disallow-mft-radio` — mapped to a free-tier/on-demand restriction
- `ad_disallow` — mapped to an action-not-allowed-in-context restriction

So the player core remains an enforcement layer even if a client attempts a next command.

## Native player boundary

The APK native-library scan is stored in:

`analysis/smali-targets/native-string-scan.txt`

Across the packaged ABIs, `liborbit-jni-spotify.so` contains all of the relevant semantic strings:

```text
ad.skippable_ad_delay
ad_disallow
mft_disallow
disallow_skipping_next_reasons
skip_to_next_restricted
SKIP_TO_NEXT_RESTRICTED
```

It also contains descriptors for Spotify's Connect/player/Esperanto `Restrictions` messages.

This strongly localizes the unresolved countdown-to-restriction transition to the Orbit/native player side (or state consumed there), rather than Android UI code.

### Native code xrefs

The focused x86_64 report is:

`analysis/native-player-xrefs-fast.md`

Direct native code references found:

| String | Direct xrefs |
|---|---:|
| `ad_disallow` | 11 |
| `mft_disallow` | 18 |
| `disallow_skipping_next_reasons` | 3 |
| `ad.skippable_ad_delay` | 0 direct |
| `SKIP_TO_NEXT_RESTRICTED` | 0 direct |
| `skip_to_next_restricted` | 0 direct |

The positive counts are important: `ad_disallow` and `mft_disallow` are not present only as protobuf/enum descriptors. Native executable code directly references and constructs those reason strings.

Most `ad_disallow` and `mft_disallow` xrefs cluster in the same broad `0x10a6xxx` Orbit code region, consistent with a related restriction-building subsystem.

A zero in this table does **not** mean a string is unused. `ad.skippable_ad_delay` is known to reach Android metadata, but the native binary can access it through a generic metadata map, generated descriptor table, hash lookup, or other indirection that a simple RIP-relative string-xref scan will not see.

So the evidence now supports:

```text
Orbit/native code actively builds restriction reasons
        |
        +--> ad_disallow
        +--> mft_disallow
        +--> disallow_skipping_next_reasons state
```

What is still not proven is a single native function that directly reads the delay key and removes `ad_disallow` when N seconds elapse.


### Native skip-next field mapping

The native trace now goes beyond string co-location.

`analysis/native-restriction-field-map.md` shows that Orbit registers the restriction fields in fixed `0x18`-byte slots. The relevant sequence is:

```text
base + 0x78 = disallow_skipping_prev_reasons
base + 0x90 = disallow_skipping_next_reasons
base + 0xa8 = disallow_toggling_repeat_context_reasons
base + 0xc0 = disallow_toggling_repeat_track_reasons
base + 0xd8 = disallow_toggling_shuffle_reasons
base + 0xf0 = disallow_set_queue_reasons
base + 0x108 = disallow_add_to_queue_reasons
```

The restriction-builder object uses the corresponding block beginning at `r14+0x1410`. Therefore:

```text
r14+0x1488 = skip-prev
r14+0x14a0 = skip-next
r14+0x14b8 = repeat-context
r14+0x14d0 = repeat-track
r14+0x14e8 = shuffle
r14+0x1500 = set-queue
r14+0x1518 = add-to-queue
```

`analysis/native-restriction-builder.md` then gives direct reason-to-container writes:

```text
0x10a6898: mft_disallow -> r14+0x14a0
0x10a74ae: ad_disallow  -> r14+0x14a0
```

So both the free-tier reason and the ad reason are proven to be inserted into **the native skip-next restriction set**.

The ad write is guarded by:

```text
[r14+0x598] != 0
[r14+0x470] != 0
```

Those are **not two independent Boolean policy flags**. The copied state layout is now decoded:

```text
restriction owner
  +0x38  nested state subobject
    |
    +-- outer optional
          payload starts at owner+0x48
          payload size = 0x550
          engagement byte = owner+0x598

          payload+0x3f0 = owner+0x438
              inner optional value storage
              begins with shared_ptr-like {object*, control_block*}

          payload+0x428 = owner+0x470
              inner optional engagement byte
```

The outer optional machinery is initialized and copied by the `0x1088fd0 / 0x1089f9e / 0x108daf0` state helpers. The inner optional's constructor/copy path increments the shared-pointer control-block refcount, and its destroy/reset path clears the engagement byte at `owner+0x470`.

So the skip-next branch is more accurately:

```text
outer current-state payload exists
AND nested polymorphic media/ad-policy object exists
        |
        v
insert ad_disallow into disallowSkippingNextReasons
```

This replaces the earlier interpretation of `+0x598` as a broad active-context Boolean and `+0x470` as an ad-specific Boolean.

The ownership chain is therefore:

```text
Orbit/native restriction builder
        |
        +-- current state optional engaged?      owner+0x598
        +-- nested object optional engaged?      owner+0x470
        +-- nested object pointer                owner+0x438
        |
        +-- inserts ad_disallow into skip-next set
        |
        v
EsRestrictions.disallow_skipping_next_reasons
        |
        v
ContextPlayer.GetState
        |
        v
Android PlayerState.restrictions
```

The remaining question is no longer what the two bytes are. It is **what lifecycle transition clears/replaces the inner object (or otherwise stops the skip-next ad branch) when skipping becomes permitted**.

### Native `skippable_ad_delay` predicate decoded

The indirect native consumer of the delay key is now resolved.

Orbit maps the external track key:

```text
ad.skippable_ad_delay
```

to the internal metadata key:

```text
skippable_ad_delay
```

The exact polymorphic interface used by the nested object at `owner+0x438` is reconstructed from ELF relocations. Its runtime vtable address point is:

```text
0x1879950
```

with the consecutive capability methods:

```text
+0xc8 -> 0x14e2472  raw "skippable" metadata getter
+0xd0 -> 0x14e248a  derived skippable/timing predicate
+0xd8 -> 0x14e24b8  "seekable" metadata getter
+0xe0 -> 0x14e24d0  "interruptible" metadata getter
+0xe8 -> 0x14e24e8  skippable_ad_delay integer parser
```

The delay parser first requires the raw `skippable` property, then reads `skippable_ad_delay` from the current ad metadata and parses it as an integer.

The derived predicate at `0x14e248a` is equivalent to:

```text
if object[+0x1b8] != 0:
    return true

if skippable_ad_delay() > 0:
    return false

return raw_skippable()
```

This is now tied to the restriction-owner layout directly. The nested optional at `owner+0x438` contains the polymorphic object on which the restriction builder invokes `+0xd0`, `+0xd8`, and `+0xe0`. Event subtype `6` at `0x10a9668` checks both optional engagement bytes, takes that same `owner+0x438` object, sets `object+0x1b8 = 1`, and rebuilds restrictions.

There is still one important boundary:

- skip-next `ad_disallow -> owner+0x14a0` is inserted from **presence of the outer and inner optionals**
- the later `+0xd0/+0xd8/+0xe0` capability calls govern other ad-restriction decisions
- therefore changing `object+0x1b8` changes the derived skippability method, but the skip-next branch does not directly test that return value

The native timing transition is now resolved further. Event subtype `6` is constructed by two independent Orbit paths that both contain the literal string `"ad_skip"`. Each producer:

```text
delay = adObject->vtable[+0xe8]()   // skippable_ad_delay
if delay > 0:
    event.name = "ad_skip"
    event.delay_ms = delay * 1000
    event.subtype = 6
    schedule(event)
```

The concrete producer sites are `0x139ba71` and `0x139be38`; both schedule through `0x139c09a`.

When subtype `6` reaches the restriction owner, `0x10a9668` sets `adObject+0x1b8 = 1` and rebuilds restrictions. This proves that the `+0x1b8` override is the local state transition produced by expiry of `skippable_ad_delay`.

A crucial distinction follows: the ordinary skip-next branch still inserts `ad_disallow` from **outer/inner optional presence** and does not test `+0x1b8` or the `+0xd0` result. Therefore the timed Spotify **Skip Ad** capability is separate from ordinary next-track / MediaSession skip-next in this build.

The ad-specific UI command is now recovered from APK smali. The Skip Ad branch creates:

```text
SignalCommand.create("skip-ad")
        |
        v
new b8p0(signalCommand)
        |
        v
p8p0.a(h8p0) -> Single
        |
        v
ignoreElement() -> Completable
```

The decisive bytecode is in `la01.smali`: a `jo20` UI/presenter object yields its injected `p8p0` player-command dependency, then the literal signal `"skip-ad"` is sent through that API.

`jo20` itself is constructed with two playback-state `Flowable` inputs plus the same `p8p0` command API. The legacy `skip_ad_button_stub` resource is only a host that is replaced by Compose content; the actual command is the player signal above.

The Android readiness gate is now recovered exactly. `p4h1.smali` copies `EsContextPlayerState.getSignalsList()` directly into `PlayerState.Builder.signals(...)`. In the Skip Ad reducer, `g511.smali` then evaluates:

```text
PlayerState.signals().contains("skip-ad")
```

and passes that Boolean directly into the `jk21` Skip Ad UI model.

So the confirmed architecture is:

```text
skippable_ad_delay
    -> native "ad_skip" timer
    -> subtype 6
    -> adObject+0x1b8 = 1
    -> native player state recomputed
    -> EsContextPlayerState.signals includes "skip-ad"
    -> p4h1 copies signals into PlayerState.signals()
    -> Skip Ad UI tests signals.contains("skip-ad")
    -> SignalCommand("skip-ad")
    -> ContextPlayer / Signal
```

This is separate from ordinary MediaSession/next-track skipping, which remains governed by `disallowSkippingNextReasons` and the next-command set.

The command facade is now resolved one layer further. `hrw` is the concrete `p8p0` implementation, `b8p0` selects its `zqw` Signal branch, and `zqw` sends an `EsSignalRequest$SignalRequest` through `ClientBase.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Signal", request)`. Ordinary next-track uses a different `ContextPlayer/SkipNext` branch. The remaining question is below the Esperanto boundary: **where Orbit consumes signal ID `skip-ad`, how it performs the ad transition, and how successful execution becomes the later `ad_skipped` state/telemetry.**

Evidence:

- `analysis/native-restriction-gate-optional.md`
- `analysis/native-restriction-payload-copy.md`
- `analysis/native-inner-ad-object-vtable.md`
- `analysis/native-delay-xrefs.md`
- `analysis/native-skippable-vtable.md`
- `analysis/native-ad-runtime-vtable.md`

## Practical consequence for spotify-muter

The previous MediaSession-only strategy is incomplete for timed ads. Spotify's own **Skip Ad** button is enabled by `PlayerState.signals().contains("skip-ad")`, while Android `ACTION_SKIP_TO_NEXT` belongs to the separate ordinary-next path.

For an Accessibility-based companion, the robust external strategy is therefore:

```text
ad detected
   |
   +-- actionable Spotify "Skip Ad" accessibility node visible?
   |       |
   |       +-- yes -> perform the normal UI click
   |
   +-- otherwise -> mute while the ad remains active
```

A normal external `MediaController` cannot invoke `ContextPlayer/Signal("skip-ad")` merely because the Skip Ad signal became available. `skipToNext()` should only be treated as the ordinary next-track command when Spotify actually exports that MediaSession action.

## Why forcing non-skippable ads is different

Changing countdown text or `ad.is_skippable` would not necessarily enable skipping because:

1. the delay is read for presentation
2. the authoritative state is `Restrictions`
3. the current player command set is derived from player capability/state
4. MediaSession only exports skip-next when command 8/9 exists
5. deeper player/native/backend validation can still reject operations

For the complete bytecode trace, see [14-deep-trace-ad-events-media-skip.md](14-deep-trace-ad-events-media-skip.md).
