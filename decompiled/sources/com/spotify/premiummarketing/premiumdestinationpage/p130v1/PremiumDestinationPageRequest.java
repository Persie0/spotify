package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.hlq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumDestinationPageRequest extends AbstractC0269h implements sre0 {
    public static final int APP_STORE_FIELD_NUMBER = 16;
    public static final int BUILD_MODEL_FIELD_NUMBER = 6;
    public static final int CLIENT_TIME_ZONE_FIELD_NUMBER = 8;
    private static final PremiumDestinationPageRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    public static final int EXPERIMENTAL_RESOURCE_ID_FIELD_NUMBER = 2;
    public static final int MANUFACTURER_FIELD_NUMBER = 15;
    public static final int OVERRIDE_COUNTRY_FIELD_NUMBER = 11;
    public static final int OVERRIDE_ELIGIBILITY_FIELD_NUMBER = 10;
    public static final int OVERRIDE_HEADER_OFFER_UTC_STOP_DATE_FIELD_NUMBER = 13;
    public static final int OVERRIDE_PAGE_SOURCE_FIELD_NUMBER = 12;
    public static final int OVERRIDE_TIME_FIELD_NUMBER = 9;
    public static final int PAGE_ID_FIELD_NUMBER = 17;
    private static volatile r2n0 PARSER = null;
    public static final int PARTNER_ID_FIELD_NUMBER = 4;
    public static final int PREMIUM_PAGE_LOCALE_FIELD_NUMBER = 1;
    public static final int PREVIEW_ID_FIELD_NUMBER = 7;
    public static final int REFERRER_ID_FIELD_NUMBER = 5;
    public static final int SHOW_UNSAFE_UNPUBLISHED_CONTENT_FIELD_NUMBER = 14;
    private int bitField0_;
    private boolean showUnsafeUnpublishedContent_;
    private String premiumPageLocale_ = "";
    private String experimentalResourceId_ = "";
    private String deviceId_ = "";
    private String partnerId_ = "";
    private String referrerId_ = "";
    private String buildModel_ = "";
    private String previewId_ = "";
    private String clientTimeZone_ = "";
    private String overrideTime_ = "";
    private String overrideEligibility_ = "";
    private String overrideCountry_ = "";
    private String overridePageSource_ = "";
    private String overrideHeaderOfferUtcStopDate_ = "";
    private String manufacturer_ = "";
    private String appStore_ = "";
    private String pageId_ = "";

    static {
        PremiumDestinationPageRequest premiumDestinationPageRequest = new PremiumDestinationPageRequest();
        DEFAULT_INSTANCE = premiumDestinationPageRequest;
        AbstractC0269h.registerDefaultInstance(PremiumDestinationPageRequest.class, premiumDestinationPageRequest);
    }

    private PremiumDestinationPageRequest() {
    }

    /* JADX INFO: renamed from: A */
    public static void m19628A(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        str.getClass();
        premiumDestinationPageRequest.premiumPageLocale_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m19629B(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        str.getClass();
        premiumDestinationPageRequest.bitField0_ |= 32;
        premiumDestinationPageRequest.previewId_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m19630C(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        str.getClass();
        premiumDestinationPageRequest.bitField0_ |= 8;
        premiumDestinationPageRequest.referrerId_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m19631D(PremiumDestinationPageRequest premiumDestinationPageRequest, boolean z) {
        premiumDestinationPageRequest.bitField0_ |= 4096;
        premiumDestinationPageRequest.showUnsafeUnpublishedContent_ = z;
    }

    /* JADX INFO: renamed from: E */
    public static hlq0 m19632E() {
        return (hlq0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m19633n(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        premiumDestinationPageRequest.bitField0_ |= 16384;
        premiumDestinationPageRequest.appStore_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19634o(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        str.getClass();
        premiumDestinationPageRequest.bitField0_ |= 16;
        premiumDestinationPageRequest.buildModel_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19635p(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        str.getClass();
        premiumDestinationPageRequest.bitField0_ |= 64;
        premiumDestinationPageRequest.clientTimeZone_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19636q(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        premiumDestinationPageRequest.bitField0_ |= 2;
        premiumDestinationPageRequest.deviceId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m19637r(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        premiumDestinationPageRequest.bitField0_ |= 1;
        premiumDestinationPageRequest.experimentalResourceId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m19638s(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        premiumDestinationPageRequest.bitField0_ |= 8192;
        premiumDestinationPageRequest.manufacturer_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m19639t(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        premiumDestinationPageRequest.bitField0_ |= 512;
        premiumDestinationPageRequest.overrideCountry_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m19640u(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        str.getClass();
        premiumDestinationPageRequest.bitField0_ |= 256;
        premiumDestinationPageRequest.overrideEligibility_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m19641v(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        str.getClass();
        premiumDestinationPageRequest.bitField0_ |= 2048;
        premiumDestinationPageRequest.overrideHeaderOfferUtcStopDate_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m19642w(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        premiumDestinationPageRequest.bitField0_ |= 1024;
        premiumDestinationPageRequest.overridePageSource_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m19643x(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        str.getClass();
        premiumDestinationPageRequest.bitField0_ |= 128;
        premiumDestinationPageRequest.overrideTime_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m19644y(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        premiumDestinationPageRequest.bitField0_ |= 32768;
        premiumDestinationPageRequest.pageId_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m19645z(PremiumDestinationPageRequest premiumDestinationPageRequest, String str) {
        premiumDestinationPageRequest.getClass();
        str.getClass();
        premiumDestinationPageRequest.bitField0_ |= 4;
        premiumDestinationPageRequest.partnerId_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006ለ\u0004\u0007ለ\u0005\bለ\u0006\tለ\u0007\nለ\b\u000bለ\t\fለ\n\rለ\u000b\u000eဇ\f\u000fለ\r\u0010ለ\u000e\u0011ለ\u000f", new Object[]{"bitField0_", "premiumPageLocale_", "experimentalResourceId_", "deviceId_", "partnerId_", "referrerId_", "buildModel_", "previewId_", "clientTimeZone_", "overrideTime_", "overrideEligibility_", "overrideCountry_", "overridePageSource_", "overrideHeaderOfferUtcStopDate_", "showUnsafeUnpublishedContent_", "manufacturer_", "appStore_", "pageId_"});
        }
        if (iOrdinal == 3) {
            return new PremiumDestinationPageRequest();
        }
        if (iOrdinal == 4) {
            return new hlq0(DEFAULT_INSTANCE);
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
        synchronized (PremiumDestinationPageRequest.class) {
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
