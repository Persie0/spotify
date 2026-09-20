package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p204p.cza;
import p204p.h4t0;
import p204p.nza;

/* JADX INFO: loaded from: classes8.dex */
public final class AppContextChangedEventSource_Factory implements h4t0 {
    private final h4t0 navigationChangedDelegateProvider;
    private final h4t0 playbackStartedDelegateProvider;

    private AppContextChangedEventSource_Factory(h4t0 h4t0Var, h4t0 h4t0Var2) {
        this.navigationChangedDelegateProvider = h4t0Var;
        this.playbackStartedDelegateProvider = h4t0Var2;
    }

    public static AppContextChangedEventSource_Factory create(h4t0 h4t0Var, h4t0 h4t0Var2) {
        return new AppContextChangedEventSource_Factory(h4t0Var, h4t0Var2);
    }

    public static AppContextChangedEventSource newInstance(cza czaVar, nza nzaVar) {
        return new AppContextChangedEventSource(czaVar, nzaVar);
    }

    @Override // p204p.i4t0
    public AppContextChangedEventSource get() {
        return newInstance((cza) this.navigationChangedDelegateProvider.get(), (nza) this.playbackStartedDelegateProvider.get());
    }
}
