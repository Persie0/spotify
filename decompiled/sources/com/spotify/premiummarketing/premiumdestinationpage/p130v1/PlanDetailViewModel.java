package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.d8o0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlanDetailViewModel extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_URL_FIELD_NUMBER = 2;
    private static final PlanDetailViewModel DEFAULT_INSTANCE;
    public static final int OFFER_DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OFFER_DISCOUNT_BADGE_FIELD_NUMBER = 5;
    public static final int OFFER_SAVINGS_BADGE_FIELD_NUMBER = 1;
    public static final int OFFER_TITLE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_COMPARISON_TEXT_FIELD_NUMBER = 6;
    private int bitField0_;
    private String offerSavingsBadge_ = "";
    private String checkoutUrl_ = "";
    private String offerTitle_ = "";
    private String offerDescription_ = "";
    private String offerDiscountBadge_ = "";
    private String priceComparisonText_ = "";

    static {
        PlanDetailViewModel planDetailViewModel = new PlanDetailViewModel();
        DEFAULT_INSTANCE = planDetailViewModel;
        AbstractC0269h.registerDefaultInstance(PlanDetailViewModel.class, planDetailViewModel);
    }

    private PlanDetailViewModel() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19610n(PlanDetailViewModel planDetailViewModel, String str) {
        planDetailViewModel.getClass();
        planDetailViewModel.checkoutUrl_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19611o(PlanDetailViewModel planDetailViewModel, String str) {
        planDetailViewModel.getClass();
        planDetailViewModel.bitField0_ |= 2;
        planDetailViewModel.offerDescription_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19612p(PlanDetailViewModel planDetailViewModel, String str) {
        planDetailViewModel.getClass();
        planDetailViewModel.bitField0_ |= 4;
        planDetailViewModel.offerDiscountBadge_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19613q(PlanDetailViewModel planDetailViewModel, String str) {
        planDetailViewModel.getClass();
        planDetailViewModel.bitField0_ |= 1;
        planDetailViewModel.offerSavingsBadge_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m19614r(PlanDetailViewModel planDetailViewModel, String str) {
        planDetailViewModel.getClass();
        planDetailViewModel.offerTitle_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static d8o0 m19615y() {
        return (d8o0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ\u0003Ȉ\u0004ለ\u0001\u0005ለ\u0002\u0006ለ\u0003", new Object[]{"bitField0_", "offerSavingsBadge_", "checkoutUrl_", "offerTitle_", "offerDescription_", "offerDiscountBadge_", "priceComparisonText_"});
        }
        if (iOrdinal == 3) {
            return new PlanDetailViewModel();
        }
        if (iOrdinal == 4) {
            return new d8o0(DEFAULT_INSTANCE);
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
        synchronized (PlanDetailViewModel.class) {
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

    /* JADX INFO: renamed from: s */
    public final String m19616s() {
        return this.checkoutUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final String m19617t() {
        return this.offerDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m19618u() {
        return this.offerDiscountBadge_;
    }

    /* JADX INFO: renamed from: v */
    public final String m19619v() {
        return this.offerSavingsBadge_;
    }

    /* JADX INFO: renamed from: w */
    public final String m19620w() {
        return this.offerTitle_;
    }

    /* JADX INFO: renamed from: x */
    public final String m19621x() {
        return this.priceComparisonText_;
    }
}
