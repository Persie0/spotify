package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p204p.gzb;
import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class CarStateEventSource_Factory implements h4t0 {
    private final h4t0 carDetectionStateProvider;

    private CarStateEventSource_Factory(h4t0 h4t0Var) {
        this.carDetectionStateProvider = h4t0Var;
    }

    public static CarStateEventSource_Factory create(h4t0 h4t0Var) {
        return new CarStateEventSource_Factory(h4t0Var);
    }

    public static CarStateEventSource newInstance(gzb gzbVar) {
        return new CarStateEventSource(gzbVar);
    }

    @Override // p204p.i4t0
    public CarStateEventSource get() {
        return newInstance((gzb) this.carDetectionStateProvider.get());
    }
}
