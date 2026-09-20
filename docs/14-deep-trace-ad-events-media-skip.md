# Deep trace: ad milestones, skip delay, and Android skip-next

This document records the bytecode-level trace performed after the first documentation pass. It focuses on three questions:

1. What exact ad milestone/event strings exist?
2. How does Spotify decide whether Android receives `ACTION_SKIP_TO_NEXT`?
3. Does `ad.skippable_ad_delay` directly change `PlayerState.restrictions`?

## Sources used

JADX sources:

- `decompiled/sources/p204p/qm0.java`
- `decompiled/sources/p204p/fh0.java`
- `decompiled/sources/p204p/om0.java`
- `decompiled/sources/p204p/sc11.java`
- `decompiled/sources/p204p/xpd0.java`
- `decompiled/sources/p204p/ox8.java`
- `decompiled/sources/p204p/b7p0.java`
- `decompiled/sources/p204p/pdp0.java`
- `decompiled/sources/com/spotify/player/model/Restrictions.java`
- `decompiled/sources/com/spotify/player/esperanto/proto/EsRestrictions$Restrictions.java`
- `decompiled/sources/com/spotify/player/esperanto/proto/EsContextPlayerState$ContextPlayerState.java`

Smali extracted directly from the APK because JADX failed to reconstruct key methods:

- `analysis/smali-targets/pqd0.smali`
- `analysis/smali-targets/fzg1.smali`
- `analysis/smali-targets/sc11.smali`
- `analysis/smali-targets/be11.smali`
- `analysis/smali-targets/xrefs.txt`

The extraction workflow is:

`.github/workflows/extract-target-smali.yml`

## 1. Exact ad event family

`qm0` is the event enum.

Important playback/lifecycle entries:

```text
STARTED          -> started
FIRST_QUARTILE   -> first_quartile
MIDPOINT         -> midpoint
THIRD_QUARTILE   -> third_quartile
ENDED            -> ended
SKIPPED          -> skipped
PAUSED           -> paused
RESUMED          -> resumed
MUTED            -> muted
UNMUTED          -> unmuted
PROGRESS         -> progress
ERROR            -> errored
IMPRESSION       -> viewed
```

Spotify also models display/viewability state separately:

```text
CONTINUOUS_VIEWABILITY    -> viewability
NONCONTINUOUS_VIEWABILITY -> video_viewed
VIEWABILITY_0             -> visible_0
VIEWABILITY_GREATER_THAN_0-> visible_gt_0
VIEWABILITY_50            -> visible_50
VIEWABILITY_50_LESS       -> visible_50_less
VIEWABILITY_100           -> visible_100
```

This means "ad viewed", "audio ad ended", and "50% visible" are different event concepts.

## 2. Per-ad milestone deduplication

`fh0.f69487b1` contains:

```text
STARTED
FIRST_QUARTILE
MIDPOINT
THIRD_QUARTILE
ENDED
UNLOADED
NONCONTINUOUS_VIEWABILITY
CONTINUOUS_VIEWABILITY
IMPRESSION
```

Each ad instance copies that set into a synchronized mutable set.

`om0.m67312b(...)` behaves approximately as:

```text
if event is not a one-shot milestone:
    emit(event)
else if pendingMilestones.remove(event):
    emit(event)
else:
    suppress duplicate
```

Therefore the client has explicit per-ad protection against repeated milestone/impression emission.

## 3. Countdown metadata is not the permission bit

The current track may contain:

`ad.skippable_ad_delay`

### Flow reader

`sc11`, selector 27:

```text
metadata["ad.skippable_ad_delay"]
        |
        v
parse integer
        |
        v
* 1000
        |
        v
emit Long milliseconds
```

This is a countdown/time representation.

### UI mapper

The stronger proof is:

`fzg1.e(PlayerState, Resources)`

Recovered from smali.

It performs two independent reads:

