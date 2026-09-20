package com.spotify.player.model;

import p204p.s571;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PauseResumeOrigin extends PauseResumeOrigin {
    private final String featureIdentifier;

    public static final class Builder extends PauseResumeOrigin.Builder {
        private String featureIdentifier;

        public Builder() {
        }

        @Override // com.spotify.player.model.PauseResumeOrigin.Builder
        public PauseResumeOrigin build() {
            String str = this.featureIdentifier;
            if (str != null) {
                return new AutoValue_PauseResumeOrigin(str, 0);
            }
            throw new IllegalStateException("Missing required properties: featureIdentifier");
        }

        @Override // com.spotify.player.model.PauseResumeOrigin.Builder
        public PauseResumeOrigin.Builder featureIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null featureIdentifier");
            }
            this.featureIdentifier = str;
            return this;
        }

        public Builder(PauseResumeOrigin pauseResumeOrigin) {
            this.featureIdentifier = pauseResumeOrigin.featureIdentifier();
        }
    }

    public /* synthetic */ AutoValue_PauseResumeOrigin(String str, int i) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PauseResumeOrigin) {
            return this.featureIdentifier.equals(((PauseResumeOrigin) obj).featureIdentifier());
        }
        return false;
    }

    @Override // com.spotify.player.model.PauseResumeOrigin
    public String featureIdentifier() {
        return this.featureIdentifier;
    }

    public int hashCode() {
        return this.featureIdentifier.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.PauseResumeOrigin
    public PauseResumeOrigin.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return s571.m77251j("PauseResumeOrigin{featureIdentifier=", this.featureIdentifier, "}");
    }

    private AutoValue_PauseResumeOrigin(String str) {
        this.featureIdentifier = str;
    }
}
