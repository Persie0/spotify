package com.spotify.agesignal.agesignalverifierimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ce5;
import p204p.de5;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AppStoreAgeSignalGenericNonAuth extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 3;
    private static final AppStoreAgeSignalGenericNonAuth DEFAULT_INSTANCE;
    public static final int GENERIC_EVENT_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private ihc0 data_ = ihc0.f102235b;
    private String spotifyId_ = "";
    private String genericEventId_ = "";
    private String sessionId_ = "";

    static {
        AppStoreAgeSignalGenericNonAuth appStoreAgeSignalGenericNonAuth = new AppStoreAgeSignalGenericNonAuth();
        DEFAULT_INSTANCE = appStoreAgeSignalGenericNonAuth;
        AbstractC0269h.registerDefaultInstance(AppStoreAgeSignalGenericNonAuth.class, appStoreAgeSignalGenericNonAuth);
    }

    private AppStoreAgeSignalGenericNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m3031n(AppStoreAgeSignalGenericNonAuth appStoreAgeSignalGenericNonAuth) {
        ihc0 ihc0Var = appStoreAgeSignalGenericNonAuth.data_;
        if (!ihc0Var.f102236a) {
            appStoreAgeSignalGenericNonAuth.data_ = ihc0Var.m50613h();
        }
        return appStoreAgeSignalGenericNonAuth.data_;
    }

    /* JADX INFO: renamed from: o */
    public static void m3032o(AppStoreAgeSignalGenericNonAuth appStoreAgeSignalGenericNonAuth, String str) {
        appStoreAgeSignalGenericNonAuth.getClass();
        str.getClass();
        appStoreAgeSignalGenericNonAuth.bitField0_ |= 2;
        appStoreAgeSignalGenericNonAuth.genericEventId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3033p(AppStoreAgeSignalGenericNonAuth appStoreAgeSignalGenericNonAuth, String str) {
        appStoreAgeSignalGenericNonAuth.getClass();
        appStoreAgeSignalGenericNonAuth.bitField0_ |= 4;
        appStoreAgeSignalGenericNonAuth.sessionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3034q(AppStoreAgeSignalGenericNonAuth appStoreAgeSignalGenericNonAuth, String str) {
        appStoreAgeSignalGenericNonAuth.getClass();
        appStoreAgeSignalGenericNonAuth.bitField0_ |= 1;
        appStoreAgeSignalGenericNonAuth.spotifyId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static ce5 m3035r() {
        return (ce5) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032\u0004ဈ\u0002", new Object[]{"bitField0_", "spotifyId_", "genericEventId_", "data_", de5.f47969a, "sessionId_"});
        }
        if (iOrdinal == 3) {
            return new AppStoreAgeSignalGenericNonAuth();
        }
        if (iOrdinal == 4) {
            return new ce5(DEFAULT_INSTANCE);
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
        synchronized (AppStoreAgeSignalGenericNonAuth.class) {
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
