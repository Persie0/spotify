package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class PlaySessionCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return PlaySessionCommand.builder();
        }

        public abstract PlaySessionCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder playOptions(PlayOptions playOptions);
    }

    public static Builder builder() {
        return new AutoValue_PlaySessionCommand.Builder();
    }

    public static PlaySessionCommand create() {
        return builder().build();
    }

    public abstract xul0 loggingParams();

    public abstract xul0 playOptions();

    public abstract Builder toBuilder();
}