```text
skipAllowed =
    PlayerState
      .restrictions()
      .disallowSkippingNextReasons()
      .isEmpty()

delaySeconds =
    currentTrack
      .metadata()["ad.skippable_ad_delay"]
```

Then both values are passed to text-formatting methods.

`fzg1.f(...)` uses this priority:

```text
if skipAllowed:
    show skip-ready text
else if delay exists:
    show "skip after N seconds"
else if AdBreakContext exists:
    show ad-position/break text
else:
    show generic advertisement text
```

The resource bundle contains:

```text
ads_skip_delay_content_description
advertisement_subtext_skippable_delay
advertisement_text_skippable_delay
```

with English text such as:

```text
"%1$d seconds to skip ad, timer"
"Skip after %1$ds"
"Advertisement • Skip after %1$ds"
```

### Conclusion

No local Android-side dataflow was found:

```text
ad.skippable_ad_delay
        X
        |
        v
Restrictions mutation
```

Instead:

```text
delay metadata -----------------> countdown UI

player Restrictions ------------> actual permission
                                  |
                                  v
                          player command set
```

The Android layer never derives that restriction from the countdown. The restriction is supplied by the streamed ContextPlayer state, as traced below.

## 4. Restrictions are transported player state

`EsRestrictions$Restrictions` defines:

```text
DISALLOW_SKIPPING_NEXT_REASONS_FIELD_NUMBER = 7
```

`EsContextPlayerState$ContextPlayerState` carries:

```text
restrictions_
contextRestrictions_
```

The Cosmos model also understands:

`disallow_skipping_next_reasons`

So the permission state exists independently in the player protocol/domain model.

## 5. Exact ContextPlayer -> PlayerState restriction mapping

`decompiled/sources/p204p/lrw.java` subscribes to:

```text
spotify.player.esperanto.proto.ContextPlayer / GetState
```

The stream is converted to the public player model by `p4h1`.

Recovered smali gives the exact restriction path:

```text
EsContextPlayerState.N()
        |
        v
EsRestrictions$Restrictions
        |
        v
f5x0.a(...)
        |
        +-- x0() -> Set
        |           |
        |           v
        |    Restrictions.Builder
        |      .disallowSkippingNextReasons(...)
        |
        v
Restrictions
        |
        v
PlayerState.Builder.restrictions(...)
```

The context-level restrictions are mapped separately through the same `f5x0` converter.

This means a skip restriction becoming empty is observed as **new ContextPlayer state**, not as a Java/Kotlin UI timer mutating the existing `PlayerState`.

## 6. ContextPlayer restricted-skip errors

`lrw.java` independently streams:

```text
spotify.player.esperanto.proto.ContextPlayer / GetError
```

`g2h1.java` maps the protocol error to:

`ErrorType.SKIP_TO_NEXT_RESTRICTED`

Known reason strings distinguish:

```text
mft_disallow       -> free-tier / on-demand restriction
disallow-mft-radio -> free-tier / on-demand restriction
ad_disallow        -> action not allowed in current context
```

This provides a second enforcement signal from the player core in addition to the state restriction sets.

## 7. Native ownership clue

`analysis/smali-targets/native-string-scan.txt` scans every packaged native ABI.

`liborbit-jni-spotify.so` contains all of:

```text
ad.skippable_ad_delay
ad_disallow
mft_disallow
disallow_skipping_next_reasons
skip_to_next_restricted
SKIP_TO_NEXT_RESTRICTED
```

It also embeds the Connect/player/Esperanto restriction message descriptors.

Therefore the remaining countdown-to-restriction transition is localized below the Android domain mapper, in the Orbit/native player layer or state consumed by that layer.

The focused x86_64 report is:

`analysis/native-player-xrefs-fast.md`

It found:

| String | Direct executable xrefs |
|---|---:|
| `ad_disallow` | 11 |
| `mft_disallow` | 18 |
| `disallow_skipping_next_reasons` | 3 |
| `ad.skippable_ad_delay` | 0 |
| `SKIP_TO_NEXT_RESTRICTED` | 0 |
| `skip_to_next_restricted` | 0 |

