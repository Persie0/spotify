package com.spotify.localfiles.settings.localfiles.impl;

import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalFilesSettingsValueAccessor_Factory implements h4t0 {
    private final h4t0 localFilesFeatureProvider;

    private LocalFilesSettingsValueAccessor_Factory(h4t0 h4t0Var) {
        this.localFilesFeatureProvider = h4t0Var;
    }

    public static LocalFilesSettingsValueAccessor_Factory create(h4t0 h4t0Var) {
        return new LocalFilesSettingsValueAccessor_Factory(h4t0Var);
    }

    public static LocalFilesSettingsValueAccessor newInstance(LocalFilesFeature localFilesFeature) {
        return new LocalFilesSettingsValueAccessor(localFilesFeature);
    }

    @Override // p204p.i4t0
    public LocalFilesSettingsValueAccessor get() {
        return newInstance((LocalFilesFeature) this.localFilesFeatureProvider.get());
    }
}
