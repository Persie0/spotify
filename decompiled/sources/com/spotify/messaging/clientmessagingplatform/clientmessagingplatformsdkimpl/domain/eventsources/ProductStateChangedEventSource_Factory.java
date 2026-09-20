package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p204p.h4t0;
import p204p.qwx0;

/* JADX INFO: loaded from: classes8.dex */
public final class ProductStateChangedEventSource_Factory implements h4t0 {
    private final h4t0 productStateProvider;

    private ProductStateChangedEventSource_Factory(h4t0 h4t0Var) {
        this.productStateProvider = h4t0Var;
    }

    public static ProductStateChangedEventSource_Factory create(h4t0 h4t0Var) {
        return new ProductStateChangedEventSource_Factory(h4t0Var);
    }

    public static ProductStateChangedEventSource newInstance(qwx0 qwx0Var) {
        return new ProductStateChangedEventSource(qwx0Var);
    }

    @Override // p204p.i4t0
    public ProductStateChangedEventSource get() {
        return newInstance((qwx0) this.productStateProvider.get());
    }
}
