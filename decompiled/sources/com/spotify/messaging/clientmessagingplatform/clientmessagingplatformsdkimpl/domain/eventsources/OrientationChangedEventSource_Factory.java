package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import android.content.Context;
import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class OrientationChangedEventSource_Factory implements h4t0 {
    private final h4t0 contextProvider;

    private OrientationChangedEventSource_Factory(h4t0 h4t0Var) {
        this.contextProvider = h4t0Var;
    }

    public static OrientationChangedEventSource_Factory create(h4t0 h4t0Var) {
        return new OrientationChangedEventSource_Factory(h4t0Var);
    }

    public static OrientationChangedEventSource newInstance(Context context) {
        return new OrientationChangedEventSource(context);
    }

    @Override // p204p.i4t0
    public OrientationChangedEventSource get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
