package com.persie.spotifymuter;

import android.media.MediaMetadata;

final class AdDetector {
    static final String SPOTIFY_PACKAGE = "com.spotify.music";
    static final String ADVERTISEMENT_KEY = "android.media.metadata.ADVERTISEMENT";
    static final String SETTINGS_NAME = "ad_detection_settings";
    static final String MUTE_SHORT_TRACKS_KEY = "mute_short_tracks";
    static final boolean DEFAULT_MUTE_SHORT_TRACKS = true;
    static final long SHORT_TRACK_LIMIT_MS = 60_000L;

    private AdDetector() {}

    static boolean isAd(MediaMetadata metadata, boolean muteShortTracks) {
        if (metadata == null) {
            return false;
        }

        long advertisementFlag = metadata.getLong(ADVERTISEMENT_KEY);
        String mediaId = metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_ID);
        String mediaUri = metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_URI);
        long duration = metadata.getLong(MediaMetadata.METADATA_KEY_DURATION);

        return isAd(advertisementFlag, mediaId, duration, muteShortTracks)
                || looksLikeAdUri(mediaUri);
    }

    static boolean isAd(long advertisementFlag, String mediaId) {
        return advertisementFlag != 0L || looksLikeAdUri(mediaId);
    }

    static boolean isAd(long advertisementFlag, String mediaId,
                        long durationMs, boolean muteShortTracks) {
        return isAd(advertisementFlag, mediaId)
                || (muteShortTracks && durationMs > 0L && durationMs < SHORT_TRACK_LIMIT_MS);
    }

    // A null/empty metadata transition is not evidence that the ad has ended.
    static boolean isKnownMedia(MediaMetadata metadata) {
        if (metadata == null) {
            return false;
        }
        return metadata.containsKey(ADVERTISEMENT_KEY)
                || nonEmpty(metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_ID))
                || nonEmpty(metadata.getString(MediaMetadata.METADATA_KEY_MEDIA_URI))
                || nonEmpty(metadata.getString(MediaMetadata.METADATA_KEY_TITLE))
                || metadata.getLong(MediaMetadata.METADATA_KEY_DURATION) > 0L;
    }

    private static boolean nonEmpty(String value) {
        return value != null && !value.isEmpty();
    }

    private static boolean looksLikeAdUri(String value) {
        return value != null && value.startsWith("spotify:ad:");
    }
}
