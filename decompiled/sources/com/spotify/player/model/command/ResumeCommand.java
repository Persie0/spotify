package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class ResumeCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return ResumeCommand.builder();
        }

        public abstract ResumeCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder resumeOrigin(PauseResumeOrigin pauseResumeOrigin);
    }

    public static Builder builder() {
        return new AutoValue_ResumeCommand.Builder();
    }

    public static ResumeCommand create() {
        return builder().build();
    }

    public abstract xul0 loggingParams();

    public abstract xul0 options();

    public abstract xul0 resumeOrigin();

    public abstract Builder toBuilder();
}
