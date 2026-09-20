# Android MediaSession and media integration

Spotify publishes part of its player state through Android's media APIs. This is the key reason the companion muter can work without patching Spotify.

## Manifest components

Confirmed manifest components include:

### Media browser service

`com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService`

It is exported and handles:

`android.media.browse.MediaBrowserService`

The APK also contains a Media3 library-service path:

`com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService`

### Media-button receiver

`com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver`

It is exported and handles:

`android.intent.action.MEDIA_BUTTON`

This is the Android integration point for headset, car, Bluetooth, lock-screen and other transport controls.

## MediaSession construction

A useful source path is:

`decompiled/sources/p204p/er3.java`

The method reconstructed as `m39766p(rsd0)` builds Android `MediaMetadataCompat`.

It exports fields such as:

```text
MEDIA_ID
TITLE
ARTIST
ALBUM
ALBUM_ARTIST
DURATION
ALBUM_ART_URI
explicit flag
19+ flag
context URI/title/description
download status
canvas URI
ADVERTISEMENT
```

Most importantly:

```java
zb70Var.m95831q(
    rsd0Var.f202312u ? 1L : 0L,
    "android.media.metadata.ADVERTISEMENT"
);
```

That is a direct bridge from Spotify's internal player/ad state to Android's system MediaSession metadata.

## Advertisement metadata key

Android/Media3 defines:

`android.media.metadata.ADVERTISEMENT`

Spotify populates it with:

- `1` for an advertisement
- `0` for normal content

This is the primary signal used by `spotify-muter`.

## Why this is robust

Compared with UI scraping:

- it works while Spotify is backgrounded
- it works with the screen off
- it is language-independent
- it does not depend on view hierarchy
- it reflects Spotify's own current player state

## Media IDs / URIs

Spotify also exports media identifiers. Ads are represented using:

`spotify:ad:<id>`

This provides a useful fallback signal.

## Media browser / Android Auto

The exported MediaBrowserService and MediaLibraryService explain how Android Auto and other media clients browse Spotify content and control playback without directly embedding Spotify's UI.

The codebase also includes package-validation / allowlist/denylist logic for media-browser clients.

## External-control flow

```text
Spotify player
     |
     v
PlayerState / current ContextTrack
     |
     v
Spotify MediaSession adapter
     |
     +--> metadata
     +--> playback state
     +--> transport actions
     |
     v
Android MediaSession
     |
     +--> lock screen
     +--> Bluetooth
     +--> Android Auto
     +--> notification controls
     +--> approved notification listeners
```

## Relevant sources

- `resources/AndroidManifest.xml`
- `decompiled/sources/p204p/er3.java`
- `decompiled/sources/com/spotify/mediabrowserservice/`
- `decompiled/sources/com/spotify/mediasession/`
- `decompiled/sources/androidx/media3/session/legacy/MediaConstants.java`
