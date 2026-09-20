package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetAstroOnManagementResponse extends AbstractC0269h implements sre0 {
    public static final int ASTRO_BENEFITS_FIELD_NUMBER = 5;
    public static final int AUDIOBOOK_PROGRESS_FIELD_NUMBER = 9;
    public static final int CONSUMPTION_TRACKING_ACTION_FIELD_NUMBER = 8;
    private static final GetAstroOnManagementResponse DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISCLAIMER_FIELD_NUMBER = 6;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int MEMBER_CARD_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_CARD_FIELD_NUMBER = 10;
    public static final int REMOVE_ASTRO_ON_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int V2_ENABLED_FIELD_NUMBER = 11;
    private BenefitListCard astroBenefits_;
    private AudiobookProgress audiobookProgress_;
    private int bitField0_;
    private ActionTypeMap consumptionTrackingAction_;
    private AstroMemberCard memberCard_;
    private PaymentCard paymentCard_;
    private Action removeAstroOn_;
    private boolean v2Enabled_;
    private String title_ = "";
    private String description_ = "";
    private String icon_ = "";
    private String disclaimer_ = "";

    static {
        GetAstroOnManagementResponse getAstroOnManagementResponse = new GetAstroOnManagementResponse();
        DEFAULT_INSTANCE = getAstroOnManagementResponse;
        AbstractC0269h.registerDefaultInstance(GetAstroOnManagementResponse.class, getAstroOnManagementResponse);
    }

    private GetAstroOnManagementResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000b\u0007", new Object[]{"bitField0_", "title_", "description_", "icon_", "memberCard_", "astroBenefits_", "disclaimer_", "removeAstroOn_", "consumptionTrackingAction_", "audiobookProgress_", "paymentCard_", "v2Enabled_"});
        }
        if (iOrdinal == 3) {
            return new GetAstroOnManagementResponse();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 29);
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
        synchronized (GetAstroOnManagementResponse.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final BenefitListCard m16447n() {
        BenefitListCard benefitListCard = this.astroBenefits_;
        return benefitListCard == null ? BenefitListCard.m16415q() : benefitListCard;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ActionTypeMap m16448o() {
        ActionTypeMap actionTypeMap = this.consumptionTrackingAction_;
        return actionTypeMap == null ? ActionTypeMap.m16394p() : actionTypeMap;
    }

    /* JADX INFO: renamed from: p */
    public final String m16449p() {
        return this.disclaimer_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16450q() {
        return this.icon_;
    }

    /* JADX INFO: renamed from: r */
    public final AstroMemberCard m16451r() {
        AstroMemberCard astroMemberCard = this.memberCard_;
        return astroMemberCard == null ? AstroMemberCard.m16403p() : astroMemberCard;
    }

    /* JADX INFO: renamed from: s */
    public final PaymentCard m16452s() {
        PaymentCard paymentCard = this.paymentCard_;
        return paymentCard == null ? PaymentCard.m16546n() : paymentCard;
    }

    /* JADX INFO: renamed from: t */
    public final Action m16453t() {
        Action action = this.removeAstroOn_;
        return action == null ? Action.m16391o() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m16454u() {
        return this.v2Enabled_;
    }
}
