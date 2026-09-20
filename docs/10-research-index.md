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

## 2. Relationship between ad delay and Restrictions — MOSTLY RESOLVED

Confirmed:

`ad.skippable_ad_delay`

is read as countdown/presentation metadata.

`fzg1.e(PlayerState, Resources)` reads the delay and:

`Restrictions.disallowSkippingNextReasons().isEmpty()`

**separately** and combines them only when rendering ad status text.

No local Android Java/Kotlin path was found that mutates `Restrictions` from the delay value.

The player restriction is transported as real player state through player schemas such as:

`EsRestrictions$Restrictions`

Remaining question:

> Which deeper player/native/backend transition removes the skip restriction when the countdown expires?

This is now the main unresolved part of the delay investigation.

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

## 4. Player command error handling — OPEN

Goal:

Determine the exact error path when a next command is submitted but the deeper player rejects it.

Best anchors:

- `SkipToNextTrackCommand`
- `wx7.java`
- `l8k.java`
- player Esperanto command request/response
- player command result/error enums
- native player boundary

## 5. Native player / JNI boundary — HIGH PRIORITY

The remaining skip-timing question likely lives below the Android presentation layer.

Questions:

- where does the available-command set change?
- which restrictions originate in native player state?
- is the countdown expiry handled locally in native code or supplied by backend/player state?
- where is `EsContextPlayerState` converted into the Android `PlayerState` model?
- can a restriction change occur without a new remote response?

This is the most useful next investigation.

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
