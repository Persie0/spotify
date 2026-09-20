package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class PlayCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return PlayCommand.builder(Context.builder("").build(), PlayOrigin.create(""));
        }

        public abstract PlayCommand build();

        public abstract Builder context(Context context);

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(PreparePlayOptions preparePlayOptions);

        public abstract Builder playOptions(PlayOptions playOptions);

        public abstract Builder playOrigin(PlayOrigin playOrigin);
    }

    public static Builder builder(Context context, PlayOrigin playOrigin) {
        return new AutoValue_PlayCommand.Builder().context(context).playOrigin(playOrigin);
    }

    public static PlayCommand create(Context context, PlayOrigin playOrigin) {
        return builder(context, playOrigin).build();
    }

    public abstract Context context();

    public abstract xul0 loggingParams();

    public abstract xul0 options();

    public abstract xul0 playOptions();

    public abstract PlayOrigin playOrigin();

    public abstract Builder toBuilder();
}
