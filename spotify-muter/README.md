# Spotify Ad Muter

A small Android app that detects Spotify audio ads from Spotify's own exported MediaSession state and temporarily mutes the phone's music stream.

## Why this detector

The decompiled Spotify 9.1.84.2205 sources in this repository show a direct chain:

1. `com.spotify.player.model.ContextTrack.Metadata.KEY_IS_ADVERTISEMENT` is `"is_advertisement"`.
2. Spotify creates ad tracks with that metadata set to `"true"`.
3. In `decompiled/sources/p204p/er3.java`, Spotify converts its internal ad boolean into the system MediaSession metadata key:
   `android.media.metadata.ADVERTISEMENT`.
4. Spotify also uses media URIs beginning with `spotify:ad:`.

The muter therefore uses the exported MediaSession marker as its primary signal, with `spotify:ad:` as a fallback. It does not infer ads from song titles or translated UI strings.

## Setup

1. Install the APK.
2. Open **Spotify Ad Muter**.
3. Tap **Enable notification access** and enable the app.
4. Start Spotify normally.

Notification access is required because Android only exposes other apps' active MediaSessions to approved notification listeners.

## Mute behavior

- On ad: remember the current `STREAM_MUSIC` volume and set it to zero.
- On normal media: restore the saved volume after a short debounce.
- If the user manually changes volume while an ad is muted, the app will not overwrite that new value when restoring.
- The app includes a manual **Restore media volume** failsafe.

This intentionally mutes the global music stream rather than modifying Spotify's account, requests, or playback state.
