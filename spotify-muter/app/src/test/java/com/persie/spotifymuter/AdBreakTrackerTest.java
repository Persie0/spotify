package com.persie.spotifymuter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AdBreakTrackerTest {
    private static final String SONG = "spotify:track:afterAds";

    @Test
    public void twoAdsDoNotRestoreBetweenAds() {
        AdBreakTracker tracker = new AdBreakTracker();
        // Ad 1/2: metadata disappears, then Spotify emits a brief normal-looking item.
        assertFalse(tracker.isContentConfirmed(null, 0));
        assertFalse(tracker.isContentConfirmed(SONG, 150));
        assertFalse(tracker.isContentConfirmed(SONG, 450));
        // Ad 2/2 arrives before song confirmation; discard the candidate.
        tracker.reset();
        assertFalse(tracker.isContentConfirmed(null, 800));
        assertFalse(tracker.isContentConfirmed(SONG, 1000));
        assertFalse(tracker.isContentConfirmed(SONG, 1749));
        assertTrue(tracker.isContentConfirmed(SONG, 1750));
    }

    @Test
    public void threeAdsNeverDependOnAnAdCounter() {
        AdBreakTracker tracker = new AdBreakTracker();
        for (int ad = 0; ad < 3; ad++) {
            tracker.reset();
            assertFalse(tracker.isContentConfirmed(null, ad * 1000L));
            assertFalse(tracker.isContentConfirmed(SONG, ad * 1000L + 100));
            assertFalse(tracker.isContentConfirmed(SONG, ad * 1000L + 500));
        }
        tracker.reset();
        assertFalse(tracker.isContentConfirmed(SONG, 3200));
        assertTrue(tracker.isContentConfirmed(SONG, 3950));
    }

    @Test
    public void missingMetadataDoesNotEndAdBreak() {
        AdBreakTracker tracker = new AdBreakTracker();
        assertFalse(tracker.isContentConfirmed(null, 0));
        assertFalse(tracker.isContentConfirmed(null, 5000));
        assertFalse(tracker.isContentConfirmed(SONG, 5500));
        assertFalse(tracker.isContentConfirmed(null, 5900));
        assertFalse(tracker.isContentConfirmed(SONG, 6100));
        assertTrue(tracker.isContentConfirmed(SONG, 6850));
    }

    @Test
    public void switchingSongsRestartsContentConfirmation() {
        AdBreakTracker tracker = new AdBreakTracker();
        assertFalse(tracker.isContentConfirmed(SONG, 100));
        assertFalse(tracker.isContentConfirmed("spotify:track:another", 700));
        assertFalse(tracker.isContentConfirmed("spotify:track:another", 1449));
        assertTrue(tracker.isContentConfirmed("spotify:track:another", 1450));
    }

    @Test
    public void repeatedCallbacksDoNotExtendConfirmation() {
        AdBreakTracker tracker = new AdBreakTracker();
        assertFalse(tracker.isContentConfirmed(SONG, 100));
        assertFalse(tracker.isContentConfirmed(SONG, 400));
        assertFalse(tracker.isContentConfirmed(SONG, 800));
        assertTrue(tracker.isContentConfirmed(SONG, 850));
    }

    @Test
    public void temporarySessionLossDoesNotImmediatelyRestore() {
        AdBreakTracker tracker = new AdBreakTracker();
        assertFalse(tracker.isInactiveLongEnough(10));
        assertFalse(tracker.isInactiveLongEnough(3509));
        assertTrue(tracker.isInactiveLongEnough(3510));
    }

    @Test
    public void resumedSessionCancelsInactivityTimeout() {
        AdBreakTracker tracker = new AdBreakTracker();
        assertFalse(tracker.isInactiveLongEnough(10));
        tracker.cancelInactivity();
        assertFalse(tracker.isInactiveLongEnough(1000));
        assertFalse(tracker.isInactiveLongEnough(4499));
        assertTrue(tracker.isInactiveLongEnough(4500));
    }
}