The most useful result is that `ad_disallow` and `mft_disallow` are referenced directly by executable native code. They are not merely dead descriptor strings.

Their main xrefs cluster in the broad `0x10a6xxx` native region. In those neighborhoods Orbit constructs the reason strings and stores/passes them through nearby restriction/state objects.

`disallow_skipping_next_reasons` also has direct executable references, including schema/field-conversion-looking paths.

By contrast, `ad.skippable_ad_delay` has no simple direct xref. Because the key is demonstrably propagated into Android `ContextTrack` metadata, the most likely explanation is an indirect/generic metadata lookup rather than non-use.

The follow-up native reports resolve that function-level question.

`analysis/native-restriction-groups.md` places the main `mft_disallow` and `ad_disallow` xrefs in the same Orbit function:

```text
0x10a6464..0x10a7f52
```

That function also constructs reasons such as `already_paused`, `not_paused`, `not_playing_context`, `automix`, `audiobook_capping`, and `not_supported_by_content_type`. It is therefore a general native restriction-set builder.

`analysis/native-restriction-field-map.md` reveals the restriction layout: schema entries are separated by `0x18` bytes, with `disallow_skipping_next_reasons` at slot `base+0x90`. In the builder, the block begins at `r14+0x1410`, giving:

```text
r14+0x1488 = disallowSkippingPrevReasons
r14+0x14a0 = disallowSkippingNextReasons
r14+0x14b8 = repeat-context reasons
r14+0x14d0 = repeat-track reasons
r14+0x14e8 = shuffle reasons
r14+0x1500 = set-queue reasons
r14+0x1518 = add-to-queue reasons
```

The decisive writes are:

```text
0x10a6898: mft_disallow -> r14+0x14a0
0x10a74ae: ad_disallow  -> r14+0x14a0
```

Thus Orbit itself constructs both the MFT and advertisement reasons in the **skip-next restriction set**.

The advertisement branch at `0x10a7492..0x10a74d1` requires two bytes to be nonzero before inserting `ad_disallow` into skip-next:

```text
restrictionOwner+0x598
restrictionOwner+0x470
```

Those fields are now decoded as nested optional engagement bytes.

The restriction-owner constructor passes `owner+0x38` to the nested state initializer. From that coordinate system:

```text
owner+0x598 = state+0x560
             engagement byte for an outer optional

outer optional payload starts at owner+0x48
payload size = 0x550

owner+0x438 = payload+0x3f0
             inner optional value storage

owner+0x470 = payload+0x428
             inner optional engagement byte
```

The inner value begins with a shared-pointer-like pair. Its copy constructor copies `object*` plus a control-block pointer and increments the control-block refcount. Its reset/destructor path clears the engagement byte at `owner+0x470`.

So the skip-next condition is not:

```text
active_flag && ad_flag
```

but structurally:

```text
outer current-state payload exists
&& nested polymorphic object exists
```

### Exact nested-object vtable and delay interface

The nested object at `owner+0x438` is now tied to the same interface that exposes `ad.skippable_ad_delay`.

Orbit translates:

```text
ad.skippable_ad_delay
        |
        v
skippable_ad_delay
```

and the exact vtable address point `0x1879950` has:

```text
+0xc8 -> 0x14e2472  raw skippable metadata getter
+0xd0 -> 0x14e248a  derived skippable/timing predicate
+0xd8 -> 0x14e24b8  seekable metadata getter
+0xe0 -> 0x14e24d0  interruptible metadata getter
+0xe8 -> 0x14e24e8  skippable_ad_delay integer parser
```

The restriction builder loads `owner+0x438` and calls exactly `+0xd0`, `+0xd8`, and `+0xe0` through that object.

The derived `+0xd0` predicate is:

```text
if adObject[+0x1b8] != 0:
    return true
if skippable_ad_delay() > 0:
    return false
return raw_skippable()
```

