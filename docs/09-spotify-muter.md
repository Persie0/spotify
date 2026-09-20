# Spotify Ad Muter architecture

The companion project lives in:

`spotify-muter/`

Its goal is deliberately narrow:

> Detect Spotify audio ads using Spotify's own exported MediaSession state and silence them locally.

## Why no AccessibilityService is needed

The initial idea was to inspect Spotify UI text with Accessibility.

Reverse engineering revealed a much stronger signal: Spotify itself exports:

`android.media.metadata.ADVERTISEMENT`

through Android's MediaSession.

Therefore the muter does not depend on:

- screen being on
- Spotify being foregrounded
- UI language
- view IDs
- accessibility text

## Components

### AdDetector

`spotify-muter/app/src/main/java/com/persie/spotifymuter/AdDetector.java`

Primary rule:

```text
android.media.metadata.ADVERTISEMENT != 0
```

Fallback:

```text
media ID or URI starts with spotify:ad:
```

### SpotifySessionService

A `NotificationListenerService`.

Why Notification Access is used:

Android allows approved notification listeners to query active media sessions from other apps.

The service:

1. queries active MediaSessions
2. selects `com.spotify.music`
3. registers `MediaController.Callback`
4. reacts to metadata/playback changes
5. calls the ad detector
6. mutes/restores volume

### VolumeMuter

Uses `AudioManager.STREAM_MUSIC`.

On ad:

- save current volume
- set media volume to zero

When normal music returns:

- debounce ~900 ms
- restore saved volume

## Background lifecycle

The launcher Activity does not have to stay open.

Android owns/binds the notification-listener service after access is granted.

Swiping the UI from Recents normally does not stop the listener.

Force Stop is different: Android prevents app components from running until the user launches the app again.

## Why the current design works well

Advantages:

- independent of Spotify obfuscated class names
- no root required
- no LSPosed required
- no APK patch required
- works screen-off/background
- very small APK
- survives Spotify UI redesigns

## Current limitation

`STREAM_MUSIC` is global.

While an ad is muted, another app sharing the media stream is muted as well.

A true Spotify-only audio mute would require a more invasive per-process/per-audio-session solution.

## Possible safe extension: native skip when available

A future version can inspect Spotify's MediaSession playback actions.

If `ACTION_SKIP_TO_NEXT` is currently exported during an ad, the muter could request:

`MediaController.TransportControls.skipToNext()`

and fall back to mute if unavailable or ineffective.

This would use Spotify's own allowed transport action rather than bypassing its internal restrictions.

## Debugging

```bash
adb logcat -s SpotifyAdMuter
```

Expected messages include:

```text
Spotify ad marker detected; muting media stream
No Spotify ad marker present; restoring music volume
```
