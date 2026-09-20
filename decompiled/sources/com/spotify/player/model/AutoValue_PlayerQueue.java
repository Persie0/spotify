package com.spotify.player.model;

import p204p.C2244p5;
import p204p.edb;
import p204p.klh;
import p204p.pf40;
import p204p.pmf0;
import p204p.xul0;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_PlayerQueue extends PlayerQueue {
    private final pf40 nextTracks;
    private final pf40 prevTracks;
    private final String revision;
    private final xul0 track;

    public /* synthetic */ AutoValue_PlayerQueue(String str, xul0 xul0Var, pf40 pf40Var, pf40 pf40Var2, int i) {
        this(str, xul0Var, pf40Var, pf40Var2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerQueue) {
            PlayerQueue playerQueue = (PlayerQueue) obj;
            if (this.revision.equals(playerQueue.revision()) && this.track.equals(playerQueue.track())) {
                pf40 pf40Var = this.nextTracks;
                pf40 pf40VarNextTracks = playerQueue.nextTracks();
                pf40Var.getClass();
                if (pmf0.m70330p(pf40Var, pf40VarNextTracks)) {
                    pf40 pf40Var2 = this.prevTracks;
                    pf40 pf40VarPrevTracks = playerQueue.prevTracks();
                    pf40Var2.getClass();
                    if (pmf0.m70330p(pf40Var2, pf40VarPrevTracks)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.revision.hashCode() ^ 1000003) * 1000003) ^ this.track.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.prevTracks.hashCode();
    }

    @Override // com.spotify.player.model.PlayerQueue
    public pf40 nextTracks() {
        return this.nextTracks;
    }

    @Override // com.spotify.player.model.PlayerQueue
    public pf40 prevTracks() {
        return this.prevTracks;
    }

    @Override // com.spotify.player.model.PlayerQueue
    public String revision() {
        return this.revision;
    }

    @Override // com.spotify.player.model.PlayerQueue
    public PlayerQueue.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.revision;
        String strValueOf = String.valueOf(this.track);
        return klh.m56837i(edb.m38573v("PlayerQueue{revision=", str, ", track=", strValueOf, ", nextTracks="), String.valueOf(this.nextTracks), ", prevTracks=", String.valueOf(this.prevTracks), "}");
    }

    @Override // com.spotify.player.model.PlayerQueue
    public xul0 track() {
        return this.track;
    }

    public static final class Builder extends PlayerQueue.Builder {
        private pf40 nextTracks;
        private pf40 prevTracks;
        private String revision;
        private xul0 track;

        public Builder() {
            this.track = C2244p5.f174033a;
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue build() {
            if (this.revision != null && this.nextTracks != null && this.prevTracks != null) {
                return new AutoValue_PlayerQueue(this.revision, this.track, this.nextTracks, this.prevTracks, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.revision == null) {
                sb.append(" revision");
            }
            if (this.nextTracks == null) {
                sb.append(" nextTracks");
            }
            if (this.prevTracks == null) {
                sb.append(" prevTracks");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder nextTracks(pf40 pf40Var) {
            if (pf40Var == null) {
                throw new NullPointerException("Null nextTracks");
            }
            this.nextTracks = pf40Var;
            return this;
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder prevTracks(pf40 pf40Var) {
            if (pf40Var == null) {
                throw new NullPointerException("Null prevTracks");
            }
            this.prevTracks = pf40Var;
            return this;
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder revision(String str) {
            if (str == null) {
                throw new NullPointerException("Null revision");
            }
            this.revision = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder track(ContextTrack contextTrack) {
            this.track = xul0.m92201d(contextTrack);
            return this;
        }

        public Builder(PlayerQueue playerQueue) {
            this.track = C2244p5.f174033a;
            this.revision = playerQueue.revision();
            this.track = playerQueue.track();
            this.nextTracks = playerQueue.nextTracks();
            this.prevTracks = playerQueue.prevTracks();
        }
    }

    private AutoValue_PlayerQueue(String str, xul0 xul0Var, pf40 pf40Var, pf40 pf40Var2) {
        this.revision = str;
        this.track = xul0Var;
        this.nextTracks = pf40Var;
        this.prevTracks = pf40Var2;
    }
}
