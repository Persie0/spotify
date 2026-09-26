# Spotify adblock — research + implementations

Reverse-engineering of Spotify Android 9.1.84.2205 (`spotify-9-1-84-2205.apk`,
untracked) plus every adblock approach that survives evidence, one per folder.

## The short version

| Folder | What | Needs | State |
|---|---|---|---|
| `spotify-muter/` | Mutes ads via Spotify's own `ADVERTISEMENT` flag | Nothing | ✅ Built, works |
| `spotify-autoskip/` | Auto-fires the genuine Skip Ad signal in-process (LSPosed) | Root + Zygisk + LSPosed | 🏗️ Builds, untested on device |
| `spotify-frida/` | Same auto-skip driven from a PC (Frida) | Root only | 🛠️ Script, untested on device |
| `analysis/` | All evidence, verdicts, specs | — | Index: `adblock-all-ways.md` |
| `docs/` | Architecture + pipeline notes | — | Start: `docs/README.md` |
| `decompiled/` | JADX output (reference only) | — | — |
| `app/`, `resources/` | APK extraction byproducts | — | — |

Skip, seek, custom actions, DNS blocking and patched APKs were each killed
with cited evidence — see `analysis/adblock-final-verdict.md`. The two live
options are mute (no root) and in-process auto-skip (root), sharing one rule:
fire only when Spotify itself reports the ad / enables Skip Ad, so every
action is indistinguishable from normal use.

## Where to go next

- Just silence ads: build `spotify-muter/` (`docs/09-spotify-muter.md`).
- Truly skip ads: read `analysis/adblock-inprocess-hook-spec.md`, then pick
  `spotify-autoskip/` (on-device module) or `spotify-frida/` (PC-driven).
  Both need a rooted test device; both are fail-closed scaffolds, not releases.
- Understand the player: `docs/04-ads-pipeline.md`,
  `docs/15-skip-ad-signal.md`, `analysis/final-readiness-provenance-summary.md`.
