package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextPage;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class UpdatePageCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return UpdatePageCommand.builder(ContextPage.EMPTY);
        }

        public abstract UpdatePageCommand build();

        public abstract Builder page(ContextPage contextPage);
    }

    public static Builder builder(ContextPage contextPage) {
        return new AutoValue_UpdatePageCommand.Builder().page(contextPage);
    }

    public static UpdatePageCommand create(ContextPage contextPage) {
        return builder(contextPage).build();
    }

    public abstract ContextPage page();

    public abstract Builder toBuilder();
}
