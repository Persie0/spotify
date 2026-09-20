package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.nmq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumOfferCTA extends AbstractC0269h implements sre0 {
    public static final int CTA_CLICK_EVENT_FIELD_NUMBER = 2;
    private static final PremiumOfferCTA DEFAULT_INSTANCE;
    public static final int FLAVOR_PAGE_VIEW_MODEL_FIELD_NUMBER = 4;
    public static final int LOGGING_INFO_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int RENDER_SECONDARY_AS_PRIMARY_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private CTAClickEvent ctaClickEvent_;
    private FlavorPageViewModel flavorPageViewModel_;
    private LoggingInfo loggingInfo_;
    private boolean renderSecondaryAsPrimary_;
    private String title_ = "";

    static {
        PremiumOfferCTA premiumOfferCTA = new PremiumOfferCTA();
        DEFAULT_INSTANCE = premiumOfferCTA;
        AbstractC0269h.registerDefaultInstance(PremiumOfferCTA.class, premiumOfferCTA);
    }

    private PremiumOfferCTA() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19677n(PremiumOfferCTA premiumOfferCTA, CTAClickEvent cTAClickEvent) {
        premiumOfferCTA.getClass();
        cTAClickEvent.getClass();
        premiumOfferCTA.ctaClickEvent_ = cTAClickEvent;
        premiumOfferCTA.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m19678o(PremiumOfferCTA premiumOfferCTA, FlavorPageViewModel flavorPageViewModel) {
        premiumOfferCTA.getClass();
        premiumOfferCTA.flavorPageViewModel_ = flavorPageViewModel;
        premiumOfferCTA.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: p */
    public static void m19679p(PremiumOfferCTA premiumOfferCTA, LoggingInfo loggingInfo) {
        premiumOfferCTA.getClass();
        premiumOfferCTA.loggingInfo_ = loggingInfo;
        premiumOfferCTA.bitField0_ |= 8;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19680q(PremiumOfferCTA premiumOfferCTA, String str) {
        premiumOfferCTA.getClass();
        str.getClass();
        premiumOfferCTA.bitField0_ |= 1;
        premiumOfferCTA.title_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static PremiumOfferCTA m19681s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static nmq0 m19682x() {
        return (nmq0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003\u0007\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "title_", "ctaClickEvent_", "renderSecondaryAsPrimary_", "flavorPageViewModel_", "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new PremiumOfferCTA();
        }
        if (iOrdinal == 4) {
            return new nmq0(DEFAULT_INSTANCE);
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
        synchronized (PremiumOfferCTA.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: r */
    public final CTAClickEvent m19683r() {
        CTAClickEvent cTAClickEvent = this.ctaClickEvent_;
        return cTAClickEvent == null ? CTAClickEvent.m19541r() : cTAClickEvent;
    }

    /* JADX INFO: renamed from: t */
    public final FlavorPageViewModel m19684t() {
        FlavorPageViewModel flavorPageViewModel = this.flavorPageViewModel_;
        return flavorPageViewModel == null ? FlavorPageViewModel.m19551v() : flavorPageViewModel;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final LoggingInfo m19685u() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.m19578r() : loggingInfo;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m19686v() {
        return this.renderSecondaryAsPrimary_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m19687w() {
        return (this.bitField0_ & 4) != 0;
    }
}
