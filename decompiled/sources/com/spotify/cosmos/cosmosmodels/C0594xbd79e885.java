package com.spotify.cosmos.cosmosmodels;

import p204p.h4t0;
import p204p.jg31;

/* JADX INFO: renamed from: com.spotify.cosmos.cosmosmodels.CosmosTypeAdapterModule_Companion_ProvideCosmosTypeAdapterFactoryFactory */
/* JADX INFO: loaded from: classes.dex */
public final class C0594xbd79e885 implements h4t0 {

    /* JADX INFO: renamed from: com.spotify.cosmos.cosmosmodels.CosmosTypeAdapterModule_Companion_ProvideCosmosTypeAdapterFactoryFactory$InstanceHolder */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class InstanceHolder {
        static final C0594xbd79e885 INSTANCE = new C0594xbd79e885();

        private InstanceHolder() {
        }
    }

    public static C0594xbd79e885 create() {
        return InstanceHolder.INSTANCE;
    }

    public static Object provideCosmosTypeAdapterFactory() {
        Object objProvideCosmosTypeAdapterFactory = CosmosTypeAdapterModule.INSTANCE.provideCosmosTypeAdapterFactory();
        jg31.m53272j(objProvideCosmosTypeAdapterFactory);
        return objProvideCosmosTypeAdapterFactory;
    }

    @Override // p204p.i4t0
    public Object get() {
        return provideCosmosTypeAdapterFactory();
    }
}
