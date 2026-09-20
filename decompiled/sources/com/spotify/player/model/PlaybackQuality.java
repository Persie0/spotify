package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class PlaybackQuality {
    public static final PlaybackQuality EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return PlaybackQuality.builder();
        }

        public abstract Builder bitrateLevel(BitrateLevel bitrateLevel);

        public abstract PlaybackQuality build();

        public abstract Builder fileOrigin(FileOrigin fileOrigin);

        public abstract Builder hifiStatus(HiFiStatus hiFiStatus);

        public abstract Builder highestAvailableQuality(BitrateLevel bitrateLevel);

        public abstract Builder strategy(BitrateStrategy bitrateStrategy);

        public abstract Builder targetBitrateAvailable(boolean z);

        public abstract Builder targetBitrateLevel(BitrateLevel bitrateLevel);
    }

    public static Builder builder() {
        AutoValue_PlaybackQuality.Builder builder = new AutoValue_PlaybackQuality.Builder();
        BitrateLevel bitrateLevel = BitrateLevel.UNKNOWN;
        return builder.bitrateLevel(bitrateLevel).strategy(BitrateStrategy.UNKNOWN).targetBitrateLevel(bitrateLevel).targetBitrateAvailable(false).hifiStatus(HiFiStatus.NONE).highestAvailableQuality(bitrateLevel).fileOrigin(FileOrigin.UNKNOWN);
    }

    public abstract BitrateLevel bitrateLevel();

    public abstract FileOrigin fileOrigin();

    public abstract HiFiStatus hifiStatus();

    public abstract BitrateLevel highestAvailableQuality();

    public abstract BitrateStrategy strategy();

    public abstract boolean targetBitrateAvailable();

    public abstract BitrateLevel targetBitrateLevel();

    public abstract Builder toBuilder();
}
