package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class PlayerError {

    public static abstract class Builder {
        public static Builder builder() {
            return PlayerError.builder(ErrorType.SUCCESS);
        }

        public abstract PlayerError build();

        public abstract Builder contextUri(String str);

        public abstract Builder error(ErrorType errorType);

        public abstract Builder reasons(String str);

        public abstract Builder trackUri(String str);

        public abstract Builder viewUri(String str);
    }

    public static Builder builder(ErrorType errorType) {
        return new AutoValue_PlayerError.Builder().error(errorType).trackUri("").contextUri("").viewUri("").reasons("");
    }

    public abstract String contextUri();

    public abstract ErrorType error();

    public abstract String reasons();

    public abstract Builder toBuilder();

    public abstract String trackUri();

    public abstract String viewUri();
}
