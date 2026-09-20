package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import p204p.kf40;
import p204p.pf40;
import p204p.wsv0;
import p204p.xul0;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class PlayerQueue {
    public static final PlayerQueue EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return PlayerQueue.builder();
        }

        public abstract PlayerQueue build();

        public Builder nextTracks(List<ContextTrack> list) {
            return nextTracks(pf40.m69791p(list));
        }

        public abstract Builder nextTracks(pf40 pf40Var);

        public Builder prevTracks(List<ContextTrack> list) {
            return prevTracks(pf40.m69791p(list));
        }

        public abstract Builder prevTracks(pf40 pf40Var);

        public abstract Builder revision(String str);

        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        Builder builderRevision = new AutoValue_PlayerQueue.Builder().revision("");
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0Var = wsv0.f254763e;
        return builderRevision.nextTracks((pf40) wsv0Var).prevTracks((pf40) wsv0Var);
    }

    public abstract pf40 nextTracks();

    public abstract pf40 prevTracks();

    public abstract String revision();

    public abstract Builder toBuilder();

    public abstract xul0 track();
}
