package com.spotify.pamviewservice.p119v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.iu51;
import p204p.lco0;
import p204p.opq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumPlanRow extends AbstractC0269h implements sre0 {
    public static final int ACTION_REQUIRED_SUBTITLE_FIELD_NUMBER = 20;
    public static final int AO_NAME_FIELD_NUMBER = 17;
    public static final int AVAILABLE_PLANS_FIELD_NUMBER = 12;
    public static final int AVAILABLE_PLANS_NAMES_FIELD_NUMBER = 7;
    private static final PremiumPlanRow DEFAULT_INSTANCE;
    public static final int IS_AAT_FIELD_NUMBER = 22;
    public static final int IS_ACTION_REQUIRED_FIELD_NUMBER = 19;
    public static final int IS_EMPLOYEE_FIELD_NUMBER = 23;
    public static final int IS_KID_ACCOUNT_FIELD_NUMBER = 21;
    public static final int IS_NEMO_EARLY_ADOPTER_FIELD_NUMBER = 15;
    public static final int IS_PREPAID_FIELD_NUMBER = 2;
    public static final int IS_TRIAL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_FAILED_FIELD_NUMBER = 11;
    public static final int PAYMENT_ROW_SUBTITLE_FIELD_NUMBER = 9;
    public static final int PAYMENT_ROW_TITLE_FIELD_NUMBER = 8;
    public static final int PLAN_TIER_FIELD_NUMBER = 16;
    public static final int PREMIUM_PLAN_COLOR_FIELD_NUMBER = 4;
    public static final int PREMIUM_PLAN_FIELD_NUMBER = 3;
    public static final int PREMIUM_PLAN_SHORT_NAME_FIELD_NUMBER = 18;
    public static final int PREPAID_DAYS_REMAINING_FIELD_NUMBER = 5;
    public static final int PREPAID_DURATION_FIELD_NUMBER = 14;
    public static final int SIGN_UP_DATE_FIELD_NUMBER = 13;
    public static final int SUBSCRIPTION_PROVIDER_FIELD_NUMBER = 10;
    public static final int SUBSCRIPTION_TYPE_FIELD_NUMBER = 6;
    private AvailablePlans availablePlans_;
    private int bitField0_;
    private boolean isAat_;
    private boolean isActionRequired_;
    private boolean isEmployee_;
    private boolean isKidAccount_;
    private boolean isNemoEarlyAdopter_;
    private boolean isPrepaid_;
    private boolean isTrial_;
    private boolean paymentFailed_;
    private int planTier_;
    private int prepaidDaysRemaining_;
    private int subscriptionProvider_;
    private int subscriptionType_;
    private String premiumPlan_ = "";
    private String premiumPlanColor_ = "";
    private ae50 availablePlansNames_ = AbstractC0269h.emptyProtobufList();
    private String paymentRowTitle_ = "";
    private String paymentRowSubtitle_ = "";
    private String signUpDate_ = "";
    private String prepaidDuration_ = "";
    private String aoName_ = "";
    private String premiumPlanShortName_ = "";
    private String actionRequiredSubtitle_ = "";

    static {
        PremiumPlanRow premiumPlanRow = new PremiumPlanRow();
        DEFAULT_INSTANCE = premiumPlanRow;
        AbstractC0269h.registerDefaultInstance(PremiumPlanRow.class, premiumPlanRow);
    }

    private PremiumPlanRow() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\f\u0007Ț\bȈ\tȈ\n\f\u000b\u0007\fဉ\u0000\rለ\u0001\u000eለ\u0002\u000f\u0007\u0010\f\u0011Ȉ\u0012ለ\u0003\u0013\u0007\u0014ለ\u0004\u0015\u0007\u0016\u0007\u0017\u0007", new Object[]{"bitField0_", "isTrial_", "isPrepaid_", "premiumPlan_", "premiumPlanColor_", "prepaidDaysRemaining_", "subscriptionType_", "availablePlansNames_", "paymentRowTitle_", "paymentRowSubtitle_", "subscriptionProvider_", "paymentFailed_", "availablePlans_", "signUpDate_", "prepaidDuration_", "isNemoEarlyAdopter_", "planTier_", "aoName_", "premiumPlanShortName_", "isActionRequired_", "actionRequiredSubtitle_", "isKidAccount_", "isAat_", "isEmployee_"});
        }
        if (iOrdinal == 3) {
            return new PremiumPlanRow();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 17);
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
        synchronized (PremiumPlanRow.class) {
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
    public final String m16597n() {
        return this.aoName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final AvailablePlans m16598o() {
        AvailablePlans availablePlans = this.availablePlans_;
        return availablePlans == null ? AvailablePlans.m16596n() : availablePlans;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16599p() {
        return this.paymentFailed_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16600q() {
        return this.paymentRowSubtitle_;
    }

    /* JADX INFO: renamed from: r */
    public final String m16601r() {
        return this.paymentRowTitle_;
    }

    /* JADX INFO: renamed from: s */
    public final lco0 m16602s() {
        lco0 lco0Var;
        int i = this.planTier_;
        if (i == 0) {
            lco0Var = lco0.PLAN_TIER_UNSPECIFIED;
        } else if (i == 1) {
            lco0Var = lco0.PLAN_TIER_FREE;
        } else if (i != 2) {
            lco0Var = i != 3 ? null : lco0.PLAN_TIER_NEMO;
        } else {
            lco0Var = lco0.PLAN_TIER_PREMIUM;
        }
        return lco0Var == null ? lco0.UNRECOGNIZED : lco0Var;
    }

    /* JADX INFO: renamed from: t */
    public final String m16603t() {
        return this.premiumPlan_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m16604u() {
        return this.premiumPlanColor_;
    }

    /* JADX INFO: renamed from: v */
    public final int m16605v() {
        return this.prepaidDaysRemaining_;
    }

    /* JADX INFO: renamed from: w */
    public final String m16606w() {
        return this.signUpDate_;
    }

    /* JADX INFO: renamed from: x */
    public final iu51 m16607x() {
        iu51 iu51Var;
        int i = this.subscriptionProvider_;
        if (i == 0) {
            iu51Var = iu51.UNKNOWN;
        } else if (i != 1) {
            iu51Var = i != 2 ? null : iu51.GOOGLE;
        } else {
            iu51Var = iu51.SPOTIFY;
        }
        return iu51Var == null ? iu51.UNRECOGNIZED : iu51Var;
    }

    /* JADX INFO: renamed from: y */
    public final opq0 m16608y() {
        opq0 opq0Var;
        int i = this.subscriptionType_;
        if (i == 0) {
            opq0Var = opq0.UNKNOWN;
        } else if (i == 1) {
            opq0Var = opq0.RECURRING_MONTHLY;
        } else if (i != 2) {
            opq0Var = i != 3 ? null : opq0.PREPAID;
        } else {
            opq0Var = opq0.TRIAL;
        }
        return opq0Var == null ? opq0.UNRECOGNIZED : opq0Var;
    }
}
