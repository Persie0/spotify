package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Collections;
import java.util.Map;
import p204p.xf40;
import p204p.xul0;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class PlayerOptionOverrides {
    public static final PlayerOptionOverrides EMPTY = builder().build();

    /* JADX INFO: loaded from: classes9.dex */
    public static abstract class Builder {
        public static Builder builder() {
            return PlayerOptionOverrides.builder();
        }

        public abstract PlayerOptionOverrides build();

        public abstract Builder modes(Map<String, String> map);

        public abstract Builder playbackSpeed(Float f);

        public abstract Builder repeatingContext(Boolean bool);

        public abstract Builder repeatingTrack(Boolean bool);

        public abstract Builder shufflingContext(Boolean bool);
    }

    public static Builder builder() {
        return new AutoValue_PlayerOptionOverrides.Builder().modes(Collections.EMPTY_MAP);
    }

    public abstract xf40 modes();

    public abstract xul0 playbackSpeed();

    public abstract xul0 repeatingContext();

    public abstract xul0 repeatingTrack();

    public abstract xul0 shufflingContext();

    public abstract Builder toBuilder();
}
