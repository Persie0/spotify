package com.persie.spotifymuter;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;

final class AdDetector {
    static final String SPOTIFY_PACKAGE = "com.spotify.music";
    static final String ADVERTISEMENT_KEY = "android.media.metadata.ADVERTISEMENT";

    private AdDetector() {}

    // Avoid reacting to a paused, stopped, or buffering Spotify item while
    // another app is playing through Android's shared music volume stream.
    static boolean isActiveSpotifyPlayback(String packageName, int playbackState) {
        return SPOTIFY_PACKAGE.equals(packageName)
                && playbackState == PlaybackState.STATE_PLAYING;
    }

    static boolean isAd(MediaMetadata metadata) {
        if (metadata == null) {
            return false;
        }

        long advertisementFlag = metadata.getLong(ADVERTISEMENT_KEY);
        String mediaId = metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_ID);
        String mediaUri = metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_URI);

        return isAd(advertisementFlag, mediaId) || looksLikeAdUri(mediaUri);
    }

    static boolean isAd(long advertisementFlag, String mediaId) {
        return advertisementFlag != 0L || looksLikeAdUri(mediaId);
    }

    // An absent advertisement marker alone is insufficient to end an ad pod:
    // Spotify may briefly publish unrelated or empty metadata between ads.
    // Require a real playable Spotify item identity as positive evidence.
    static String normalContentIdentity(MediaMetadata metadata) {
        if (metadata == null || isAd(metadata)) {
            return null;
        }
        String id = metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_ID);
        if (isNormalContentId(id)) {
            return id;
        }
        String uri = metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_URI);
        return isNormalContentId(uri) ? uri : null;
    }

    static boolean isNormalContentId(String id) {
        return id != null && (id.startsWith("spotify:track:")
                || id.startsWith("spotify:local:")
                || id.startsWith("spotify:episode:"));
    }

    private static boolean looksLikeAdUri(String value) {
        return value != null && value.startsWith("spotify:ad:");
    }
}
