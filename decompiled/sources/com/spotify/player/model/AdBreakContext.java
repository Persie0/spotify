package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class AdBreakContext {
    public static final AdBreakContext EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return AdBreakContext.builder();
        }

        public abstract AdBreakContext build();

        public abstract Builder maxSecondsRemaining(long j);

        public abstract Builder positionInCurrentAdBreak(long j);

        public abstract Builder totalAdsInBreakEstimate(long j);
    }

    public static Builder builder() {
        return new AutoValue_AdBreakContext.Builder().maxSecondsRemaining(0L).positionInCurrentAdBreak(0L).totalAdsInBreakEstimate(0L);
    }

    public abstract long maxSecondsRemaining();

    public abstract long positionInCurrentAdBreak();

    public abstract Builder toBuilder();

    public abstract long totalAdsInBreakEstimate();
}
