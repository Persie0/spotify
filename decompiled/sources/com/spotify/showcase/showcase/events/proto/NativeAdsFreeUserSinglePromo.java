package com.spotify.showcase.showcase.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vvi0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class NativeAdsFreeUserSinglePromo extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int CONTENT_URI_FIELD_NUMBER = 3;
    private static final NativeAdsFreeUserSinglePromo DEFAULT_INSTANCE;
    public static final int FLIGHT_ID_FIELD_NUMBER = 2;
    public static final int HAS_ON_DEMAND_ACCESS_FIELD_NUMBER = 4;
    public static final int NATIVE_AD_PROMOTION_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean hasOnDemandAccess_;
    private String adId_ = "";
    private String flightId_ = "";
    private String contentUri_ = "";
    private String nativeAdPromotion_ = "";

    static {
        NativeAdsFreeUserSinglePromo nativeAdsFreeUserSinglePromo = new NativeAdsFreeUserSinglePromo();
        DEFAULT_INSTANCE = nativeAdsFreeUserSinglePromo;
        AbstractC0269h.registerDefaultInstance(NativeAdsFreeUserSinglePromo.class, nativeAdsFreeUserSinglePromo);
    }

    private NativeAdsFreeUserSinglePromo() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21270n(NativeAdsFreeUserSinglePromo nativeAdsFreeUserSinglePromo, String str) {
        nativeAdsFreeUserSinglePromo.getClass();
        str.getClass();
        nativeAdsFreeUserSinglePromo.bitField0_ |= 1;
        nativeAdsFreeUserSinglePromo.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21271o(NativeAdsFreeUserSinglePromo nativeAdsFreeUserSinglePromo, String str) {
        nativeAdsFreeUserSinglePromo.getClass();
        str.getClass();
        nativeAdsFreeUserSinglePromo.bitField0_ |= 4;
        nativeAdsFreeUserSinglePromo.contentUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21272p(NativeAdsFreeUserSinglePromo nativeAdsFreeUserSinglePromo, String str) {
        nativeAdsFreeUserSinglePromo.getClass();
        str.getClass();
        nativeAdsFreeUserSinglePromo.bitField0_ |= 2;
        nativeAdsFreeUserSinglePromo.flightId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21273q(NativeAdsFreeUserSinglePromo nativeAdsFreeUserSinglePromo, boolean z) {
        nativeAdsFreeUserSinglePromo.bitField0_ |= 8;
        nativeAdsFreeUserSinglePromo.hasOnDemandAccess_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m21274r(NativeAdsFreeUserSinglePromo nativeAdsFreeUserSinglePromo) {
        nativeAdsFreeUserSinglePromo.getClass();
        nativeAdsFreeUserSinglePromo.bitField0_ |= 16;
        nativeAdsFreeUserSinglePromo.nativeAdPromotion_ = "showcase";
    }

    /* JADX INFO: renamed from: s */
    public static vvi0 m21275s() {
        return (vvi0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "adId_", "flightId_", "contentUri_", "hasOnDemandAccess_", "nativeAdPromotion_"});
        }
        if (iOrdinal == 3) {
            return new NativeAdsFreeUserSinglePromo();
        }
        if (iOrdinal == 4) {
            return new vvi0(DEFAULT_INSTANCE);
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
        synchronized (NativeAdsFreeUserSinglePromo.class) {
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
