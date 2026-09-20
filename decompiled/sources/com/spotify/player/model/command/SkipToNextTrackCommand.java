package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class SkipToNextTrackCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return SkipToNextTrackCommand.builder();
        }

        public abstract SkipToNextTrackCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        return new AutoValue_SkipToNextTrackCommand.Builder();
    }

    public static SkipToNextTrackCommand create() {
        return builder().build();
    }

    public abstract xul0 loggingParams();

    public abstract xul0 options();

    public abstract Builder toBuilder();

    public abstract xul0 track();
}
