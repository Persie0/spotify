package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class UpdateViewUriCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return UpdateViewUriCommand.builder("");
        }

        public abstract UpdateViewUriCommand build();

        public abstract Builder viewUri(String str);
    }

    public static Builder builder(String str) {
        return new AutoValue_UpdateViewUriCommand.Builder().viewUri(str);
    }

    public static UpdateViewUriCommand create(String str) {
        return builder(str).build();
    }

    public abstract Builder toBuilder();

    public abstract String viewUri();
}
