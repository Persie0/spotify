package com.spotify.localfiles.settings.localfiles.impl;

import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalFilesLibrarySettingsItemFactoryImpl_Factory implements h4t0 {

    public static final class InstanceHolder {
        static final LocalFilesLibrarySettingsItemFactoryImpl_Factory INSTANCE = new LocalFilesLibrarySettingsItemFactoryImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static LocalFilesLibrarySettingsItemFactoryImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LocalFilesLibrarySettingsItemFactoryImpl newInstance() {
        return new LocalFilesLibrarySettingsItemFactoryImpl();
    }

    @Override // p204p.i4t0
    public LocalFilesLibrarySettingsItemFactoryImpl get() {
        return newInstance();
    }
}
