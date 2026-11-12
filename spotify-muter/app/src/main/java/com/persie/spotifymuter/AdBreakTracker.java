package com.persie.spotifymuter;

/**
 * Monotonic-time confirmation of a genuinely resumed Spotify item.
 * A brief unmarked transition between advertisements never restores volume.
 * This class has no Android dependencies so ad-pod scenarios are unit-testable.
 */
final class AdBreakTracker {
    static final long CONTENT_CONFIRM_MS = 750L;
    static final long INACTIVE_RESTORE_MS = 3_500L;

    private String contentCandidate;
    private long contentSinceMs = -1L;
    private long inactiveSinceMs = -1L;

    boolean isContentConfirmed(String contentId, long nowMs) {
        if (contentId == null) {
            cancelContentCandidate();
            return false;
        }
        if (!contentId.equals(contentCandidate)) {
            contentCandidate = contentId;
            contentSinceMs = nowMs;
            return false;
        }
        return nowMs - contentSinceMs >= CONTENT_CONFIRM_MS;
    }

    long contentCheckDelayMs(long nowMs) {
        return Math.max(1L, CONTENT_CONFIRM_MS - (nowMs - contentSinceMs));
    }

    void cancelContentCandidate() {
        contentCandidate = null;
        contentSinceMs = -1L;
    }

    boolean isInactiveLongEnough(long nowMs) {
        if (inactiveSinceMs < 0L) {
            inactiveSinceMs = nowMs;
            return false;
        }
        return nowMs - inactiveSinceMs >= INACTIVE_RESTORE_MS;
    }

    long inactivityCheckDelayMs(long nowMs) {
        return Math.max(1L, INACTIVE_RESTORE_MS - (nowMs - inactiveSinceMs));
    }

    void cancelInactivity() {
        inactiveSinceMs = -1L;
    }

    void reset() {
        cancelContentCandidate();
        cancelInactivity();
    }
}
