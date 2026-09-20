package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p204p.xul0;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class SkipToTrack {
    public static final SkipToTrack EMPTY = builder().build();

    /* JADX INFO: loaded from: classes9.dex */
    public static abstract class Builder {
        public static Builder builder() {
            return SkipToTrack.builder();
        }

        public abstract SkipToTrack build();

        public abstract Builder pageIndex(Long l);

        public abstract Builder pageUrl(String str);

        public abstract Builder trackIndex(Long l);

        public abstract Builder trackUid(String str);

        public abstract Builder trackUri(String str);
    }

    public static Builder builder() {
        return new AutoValue_SkipToTrack.Builder();
    }

    public static SkipToTrack fromIndices(Long l, Long l2) {
        return builder().trackIndex(l).pageIndex(l2).build();
    }

    public static SkipToTrack fromUid(String str) {
        return builder().trackUid(str).build();
    }

    public static SkipToTrack fromUri(String str) {
        return builder().trackUri(str).build();
    }

    public abstract xul0 pageIndex();

    public abstract xul0 pageUrl();

    public abstract Builder toBuilder();

    public abstract xul0 trackIndex();

    public abstract xul0 trackUid();

    public abstract xul0 trackUri();
}
