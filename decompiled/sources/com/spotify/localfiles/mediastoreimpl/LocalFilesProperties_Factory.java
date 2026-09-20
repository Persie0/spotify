package com.spotify.localfiles.mediastoreimpl;

import p204p.bji;
import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalFilesProperties_Factory implements h4t0 {
    private final h4t0 configProvider;

    private LocalFilesProperties_Factory(h4t0 h4t0Var) {
        this.configProvider = h4t0Var;
    }

    public static LocalFilesProperties_Factory create(h4t0 h4t0Var) {
        return new LocalFilesProperties_Factory(h4t0Var);
    }

    public static LocalFilesProperties newInstance(bji bjiVar) {
        return new LocalFilesProperties(bjiVar);
    }

    @Override // p204p.i4t0
    public LocalFilesProperties get() {
        return newInstance((bji) this.configProvider.get());
    }
}
