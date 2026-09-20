package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Map;
import p204p.btv0;
import p204p.xf40;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class SetOptionsCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return SetOptionsCommand.builder();
        }

        public abstract SetOptionsCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder modes(Map<String, String> map);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder playbackSpeed(float f);

        public abstract Builder repeatingContext(boolean z);

        public abstract Builder repeatingTrack(boolean z);

        public abstract Builder shufflingContext(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_SetOptionsCommand.Builder().modes(btv0.f30940g);
    }

    public static SetOptionsCommand create() {
        return builder().build();
    }

    public abstract xul0 loggingParams();

    public abstract xf40 modes();

    public abstract xul0 options();

    public abstract xul0 playbackSpeed();

    public abstract xul0 repeatingContext();

    public abstract xul0 repeatingTrack();

    public abstract xul0 shufflingContext();

    public abstract Builder toBuilder();
}
