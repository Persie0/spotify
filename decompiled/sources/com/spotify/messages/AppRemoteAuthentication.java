package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.kd5;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class AppRemoteAuthentication extends AbstractC0269h implements sre0 {
    public static final int APP_SIGNATURE_FIELD_NUMBER = 2;
    public static final int CLIENT_ID_FIELD_NUMBER = 3;
    private static final AppRemoteAuthentication DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String packageName_ = "";
    private String appSignature_ = "";
    private String clientId_ = "";

    static {
        AppRemoteAuthentication appRemoteAuthentication = new AppRemoteAuthentication();
        DEFAULT_INSTANCE = appRemoteAuthentication;
        AbstractC0269h.registerDefaultInstance(AppRemoteAuthentication.class, appRemoteAuthentication);
    }

    private AppRemoteAuthentication() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13568n(AppRemoteAuthentication appRemoteAuthentication, String str) {
        appRemoteAuthentication.getClass();
        str.getClass();
        appRemoteAuthentication.bitField0_ |= 2;
        appRemoteAuthentication.appSignature_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13569o(AppRemoteAuthentication appRemoteAuthentication, String str) {
        appRemoteAuthentication.getClass();
        str.getClass();
        appRemoteAuthentication.bitField0_ |= 4;
        appRemoteAuthentication.clientId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13570p(AppRemoteAuthentication appRemoteAuthentication, String str) {
        appRemoteAuthentication.getClass();
        str.getClass();
        appRemoteAuthentication.bitField0_ |= 1;
        appRemoteAuthentication.packageName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static kd5 m13571q() {
        return (kd5) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "appSignature_", "clientId_"});
        }
        if (iOrdinal == 3) {
            return new AppRemoteAuthentication();
        }
        if (iOrdinal == 4) {
            return new kd5(DEFAULT_INSTANCE);
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
        synchronized (AppRemoteAuthentication.class) {
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
