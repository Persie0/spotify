package com.spotify.cosmos.sharedcosmosrouterservice;

import p204p.h4t0;
import p204p.xtk;

/* JADX INFO: loaded from: classes6.dex */
public final class SharedCosmosRouterService_Factory implements h4t0 {
    private final h4t0 coreThreadingApiProvider;
    private final h4t0 remoteRouterFactoryProvider;

    private SharedCosmosRouterService_Factory(h4t0 h4t0Var, h4t0 h4t0Var2) {
        this.coreThreadingApiProvider = h4t0Var;
        this.remoteRouterFactoryProvider = h4t0Var2;
    }

    public static SharedCosmosRouterService_Factory create(h4t0 h4t0Var, h4t0 h4t0Var2) {
        return new SharedCosmosRouterService_Factory(h4t0Var, h4t0Var2);
    }

    public static SharedCosmosRouterService newInstance(xtk xtkVar, RemoteRouterFactory remoteRouterFactory) {
        return new SharedCosmosRouterService(xtkVar, remoteRouterFactory);
    }

    @Override // p204p.i4t0
    public SharedCosmosRouterService get() {
        return newInstance((xtk) this.coreThreadingApiProvider.get(), (RemoteRouterFactory) this.remoteRouterFactoryProvider.get());
    }
}
