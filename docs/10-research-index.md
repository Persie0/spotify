# Research index and open questions

This file tracks completed investigations and the next useful reverse-engineering targets.

## 1. Exact ad milestone event types — RESOLVED

Recovered from:

`decompiled/sources/p204p/qm0.java`

Confirmed lifecycle/wire names include:

```text
started
first_quartile
midpoint
third_quartile
ended
skipped
muted
unmuted
progress
viewed
video_viewed
viewability
visible_0
visible_gt_0
visible_50
visible_50_less
visible_100
errored
```

The complete 38-entry table is in:

[05-ad-reporting-tracking.md](05-ad-reporting-tracking.md)

Also resolved:

- `IMPRESSION -> "viewed"`
- normal completion-style event is `ENDED -> "ended"`
- one-shot milestone deduplication exists per registered ad
- progress/volume-style events can repeat

## 2. Relationship between ad delay and Restrictions — RESOLVED THROUGH ANDROID BOUNDARY

Confirmed:

`ad.skippable_ad_delay`

is read as countdown/presentation metadata.

`fzg1.e(PlayerState, Resources)` reads the delay and:

`Restrictions.disallowSkippingNextReasons().isEmpty()`

**separately** and combines them only when rendering ad status text.

No local Android Java/Kotlin path was found that mutates `Restrictions` from the delay value.

The restriction transport is now traced exactly:

```text
ContextPlayer.GetState
  -> EsContextPlayerState.N()
  -> f5x0.a(EsRestrictions)
  -> Restrictions.Builder.disallowSkippingNextReasons(...)
  -> PlayerState.Builder.restrictions(...)
```

The mapper reads `EsRestrictions$Restrictions.x0()` for the skip-next reasons.

No Android-side countdown mutation exists between the streamed protocol state and the public `PlayerState`.

Remaining question:

> Inside/below `liborbit-jni-spotify.so`, is countdown expiry computed locally, or does Orbit consume an already-updated restriction from another player/backend state source?

## 3. MediaSession ACTION_SKIP_TO_NEXT generation — RESOLVED

JADX could not reconstruct `pqd0.b(...)`, so the DEX was decoded to smali.

Stored under:

`analysis/smali-targets/pqd0.smali`

Confirmed:

```text
internal command 8 -> Android action 0x20
internal command 9 -> Android action 0x20
0x20 = ACTION_SKIP_TO_NEXT
```

`pqd0.onSkipToNext()` prefers internal command 9 and falls back to command 8.

See:

[06-skip-restrictions.md](06-skip-restrictions.md)

and:

[14-deep-trace-ad-events-media-skip.md](14-deep-trace-ad-events-media-skip.md)

## 4. Player command error handling — MOSTLY RESOLVED

`ContextPlayer.GetError` is streamed by `lrw.java`.

`g2h1.java` maps the protocol error enum into `ErrorType.SKIP_TO_NEXT_RESTRICTED`.

Known restriction reasons include:

- `mft_disallow` / `disallow-mft-radio` — free-tier/on-demand restriction
- `ad_disallow` — action not allowed in the current context

Remaining work is native function-level tracing of where those reasons are produced.

## 5. Native player / JNI boundary — ACTIVE

The Android boundary is now mapped:

```text
ContextPlayer.GetState
  -> EsContextPlayerState
  -> p4h1
  -> f5x0
  -> public PlayerState / Restrictions
```

The native scan identifies `liborbit-jni-spotify.so` as containing:

```text
ad.skippable_ad_delay
ad_disallow
disallow_skipping_next_reasons
SKIP_TO_NEXT_RESTRICTED
```

along with the player/Connect/Esperanto restriction descriptors.

Native xref status:

| String | Direct x86_64 code xrefs |
|---|---:|
| `ad_disallow` | 11 |
| `mft_disallow` | 18 |
| `disallow_skipping_next_reasons` | 3 |
| `ad.skippable_ad_delay` | 0 direct |

The first three results confirm executable Orbit code actively uses the restriction vocabulary. The delay key being present but lacking a direct reference is consistent with generic metadata lookup/descriptor indirection.

Most `ad_disallow` and `mft_disallow` references cluster in the broad `0x10a6xxx` region.

Current target:

- group the stripped native xrefs by real `.eh_frame` function ranges
- determine whether `ad_disallow` and `mft_disallow` are emitted by the same function/subsystem
- find the indirect consumer of `ad.skippable_ad_delay`
- distinguish a local native timer transition from a restriction update supplied by deeper/backend state

## 6. Connect-device behavior — OPEN

Questions:

- are ads represented with the same `ContextTrack` metadata during remote playback?
- does the phone export advertisement metadata when another device is the active renderer?
- are skip restrictions device-specific?
- does remote playback use the same Android command-set adapter?

## 7. Ad viewability vs audio completion — PARTIALLY RESOLVED

Known distinct events now include:

- `viewed`
- `video_viewed`
- `viewability`
- `visible_0`
- `visible_gt_0`
- `visible_50`
- `visible_50_less`
- `visible_100`
- `started`
- quartiles
- `ended`

Remaining work:

- map which event producer is used for audio-only ads
- identify placement-specific completion requirements
- separate display-ad viewability from audible playback milestones

## 8. Reporting authority / validation — OPEN

Need to determine:

- which RPC/event family is authoritative for billing
- whether the backend cross-checks events against player telemetry
- relationship between `postEvent`, `postUnmanagedEvent`, and `postEventV2`
- whether Connect reports independently

Documentation only; do not fabricate reporting events.

## 9. Ad caching and prefetch — OPEN

Potential anchors:

- ad-on-app-open feature flags
- cached-ad expiration
- preview/fetch RPCs
- media manifest IDs
- ad opportunity state APIs

## 10. App-wide architecture — ONGOING

Further documentation targets:

- authentication/session lifecycle
- offline/download state machine
- Connect/cast path
- library synchronization
- experiments/remote config
- analytics/logging stack
- search/home data flow

## 11. Decompilation quality improvements — ACTIVE

Implemented:

- targeted apktool/smali extraction for classes JADX fails to reconstruct
- stored bytecode targets under `analysis/smali-targets/`
- xref report for MediaSession/ad-skip tracing

Possible next improvements:

- secondary decompiler comparison
- automated semantic-string xref generation
- call graphs for selected domain anchors
- DEX/smali method-offset references in docs
- version-to-version diffing when a newer APK is added
