package com.persie.spotifymuter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AdDetectorTest {
    @Test
    public void advertisementFlagIsAuthoritative() {
        assertTrue(AdDetector.isAd(1L, "spotify:track:abc"));
        assertTrue(AdDetector.isAd(1L, "spotify:track:abc", 120_000L, false));
    }

    @Test
    public void spotifyAdUriIsDetected() {
        assertTrue(AdDetector.isAd(0L, "spotify:ad:123"));
        assertTrue(AdDetector.isAd(0L, "spotify:ad:123", 120_000L, false));
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
    public void shortTracksCanBeMutedAsFallback() {
        assertTrue(AdDetector.isAd(0L, "spotify:track:short", 59_999L, true));
        assertTrue(AdDetector.isAd(0L, null, 1L, true));
    }

    @Test
    public void shortTracksCanBeExcluded() {
        assertFalse(AdDetector.isAd(0L, "spotify:track:short", 59_999L, false));
    }

    @Test
    public void unknownAndOneMinuteDurationsAreNotShortAds() {
        assertFalse(AdDetector.isAd(0L, "spotify:track:abc", 0L, true));
        assertFalse(AdDetector.isAd(0L, "spotify:track:abc", -1L, true));
        assertFalse(AdDetector.isAd(0L, "spotify:track:abc", 60_000L, true));
        assertFalse(AdDetector.isAd(0L, "spotify:track:abc", 60_001L, true));
    }
}
