package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ixf;
import p204p.ore0;
import p204p.p2m0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PDPComponent extends AbstractC0269h implements sre0 {
    public static final int BENEFITS_FIELD_NUMBER = 5;
    public static final int COMPONENT_TYPE_FIELD_NUMBER = 1;
    private static final PDPComponent DEFAULT_INSTANCE;
    public static final int FEATURE_CARD_FIELD_NUMBER = 8;
    public static final int GROUPED_OFFER_CARDS_FIELD_NUMBER = 9;
    public static final int HEADER_CTA_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int LEGAL_TEXT_FIELD_NUMBER = 4;
    public static final int OFFER_CARD_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SECTION_HEADER_FIELD_NUMBER = 6;
    private int componentCase_ = 0;
    private int componentType_;
    private Object component_;

    static {
        PDPComponent pDPComponent = new PDPComponent();
        DEFAULT_INSTANCE = pDPComponent;
        AbstractC0269h.registerDefaultInstance(PDPComponent.class, pDPComponent);
    }

    private PDPComponent() {
    }

    /* JADX INFO: renamed from: G */
    public static p2m0 m19590G() {
        return (p2m0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m19591n(PDPComponent pDPComponent, PremiumBenefitsSection premiumBenefitsSection) {
        pDPComponent.getClass();
        premiumBenefitsSection.getClass();
        pDPComponent.component_ = premiumBenefitsSection;
        pDPComponent.componentCase_ = 5;
    }

    /* JADX INFO: renamed from: o */
    public static void m19592o(PDPComponent pDPComponent, ixf ixfVar) {
        pDPComponent.getClass();
        pDPComponent.componentType_ = ixfVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m19593p(PDPComponent pDPComponent, PremiumFeatureCard premiumFeatureCard) {
        pDPComponent.getClass();
        premiumFeatureCard.getClass();
        pDPComponent.component_ = premiumFeatureCard;
        pDPComponent.componentCase_ = 8;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19594q(PDPComponent pDPComponent, GroupedOfferCards groupedOfferCards) {
        pDPComponent.getClass();
        groupedOfferCards.getClass();
        pDPComponent.component_ = groupedOfferCards;
        pDPComponent.componentCase_ = 9;
    }

    /* JADX INFO: renamed from: r */
    public static void m19595r(PDPComponent pDPComponent, PremiumPageHeader premiumPageHeader) {
        pDPComponent.getClass();
        premiumPageHeader.getClass();
        pDPComponent.component_ = premiumPageHeader;
        pDPComponent.componentCase_ = 2;
    }

    /* JADX INFO: renamed from: s */
    public static void m19596s(PDPComponent pDPComponent, HeaderCTA headerCTA) {
        pDPComponent.getClass();
        headerCTA.getClass();
        pDPComponent.component_ = headerCTA;
        pDPComponent.componentCase_ = 3;
    }

    /* JADX INFO: renamed from: t */
    public static void m19597t(PDPComponent pDPComponent, PremiumLegalText premiumLegalText) {
        pDPComponent.getClass();
        premiumLegalText.getClass();
        pDPComponent.component_ = premiumLegalText;
        pDPComponent.componentCase_ = 4;
    }

    /* JADX INFO: renamed from: u */
    public static void m19598u(PDPComponent pDPComponent, PremiumOfferCard premiumOfferCard) {
        pDPComponent.getClass();
        premiumOfferCard.getClass();
        pDPComponent.component_ = premiumOfferCard;
        pDPComponent.componentCase_ = 7;
    }

    /* JADX INFO: renamed from: v */
    public static void m19599v(PDPComponent pDPComponent, PremiumSectionHeader premiumSectionHeader) {
        pDPComponent.getClass();
        premiumSectionHeader.getClass();
        pDPComponent.component_ = premiumSectionHeader;
        pDPComponent.componentCase_ = 6;
    }

    /* JADX INFO: renamed from: y */
    public static PDPComponent m19600y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final GroupedOfferCards m19601A() {
        return this.componentCase_ == 9 ? (GroupedOfferCards) this.component_ : GroupedOfferCards.m19562s();
    }

    /* JADX INFO: renamed from: B */
    public final PremiumPageHeader m19602B() {
        return this.componentCase_ == 2 ? (PremiumPageHeader) this.component_ : PremiumPageHeader.m19724s();
    }

    /* JADX INFO: renamed from: C */
    public final HeaderCTA m19603C() {
        return this.componentCase_ == 3 ? (HeaderCTA) this.component_ : HeaderCTA.m19571r();
    }

    /* JADX INFO: renamed from: D */
    public final PremiumLegalText m19604D() {
        return this.componentCase_ == 4 ? (PremiumLegalText) this.component_ : PremiumLegalText.m19672p();
    }

    /* JADX INFO: renamed from: E */
    public final PremiumOfferCard m19605E() {
        return this.componentCase_ == 7 ? (PremiumOfferCard) this.component_ : PremiumOfferCard.m19688D();
    }

    /* JADX INFO: renamed from: F */
    public final PremiumSectionHeader m19606F() {
        return this.componentCase_ == 6 ? (PremiumSectionHeader) this.component_ : PremiumSectionHeader.m19730q();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"component_", "componentCase_", "componentType_", PremiumPageHeader.class, HeaderCTA.class, PremiumLegalText.class, PremiumBenefitsSection.class, PremiumSectionHeader.class, PremiumOfferCard.class, PremiumFeatureCard.class, GroupedOfferCards.class});
        }
        if (iOrdinal == 3) {
            return new PDPComponent();
        }
        if (iOrdinal == 4) {
            return new p2m0(DEFAULT_INSTANCE);
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
        synchronized (PDPComponent.class) {
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

    /* JADX INFO: renamed from: w */
    public final PremiumBenefitsSection m19607w() {
        return this.componentCase_ == 5 ? (PremiumBenefitsSection) this.component_ : PremiumBenefitsSection.m19625q();
    }

    /* JADX INFO: renamed from: x */
    public final ixf m19608x() {
        ixf ixfVar;
        switch (this.componentType_) {
            case 0:
                ixfVar = ixf.UNKNOWN;
                break;
            case 1:
                ixfVar = ixf.HEADER;
                break;
            case 2:
                ixfVar = ixf.HEADER_CTA;
                break;
            case 3:
                ixfVar = ixf.LEGAL_TEXT;
                break;
            case 4:
                ixfVar = ixf.BENEFITS;
                break;
            case 5:
                ixfVar = ixf.SECTION_HEADER;
                break;
            case 6:
                ixfVar = ixf.OFFER_CARD;
                break;
            case 7:
                ixfVar = ixf.GROUPED_OFFER_CARDS;
                break;
            case 8:
                ixfVar = ixf.FEATURE_CARD;
                break;
            default:
                ixfVar = null;
                break;
        }
        return ixfVar == null ? ixf.UNRECOGNIZED : ixfVar;
    }

    /* JADX INFO: renamed from: z */
    public final PremiumFeatureCard m19609z() {
        return this.componentCase_ == 8 ? (PremiumFeatureCard) this.component_ : PremiumFeatureCard.m19664y();
    }
}
