package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class AccountFlags extends AbstractC0269h implements sre0 {
    public static final int CAN_ADD_SUBACCOUNT_FIELD_NUMBER = 7;
    public static final int CAN_CANCEL_SUBSCRIPTION_FIELD_NUMBER = 1;
    public static final int CAN_CHANGE_PIN_FIELD_NUMBER = 4;
    public static final int CAN_REMOVE_EXPIRING_ACCOUNT_FIELD_NUMBER = 11;
    public static final int CAN_REMOVE_SUBACCOUNT_FIELD_NUMBER = 8;
    public static final int CAN_SEE_ALL_PLANS_FIELD_NUMBER = 2;
    public static final int CAN_TOP_UP_PREPAID_FIELD_NUMBER = 3;
    private static final AccountFlags DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_ALTERNATE_AUDIOBOOK_ENTRY_FIELD_NUMBER = 6;
    public static final int SHOW_AUDIOBOOK_PROGRESS_FIELD_NUMBER = 12;
    public static final int SHOW_CONSENT_CARD_FIELD_NUMBER = 10;
    public static final int SHOW_FALLBACK_FIELD_NUMBER = 5;
    public static final int SHOW_LARGE_BENEFITS_HUB_ENTRY_FIELD_NUMBER = 13;
    public static final int SHOW_PARENTAL_CONTROLS_ENTRY_FIELD_NUMBER = 17;
    public static final int SHOW_RENEW_BUTTON_FIELD_NUMBER = 9;
    public static final int SHOW_SMALL_BENEFITS_HUB_ENTRY_FIELD_NUMBER = 14;
    public static final int SHOW_UPSELL_BELOW_BENEFITS_FIELD_NUMBER = 16;
    public static final int SHOW_UPSELL_BELOW_SUBSCRIPTION_FIELD_NUMBER = 15;
    private boolean canAddSubaccount_;
    private boolean canCancelSubscription_;
    private boolean canChangePin_;
    private boolean canRemoveExpiringAccount_;
    private boolean canRemoveSubaccount_;
    private boolean canSeeAllPlans_;
    private boolean canTopUpPrepaid_;
    private boolean showAlternateAudiobookEntry_;
    private boolean showAudiobookProgress_;
    private boolean showConsentCard_;
    private boolean showFallback_;
    private boolean showLargeBenefitsHubEntry_;
    private boolean showParentalControlsEntry_;
    private boolean showRenewButton_;
    private boolean showSmallBenefitsHubEntry_;
    private boolean showUpsellBelowBenefits_;
    private boolean showUpsellBelowSubscription_;

    static {
        AccountFlags accountFlags = new AccountFlags();
        DEFAULT_INSTANCE = accountFlags;
        AbstractC0269h.registerDefaultInstance(AccountFlags.class, accountFlags);
    }

    private AccountFlags() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static AccountFlags m16375u() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m16376A() {
        return this.showSmallBenefitsHubEntry_;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m16377B() {
        return this.showUpsellBelowBenefits_;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m16378C() {
        return this.showUpsellBelowSubscription_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007", new Object[]{"canCancelSubscription_", "canSeeAllPlans_", "canTopUpPrepaid_", "canChangePin_", "showFallback_", "showAlternateAudiobookEntry_", "canAddSubaccount_", "canRemoveSubaccount_", "showRenewButton_", "showConsentCard_", "canRemoveExpiringAccount_", "showAudiobookProgress_", "showLargeBenefitsHubEntry_", "showSmallBenefitsHubEntry_", "showUpsellBelowSubscription_", "showUpsellBelowBenefits_", "showParentalControlsEntry_"});
        }
        if (iOrdinal == 3) {
            return new AccountFlags();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 7);
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
        synchronized (AccountFlags.class) {
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
    public final boolean m16379n() {
        return this.canAddSubaccount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16380o() {
        return this.canCancelSubscription_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16381p() {
        return this.canChangePin_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16382q() {
        return this.canRemoveExpiringAccount_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m16383r() {
        return this.canRemoveSubaccount_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16384s() {
        return this.canSeeAllPlans_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16385t() {
        return this.canTopUpPrepaid_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m16386v() {
        return this.showAlternateAudiobookEntry_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m16387w() {
        return this.showFallback_;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m16388x() {
        return this.showLargeBenefitsHubEntry_;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m16389y() {
        return this.showParentalControlsEntry_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m16390z() {
        return this.showRenewButton_;
    }
}
