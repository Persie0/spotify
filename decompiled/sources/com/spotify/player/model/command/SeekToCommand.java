package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class SeekToCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return SeekToCommand.builder(0L);
        }

        public abstract SeekToCommand build();

        public abstract Builder creatorTimestampPositionMs(long j);

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder relative(Relative relative);

        public abstract Builder value(long j);
    }

    @JsonFormat
    public enum Relative {
        BEGINNING,
        END,
        CURRENT
    }

    public static Builder builder(long j) {
        return new AutoValue_SeekToCommand.Builder().value(j);
    }

    public static SeekToCommand create(long j) {
        return builder(j).build();
    }

    public abstract xul0 creatorTimestampPositionMs();

    public abstract xul0 loggingParams();

    public abstract xul0 options();

    public abstract xul0 relative();

    public abstract Builder toBuilder();

    public abstract long value();
}
