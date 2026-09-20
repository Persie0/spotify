package com.spotify.cosmos.servicebasedrouterimpl;

import com.spotify.cosmos.rxrouter.RxRouter;
import p204p.h4t0;

/* JADX INFO: loaded from: classes6.dex */
public final class RxFireAndForgetResolver_Factory implements h4t0 {
    private final h4t0 rxRouterProvider;

    private RxFireAndForgetResolver_Factory(h4t0 h4t0Var) {
        this.rxRouterProvider = h4t0Var;
    }

    public static RxFireAndForgetResolver_Factory create(h4t0 h4t0Var) {
        return new RxFireAndForgetResolver_Factory(h4t0Var);
    }

    public static RxFireAndForgetResolver newInstance(RxRouter rxRouter) {
        return new RxFireAndForgetResolver(rxRouter);
    }

    @Override // p204p.i4t0
    public RxFireAndForgetResolver get() {
        return newInstance((RxRouter) this.rxRouterProvider.get());
    }
}
