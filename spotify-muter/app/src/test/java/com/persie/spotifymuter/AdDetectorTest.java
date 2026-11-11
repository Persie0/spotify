package com.persie.spotifymuter;

import org.junit.Test;
import android.media.session.PlaybackState;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AdDetectorTest {
    @Test
    public void advertisementFlagIsAuthoritative() {
        assertTrue(AdDetector.isAd(1L, "spotify:track:abc"));
    }

    @Test
    public void spotifyAdUriIsDetected() {
        assertTrue(AdDetector.isAd(0L, "spotify:ad:123"));
    }

    @Test
    public void normalTrackIsNotAnAd() {
        assertFalse(AdDetector.isAd(0L, "spotify:track:abc"));
    }

    @Test
    public void nullMediaIdIsSafe() {
        assertFalse(AdDetector.isAd(0L, null));
    }

    @Test
    public void interruptionIsNotTreatedAsAdWithoutMarker() {
        assertFalse(AdDetector.isAd(0L, "spotify:interruption:abc"));
    }

    @Test
    public void onlyActiveSpotifyCanTriggerMuting() {
        assertTrue(AdDetector.isActiveSpotifyPlayback(
                AdDetector.SPOTIFY_PACKAGE, PlaybackState.STATE_PLAYING));
        assertFalse(AdDetector.isActiveSpotifyPlayback(
                "com.google.android.youtube", PlaybackState.STATE_PLAYING));
        assertFalse(AdDetector.isActiveSpotifyPlayback(
                "com.example.podcast", PlaybackState.STATE_PLAYING));
        assertFalse(AdDetector.isActiveSpotifyPlayback(
                AdDetector.SPOTIFY_PACKAGE, PlaybackState.STATE_BUFFERING));
        assertFalse(AdDetector.isActiveSpotifyPlayback(
                AdDetector.SPOTIFY_PACKAGE, PlaybackState.STATE_PAUSED));
        assertFalse(AdDetector.isActiveSpotifyPlayback(
                AdDetector.SPOTIFY_PACKAGE, PlaybackState.STATE_STOPPED));
        assertFalse(AdDetector.isActiveSpotifyPlayback(
                AdDetector.SPOTIFY_PACKAGE, PlaybackState.STATE_NONE));
    }
}
