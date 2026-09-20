package com.persie.spotifymuter;

import org.junit.Test;

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
}