The ContextPlayer event handler at `0x10a9668..0x10a969c` performs:

```text
if event[+0x38] == 6:
    if restrictionOwner[+0x598] != 0
       and restrictionOwner[+0x470] != 0
       and restrictionOwner[+0x438] != null:
        restrictionOwner[+0x438][+0x1b8] = 1

    rebuild restrictions
```

This proves that subtype `6` mutates the same polymorphic object whose `+0xd0` method incorporates the delay/skippability state.

Subtype `6` is now proven to be the countdown-expiry/readiness event.

Two independent native producers contain the literal string `"ad_skip"` and perform the same sequence:

```text
delay = adObject->vtable[+0xe8]()   // skippable_ad_delay
if delay > 0:
    event.name = "ad_skip"
    event.delay_ms = delay * 1000
    event.subtype = 6
    schedule via 0x139c09a
```

The concrete subtype stores are at `0x139ba71` and `0x139be38`.

Therefore the full local transition is:

```text
ad metadata
    |
    +-- skippable_ad_delay
            |
            v
      "ad_skip" scheduled timer
            |
            v
      subtype 6 callback
            |
            +-- adObject+0x1b8 = 1
            |
            v
      +0xd0 derived skippability => true
            |
            v
      rebuild restrictions
```

However, the ordinary skip-next `ad_disallow` branch still tests only the two optional-engagement bytes. It is not directly removed by the `+0x1b8` override. This is strong evidence that Spotify's user-facing **Skip Ad** operation is a separate command path from ordinary next-track / MediaSession skip-next.

The Android-side ad-specific command is now recovered from smali.

The Skip Ad action branch obtains the `p8p0` dependency stored in `jo20.c`, then executes:

```text
SignalCommand.create("skip-ad")
        |
        v
b8p0(SignalCommand)
        |
        v
p8p0.a(h8p0) -> Single
        |
        v
ignoreElement() -> Completable
```

The literal `"skip-ad"` is therefore the concrete player signal used by the UI. This is independent confirmation that user-facing Skip Ad does not route through ordinary `skipToNext`.

`jo20` is dependency-injected with:

```text
Flowable
Flowable
p8p0
```

and is part of the UI family that renders `skip_ad_title`. The XML `skip_ad_button_stub` is only replaced by Compose content in the now-playing layouts.

The command path is now resolved through the Esperanto boundary. `p8p0` is implemented here by `hrw`; the `b8p0` Signal variant dispatches through `zqw`, which builds/receives an `EsSignalRequest$SignalRequest` and calls:

```text
spotify.player.esperanto.proto.ContextPlayer / Signal
```

The ordinary next-track variant dispatches separately to `ContextPlayer / SkipNext`, confirming again that timed Skip Ad is not MediaSession skip-next.

The unresolved boundary has moved into Orbit/native handling:

> Which native handler consumes signal ID `skip-ad`, what state transition it performs, and how successful execution is reflected in `ad_skipped` state/telemetry?

Reports:

- `analysis/native-restriction-gate-optional.md`
- `analysis/native-restriction-payload-copy.md`
- `analysis/native-inner-ad-object-vtable.md`
- `analysis/native-delay-xrefs.md`
- `analysis/native-skippable-vtable.md`
- `analysis/native-ad-delay-link.md`
- `analysis/native-ad-runtime-vtable.md`

## 8. MediaSession PlaybackState builder recovered from smali

JADX did not emit a usable `pqd0.java`, but `pqd0.smali` contains:

```text
pqd0.b(pdp0) -> PlaybackStateCompat
```

The method obtains the active player command set and maps each internal command to Android action bits.

Relevant mapping:

| Internal command | Android action bits |
|---:|---:|
| 8 | `0x20` |
| 9 | `0x20` |

`0x20` is Android's `ACTION_SKIP_TO_NEXT`.

Other command IDs are mapped to other transport actions, but 8/9 are the critical pair for this investigation.

## 9. Platform export

The resulting bitmask is put into:

