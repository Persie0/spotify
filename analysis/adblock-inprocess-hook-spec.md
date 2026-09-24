# Adblock way #2: in-process auto-skip (root/LSPosed) — buildable spec

The external (no-root) ceiling is mute-only (`analysis/adblock-final-verdict.md`).
A TRUE skip (ad gone, music resumes immediately) is possible only in-process,
driving the exact RPC the Skip Ad button drives. This file specifies the minimal
hook surface, all points verified in this repo's decompiled sources/smali for
build 9.1.84.2205. Defensive documentation; implementing it needs a rooted
device or LSPosed + the user's own Spotify session.

## 1. What the button does (copy this exactly)

Decompiled precedent, twice with different signal IDs:

```java
// urt0.java:93 — reshuffle button:
((hrw) z080Var.f278013d).mo48412a(new b8p0(SignalCommand.create("reshuffle"))).ignoreElement();
// dw3.java:139 — chapter button:
((c0y) this.f53593a).f32913j.mo48412a(h8p0.m46841i(SignalCommand.create("switch-to-full-episode")))
```

Auto-skip is the same call with `"skip-ad"`:

```java
p8p0 playerCommands = /* captured hrw instance */;
playerCommands.mo48412a(new b8p0(SignalCommand.create("skip-ad")))
    .ignoreElement()
    .subscribe();   // or block for completion
```

DEX-grounded signatures (verified by direct DEX parse of this APK, 2026-09-25):

```text
classes9.dex  Lp/b8p0;  super=Lp/h8p0;  <init>(Ljava/lang/Object;)V  // arg = SignalCommand
              methods a/b = 12-arg visitor dispatch (brw..zqw family)
classes9.dex  Lp/h8p0;  method i(Ljava/lang/Object;)Lp/b8p0;  // == h8p0.m46841i(cmd)
classes9.dex  Lp/zqw;   implements Function  // Signal-variant visitor in hrw dispatch
classes2.dex  Lp/c0y;   methods b..j(...)Single  // p8p0 holder (cf. dw3 f32913j)
classes2.dex  Lp/jo20;  (Skip Ad UI host, dut/mzd1)
classes10.dex Lp/g511;  super=Lp/qe70;  invoke(...)  // signals.contains reducer
```

Ad check constant: `ContextTrack.Metadata.KEY_IS_ADVERTISEMENT = "is_advertisement"`
(`com/spotify/player/model/ContextTrack.java:105`).

Wire format (resolved, `docs/15-skip-ad-signal.md` §4): `EsSignalRequest`
`{signal_id="skip-ad", logging_params=<generated>}`, no `parameters`, over
`spotify.player.esperanto.proto.ContextPlayer / Signal`
(`tp01.ENDPOINT_NAME="signal"`, method `"Signal"`). Ordinary next-track is the
separate `ContextPlayer / SkipNext` path — do NOT use it (still `ad_disallow`).

## 2. Hook points (minimal set)

| # | Point | Role | Evidence |
|---|---|---|---|
| H1 | `p.hrW` constructor `(r7k, msa0, boolean)` | Capture the `p8p0` singleton (hook ctor, keep instance) | `hrw.java:6` `implements p8p0`; `mo48412a(h8p0):Single` dispatches over visitor family incl. `zqw` (Signal variant) |
| H2 | `PlayerState.signals()` (`com.spotify.player.model.PlayerState:157`, returns `pf40` list) | Readiness: fire only when list contains `"skip-ad"` | `p4h1.smali:2980-3000` maps `EsContextPlayerState.signals_` in; `g511` reduces via `contains("skip-ad")` into `jk21` UI state |
| H3 | Ad check: current `ContextTrack` metadata `is_advertisement=true` (internal twin of the exported `ADVERTISEMENT` flag, `er3.java:436`) | Fire only during real ads | `docs/04-ads-pipeline.md` |
| H4 (alt. trigger) | The Skip Ad button click itself (`jo20` family; `skip_ad_button_stub 0x7f0b0eb1`) | Optional: log-only observer to compare auto-fire timing vs taps | `analysis/skip-ad-click-handler.md` |

Rule: fire **iff** (ad playing) **AND** (`signals()` contains `"skip-ad"`).
That is exactly when the genuine button is enabled, so each fired RPC is
protocol-indistinguishable from a tap (generated `LoggingParams` included).
Never fire before readiness — the native discriminator (`fd381a`, `+0x140==0`
gate) would just run generic dispatch without the skip bookkeeping, and early
fires are the only behaviorally anomalous pattern.

## 3. Why this survives native churn

The hook sits ABOVE the entire Orbit chain (`fd381a` availability →
secondary dispatcher `0x185bf88:+0xc0` → `0x1868200:+0x68 = 0x1371d90`
`smartSkipEmbeddedPodcastAd` → seek-to-`end_ms` → `"smart-skip-embedded-podcast-ad"`
report). Native addresses will drift per release; the Java `p8p0`/`SignalCommand`
API is the stable seam. Re-verify per APK: `hrw implements p8p0`,
`SignalCommand.create`, `PlayerState.signals()`.

## 4. Risks (do not omit)

- **Root/hook detection:** `librootChecker.so` ships in all ABIs
  (`app/src/main/lib/*/librootChecker.so`). Zygisk/LSPosed hiding may be needed;
  detection posture is version-dependent — test on a secondary account first.
- **Account telemetry:** each skip still reports playback milestones
  (`started`/`ended`/`skipped`, quartile set per ad). Firing only at genuine
  readiness keeps this identical to manual taps; fabrication (firing early,
  suppressing events) is a different, riskier project — not specified here.
- **Version drift:** obfuscated names (`hrw`, `b8p0`, `jk21`, `g511`, `jo20`)
  change per release; the spec must be re-resolved ( Dex `SignalCommand.create`
  call sites + `implements p8p0` search take minutes).
- **Scope:** embedded-podcast smart-skip is the proven native executor for the
  `skip-ad` signal in this build; other ad formats share the Signal entry but
  their executors were not individually traced — verify per format.

## 5. Non-goals (rejected alternatives)

- Flipping native `adObject+0x1b8` or spoofing `+0xd0`: readiness only, not execution.
- Patching the APK: breaks updates/signature, worse than LSPosed.
- Blocking ad domains/DNS: ads share infra; breaks playback.
- `skipToNext`/`seekTo` from inside: same restrictions as outside — dead ends.
