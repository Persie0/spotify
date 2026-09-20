package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class PreparePlayCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return PreparePlayCommand.builder(Context.builder("").build(), PlayOrigin.create(""));
        }

        public abstract PreparePlayCommand build();

        public abstract Builder context(Context context);

        public abstract Builder options(PreparePlayOptions preparePlayOptions);

        public abstract Builder playOrigin(PlayOrigin playOrigin);
    }

    public static Builder builder(Context context, PlayOrigin playOrigin) {
        return new AutoValue_PreparePlayCommand.Builder().context(context).playOrigin(playOrigin);
    }

    public static PreparePlayCommand create(Context context, PlayOrigin playOrigin) {
        return builder(context, playOrigin).build();
    }

    public abstract Context context();

    public abstract xul0 options();

    public abstract PlayOrigin playOrigin();

    public abstract Builder toBuilder();
}
