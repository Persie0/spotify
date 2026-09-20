package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p204p.h4t0;
import p204p.hza;
import p204p.mwa;
import p204p.xya;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageRequestEventSource_Factory implements h4t0 {
    private final h4t0 customClientRequestDelegateProvider;
    private final h4t0 navigationChangedRequestDelegateProvider;
    private final h4t0 playbackStartedRequestDelegateProvider;

    private MessageRequestEventSource_Factory(h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3) {
        this.customClientRequestDelegateProvider = h4t0Var;
        this.navigationChangedRequestDelegateProvider = h4t0Var2;
        this.playbackStartedRequestDelegateProvider = h4t0Var3;
    }

    public static MessageRequestEventSource_Factory create(h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3) {
        return new MessageRequestEventSource_Factory(h4t0Var, h4t0Var2, h4t0Var3);
    }

    public static MessageRequestEventSource newInstance(mwa mwaVar, xya xyaVar, hza hzaVar) {
        return new MessageRequestEventSource(mwaVar, xyaVar, hzaVar);
    }

    @Override // p204p.i4t0
    public MessageRequestEventSource get() {
        return newInstance((mwa) this.customClientRequestDelegateProvider.get(), (xya) this.navigationChangedRequestDelegateProvider.get(), (hza) this.playbackStartedRequestDelegateProvider.get());
    }
}
