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

A separate native xref report is being generated to narrow this from library-level ownership to function-level neighborhoods.

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

The three original research questions are now resolved except for one deeper transition:

- exact ad event strings: **resolved**
- MediaSession skip action generation: **resolved**
- delay vs Restrictions relation: **resolved through the Android/Esperanto mapping boundary**
- `EsContextPlayerState` -> domain `PlayerState`: **resolved**
- restricted-skip error path: **resolved through `ContextPlayer.GetError`**
- native library containing the relevant concepts: **resolved as `liborbit-jni-spotify.so`**
- exact native/backend mechanism that removes `ad_disallow` / skip-next restriction at expiry: **open**

Next targets:

1. native function-level xrefs inside `liborbit-jni-spotify.so`
2. determine local native timer vs deeper/backend-provided state
3. available-command-set synchronization with the ContextPlayer restriction update
4. Connect-device equivalent path
