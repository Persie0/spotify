package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p204p.h4t0;
import p204p.yza;

/* JADX INFO: loaded from: classes8.dex */
public final class ViewEventsEventSource_Factory implements h4t0 {
    private final h4t0 viewEventsDelegateProvider;

    private ViewEventsEventSource_Factory(h4t0 h4t0Var) {
        this.viewEventsDelegateProvider = h4t0Var;
    }

    public static ViewEventsEventSource_Factory create(h4t0 h4t0Var) {
        return new ViewEventsEventSource_Factory(h4t0Var);
    }

    public static ViewEventsEventSource newInstance(yza yzaVar) {
        return new ViewEventsEventSource(yzaVar);
    }

    @Override // p204p.i4t0
    public ViewEventsEventSource get() {
        return newInstance((yza) this.viewEventsDelegateProvider.get());
    }
}
