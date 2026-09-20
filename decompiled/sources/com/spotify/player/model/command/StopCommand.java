package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class StopCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return StopCommand.builder();
        }

        public abstract StopCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);
    }

    public static Builder builder() {
        return new AutoValue_StopCommand.Builder();
    }

    public static StopCommand create() {
        return builder().build();
    }

    public abstract xul0 loggingParams();

    public abstract Builder toBuilder();
}
