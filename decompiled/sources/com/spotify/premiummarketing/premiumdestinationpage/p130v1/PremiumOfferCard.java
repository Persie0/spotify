package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ftk0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rmq0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumOfferCard extends AbstractC0269h implements sre0 {
    public static final int BADGE_TEXT_FIELD_NUMBER = 1;
    public static final int BENEFITS_FIELD_NUMBER = 6;
    public static final int COLOR_SET_FIELD_NUMBER = 8;
    private static final PremiumOfferCard DEFAULT_INSTANCE;
    public static final int FOOT_NOTE_TEXT_FIELD_NUMBER = 7;
    public static final int GBB_TAGLINE_FIELD_NUMBER = 12;
    public static final int GRADIENT_END_COLOR_FIELD_NUMBER = 15;
    public static final int GRADIENT_START_COLOR_FIELD_NUMBER = 14;
    public static final int HEADER_IMAGE_URL_FIELD_NUMBER = 13;
    public static final int LOGGING_INFO_FIELD_NUMBER = 11;
    public static final int OFFER_CARD_VERSION_FIELD_NUMBER = 16;
    private static volatile r2n0 PARSER = null;
    public static final int PERIOD_TEXT_FIELD_NUMBER = 4;
    public static final int PLAN_ADDITIONAL_PRICE_PERIOD_TEXT_FIELD_NUMBER = 5;
    public static final int PRICE_TEXT_FIELD_NUMBER = 3;
    public static final int PRIMARY_OFFER_CTA_FIELD_NUMBER = 9;
    public static final int SECONDARY_OFFER_CTA_FIELD_NUMBER = 10;
    public static final int TITLE_TEXT_FIELD_NUMBER = 2;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private int offerCardVersion_;
    private PremiumOfferCTA primaryOfferCta_;
    private PremiumOfferCTA secondaryOfferCta_;
    private String badgeText_ = "";
    private String titleText_ = "";
    private String priceText_ = "";
    private String periodText_ = "";
    private String planAdditionalPricePeriodText_ = "";
    private ae50 benefits_ = AbstractC0269h.emptyProtobufList();
    private String footNoteText_ = "";
    private String colorSet_ = "";
    private String gbbTagline_ = "";
    private String headerImageUrl_ = "";
    private String gradientStartColor_ = "";
    private String gradientEndColor_ = "";

    static {
        PremiumOfferCard premiumOfferCard = new PremiumOfferCard();
        DEFAULT_INSTANCE = premiumOfferCard;
        AbstractC0269h.registerDefaultInstance(PremiumOfferCard.class, premiumOfferCard);
    }

    private PremiumOfferCard() {
    }

    /* JADX INFO: renamed from: D */
    public static PremiumOfferCard m19688D() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static rmq0 m19689R() {
        return (rmq0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m19690n(PremiumOfferCard premiumOfferCard, OfferCardBenefitItem offerCardBenefitItem) {
        premiumOfferCard.getClass();
        offerCardBenefitItem.getClass();
        ae50 ae50Var = premiumOfferCard.benefits_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            premiumOfferCard.benefits_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        premiumOfferCard.benefits_.add(offerCardBenefitItem);
    }

    /* JADX INFO: renamed from: o */
    public static void m19691o(PremiumOfferCard premiumOfferCard, String str) {
        premiumOfferCard.getClass();
        str.getClass();
        premiumOfferCard.bitField0_ |= 1;
        premiumOfferCard.badgeText_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19692p(PremiumOfferCard premiumOfferCard, String str) {
        premiumOfferCard.getClass();
        premiumOfferCard.bitField0_ |= 64;
        premiumOfferCard.colorSet_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19693q(PremiumOfferCard premiumOfferCard, String str) {
        premiumOfferCard.getClass();
        premiumOfferCard.bitField0_ |= 32;
        premiumOfferCard.footNoteText_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m19694r(PremiumOfferCard premiumOfferCard, String str) {
        premiumOfferCard.getClass();
        premiumOfferCard.bitField0_ |= 1024;
        premiumOfferCard.gbbTagline_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m19695s(PremiumOfferCard premiumOfferCard, String str) {
        premiumOfferCard.getClass();
        premiumOfferCard.bitField0_ |= 2048;
        premiumOfferCard.headerImageUrl_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m19696t(PremiumOfferCard premiumOfferCard, LoggingInfo loggingInfo) {
        premiumOfferCard.getClass();
        premiumOfferCard.loggingInfo_ = loggingInfo;
        premiumOfferCard.bitField0_ |= 512;
    }

    /* JADX INFO: renamed from: u */
    public static void m19697u(PremiumOfferCard premiumOfferCard) {
        premiumOfferCard.getClass();
        premiumOfferCard.offerCardVersion_ = ftk0.V3.getNumber();
    }

    /* JADX INFO: renamed from: v */
    public static void m19698v(PremiumOfferCard premiumOfferCard, String str) {
        premiumOfferCard.getClass();
        premiumOfferCard.bitField0_ |= 8;
        premiumOfferCard.periodText_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m19699w(PremiumOfferCard premiumOfferCard, String str) {
        premiumOfferCard.getClass();
        premiumOfferCard.bitField0_ |= 4;
        premiumOfferCard.priceText_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m19700x(PremiumOfferCard premiumOfferCard, PremiumOfferCTA premiumOfferCTA) {
        premiumOfferCard.getClass();
        premiumOfferCTA.getClass();
        premiumOfferCard.primaryOfferCta_ = premiumOfferCTA;
        premiumOfferCard.bitField0_ |= 128;
    }

    /* JADX INFO: renamed from: y */
    public static void m19701y(PremiumOfferCard premiumOfferCard, PremiumOfferCTA premiumOfferCTA) {
        premiumOfferCard.getClass();
        premiumOfferCTA.getClass();
        premiumOfferCard.secondaryOfferCta_ = premiumOfferCTA;
        premiumOfferCard.bitField0_ |= 256;
    }

    /* JADX INFO: renamed from: z */
    public static void m19702z(PremiumOfferCard premiumOfferCard, String str) {
        premiumOfferCard.getClass();
        premiumOfferCard.bitField0_ |= 2;
        premiumOfferCard.titleText_ = str;
    }

    /* JADX INFO: renamed from: A */
    public final String m19703A() {
        return this.badgeText_;
    }

    /* JADX INFO: renamed from: B */
    public final ae50 m19704B() {
        return this.benefits_;
    }

    /* JADX INFO: renamed from: C */
    public final String m19705C() {
        return this.colorSet_;
    }

    /* JADX INFO: renamed from: E */
    public final String m19706E() {
        return this.footNoteText_;
    }

    /* JADX INFO: renamed from: F */
    public final String m19707F() {
        return this.gbbTagline_;
    }

    /* JADX INFO: renamed from: G */
    public final String m19708G() {
        return this.headerImageUrl_;
    }

    /* JADX INFO: renamed from: H */
    public final LoggingInfo m19709H() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.m19578r() : loggingInfo;
    }

    /* JADX INFO: renamed from: I */
    public final ftk0 m19710I() {
        ftk0 ftk0Var;
        int i = this.offerCardVersion_;
        if (i == 0) {
            ftk0Var = ftk0.UNKNOWN_VERSION;
        } else if (i == 1) {
            ftk0Var = ftk0.V1;
        } else if (i != 2) {
            ftk0Var = i != 3 ? null : ftk0.V3;
        } else {
            ftk0Var = ftk0.V2;
        }
        return ftk0Var == null ? ftk0.UNRECOGNIZED : ftk0Var;
    }

    /* JADX INFO: renamed from: J */
    public final String m19711J() {
        return this.periodText_;
    }

    /* JADX INFO: renamed from: K */
    public final String m19712K() {
        return this.planAdditionalPricePeriodText_;
    }

    /* JADX INFO: renamed from: L */
    public final String m19713L() {
        return this.priceText_;
    }

    /* JADX INFO: renamed from: M */
    public final PremiumOfferCTA m19714M() {
        PremiumOfferCTA premiumOfferCTA = this.primaryOfferCta_;
        return premiumOfferCTA == null ? PremiumOfferCTA.m19681s() : premiumOfferCTA;
    }

    /* JADX INFO: renamed from: N */
    public final PremiumOfferCTA m19715N() {
        PremiumOfferCTA premiumOfferCTA = this.secondaryOfferCta_;
        return premiumOfferCTA == null ? PremiumOfferCTA.m19681s() : premiumOfferCTA;
    }

    /* JADX INFO: renamed from: O */
    public final String m19716O() {
        return this.titleText_;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m19717P() {
        return (this.bitField0_ & 128) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m19718Q() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006\u001b\u0007ለ\u0005\bለ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fለ\n\rለ\u000b\u000eለ\f\u000fለ\r\u0010\f", new Object[]{"bitField0_", "badgeText_", "titleText_", "priceText_", "periodText_", "planAdditionalPricePeriodText_", "benefits_", OfferCardBenefitItem.class, "footNoteText_", "colorSet_", "primaryOfferCta_", "secondaryOfferCta_", "loggingInfo_", "gbbTagline_", "headerImageUrl_", "gradientStartColor_", "gradientEndColor_", "offerCardVersion_"});
        }
        if (iOrdinal == 3) {
            return new PremiumOfferCard();
        }
        if (iOrdinal == 4) {
            return new rmq0(DEFAULT_INSTANCE);
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
        synchronized (PremiumOfferCard.class) {
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
