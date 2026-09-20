package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class AdPlayingEventSource_Factory implements h4t0 {
    private final h4t0 playerStateFlowableProvider;

    private AdPlayingEventSource_Factory(h4t0 h4t0Var) {
        this.playerStateFlowableProvider = h4t0Var;
    }

    public static AdPlayingEventSource_Factory create(h4t0 h4t0Var) {
        return new AdPlayingEventSource_Factory(h4t0Var);
    }

    public static AdPlayingEventSource newInstance(Flowable<PlayerState> flowable) {
        return new AdPlayingEventSource(flowable);
    }

    @Override // p204p.i4t0
    public AdPlayingEventSource get() {
        return newInstance((Flowable) this.playerStateFlowableProvider.get());
    }
}
