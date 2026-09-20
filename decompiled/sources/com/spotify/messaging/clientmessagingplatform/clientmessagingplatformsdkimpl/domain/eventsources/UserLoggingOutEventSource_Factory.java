package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import io.reactivex.rxjava3.core.Flowable;
import p204p.e301;
import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class UserLoggingOutEventSource_Factory implements h4t0 {
    private final h4t0 sessionStateProvider;

    private UserLoggingOutEventSource_Factory(h4t0 h4t0Var) {
        this.sessionStateProvider = h4t0Var;
    }

    public static UserLoggingOutEventSource_Factory create(h4t0 h4t0Var) {
        return new UserLoggingOutEventSource_Factory(h4t0Var);
    }

    public static UserLoggingOutEventSource newInstance(Flowable<e301> flowable) {
        return new UserLoggingOutEventSource(flowable);
    }

    @Override // p204p.i4t0
    public UserLoggingOutEventSource get() {
        return newInstance((Flowable) this.sessionStateProvider.get());
    }
}
