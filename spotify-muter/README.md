# Spotify Ad Muter

A small Android app that detects Spotify audio ads from Spotify's own exported MediaSession state and temporarily mutes the phone's music stream.

It does **not** patch Spotify, modify the Spotify account, block network requests, require LSPosed, or depend on Accessibility text recognition.

## Why this detector works

The detector uses playback metadata published through Android's MediaSession API:

1. `com.spotify.player.model.ContextTrack.Metadata.KEY_IS_ADVERTISEMENT` is `"is_advertisement"`.
2. Spotify creates ad tracks with that metadata set to `"true"`.
3. Spotify exposes the advertisement marker through the Android MediaSession metadata key:
   `android.media.metadata.ADVERTISEMENT`.
4. Spotify also uses media identifiers/URIs beginning with `spotify:ad:`.

The muter therefore uses Spotify's own exported playback state:

```text
Spotify internal ContextTrack
        |
        | is_advertisement = true
        v
Spotify MediaSession metadata
        |
        | android.media.metadata.ADVERTISEMENT = 1
        v
Spotify Ad Muter detects the ad
        |
        v
save media volume -> set STREAM_MUSIC to 0
        |
        | confirmed normal track appears
        v
restore previous volume immediately
```

The primary detector is `android.media.metadata.ADVERTISEMENT`. A `spotify:ad:` media ID/URI is used as an additional fallback.

This is much more reliable than searching the Spotify UI for words such as "Advertisement" or "Werbung", and it continues to work when Spotify is in the background or the screen is off.

## Architecture

The app has two main parts:

- `SpotifySessionService` — an Android `NotificationListenerService` that is allowed to query active MediaSessions after the user grants Notification Access.
- `VolumeMuter` — remembers the current `STREAM_MUSIC` volume, mutes it during an ad, and restores it afterward.

At startup of the listener service:

```text
Android binds SpotifySessionService
        |
        v
MediaSessionManager.getActiveSessions(...)
        |
        v
find controller where packageName == com.spotify.music
        |
        v
register MediaController.Callback
        |
        +--> onMetadataChanged(...)
        |
        +--> onPlaybackStateChanged(...)
        |
        v
evaluate current Spotify metadata
```

Only the Spotify MediaSession can trigger muting; a paused or stopped Spotify session restores media volume. The active-session listener detects Spotify session changes. Controller callbacks are reused by session token instead of being detached and reattached for every notification. Notification changes can still refresh sessions when reconnection is needed.

## Does the app have to stay open?

**No. The app UI does not need to stay open.**

After Notification Access is granted, Android manages `SpotifySessionService` in the background. The launcher activity can be closed and the app can be removed from the Recent Apps screen.

Normal usage is:

1. Install the APK.
2. Open Spotify Ad Muter once.
3. Grant Notification Access.
4. Close the app.
5. Use Spotify normally.

The background listener continues receiving Spotify MediaSession changes without the activity being visible.

### Swiping away the app

Swiping Spotify Ad Muter away from Android's Recent Apps screen does **not normally stop the detector**. The activity and the notification-listener service are separate components.

### Force Stop

Android's **Force stop** action is different.

If you open:

`Settings -> Apps -> Spotify Ad Muter -> Force stop`

Android prevents the app's components from running again until the app is manually opened. During that time the muter will not work.

### Process restart / reboot

Notification Access remains granted unless the user revokes it. Android normally reconnects enabled `NotificationListenerService` components when their process is recreated, so manually reopening the app should not normally be necessary after ordinary process death or a reboot.

Some heavily customized Android ROMs may apply unusually aggressive background/battery restrictions. If detection stops on such a device, exclude Spotify Ad Muter from battery optimization/background restrictions.

## Releases

The APK is built from the marker-only main branch. The experimental short-duration fallback is preserved separately in [`feature/spotify-under-60s-fallback`](https://github.com/Persie0/spotify/tree/feature/spotify-under-60s-fallback) and is **not** part of the main release.

## Setup

1. Install the APK.
2. Open **Spotify Ad Muter**.
3. Tap **Enable notification access**.
4. Enable **Spotify Ad Muter** in Android's Notification Access settings.
5. Start Spotify normally.

Notification Access is required because Android only exposes other apps' active MediaSessions to approved notification listeners.

No Accessibility Service is required.

No root is required for the current implementation.

## Mute behavior

When Spotify reports a playback advertisement:

1. Read the current `AudioManager.STREAM_MUSIC` volume.
2. Save that value in app preferences.
3. Set `STREAM_MUSIC` to zero.
4. Keep it muted while Spotify continues reporting an ad.
5. When Spotify reports identifiable normal media, restore the saved volume **immediately** (no 900 ms debounce).
6. If Spotify temporarily publishes null/empty metadata during a transition, keep the current mute for at most 250 ms before restoring as a failsafe. Repeated playback-state updates do not extend this grace period.

The app reacts to Spotify's MediaSession callbacks as they arrive; there is no polling interval. The start-of-ad latency is therefore limited by when Spotify publishes the metadata and Android delivers the callback, plus the audio-volume API call. Truly zero-latency detection cannot be guaranteed.

If the service is disconnected or destroyed, it also attempts to restore the previously saved volume.

The app includes a manual **Restore media volume** button as a failsafe.

## Important limitation: global media volume

The current implementation changes Android's global `STREAM_MUSIC` volume.

That means another app using the same media stream at exactly the same time would also be muted during the Spotify ad. Android's `STREAM_MUSIC` is shared, so the current mechanism cannot guarantee Spotify-only volume muting while another app plays simultaneously.

It does **not** currently change only Spotify's private audio gain.

A future root/LSPosed implementation could potentially mute only Spotify's own audio session, but the current MediaSession + global-volume approach is considerably simpler and has the advantage of not depending on Spotify's obfuscated internal classes.

## Why not Accessibility?

An Accessibility-based detector would have several disadvantages:

- Spotify needs to expose useful text or nodes in its UI.
- UI strings can vary by language.
- Spotify can redesign the UI.
- The relevant Spotify window may not be active while the screen is off.
- Background playback does not require Spotify's UI to be visible.

The MediaSession implementation instead consumes playback metadata that Spotify itself publishes for Android integrations such as system media controls.

## Why not DNS/ad blocking?

This app deliberately lets Spotify load and play the advertisement normally from Spotify's point of view.

It only reacts locally after Spotify identifies the current playback item as an advertisement and then mutes Android's media stream.

It therefore does not need to maintain lists of Spotify ad domains, inspect network traffic, or distinguish ads from legitimate requests sent through shared Spotify servers.

## Relevant source files

- `app/src/main/java/com/persie/spotifymuter/AdDetector.java` — MediaSession ad detection.
- `app/src/main/java/com/persie/spotifymuter/SpotifySessionService.java` — background service and Spotify MediaSession callbacks.
- `app/src/main/java/com/persie/spotifymuter/VolumeMuter.java` — volume save/mute/restore logic.
- `app/src/main/java/com/persie/spotifymuter/MainActivity.java` — setup/status UI.

## Testing / debugging

Useful logcat filter:

```bash
adb logcat -s SpotifyAdMuter
```

When an ad starts, the service logs:

```text
Spotify ad detected; muting media stream
```

When normal playback returns:

```text
Normal Spotify track detected; restoring music volume immediately
```
