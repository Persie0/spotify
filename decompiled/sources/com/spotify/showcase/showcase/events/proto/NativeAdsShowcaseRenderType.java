package com.spotify.showcase.showcase.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cwi0;
import p204p.fwi0;
import p204p.g6f0;
import p204p.gwi0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class NativeAdsShowcaseRenderType extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int CONTENT_URI_FIELD_NUMBER = 3;
    private static final NativeAdsShowcaseRenderType DEFAULT_INSTANCE;
    public static final int FLIGHT_ID_FIELD_NUMBER = 2;
    public static final int HAS_COMPANION_VIDEO_FIELD_NUMBER = 10;
    public static final int IS_MDC_ENABLED_FIELD_NUMBER = 7;
    public static final int IS_SINGLE_RELEASE_FIELD_NUMBER = 9;
    public static final int MUSIC_VIDEO_FALLBACK_REASON_FIELD_NUMBER = 13;
    public static final int MUSIC_VIDEO_TRAIT_RESOLVED_FIELD_NUMBER = 12;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 11;
    public static final int RENDERED_WITH_MDC_FIELD_NUMBER = 8;
    public static final int SHOWCASE_TYPE_FIELD_NUMBER = 5;
    public static final int SURFACE_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean hasCompanionVideo_;
    private boolean isMdcEnabled_;
    private boolean isSingleRelease_;
    private int musicVideoFallbackReason_;
    private boolean musicVideoTraitResolved_;
    private int platform_;
    private boolean renderedWithMdc_;
    private int showcaseType_;
    private int surface_;
    private String adId_ = "";
    private String flightId_ = "";
    private String contentUri_ = "";
    private String navigationUri_ = "";

    static {
        NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType = new NativeAdsShowcaseRenderType();
        DEFAULT_INSTANCE = nativeAdsShowcaseRenderType;
        AbstractC0269h.registerDefaultInstance(NativeAdsShowcaseRenderType.class, nativeAdsShowcaseRenderType);
    }

    private NativeAdsShowcaseRenderType() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21276n(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, String str) {
        nativeAdsShowcaseRenderType.getClass();
        str.getClass();
        nativeAdsShowcaseRenderType.bitField0_ |= 1;
        nativeAdsShowcaseRenderType.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21277o(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, String str) {
        nativeAdsShowcaseRenderType.getClass();
        str.getClass();
        nativeAdsShowcaseRenderType.bitField0_ |= 4;
        nativeAdsShowcaseRenderType.contentUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21278p(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, String str) {
        nativeAdsShowcaseRenderType.getClass();
        str.getClass();
        nativeAdsShowcaseRenderType.bitField0_ |= 2;
        nativeAdsShowcaseRenderType.flightId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21279q(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, boolean z) {
        nativeAdsShowcaseRenderType.bitField0_ |= 512;
        nativeAdsShowcaseRenderType.hasCompanionVideo_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m21280r(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, boolean z) {
        nativeAdsShowcaseRenderType.bitField0_ |= 64;
        nativeAdsShowcaseRenderType.isMdcEnabled_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m21281s(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, boolean z) {
        nativeAdsShowcaseRenderType.bitField0_ |= 256;
        nativeAdsShowcaseRenderType.isSingleRelease_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m21282t(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, String str) {
        nativeAdsShowcaseRenderType.getClass();
        str.getClass();
        nativeAdsShowcaseRenderType.bitField0_ |= 8;
        nativeAdsShowcaseRenderType.navigationUri_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m21283u(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType) {
        nativeAdsShowcaseRenderType.getClass();
        nativeAdsShowcaseRenderType.platform_ = 1;
        nativeAdsShowcaseRenderType.bitField0_ |= 1024;
    }

    /* JADX INFO: renamed from: v */
    public static void m21284v(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, boolean z) {
        nativeAdsShowcaseRenderType.bitField0_ |= 128;
        nativeAdsShowcaseRenderType.renderedWithMdc_ = z;
    }

    /* JADX INFO: renamed from: w */
    public static void m21285w(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, fwi0 fwi0Var) {
        nativeAdsShowcaseRenderType.getClass();
        nativeAdsShowcaseRenderType.showcaseType_ = fwi0Var.f74078a;
        nativeAdsShowcaseRenderType.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: x */
    public static void m21286x(NativeAdsShowcaseRenderType nativeAdsShowcaseRenderType, gwi0 gwi0Var) {
        nativeAdsShowcaseRenderType.getClass();
        nativeAdsShowcaseRenderType.surface_ = gwi0Var.f85016a;
        nativeAdsShowcaseRenderType.bitField0_ |= 32;
    }

    /* JADX INFO: renamed from: y */
    public static cwi0 m21287y() {
        return (cwi0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000b᠌\n\fဇ\u000b\r᠌\f", new Object[]{"bitField0_", "adId_", "flightId_", "contentUri_", "navigationUri_", "showcaseType_", g6f0.f77032e, "surface_", g6f0.f77033f, "isMdcEnabled_", "renderedWithMdc_", "isSingleRelease_", "hasCompanionVideo_", "platform_", g6f0.f77031d, "musicVideoTraitResolved_", "musicVideoFallbackReason_", g6f0.f77030c});
        }
        if (iOrdinal == 3) {
            return new NativeAdsShowcaseRenderType();
        }
        if (iOrdinal == 4) {
            return new cwi0(DEFAULT_INSTANCE);
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
        synchronized (NativeAdsShowcaseRenderType.class) {
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
