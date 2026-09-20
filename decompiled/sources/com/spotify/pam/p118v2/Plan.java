package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.cjr0;
import p204p.hnn0;
import p204p.mco0;
import p204p.ore0;
import p204p.pco0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Plan extends AbstractC0269h implements sre0 {
    public static final int ACTION_URI_FIELD_NUMBER = 18;
    public static final int BENEFITS_FIELD_NUMBER = 17;
    public static final int CHANGE_PLAN_URI_FIELD_NUMBER = 12;
    public static final int CTA_ICON_FIELD_NUMBER = 23;
    public static final int CTA_TEXT_FIELD_NUMBER = 22;
    private static final Plan DEFAULT_INSTANCE;
    public static final int DETAILED_BENEFITS_FIELD_NUMBER = 20;
    public static final int ENCORE_COLOR_SET_FIELD_NUMBER = 13;
    public static final int IOS_SUPPORT_URL_FIELD_NUMBER = 21;
    public static final int IS_ACTIVE_FIELD_NUMBER = 16;
    public static final int IS_DISCOUNTED_FIELD_NUMBER = 26;
    public static final int IS_RECOMMENDED_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_BACKGROUND_URI_FIELD_NUMBER = 19;
    public static final int PLAN_COLOR_FIELD_NUMBER = 5;
    public static final int PLAN_DETAILS_URI_FIELD_NUMBER = 11;
    public static final int PLAN_NAME_FIELD_NUMBER = 3;
    public static final int PLAN_PRICE_FIELD_NUMBER = 6;
    public static final int PLAN_TIER_FIELD_NUMBER = 2;
    public static final int PLAN_TYPE_FIELD_NUMBER = 1;
    public static final int PLAN_UPSELL_FIELD_NUMBER = 15;
    public static final int PRIMARY_ACCOUNT_DESCRIPTION_FIELD_NUMBER = 9;
    public static final int PRODUCT_COMPOSER_TIER_FIELD_NUMBER = 25;
    public static final int SHORT_PLAN_NAME_FIELD_NUMBER = 4;
    public static final int SUBACCOUNT_DESCRIPTION_FIELD_NUMBER = 10;
    private int bitField0_;
    private boolean isActive_;
    private boolean isDiscounted_;
    private boolean isRecommended_;
    private int planTier_;
    private int planType_;
    private int productComposerTier_;
    private String planName_ = "";
    private String shortPlanName_ = "";
    private String planColor_ = "";
    private String planPrice_ = "";
    private String primaryAccountDescription_ = "";
    private String subaccountDescription_ = "";
    private String planDetailsUri_ = "";
    private String changePlanUri_ = "";
    private String encoreColorSet_ = "";
    private String planUpsell_ = "";
    private ae50 benefits_ = AbstractC0269h.emptyProtobufList();
    private String actionUri_ = "";
    private String planBackgroundUri_ = "";
    private ae50 detailedBenefits_ = AbstractC0269h.emptyProtobufList();
    private String iosSupportUrl_ = "";
    private String ctaText_ = "";
    private String ctaIcon_ = "";

    static {
        Plan plan = new Plan();
        DEFAULT_INSTANCE = plan;
        AbstractC0269h.registerDefaultInstance(Plan.class, plan);
    }

    private Plan() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Plan m16553q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m16554A() {
        return this.primaryAccountDescription_;
    }

    /* JADX INFO: renamed from: B */
    public final cjr0 m16555B() {
        cjr0 cjr0Var;
        switch (this.productComposerTier_) {
            case 0:
                cjr0Var = cjr0.DEFAULT_TIER;
                break;
            case 1:
                cjr0Var = cjr0.PREMIUM_TIER;
                break;
            case 2:
            case 7:
            case 16:
            case 17:
            default:
                cjr0Var = null;
                break;
            case 3:
                cjr0Var = cjr0.BASIC_TIER;
                break;
            case 4:
                cjr0Var = cjr0.PREMIUM_LITE_TIER;
                break;
            case 5:
                cjr0Var = cjr0.PREMIUM_MINI_TIER;
                break;
            case 6:
                cjr0Var = cjr0.PREMIUM_BASIC_TIER;
                break;
            case 8:
                cjr0Var = cjr0.AUDIOBOOK_ACCESS_TIER;
                break;
            case 9:
                cjr0Var = cjr0.NO_FREE_TIER;
                break;
            case 10:
                cjr0Var = cjr0.UNKNOWN_TIER;
                break;
            case 11:
                cjr0Var = cjr0.MFT_TIER;
                break;
            case 12:
                cjr0Var = cjr0.MFT_PLUS_TIER;
                break;
            case 13:
                cjr0Var = cjr0.FREE_TIER_DISABLED_TIER;
                break;
            case 14:
                cjr0Var = cjr0.ON_DEMAND_TRIAL_TIER;
                break;
            case 15:
                cjr0Var = cjr0.PLATINUM_TIER;
                break;
            case 18:
                cjr0Var = cjr0.LITE_TIER;
                break;
            case 19:
                cjr0Var = cjr0.STANDARD_TIER;
                break;
            case 20:
                cjr0Var = cjr0.BASIC_PLATINUM_TIER;
                break;
        }
        return cjr0Var == null ? cjr0.UNRECOGNIZED : cjr0Var;
    }

    /* JADX INFO: renamed from: C */
    public final String m16556C() {
        return this.shortPlanName_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0002\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\tȈ\nለ\u0000\u000bȈ\fȈ\rȈ\u000fለ\u0001\u0010\u0007\u0011Ț\u0012Ȉ\u0013Ȉ\u0014\u001b\u0015Ȉ\u0016ለ\u0002\u0017ለ\u0003\u0019\f\u001a\u0007", new Object[]{"bitField0_", "planType_", "planTier_", "planName_", "shortPlanName_", "planColor_", "planPrice_", "isRecommended_", "primaryAccountDescription_", "subaccountDescription_", "planDetailsUri_", "changePlanUri_", "encoreColorSet_", "planUpsell_", "isActive_", "benefits_", "actionUri_", "planBackgroundUri_", "detailedBenefits_", Benefit.class, "iosSupportUrl_", "ctaText_", "ctaIcon_", "productComposerTier_", "isDiscounted_"});
        }
        if (iOrdinal == 3) {
            return new Plan();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 20);
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
        synchronized (Plan.class) {
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

    public final String getPlanName() {
        return this.planName_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16557n() {
        return this.actionUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m16558o() {
        return this.benefits_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16559p() {
        return this.ctaText_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m16560r() {
        return this.detailedBenefits_;
    }

    /* JADX INFO: renamed from: s */
    public final String m16561s() {
        return this.encoreColorSet_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16562t() {
        return this.isActive_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m16563u() {
        return this.isDiscounted_;
    }

    /* JADX INFO: renamed from: v */
    public final String m16564v() {
        return this.planBackgroundUri_;
    }

    /* JADX INFO: renamed from: w */
    public final String m16565w() {
        return this.planColor_;
    }

    /* JADX INFO: renamed from: x */
    public final String m16566x() {
        return this.planPrice_;
    }

    /* JADX INFO: renamed from: y */
    public final mco0 m16567y() {
        mco0 mco0VarM61468a = mco0.m61468a(this.planTier_);
        return mco0VarM61468a == null ? mco0.UNRECOGNIZED : mco0VarM61468a;
    }

    /* JADX INFO: renamed from: z */
    public final pco0 m16568z() {
        pco0 pco0VarM69598a = pco0.m69598a(this.planType_);
        return pco0VarM69598a == null ? pco0.UNRECOGNIZED : pco0VarM69598a;
    }
}
