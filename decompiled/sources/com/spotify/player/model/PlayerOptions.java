package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;
import p204p.btv0;
import p204p.xf40;
import p204p.xul0;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class PlayerOptions {
    public static final PlayerOptions EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return PlayerOptions.builder();
        }

        public abstract PlayerOptions build();

        public abstract Builder modes(Map<String, String> map);

        public abstract Builder playbackSpeed(float f);

        public abstract Builder repeatingContext(boolean z);

        public abstract Builder repeatingTrack(boolean z);

        public abstract Builder shufflingContext(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_PlayerOptions.Builder().shufflingContext(false).repeatingContext(false).repeatingTrack(false).modes(btv0.f30940g);
    }

    public abstract xf40 modes();

    public abstract xul0 playbackSpeed();

    public abstract boolean repeatingContext();

    public abstract boolean repeatingTrack();

    public abstract boolean shufflingContext();

    public abstract Builder toBuilder();
}
