package com.spotify.agesignal.agesignalverifierimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae5;
import p204p.be5;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AppStoreAgeSignalGeneric extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 3;
    private static final AppStoreAgeSignalGeneric DEFAULT_INSTANCE;
    public static final int GENERIC_EVENT_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private ihc0 data_ = ihc0.f102235b;
    private String spotifyId_ = "";
    private String genericEventId_ = "";

    static {
        AppStoreAgeSignalGeneric appStoreAgeSignalGeneric = new AppStoreAgeSignalGeneric();
        DEFAULT_INSTANCE = appStoreAgeSignalGeneric;
        AbstractC0269h.registerDefaultInstance(AppStoreAgeSignalGeneric.class, appStoreAgeSignalGeneric);
    }

    private AppStoreAgeSignalGeneric() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m3027n(AppStoreAgeSignalGeneric appStoreAgeSignalGeneric) {
        ihc0 ihc0Var = appStoreAgeSignalGeneric.data_;
        if (!ihc0Var.f102236a) {
            appStoreAgeSignalGeneric.data_ = ihc0Var.m50613h();
        }
        return appStoreAgeSignalGeneric.data_;
    }

    /* JADX INFO: renamed from: o */
    public static void m3028o(AppStoreAgeSignalGeneric appStoreAgeSignalGeneric, String str) {
        appStoreAgeSignalGeneric.getClass();
        str.getClass();
        appStoreAgeSignalGeneric.bitField0_ |= 2;
        appStoreAgeSignalGeneric.genericEventId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3029p(AppStoreAgeSignalGeneric appStoreAgeSignalGeneric, String str) {
        appStoreAgeSignalGeneric.getClass();
        appStoreAgeSignalGeneric.bitField0_ |= 1;
        appStoreAgeSignalGeneric.spotifyId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ae5 m3030q() {
        return (ae5) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032", new Object[]{"bitField0_", "spotifyId_", "genericEventId_", "data_", be5.f26283a});
        }
        if (iOrdinal == 3) {
            return new AppStoreAgeSignalGeneric();
        }
        if (iOrdinal == 4) {
            return new ae5(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (AppStoreAgeSignalGeneric.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
