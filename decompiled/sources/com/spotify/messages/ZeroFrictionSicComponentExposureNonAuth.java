package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tye1;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ZeroFrictionSicComponentExposureNonAuth extends AbstractC0269h implements sre0 {
    public static final int COMPONENT_NAME_FIELD_NUMBER = 3;
    public static final int COMPONENT_TYPE_FIELD_NUMBER = 4;
    private static final ZeroFrictionSicComponentExposureNonAuth DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String spotifyId_ = "";
    private String requestId_ = "";
    private String componentName_ = "";
    private String componentType_ = "";

    static {
        ZeroFrictionSicComponentExposureNonAuth zeroFrictionSicComponentExposureNonAuth = new ZeroFrictionSicComponentExposureNonAuth();
        DEFAULT_INSTANCE = zeroFrictionSicComponentExposureNonAuth;
        AbstractC0269h.registerDefaultInstance(ZeroFrictionSicComponentExposureNonAuth.class, zeroFrictionSicComponentExposureNonAuth);
    }

    private ZeroFrictionSicComponentExposureNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14938n(ZeroFrictionSicComponentExposureNonAuth zeroFrictionSicComponentExposureNonAuth, String str) {
        zeroFrictionSicComponentExposureNonAuth.getClass();
        zeroFrictionSicComponentExposureNonAuth.bitField0_ |= 4;
        zeroFrictionSicComponentExposureNonAuth.componentName_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14939o(ZeroFrictionSicComponentExposureNonAuth zeroFrictionSicComponentExposureNonAuth, String str) {
        zeroFrictionSicComponentExposureNonAuth.getClass();
        str.getClass();
        zeroFrictionSicComponentExposureNonAuth.bitField0_ |= 2;
        zeroFrictionSicComponentExposureNonAuth.requestId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14940p(ZeroFrictionSicComponentExposureNonAuth zeroFrictionSicComponentExposureNonAuth, String str) {
        zeroFrictionSicComponentExposureNonAuth.getClass();
        zeroFrictionSicComponentExposureNonAuth.bitField0_ |= 1;
        zeroFrictionSicComponentExposureNonAuth.spotifyId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static tye1 m14941q() {
        return (tye1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "spotifyId_", "requestId_", "componentName_", "componentType_"});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionSicComponentExposureNonAuth();
        }
        if (iOrdinal == 4) {
            return new tye1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionSicComponentExposureNonAuth.class) {
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
