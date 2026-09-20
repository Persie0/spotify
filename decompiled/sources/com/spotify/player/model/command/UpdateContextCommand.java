package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.Context;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class UpdateContextCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return UpdateContextCommand.builder(Context.builder("").build());
        }

        public abstract UpdateContextCommand build();

        public abstract Builder context(Context context);
    }

    public static Builder builder(Context context) {
        return new AutoValue_UpdateContextCommand.Builder().context(context);
    }

    public static UpdateContextCommand create(Context context) {
        return builder(context).build();
    }

    public abstract Context context();

    public abstract Builder toBuilder();
}
