package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p204p.gcu0;
import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class InternetConnectionStateEventSource_Factory implements h4t0 {
    private final h4t0 reachabilityMonitorProvider;

    private InternetConnectionStateEventSource_Factory(h4t0 h4t0Var) {
        this.reachabilityMonitorProvider = h4t0Var;
    }

    public static InternetConnectionStateEventSource_Factory create(h4t0 h4t0Var) {
        return new InternetConnectionStateEventSource_Factory(h4t0Var);
    }

    public static InternetConnectionStateEventSource newInstance(gcu0 gcu0Var) {
        return new InternetConnectionStateEventSource(gcu0Var);
    }

    @Override // p204p.i4t0
    public InternetConnectionStateEventSource get() {
        return newInstance((gcu0) this.reachabilityMonitorProvider.get());
    }
}
