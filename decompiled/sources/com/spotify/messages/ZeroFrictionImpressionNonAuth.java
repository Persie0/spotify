package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qye1;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ZeroFrictionImpressionNonAuth extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 5;
    private static final ZeroFrictionImpressionNonAuth DEFAULT_INSTANCE;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SCREEN_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String spotifyId_ = "";
    private String sessionId_ = "";
    private String screenId_ = "";
    private String impressionId_ = "";
    private String context_ = "";

    static {
        ZeroFrictionImpressionNonAuth zeroFrictionImpressionNonAuth = new ZeroFrictionImpressionNonAuth();
        DEFAULT_INSTANCE = zeroFrictionImpressionNonAuth;
        AbstractC0269h.registerDefaultInstance(ZeroFrictionImpressionNonAuth.class, zeroFrictionImpressionNonAuth);
    }

    private ZeroFrictionImpressionNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14921n(ZeroFrictionImpressionNonAuth zeroFrictionImpressionNonAuth, String str) {
        zeroFrictionImpressionNonAuth.getClass();
        str.getClass();
        zeroFrictionImpressionNonAuth.bitField0_ |= 8;
        zeroFrictionImpressionNonAuth.impressionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14922o(ZeroFrictionImpressionNonAuth zeroFrictionImpressionNonAuth, String str) {
        zeroFrictionImpressionNonAuth.getClass();
        str.getClass();
        zeroFrictionImpressionNonAuth.bitField0_ |= 4;
        zeroFrictionImpressionNonAuth.screenId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14923p(ZeroFrictionImpressionNonAuth zeroFrictionImpressionNonAuth, String str) {
        zeroFrictionImpressionNonAuth.getClass();
        zeroFrictionImpressionNonAuth.bitField0_ |= 2;
        zeroFrictionImpressionNonAuth.sessionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14924q(ZeroFrictionImpressionNonAuth zeroFrictionImpressionNonAuth, String str) {
        zeroFrictionImpressionNonAuth.getClass();
        zeroFrictionImpressionNonAuth.bitField0_ |= 1;
        zeroFrictionImpressionNonAuth.spotifyId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static qye1 m14925r() {
        return (qye1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "screenId_", "impressionId_", "context_"});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionImpressionNonAuth();
        }
        if (iOrdinal == 4) {
            return new qye1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionImpressionNonAuth.class) {
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
