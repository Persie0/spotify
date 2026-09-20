package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class CommandOptions {
    public static final CommandOptions EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return CommandOptions.builder();
        }

        public abstract CommandOptions build();

        public abstract Builder onlyForLocalDevice(boolean z);

        public abstract Builder onlyForPlaybackId(String str);

        public abstract Builder overrideRestrictions(boolean z);

        public abstract Builder systemInitiated(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_CommandOptions.Builder();
    }

    public abstract xul0 onlyForLocalDevice();

    public abstract xul0 onlyForPlaybackId();

    public abstract xul0 overrideRestrictions();

    public abstract xul0 systemInitiated();

    public abstract Builder toBuilder();
}
