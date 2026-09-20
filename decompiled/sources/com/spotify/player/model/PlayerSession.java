package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class PlayerSession {

    public static abstract class Builder {
        public static Builder builder() {
            return PlayerSession.builder("");
        }

        public abstract PlayerSession build();

        public abstract Builder session(String str);
    }

    public static Builder builder(String str) {
        return new AutoValue_PlayerSession.Builder().session(str);
    }

    public static PlayerSession create(String str) {
        return builder(str).build();
    }

    public abstract String session();

    public abstract Builder toBuilder();
}
