package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class SkipToPrevTrackOptions {
    public static final SkipToPrevTrackOptions EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return SkipToPrevTrackOptions.builder();
        }

        public abstract Builder allowSeeking(Boolean bool);

        public abstract SkipToPrevTrackOptions build();

        @JsonUnwrapped
        public abstract Builder commandOptions(CommandOptions commandOptions);
    }

    public static Builder builder() {
        return new AutoValue_SkipToPrevTrackOptions.Builder().commandOptions(CommandOptions.EMPTY);
    }

    public abstract xul0 allowSeeking();

    @JsonUnwrapped
    public abstract CommandOptions commandOptions();

    public abstract Builder toBuilder();
}
