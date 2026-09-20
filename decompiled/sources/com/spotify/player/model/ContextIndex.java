package com.spotify.player.model;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ContextIndex {
    public static ContextIndex create() {
        return create(0L, 0L);
    }

    public abstract long page();

    public abstract long track();

    public static ContextIndex create(long j, long j2) {
        return new AutoValue_ContextIndex(j, j2);
    }
}
