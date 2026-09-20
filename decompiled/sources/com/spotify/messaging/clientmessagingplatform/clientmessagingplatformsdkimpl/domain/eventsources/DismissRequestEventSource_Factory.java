package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p204p.h4t0;
import p204p.qwa;

/* JADX INFO: loaded from: classes8.dex */
public final class DismissRequestEventSource_Factory implements h4t0 {
    private final h4t0 delegateProvider;

    private DismissRequestEventSource_Factory(h4t0 h4t0Var) {
        this.delegateProvider = h4t0Var;
    }

    public static DismissRequestEventSource_Factory create(h4t0 h4t0Var) {
        return new DismissRequestEventSource_Factory(h4t0Var);
    }

    public static DismissRequestEventSource newInstance(qwa qwaVar) {
        return new DismissRequestEventSource(qwaVar);
    }

    @Override // p204p.i4t0
    public DismissRequestEventSource get() {
        return newInstance((qwa) this.delegateProvider.get());
    }
}
