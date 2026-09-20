package com.spotify.player.model;

import p204p.dq60;
import p204p.edb;
import p204p.klh;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PlaybackQuality extends PlaybackQuality {
    private final BitrateLevel bitrateLevel;
    private final FileOrigin fileOrigin;
    private final HiFiStatus hifiStatus;
    private final BitrateLevel highestAvailableQuality;
    private final BitrateStrategy strategy;
    private final boolean targetBitrateAvailable;
    private final BitrateLevel targetBitrateLevel;

    public static final class Builder extends PlaybackQuality.Builder {
        private BitrateLevel bitrateLevel;
        private FileOrigin fileOrigin;
        private HiFiStatus hifiStatus;
        private BitrateLevel highestAvailableQuality;
        private byte set$0;
        private BitrateStrategy strategy;
        private boolean targetBitrateAvailable;
        private BitrateLevel targetBitrateLevel;

        public Builder() {
        }

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality.Builder bitrateLevel(BitrateLevel bitrateLevel) {
            if (bitrateLevel == null) {
                throw new NullPointerException("Null bitrateLevel");
            }
            this.bitrateLevel = bitrateLevel;
            return this;
        }

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality build() {
            if (this.set$0 == 1 && this.bitrateLevel != null && this.strategy != null && this.targetBitrateLevel != null && this.hifiStatus != null && this.highestAvailableQuality != null && this.fileOrigin != null) {
                return new AutoValue_PlaybackQuality(this.bitrateLevel, this.strategy, this.targetBitrateLevel, this.targetBitrateAvailable, this.hifiStatus, this.highestAvailableQuality, this.fileOrigin, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.bitrateLevel == null) {
                sb.append(" bitrateLevel");
            }
            if (this.strategy == null) {
                sb.append(" strategy");
            }
            if (this.targetBitrateLevel == null) {
                sb.append(" targetBitrateLevel");
            }
            if ((1 & this.set$0) == 0) {
                sb.append(" targetBitrateAvailable");
            }
            if (this.hifiStatus == null) {
                sb.append(" hifiStatus");
            }
            if (this.highestAvailableQuality == null) {
                sb.append(" highestAvailableQuality");
            }
            if (this.fileOrigin == null) {
                sb.append(" fileOrigin");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality.Builder fileOrigin(FileOrigin fileOrigin) {
            if (fileOrigin == null) {
                throw new NullPointerException("Null fileOrigin");
            }
            this.fileOrigin = fileOrigin;
            return this;
        }

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality.Builder hifiStatus(HiFiStatus hiFiStatus) {
            if (hiFiStatus == null) {
                throw new NullPointerException("Null hifiStatus");
            }
            this.hifiStatus = hiFiStatus;
            return this;
        }

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality.Builder highestAvailableQuality(BitrateLevel bitrateLevel) {
            if (bitrateLevel == null) {
                throw new NullPointerException("Null highestAvailableQuality");
            }
            this.highestAvailableQuality = bitrateLevel;
            return this;
        }

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality.Builder strategy(BitrateStrategy bitrateStrategy) {
            if (bitrateStrategy == null) {
                throw new NullPointerException("Null strategy");
            }
            this.strategy = bitrateStrategy;
            return this;
        }

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality.Builder targetBitrateAvailable(boolean z) {
            this.targetBitrateAvailable = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality.Builder targetBitrateLevel(BitrateLevel bitrateLevel) {
            if (bitrateLevel == null) {
                throw new NullPointerException("Null targetBitrateLevel");
            }
            this.targetBitrateLevel = bitrateLevel;
            return this;
        }

        public Builder(PlaybackQuality playbackQuality) {
            this.bitrateLevel = playbackQuality.bitrateLevel();
            this.strategy = playbackQuality.strategy();
            this.targetBitrateLevel = playbackQuality.targetBitrateLevel();
            this.targetBitrateAvailable = playbackQuality.targetBitrateAvailable();
            this.hifiStatus = playbackQuality.hifiStatus();
            this.highestAvailableQuality = playbackQuality.highestAvailableQuality();
            this.fileOrigin = playbackQuality.fileOrigin();
            this.set$0 = (byte) 1;
        }
    }

    public /* synthetic */ AutoValue_PlaybackQuality(BitrateLevel bitrateLevel, BitrateStrategy bitrateStrategy, BitrateLevel bitrateLevel2, boolean z, HiFiStatus hiFiStatus, BitrateLevel bitrateLevel3, FileOrigin fileOrigin, int i) {
        this(bitrateLevel, bitrateStrategy, bitrateLevel2, z, hiFiStatus, bitrateLevel3, fileOrigin);
    }

    @Override // com.spotify.player.model.PlaybackQuality
    public BitrateLevel bitrateLevel() {
        return this.bitrateLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaybackQuality) {
            PlaybackQuality playbackQuality = (PlaybackQuality) obj;
            if (this.bitrateLevel.equals(playbackQuality.bitrateLevel()) && this.strategy.equals(playbackQuality.strategy()) && this.targetBitrateLevel.equals(playbackQuality.targetBitrateLevel()) && this.targetBitrateAvailable == playbackQuality.targetBitrateAvailable() && this.hifiStatus.equals(playbackQuality.hifiStatus()) && this.highestAvailableQuality.equals(playbackQuality.highestAvailableQuality()) && this.fileOrigin.equals(playbackQuality.fileOrigin())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.player.model.PlaybackQuality
    public FileOrigin fileOrigin() {
        return this.fileOrigin;
    }

    public int hashCode() {
        return ((((((((((((this.bitrateLevel.hashCode() ^ 1000003) * 1000003) ^ this.strategy.hashCode()) * 1000003) ^ this.targetBitrateLevel.hashCode()) * 1000003) ^ (this.targetBitrateAvailable ? 1231 : 1237)) * 1000003) ^ this.hifiStatus.hashCode()) * 1000003) ^ this.highestAvailableQuality.hashCode()) * 1000003) ^ this.fileOrigin.hashCode();
    }

    @Override // com.spotify.player.model.PlaybackQuality
    public HiFiStatus hifiStatus() {
        return this.hifiStatus;
    }

    @Override // com.spotify.player.model.PlaybackQuality
    public BitrateLevel highestAvailableQuality() {
        return this.highestAvailableQuality;
    }

    @Override // com.spotify.player.model.PlaybackQuality
    public BitrateStrategy strategy() {
        return this.strategy;
    }

    @Override // com.spotify.player.model.PlaybackQuality
    public boolean targetBitrateAvailable() {
        return this.targetBitrateAvailable;
    }

    @Override // com.spotify.player.model.PlaybackQuality
    public BitrateLevel targetBitrateLevel() {
        return this.targetBitrateLevel;
    }

    @Override // com.spotify.player.model.PlaybackQuality
    public PlaybackQuality.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.bitrateLevel);
        String strValueOf2 = String.valueOf(this.strategy);
        String strValueOf3 = String.valueOf(this.targetBitrateLevel);
        boolean z = this.targetBitrateAvailable;
        String strValueOf4 = String.valueOf(this.hifiStatus);
        String strValueOf5 = String.valueOf(this.highestAvailableQuality);
        String strValueOf6 = String.valueOf(this.fileOrigin);
        StringBuilder sbM38573v = edb.m38573v("PlaybackQuality{bitrateLevel=", strValueOf, ", strategy=", strValueOf2, ", targetBitrateLevel=");
        sbM38573v.append(strValueOf3);
        sbM38573v.append(", targetBitrateAvailable=");
        sbM38573v.append(z);
        sbM38573v.append(", hifiStatus=");
        klh.m56844p(sbM38573v, strValueOf4, ", highestAvailableQuality=", strValueOf5, ", fileOrigin=");
        return dq60.m36616p(strValueOf6, "}", sbM38573v);
    }

    private AutoValue_PlaybackQuality(BitrateLevel bitrateLevel, BitrateStrategy bitrateStrategy, BitrateLevel bitrateLevel2, boolean z, HiFiStatus hiFiStatus, BitrateLevel bitrateLevel3, FileOrigin fileOrigin) {
        this.bitrateLevel = bitrateLevel;
        this.strategy = bitrateStrategy;
        this.targetBitrateLevel = bitrateLevel2;
        this.targetBitrateAvailable = z;
        this.hifiStatus = hiFiStatus;
        this.highestAvailableQuality = bitrateLevel3;
        this.fileOrigin = fileOrigin;
    }
}
