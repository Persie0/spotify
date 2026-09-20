package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ca10;
import p204p.mco0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetPlanDetailsViewResponse extends AbstractC0269h implements sre0 {
    public static final int BENEFIT_LIST_CARD_FIELD_NUMBER = 2;
    private static final GetPlanDetailsViewResponse DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 4;
    public static final int OFFER_CARD_FIELD_NUMBER = 1;
    public static final int PAGE_TITLE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_TIER_FIELD_NUMBER = 3;
    private BenefitListCard benefitListCard_;
    private int bitField0_;
    private Disclaimer disclaimer_;
    private OfferCard offerCard_;
    private String pageTitle_ = "";
    private int planTier_;

    static {
        GetPlanDetailsViewResponse getPlanDetailsViewResponse = new GetPlanDetailsViewResponse();
        DEFAULT_INSTANCE = getPlanDetailsViewResponse;
        AbstractC0269h.registerDefaultInstance(GetPlanDetailsViewResponse.class, getPlanDetailsViewResponse);
    }

    private GetPlanDetailsViewResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004ဉ\u0002\u0005Ȉ", new Object[]{"bitField0_", "offerCard_", "benefitListCard_", "planTier_", "disclaimer_", "pageTitle_"});
        }
        if (iOrdinal == 3) {
            return new GetPlanDetailsViewResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(DEFAULT_INSTANCE, 2);
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
        synchronized (GetPlanDetailsViewResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final BenefitListCard m16501n() {
        BenefitListCard benefitListCard = this.benefitListCard_;
        return benefitListCard == null ? BenefitListCard.m16415q() : benefitListCard;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Disclaimer m16502o() {
        Disclaimer disclaimer = this.disclaimer_;
        return disclaimer == null ? Disclaimer.m16439n() : disclaimer;
    }

    /* JADX INFO: renamed from: p */
    public final OfferCard m16503p() {
        OfferCard offerCard = this.offerCard_;
        return offerCard == null ? OfferCard.m16540q() : offerCard;
    }

    /* JADX INFO: renamed from: q */
    public final String m16504q() {
        return this.pageTitle_;
    }

    /* JADX INFO: renamed from: r */
    public final mco0 m16505r() {
        mco0 mco0VarM61468a = mco0.m61468a(this.planTier_);
        return mco0VarM61468a == null ? mco0.UNRECOGNIZED : mco0VarM61468a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
