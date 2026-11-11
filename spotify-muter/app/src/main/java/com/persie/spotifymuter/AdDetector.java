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

    // A null/empty metadata transition is not evidence that the ad has ended.
    static boolean isKnownMedia(MediaMetadata metadata) {
        if (metadata == null) {
            return false;
        }
        return metadata.containsKey(ADVERTISEMENT_KEY)
                || nonEmpty(metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_ID))
                || nonEmpty(metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_URI))
                || nonEmpty(metadata.getString(MediaMetadata.METADATA_KEY_TITLE));
    }

    private static boolean nonEmpty(String value) {
        return value != null && !value.isEmpty();
    }

    private static boolean looksLikeAdUri(String value) {
        return value != null && value.startsWith("spotify:ad:");
    }
}
