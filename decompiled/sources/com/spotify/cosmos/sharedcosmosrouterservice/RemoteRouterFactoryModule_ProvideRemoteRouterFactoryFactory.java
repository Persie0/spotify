package com.spotify.cosmos.sharedcosmosrouterservice;

import p204p.h4t0;
import p204p.jg31;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteRouterFactoryModule_ProvideRemoteRouterFactoryFactory implements h4t0 {

    /* JADX INFO: loaded from: classes6.dex */
    public static final class InstanceHolder {
        static final RemoteRouterFactoryModule_ProvideRemoteRouterFactoryFactory INSTANCE = new RemoteRouterFactoryModule_ProvideRemoteRouterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static RemoteRouterFactoryModule_ProvideRemoteRouterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RemoteRouterFactory provideRemoteRouterFactory() {
        RemoteRouterFactory remoteRouterFactoryProvideRemoteRouterFactory = RemoteRouterFactoryModule.INSTANCE.provideRemoteRouterFactory();
        jg31.m53272j(remoteRouterFactoryProvideRemoteRouterFactory);
        return remoteRouterFactoryProvideRemoteRouterFactory;
    }

    @Override // p204p.i4t0
    public RemoteRouterFactory get() {
        return provideRemoteRouterFactory();
    }
}
