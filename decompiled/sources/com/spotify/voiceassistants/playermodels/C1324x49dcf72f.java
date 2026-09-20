package com.spotify.voiceassistants.playermodels;

import p204p.h4t0;
import p204p.jg31;

/* JADX INFO: renamed from: com.spotify.voiceassistants.playermodels.SpeakeasyPlayerModelsMoshiAdaptersModule_ProvideCommandPlayResponseCustomJsonAdapterFactory */
/* JADX INFO: loaded from: classes2.dex */
public final class C1324x49dcf72f implements h4t0 {

    /* JADX INFO: renamed from: com.spotify.voiceassistants.playermodels.SpeakeasyPlayerModelsMoshiAdaptersModule_ProvideCommandPlayResponseCustomJsonAdapterFactory$InstanceHolder */
    /* JADX INFO: loaded from: classes11.dex */
    public static final class InstanceHolder {
        static final C1324x49dcf72f INSTANCE = new C1324x49dcf72f();

        private InstanceHolder() {
        }
    }

    public static C1324x49dcf72f create() {
        return InstanceHolder.INSTANCE;
    }

    public static Object provideCommandPlayResponseCustomJsonAdapter() {
        Object objProvideCommandPlayResponseCustomJsonAdapter = SpeakeasyPlayerModelsMoshiAdaptersModule.INSTANCE.provideCommandPlayResponseCustomJsonAdapter();
        jg31.m53272j(objProvideCommandPlayResponseCustomJsonAdapter);
        return objProvideCommandPlayResponseCustomJsonAdapter;
    }

    @Override // p204p.i4t0
    public Object get() {
        return provideCommandPlayResponseCustomJsonAdapter();
    }
}
