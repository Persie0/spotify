package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetAvailablePlansViewResponse extends AbstractC0269h implements sre0 {
    public static final int AOS_FIELD_NUMBER = 5;
    public static final int ASTRO_ONS_FIELD_NUMBER = 8;
    public static final int ASTRO_ON_TERMS_DISCLAIMER_FIELD_NUMBER = 10;
    public static final int CURRENT_PLAN_FIELD_NUMBER = 1;
    private static final GetAvailablePlansViewResponse DEFAULT_INSTANCE;
    public static final int FEATURED_PLANS_FIELD_NUMBER = 4;
    public static final int NEMO_PLANS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_CARDS_ENABLED_FIELD_NUMBER = 11;
    public static final int PLAN_CARDS_FIELD_NUMBER = 12;
    public static final int PREMIUM_PLANS_FIELD_NUMBER = 2;
    public static final int TAB_NAMES_FIELD_NUMBER = 9;
    public static final int TERMS_DISCLAIMER_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 6;
    private int bitField0_;
    private Plan currentPlan_;
    private boolean planCardsEnabled_;
    private ae50 premiumPlans_ = AbstractC0269h.emptyProtobufList();
    private ae50 nemoPlans_ = AbstractC0269h.emptyProtobufList();
    private ae50 featuredPlans_ = AbstractC0269h.emptyProtobufList();
    private ae50 aos_ = AbstractC0269h.emptyProtobufList();
    private String title_ = "";
    private String termsDisclaimer_ = "";
    private ae50 astroOns_ = AbstractC0269h.emptyProtobufList();
    private ae50 tabNames_ = AbstractC0269h.emptyProtobufList();
    private String astroOnTermsDisclaimer_ = "";
    private ae50 planCards_ = AbstractC0269h.emptyProtobufList();

    static {
        GetAvailablePlansViewResponse getAvailablePlansViewResponse = new GetAvailablePlansViewResponse();
        DEFAULT_INSTANCE = getAvailablePlansViewResponse;
        AbstractC0269h.registerDefaultInstance(GetAvailablePlansViewResponse.class, getAvailablePlansViewResponse);
    }

    private GetAvailablePlansViewResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0007\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006Ȉ\u0007Ȉ\b\u001b\tȚ\nȈ\u000b\u0007\f\u001b", new Object[]{"bitField0_", "currentPlan_", "premiumPlans_", Plan.class, "nemoPlans_", Plan.class, "featuredPlans_", Plan.class, "aos_", C1098Ao.class, "title_", "termsDisclaimer_", "astroOns_", AstroOn.class, "tabNames_", "astroOnTermsDisclaimer_", "planCardsEnabled_", "planCards_", PlanCard.class});
        }
        if (iOrdinal == 3) {
            return new GetAvailablePlansViewResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 4);
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
        synchronized (GetAvailablePlansViewResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final ae50 m16464n() {
        return this.astroOns_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16465o() {
        return this.planCardsEnabled_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m16466p() {
        return this.planCards_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m16467q() {
        return this.premiumPlans_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m16468r() {
        return this.tabNames_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
