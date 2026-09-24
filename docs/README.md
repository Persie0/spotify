# Spotify Android Reverse-Engineering Notes

This folder documents the decompiled Spotify Android APK in this repository and the companion `spotify-muter` project.

The APK analyzed here is **Spotify 9.1.84.2205** from release `r1`, decompiled with JADX 1.5.6 using deobfuscation and bad-code recovery. The generated source tree lives under `decompiled/sources/`.

## Start here

- [Reverse-engineering scope and limitations](00-reverse-engineering-scope.md)
- [Application architecture](01-app-architecture.md)
- [Playback and player state](02-playback-player-state.md)
- [Android MediaSession / media integration](03-media-session-android-integration.md)
- [Advertising pipeline](04-ads-pipeline.md)
- [Ad reporting and tracking](05-ad-reporting-tracking.md)
- [Skipping and playback restrictions](06-skip-restrictions.md)
- [Networking: Esperanto and Cosmos](07-networking-esperanto-cosmos.md)
- [Subsystem / package map](08-package-map.md)
- [Spotify Ad Muter architecture](09-spotify-muter.md)
- [Research index and open questions](10-research-index.md)
- [Android component inventory](11-android-components.md)
- [Runtime and framework stack](12-runtime-stack.md)
- [Top-level Spotify package index](13-top-level-package-index.md)
- [Deep trace: ad milestones, skip delay, and Android skip-next](14-deep-trace-ad-events-media-skip.md)
- [Skip Ad readiness and signal execution](15-skip-ad-signal.md)

Adblock conclusion: `analysis/adblock-final-verdict.md` (mute-only viable externally; auto-skip via public `MediaSession` APIs rejected with evidence).

## High-level mental model

```text
SpotifyApplication
      |
      v
SpotifyMainActivity / feature UIs
      |
      +--------------------+
      |                    |
      v                    v
 player state         navigation / UI
      |
      v
ContextTrack + Restrictions
      |
      +-------------------------+
      |                         |
      v                         v
MediaSession export       player commands
      |                         |
      v                         v
Android system UI       Spotify player core
      |
      v
external integrations

Ads are inserted into the same playback model as ordinary tracks,
but carry ad-specific metadata such as:
  is_advertisement
  ad_id
  ad_playback_id
  ad.is_skippable
  ad.skippable_ad_delay
```

A major theme throughout the app is that Spotify exposes stable domain models such as `PlayerState`, `ContextTrack`, and protobuf request/response types, while much of the wiring around them has been heavily obfuscated into the `p204p` package.

## Bytecode fallback

When JADX cannot reconstruct a critical method, targeted APKTool/smali extraction is used.

Current bytecode targets are stored under:

`analysis/smali-targets/`

This was required to recover the MediaSession action builder and parts of the ad-skip UI mapping.

## Confidence levels

Documentation distinguishes between:

- **Confirmed** — directly visible in decompiled code, smali, resources, or manifest.
- **Strong inference** — multiple independent code paths point to the same interpretation.
- **Uncertain** — reconstruction/obfuscation or a native/backend boundary prevents a definitive conclusion.

The docs avoid pretending that JADX-generated names are original source names.
