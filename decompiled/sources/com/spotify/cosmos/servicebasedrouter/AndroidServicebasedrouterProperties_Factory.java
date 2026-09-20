package com.spotify.cosmos.servicebasedrouter;

import p204p.bji;
import p204p.h4t0;

/* JADX INFO: loaded from: classes6.dex */
public final class AndroidServicebasedrouterProperties_Factory implements h4t0 {
    private final h4t0 configProvider;

    private AndroidServicebasedrouterProperties_Factory(h4t0 h4t0Var) {
        this.configProvider = h4t0Var;
    }

    public static AndroidServicebasedrouterProperties_Factory create(h4t0 h4t0Var) {
        return new AndroidServicebasedrouterProperties_Factory(h4t0Var);
    }

    public static AndroidServicebasedrouterProperties newInstance(bji bjiVar) {
        return new AndroidServicebasedrouterProperties(bjiVar);
    }

    @Override // p204p.i4t0
    public AndroidServicebasedrouterProperties get() {
        return newInstance((bji) this.configProvider.get());
    }
}
