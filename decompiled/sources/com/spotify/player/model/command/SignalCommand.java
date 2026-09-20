package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class SignalCommand implements Command {
    public static final String ENDPOINT_NAME = "signal";

    public static abstract class Builder {
        public static Builder builder() {
            return SignalCommand.builder();
        }

        public abstract SignalCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder parameters(String str);

        public abstract Builder signalId(String str);
    }

    public static Builder builder() {
        return new AutoValue_SignalCommand.Builder();
    }

    public static SignalCommand create(String str) {
        return builder().signalId(str).build();
    }

    public abstract xul0 loggingParams();

    public abstract xul0 options();

    public abstract xul0 parameters();

    public abstract String signalId();

    public abstract Builder toBuilder();
}
