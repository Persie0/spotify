package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class PauseResumeOrigin {

    public static abstract class Builder {
        public static Builder builder() {
            return PauseResumeOrigin.builder("");
        }

        public abstract PauseResumeOrigin build();

        public abstract Builder featureIdentifier(String str);
    }

    public static Builder builder(String str) {
        return new AutoValue_PauseResumeOrigin.Builder().featureIdentifier(str);
    }

    public static PauseResumeOrigin create(String str) {
        return builder(str).build();
    }

    public abstract String featureIdentifier();

    public abstract Builder toBuilder();
}
