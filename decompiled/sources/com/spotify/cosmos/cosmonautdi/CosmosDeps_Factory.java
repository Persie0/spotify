package com.spotify.cosmos.cosmonautdi;

import p204p.h4t0;
import p204p.i4t0;

/* JADX INFO: loaded from: classes6.dex */
public final class CosmosDeps_Factory implements h4t0 {
    private final h4t0 ioSchedulerProvider;
    private final h4t0 jsonProvider;
    private final h4t0 moshiProvider;
    private final h4t0 rxRouterProvider;
    private final h4t0 subscriptionTrackerProvider;

    private CosmosDeps_Factory(h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3, h4t0 h4t0Var4, h4t0 h4t0Var5) {
        this.ioSchedulerProvider = h4t0Var;
        this.subscriptionTrackerProvider = h4t0Var2;
        this.moshiProvider = h4t0Var3;
        this.rxRouterProvider = h4t0Var4;
        this.jsonProvider = h4t0Var5;
    }

    public static CosmosDeps_Factory create(h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3, h4t0 h4t0Var4, h4t0 h4t0Var5) {
        return new CosmosDeps_Factory(h4t0Var, h4t0Var2, h4t0Var3, h4t0Var4, h4t0Var5);
    }

    public static CosmosDeps newInstance(i4t0 i4t0Var, i4t0 i4t0Var2, i4t0 i4t0Var3, i4t0 i4t0Var4, i4t0 i4t0Var5) {
        return new CosmosDeps(i4t0Var, i4t0Var2, i4t0Var3, i4t0Var4, i4t0Var5);
    }

    @Override // p204p.i4t0
    public CosmosDeps get() {
        return newInstance(this.ioSchedulerProvider, this.subscriptionTrackerProvider, this.moshiProvider, this.rxRouterProvider, this.jsonProvider);
    }
}