`PlaybackStateCompat.Builder.setActions(...)`

and then propagated to the platform playback state.

Therefore an external `MediaController` sees `ACTION_SKIP_TO_NEXT` only when Spotify's current player command set contains one of the next commands that maps to `0x20`.

## 10. What happens when Android invokes skip-next

`pqd0.onSkipToNext()` is also fully visible in smali.

Pseudo-code:

```text
if player.hasCommand(9):
    dispatch internal command 9
else:
    dispatch internal command 8
```

The callbacks resolve through `xpd0.java`:

```text
selector 8 -> pdp0.mo43884f0()
selector 9 -> pdp0.mo43854Q()
```

`ox8.java` shows both methods perform next-item/timeline transitions with slightly different semantics.

## 11. End-to-end skip capability

```text
deeper player state
      |
      v
Restrictions + available commands
      |
      +----------------------------------+
      |                                  |
      v                                  v
Spotify UI                         MediaSession adapter
      |                                  |
skip enabled?                           command 8/9?
      |                                  |
      v                                  v
button/state                      action mask |= 0x20
                                         |
                                         v
                              Android ACTION_SKIP_TO_NEXT
                                         |
                                         v
                              MediaController.skipToNext()
                                         |
                                         v
                              pqd0.onSkipToNext()
                                         |
                               +---------+---------+
                               |                   |
                             cmd 9               cmd 8
```

## 12. Likely time transition

The observed Android code supports this model:

```text
T = 0:
  ad.skippable_ad_delay = N
  disallowSkippingNextReasons = non-empty
  command 8/9 absent
  MediaSession skip-next absent
  UI shows countdown

T reaches the allowed point:
  deeper player state changes
  restrictions become empty
  command 8/9 becomes available

next PlayerState / command update:
  UI shows skip-ready state
  pqd0 maps command 8/9 -> 0x20
  MediaSession exposes ACTION_SKIP_TO_NEXT
```

The **timer-to-restriction transition itself is not in Android Java/Kotlin code**. A later `ContextPlayer.GetState` update carries the changed restriction into the app. Native string evidence places the relevant delay/restriction vocabulary in `liborbit-jni-spotify.so`.

## 13. Implication for the companion muter

A robust companion app does not need to recreate Spotify's countdown logic.

It can observe the current Android playback action mask:

```text
ad detected
      |
      v
ACTION_SKIP_TO_NEXT present?
      |
      +-- yes --> request native skip
      |
      +-- no  --> mute
```

That automatically follows Spotify's own current permission state and remains less brittle than hooking obfuscated internal classes.

## 14. Remaining questions

Most of the original trace is now resolved:

- exact ad event strings: **resolved**
- MediaSession skip action generation: **resolved**
- delay vs Restrictions relation through Android/Esperanto: **resolved**
- native `ad_disallow` insertion into skip-next: **resolved**
- restriction-owner identity: **resolved**
- meaning of `owner+0x598` and `owner+0x470`: **resolved structurally as outer/inner optional engagement bytes**
- identity of the nested interface at `owner+0x438`: **resolved to the vtable family containing skippable/seekable/interruptible/delay methods**
- restricted-skip error path: **resolved**
- ContextPlayer event subtype `6`: **resolved as the scheduled `ad_skip` readiness event**
- native `skippable_ad_delay` -> timer -> `+0x1b8` transition: **resolved**
- relationship between Skip Ad and ordinary skip-next: **resolved structurally as separate capability paths**
- actual ad-specific skip command/action: **resolved as `SignalCommand("skip-ad")` through `p8p0`**
- exact `p8p0` implementation / native signal endpoint: **open**
- `ad_skipped` completion/telemetry link: **open**

Next targets:

1. resolve `p8p0`, `b8p0`, and `h8p0`
2. trace `SignalCommand("skip-ad")` serialization and dispatch
3. identify the Orbit/ContextPlayer handler for the signal
4. link successful command execution to `ad_skipped`
5. map the equivalent path for Connect/remote playback
