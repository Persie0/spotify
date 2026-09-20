package com.spotify.player.model;

import p204p.ikc0;
import p204p.s571;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_ContextIndex extends ContextIndex {
    private final long page;
    private final long track;

    public AutoValue_ContextIndex(long j, long j2) {
        this.page = j;
        this.track = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextIndex) {
            ContextIndex contextIndex = (ContextIndex) obj;
            if (this.page == contextIndex.page() && this.track == contextIndex.track()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.page;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.track;
        return i ^ ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // com.spotify.player.model.ContextIndex
    public long page() {
        return this.page;
    }

    public String toString() {
        return ikc0.m50938j(this.track, "}", s571.m77254m(this.page, "ContextIndex{page=", ", track="));
    }

    @Override // com.spotify.player.model.ContextIndex
    public long track() {
        return this.track;
    }
}
