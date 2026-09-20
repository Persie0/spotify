package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class PlayOptions {
    public static final PlayOptions EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return PlayOptions.builder();
        }

        public abstract PlayOptions build();

        @JsonUnwrapped
        public abstract Builder commandOptions(CommandOptions commandOptions);

        public abstract Builder operation(PlayOperation playOperation);

        public abstract Builder trigger(PlayTrigger playTrigger);
    }

    public static Builder builder() {
        return new AutoValue_PlayOptions.Builder().commandOptions(CommandOptions.EMPTY);
    }

    @JsonUnwrapped
    public abstract CommandOptions commandOptions();

    public abstract xul0 operation();

    public abstract Builder toBuilder();

    public abstract xul0 trigger();
}
