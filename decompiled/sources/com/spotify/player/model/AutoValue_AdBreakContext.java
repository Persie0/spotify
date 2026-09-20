package com.spotify.player.model;

import p204p.s571;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_AdBreakContext extends AdBreakContext {
    private final long maxSecondsRemaining;
    private final long positionInCurrentAdBreak;
    private final long totalAdsInBreakEstimate;

    public static final class Builder extends AdBreakContext.Builder {
        private long maxSecondsRemaining;
        private long positionInCurrentAdBreak;
        private byte set$0;
        private long totalAdsInBreakEstimate;

        public Builder() {
        }

        @Override // com.spotify.player.model.AdBreakContext.Builder
        public AdBreakContext build() {
            if (this.set$0 == 7) {
                return new AutoValue_AdBreakContext(0, this.maxSecondsRemaining, this.positionInCurrentAdBreak, this.totalAdsInBreakEstimate);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" maxSecondsRemaining");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" positionInCurrentAdBreak");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" totalAdsInBreakEstimate");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.AdBreakContext.Builder
        public AdBreakContext.Builder maxSecondsRemaining(long j) {
            this.maxSecondsRemaining = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.spotify.player.model.AdBreakContext.Builder
        public AdBreakContext.Builder positionInCurrentAdBreak(long j) {
            this.positionInCurrentAdBreak = j;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.spotify.player.model.AdBreakContext.Builder
        public AdBreakContext.Builder totalAdsInBreakEstimate(long j) {
            this.totalAdsInBreakEstimate = j;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        public Builder(AdBreakContext adBreakContext) {
            this.maxSecondsRemaining = adBreakContext.maxSecondsRemaining();
            this.positionInCurrentAdBreak = adBreakContext.positionInCurrentAdBreak();
            this.totalAdsInBreakEstimate = adBreakContext.totalAdsInBreakEstimate();
            this.set$0 = (byte) 7;
        }
    }

    public /* synthetic */ AutoValue_AdBreakContext(int i, long j, long j2, long j3) {
        this(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdBreakContext) {
            AdBreakContext adBreakContext = (AdBreakContext) obj;
            if (this.maxSecondsRemaining == adBreakContext.maxSecondsRemaining() && this.positionInCurrentAdBreak == adBreakContext.positionInCurrentAdBreak() && this.totalAdsInBreakEstimate == adBreakContext.totalAdsInBreakEstimate()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.maxSecondsRemaining;
        long j2 = this.positionInCurrentAdBreak;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.totalAdsInBreakEstimate;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    @Override // com.spotify.player.model.AdBreakContext
    public long maxSecondsRemaining() {
        return this.maxSecondsRemaining;
    }

    @Override // com.spotify.player.model.AdBreakContext
    public long positionInCurrentAdBreak() {
        return this.positionInCurrentAdBreak;
    }

    @Override // com.spotify.player.model.AdBreakContext
    public AdBreakContext.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        long j = this.maxSecondsRemaining;
        long j2 = this.positionInCurrentAdBreak;
        long j3 = this.totalAdsInBreakEstimate;
        StringBuilder sbM77254m = s571.m77254m(j, "AdBreakContext{maxSecondsRemaining=", ", positionInCurrentAdBreak=");
        sbM77254m.append(j2);
        sbM77254m.append(", totalAdsInBreakEstimate=");
        sbM77254m.append(j3);
        sbM77254m.append("}");
        return sbM77254m.toString();
    }

    @Override // com.spotify.player.model.AdBreakContext
    public long totalAdsInBreakEstimate() {
        return this.totalAdsInBreakEstimate;
    }

    private AutoValue_AdBreakContext(long j, long j2, long j3) {
        this.maxSecondsRemaining = j;
        this.positionInCurrentAdBreak = j2;
        this.totalAdsInBreakEstimate = j3;
    }
}
