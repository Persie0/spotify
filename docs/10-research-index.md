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

Native ownership is now resolved further: Orbit's restriction builder directly inserts `ad_disallow` into the internal slot mapped to `disallowSkippingNextReasons`.

Native gate layout is now resolved beyond the Android boundary: the two tested bytes are optional-engagement bytes, not standalone policy flags. The remaining question is the lifecycle transition that removes/replaces the nested ad/media-policy object (or otherwise stops the native `ad_disallow` branch) when skip becomes available.

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

The main `ad_disallow` and `mft_disallow` references are now grouped into the same Orbit function:

```text
0x10a6464..0x10a7f52
```

That function is a general restriction builder. Schema-field analysis establishes a `0x18` slot stride and maps its internal `r14+0x14a0` container to `disallow_skipping_next_reasons`.

Confirmed native writes:

```text
mft_disallow -> r14+0x14a0
ad_disallow  -> r14+0x14a0
```

The ad skip-next write is guarded by `r14+0x598` and `r14+0x470`.

The restriction-owner object is the `0x18b0`-byte object created by `0x10a578a..0x10a5d2d`, with primary vtable address point `0x184c738`. Its nested state begins at `owner+0x38`.

The gate layout is now structurally decoded:

```text
owner+0x598 = engagement byte of an outer optional
owner+0x48  = start of that optional's 0x550-byte payload

owner+0x438 = start of an inner optional value inside the payload
              first fields are shared_ptr-like {object*, control_block*}
owner+0x470 = engagement byte of that inner optional
```

Thus `+0x598 && +0x470` means **outer state exists and the nested polymorphic object exists**. It is not a pair of independent Boolean restriction flags.

The inner object is also now tied to the previously decoded ad metadata interface. ELF relocations at vtable address point `0x1879950` resolve:

```text
+0xc8 -> 0x14e2472  raw skippable getter
+0xd0 -> 0x14e248a  derived skippable/timing predicate
+0xd8 -> 0x14e24b8  seekable getter
+0xe0 -> 0x14e24d0  interruptible getter
+0xe8 -> 0x14e24e8  skippable_ad_delay parser
```

The restriction builder loads the pointer from `owner+0x438` and calls exactly `+0xd0/+0xd8/+0xe0`. Event subtype `6` at `0x10a9668` checks the two optional engagement bytes, sets `[owner+0x438]+0x1b8 = 1`, and rebuilds restrictions. The `+0xd0` predicate returns true immediately when `+0x1b8` is set; otherwise a positive `skippable_ad_delay` suppresses the predicate and zero/non-positive delay falls back to raw `skippable`.

Event subtype `6` is now semantically resolved. Two native producer paths contain the literal string `"ad_skip"`; both call the nested ad object's `+0xe8` `skippable_ad_delay` parser, require a positive delay, multiply it by 1000, write subtype `6`, and schedule the event through `0x139c09a`. The callback at `0x10a9668` then sets `adObject+0x1b8 = 1` and rebuilds restrictions.

This proves the local delay-expiry state machine:

```text
skippable_ad_delay > 0
    -> schedule "ad_skip" after delay*1000 ms
    -> subtype 6 fires
    -> adObject+0x1b8 = 1
    -> derived +0xd0 skippability becomes true
    -> restrictions rebuilt
```

It also proves an important separation: ordinary skip-next `ad_disallow` is still derived from nested-object presence and does not test `+0x1b8`. Spotify's timed **Skip Ad** capability is therefore distinct from ordinary next-track / MediaSession skip-next in this build.

Current target:

- trace the actual ad-specific skip command invoked after `ad_skip` readiness
- trace the Android UI click path from the skip-ad button into player/Esperanto/native code
- identify the native/ContextPlayer endpoint that records or executes an ad skip
- determine whether Connect uses the same ad-specific command or a remote equivalent

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
