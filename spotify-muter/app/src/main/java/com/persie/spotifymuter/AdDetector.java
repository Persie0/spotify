package com.persie.spotifymuter;

import android.media.MediaMetadata;

final class AdDetector {
    static final String SPOTIFY_PACKAGE = "com.spotify.music";
    static final String ADVERTISEMENT_KEY = "android.media.metadata.ADVERTISEMENT";

    private AdDetector() {}

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

    private static boolean looksLikeAdUri(String value) {
        return value != null && value.startsWith("spotify:ad:");
    }
}
