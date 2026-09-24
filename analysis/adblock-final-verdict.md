# Adblock final verdict (external, no-root, no-patch)

Static synthesis closing the `analysis/` Skip-Ad trail for the specific question: **what can an external companion app do about Spotify ads through public Android APIs?** No runtime patching, no bypass behavior; provenance documentation only.

## 1. Externally verified surface

### 1a. Ad detection via MediaSession — CONFIRMED, already implemented

`decompiled/sources/p204p/er3.java:436`:

```java
zb70Var.m95831q(rsd0Var.f202312u ? 1L : 0L, "android.media.metadata.ADVERTISEMENT");
```

plus `spotify:ad:` media ID/URI fallback. The muter consumes exactly this via `MediaController.getMetadata()` (`AdDetector.java`, `SpotifySessionService.java`). This path is stable because it uses Spotify's own exported playback state, not UI text, and works background/screen-off.

### 1b. Playback actions — ordinary next only, no Skip-Ad export

`analysis/smali-targets/pqd0.smali`:

- `4649: const-wide/16 v3, 0x20` (`pswitch_6`), with the packed-switch at `5551-5564` mapping internal commands **8 and 9 to `0x20` = `ACTION_SKIP_TO_NEXT`**.
- `10811 onSkipToNext()`: checks `pdp0.W(9)` (has command 9), then dispatches internal command 9 or falls back to 8 via `xpd0` handlers. There is no third branch. An external `MediaController.TransportControls.skipToNext()` can therefore only ever reach internal **8/9**.
- `9117 onCustomAction()`: handles `SESSION_COMMAND_MEDIA3_PLAY_REQUEST` plus `bcf`-defined `PLAYER_COMMAND_*` / `SESSION_COMMAND_*` commands (`bcf.java:344` prefix check, `bcf.m28701d`). There is **no `"skip-ad"` branch** in `pqd0`.
- No `skip-ad` string occurs anywhere in `pqd0.smali`.

### 1c. Skip-Ad readiness is in-process only

`analysis/smali-targets/p4h1.smali:2980-3000`:

```text
EsContextPlayerState.getSignalsCount()/getSignalsList()
  -> PlayerState.Builder.signals(...)
```

The `"skip-ad"` readiness string lives in `PlayerState.signals()` and is consumed in-process (`g511`: `signals.contains("skip-ad")` -> `jk21` UI state). It is **not** copied into `PlaybackStateCompat` actions, extras, or custom actions in `pqd0.b()`. So an external `MediaController` has no public signal for "Skip Ad is ready".

### 1d. Skip-Ad execution is `ContextPlayer/Signal`, not MediaSession

Decompiled `SignalCommand.create("skip-ad")` (`SignalCommand.java`) dispatches through `b8p0 -> p8p0(hrw) -> zqw` to Esperanto `ContextPlayer / Signal` with `EsSignalRequest(signal_id="skip-ad")`. Ordinary next goes to `ContextPlayer / SkipNext`. The native side (`docs/15-skip-ad-signal.md` §3) confirms two distinct paths:

- availability: `fd381a` exposes `"skip-ad"` when `state+0x40 / +0x140` returns zero;
- execution: native `"skip-ad"` discriminator -> secondary dispatcher -> dependency `0x1868200:+0x68 = 0x1371d90` (`smartSkipEmbeddedPodcastAd` seek-to-`end_ms` + `"smart-skip-embedded-podcast-ad"` report).

Neither endpoint is reachable from `MediaSessionCompat.Callback` (`onSkipToNext` / `onCustomAction`).

## 2. Stale heuristic correction

`docs/14-deep-trace-ad-events-media-skip.md` §13 proposed:

```text
ad detected -> ACTION_SKIP_TO_NEXT present? yes -> skipToNext(), no -> mute
```

This is **rejected for timed Skip Ad** and must not be implemented as an adblock strategy:

1. During ads the ordinary skip-next path stays gated by `ad_disallow` in `disallowSkippingNextReasons` (native builder `0x10a6464..0x10a7f52`, writes at `0x10a6898`/`0x10a74ae`). That branch tests nested-optional presence (`restrictionOwner+0x598`/`+0x470`), **not** the delay-expiry byte `adObject+0x1b8`. The `+0x1b8=1` transition makes the derived `+0xd0` predicate true and rebuilds state, but does not clear `ad_disallow` from the skip-next set.
2. Skip capability is instead exported through the signals list (`fd381a` -> `"skip-ad"`), which has no `PlaybackStateCompat` action-bit equivalent.
3. Therefore `ACTION_SKIP_TO_NEXT` (`0x20`) is expected to **remain absent even when the in-app Skip Ad button becomes enabled**. Polling the action mask cannot detect Skip-Ad readiness, and calling `skipToNext()` cannot invoke the `Signal("skip-ad")` path — it hits the still-restricted 8/9 path and yields `SKIP_TO_NEXT_RESTRICTED` (`ad_disallow`).
4. An opportunistic "call `skipToNext()` whenever `0x20` happens to be present during an ad" would at best be useless (the bit is absent during ads) and at worst skip real user content if the ad flag flaps mid-transition. It is not a Skip-Ad implementation.

