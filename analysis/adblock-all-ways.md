# All the ways to block Spotify audio ads (this repo's findings)

Question asked: *can it be done with just KernelSU or Magisk?* Answer: **yes —
via Frida as root, no LSPosed needed** (way 3). Details and every other way below.

| # | Way | Needs | Effect | Status here | Risk |
|---|---|---|---|---|---|
| 1 | Mute companion (`spotify-muter/`) | Nothing (Notification access) | Ad plays silently, music resumes | ✅ Built, proven | Global `STREAM_MUSIC` also mutes other apps during ads |
| 2 | LSPosed auto-skip (`spotify-autoskip/`) | Root + Zygisk + LSPosed | True skip the instant Skip Ad enables | 🛠️ Scaffold (uncompiled) | `librootChecker.so`; telemetry; version drift |
| 3 | Frida auto-skip (`spotify-frida/skip.js`) | Root only (KSU/Magisk) + PC | True skip, same trigger as #2 | 🛠️ Script (untested) | Same as #2, plus frida-server is detectable |
| 4 | Patched APK (smali edit) | None technically (reinstall) | Depends on patch | ❌ Not provided | Signature + Play Integrity breakage; update churn |
| 5 | DNS/VPN/adlist blocking | None | None for audio ads | ❌ Ineffective | Ads share streaming infra; breaks playback |
| 6 | Downgraded/modded clients | None | Varies | ❌ Third-party | Account security, staleness, trust |
| 7 | MediaSession/ADB tricks (`skipToNext`, `seekTo`, custom actions) | Nothing/ADB | None | ❌ Disproven | `ad_disallow`, stripped commands 4–12, seeks ignored with log |

## Why 2 and 3 work (and 7 doesn't)

Timed Skip Ad is an in-process `ContextPlayer/Signal("skip-ad")` RPC, reachable
only past the native readiness gate (`fd381a` + `state+0x40/+0x140 == 0`), which
Android surfaces solely as `PlayerState.signals() ∋ "skip-ad"`. Public
transports can't invoke it: `onSkipToNext` reaches only commands 8/9 (still
`ad_disallow`), `onSeekTo` dispatches but execution logs
`"seekTo ignored because an ad is playing"`, and `onCustomAction` only speaks
media3/bcf commands. Ways 2 and 3 instead call the exact UI path in-process —
`hrw.mo48412a(new b8p0(SignalCommand.create("skip-ad")))` — gated on the same
readiness the button uses, so each fire is protocol-identical to a tap
(see `adblock-inprocess-hook-spec.md` for the DEX-verified chain).

## Folder contract (per request: separate apps/modules, separate folders)

```text
spotify-muter/    no-root mute app (Gradle, builds today)
spotify-autoskip/ LSPosed module scaffold (Gradle, uncompiled, needs device test)
spotify-frida/    Frida script + runbook (root only, untested, needs device test)
analysis/         all reverse-engineering evidence + verdicts
docs/             architecture and pipeline notes
```

Rule going forward: one way per folder; shared evidence stays in `analysis/`.
