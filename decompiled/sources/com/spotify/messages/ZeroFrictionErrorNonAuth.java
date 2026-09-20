package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.iye1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ZeroFrictionErrorNonAuth extends AbstractC0269h implements sre0 {
    private static final ZeroFrictionErrorNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_DATA_FIELD_NUMBER = 6;
    public static final int ERROR_TYPE_ID_FIELD_NUMBER = 4;
    public static final int INPUT_FIELD_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SCREEN_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String spotifyId_ = "";
    private String sessionId_ = "";
    private String screenId_ = "";
    private String errorTypeId_ = "";
    private String inputFieldId_ = "";
    private String errorData_ = "";

    static {
        ZeroFrictionErrorNonAuth zeroFrictionErrorNonAuth = new ZeroFrictionErrorNonAuth();
        DEFAULT_INSTANCE = zeroFrictionErrorNonAuth;
        AbstractC0269h.registerDefaultInstance(ZeroFrictionErrorNonAuth.class, zeroFrictionErrorNonAuth);
    }

    private ZeroFrictionErrorNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14899n(ZeroFrictionErrorNonAuth zeroFrictionErrorNonAuth, String str) {
        zeroFrictionErrorNonAuth.getClass();
        zeroFrictionErrorNonAuth.bitField0_ |= 32;
        zeroFrictionErrorNonAuth.errorData_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14900o(ZeroFrictionErrorNonAuth zeroFrictionErrorNonAuth, String str) {
        zeroFrictionErrorNonAuth.getClass();
        str.getClass();
        zeroFrictionErrorNonAuth.bitField0_ |= 8;
        zeroFrictionErrorNonAuth.errorTypeId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14901p(ZeroFrictionErrorNonAuth zeroFrictionErrorNonAuth, String str) {
        zeroFrictionErrorNonAuth.getClass();
        zeroFrictionErrorNonAuth.bitField0_ |= 16;
        zeroFrictionErrorNonAuth.inputFieldId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14902q(ZeroFrictionErrorNonAuth zeroFrictionErrorNonAuth, String str) {
        zeroFrictionErrorNonAuth.getClass();
        str.getClass();
        zeroFrictionErrorNonAuth.bitField0_ |= 4;
        zeroFrictionErrorNonAuth.screenId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14903r(ZeroFrictionErrorNonAuth zeroFrictionErrorNonAuth, String str) {
        zeroFrictionErrorNonAuth.getClass();
        zeroFrictionErrorNonAuth.bitField0_ |= 2;
        zeroFrictionErrorNonAuth.sessionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14904s(ZeroFrictionErrorNonAuth zeroFrictionErrorNonAuth, String str) {
        zeroFrictionErrorNonAuth.getClass();
        zeroFrictionErrorNonAuth.bitField0_ |= 1;
        zeroFrictionErrorNonAuth.spotifyId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static iye1 m14905t() {
        return (iye1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "screenId_", "errorTypeId_", "inputFieldId_", "errorData_"});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionErrorNonAuth();
        }
        if (iOrdinal == 4) {
            return new iye1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionErrorNonAuth.class) {
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