## 3. Native open-thread disposition (why they do not block adblock)

`analysis/final-readiness-provenance-summary.md` lists as still open:

```text
Bind concrete object/AP at owner+0x480.
Bind r14 vtable +0xa0/+0xa8 implementations.
Trace owner+0x480 writers; keep [r13+0x410].vtable+0x28 as side-effect/gate.
Trace where the e99c54 package is invoked / what reaches e99c54.
```

Status after v14–v18 (no change to the external verdict):

- **Closed (and stays closed):** `af2eb8` is a shared-pointer copy helper (`af2eb8: [dst+0x00]=[src+0x00]`, `[dst+0x08]=[src+0x08]` + `lock inc`, `[dst+0x10]/[dst+0x18]` copies); `[rsp+0x390]/[rsp+0x398]` source is `owner+0x480` (`e92f64`/`e92f6b`/`e92f73`). `17da794`/`17da802` package layout/cleanup, `aab330` weak/shared lock+copier role, `e99c54` as packaged callback (not a direct AP relocation), `0x184d898` installed-object semantics, `0x184d5d0+0x150/+0x158` downstream dispatch — all confirmed in `restrictions-rsp390-lifecycle-v18.md`, `restrictions-af2eb8-receiver-copy-v18.md`, and predecessors.
- **Remaining but non-blocking for adblock:** the concrete AP at `owner+0x480`, the `r14 +0xa0/+0xa8` implementations, `owner+0x480` writers, and the final scalar `+0x140` discriminator identity. These live entirely inside Orbit's in-process Restrictions/setup object graph. Even a complete identification would only name another in-process vtable slot — it would not create a new public `MediaSession` action, custom action, or metadata field, because §1b/§1c prove no such export exists in `pqd0`. They remain valid pure-RE targets but are **out of scope for the external adblock decision**.
- Explicit non-goals carried forward: `0x18678f8:+0x140`, the `18365e0`/`183d258`/`183d3b0`/`183d470` variant tables, the `d85524->d8a488->d8a5c2` carrier, and raw-`0x6b0` aliases stay rejected for the final receiver (§5 of `docs/15-skip-ad-signal.md`); do not reopen them for adblock purposes.

## 4. Final verdict matrix

| Strategy (external app, public APIs) | Verdict | Reason |
|---|---|---|
| Detect ad via `ADVERTISEMENT` / `spotify:ad:` metadata | **Viable — keep** | Proven export (`er3.java:436`); already implemented |
| Mute `STREAM_MUSIC` during ad, restore after (~900 ms debounce) | **Viable — keep** | Only approach that follows Spotify state without patching; known limitation is global-stream muting |
| Auto-press Skip Ad via `skipToNext()` when ad is playing | **Not viable — do not implement** | Reaches only internal 8/9, still gated by `ad_disallow`; Skip Ad needs `Signal("skip-ad")` |
| Auto-press Skip Ad via `sendCustomAction("skip-ad", ...)` | **Not viable — do not implement** | No `skip-ad` handler in `pqd0.onCustomAction`; only media3/bcf commands |
| Detect Skip-Ad readiness via `PlaybackState.getActions()` bit `0x20` | **Not viable — do not implement** | Bit tracks 8/9, not the signals list; stays absent when Skip Ad becomes ready |
| Detect Skip-Ad readiness via `PlaybackState` extras/custom actions | **Not viable** | `pqd0.b()` never exports `PlayerState.signals()` there |
| In-process `SignalCommand("skip-ad")` / patched Orbit / LSPosed hook | **Out of scope for muter** | Would require in-process code, root/patch, account/ToS risk; contradicts muter's no-patch design |

## 5. What "finished" means here

- The external adblock question is **closed**: mute-on-`ADVERTISEMENT` is the correct and complete no-root/no-patch implementation for this build (9.1.84.2205). No public-API auto-skip exists to add.
- The deep native availability chain (`owner+0x428 -> e99d07 -> 0x1843bf8 carrier -> P(0x1832be8) -> P+0x40 -> fd381a +0x140`) and the Restrictions callback-package threads are valuable RE but **do not gate any muter behavior**; they are parked as informational.
- Future work that could reopen this verdict (all out of scope for the current muter): a new APK version that exports Skip-Ad as a `PlaybackStateCompat` custom action; a documented `Media3` session command mapping to `Signal`; or an explicit decision to abandon the no-patch constraint and drive `ContextPlayer/Signal` in-process.

Evidence index: `analysis/smali-targets/pqd0.smali` (actions mapping, `onSkipToNext`, `onCustomAction`), `analysis/smali-targets/p4h1.smali` (signals export), `decompiled/sources/p204p/er3.java:436`, `decompiled/sources/com/spotify/player/model/command/SignalCommand.java`, `decompiled/sources/p204p/bcf.java`, `docs/15-skip-ad-signal.md`, `analysis/final-readiness-provenance-summary.md`, `analysis/restrictions-rsp390-lifecycle-v18.md`, `analysis/restrictions-af2eb8-receiver-copy-v18.md`.
