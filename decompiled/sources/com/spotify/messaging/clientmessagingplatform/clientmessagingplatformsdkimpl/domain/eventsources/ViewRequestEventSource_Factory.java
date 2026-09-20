package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p204p.axa;
import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class ViewRequestEventSource_Factory implements h4t0 {
    private final h4t0 viewRequestDelegateProvider;

    private ViewRequestEventSource_Factory(h4t0 h4t0Var) {
        this.viewRequestDelegateProvider = h4t0Var;
    }

    public static ViewRequestEventSource_Factory create(h4t0 h4t0Var) {
        return new ViewRequestEventSource_Factory(h4t0Var);
    }

    public static ViewRequestEventSource newInstance(axa axaVar) {
        return new ViewRequestEventSource(axaVar);
    }

    @Override // p204p.i4t0
    public ViewRequestEventSource get() {
        return newInstance((axa) this.viewRequestDelegateProvider.get());
    }
}
