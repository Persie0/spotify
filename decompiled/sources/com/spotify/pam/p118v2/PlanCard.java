package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlanCard extends AbstractC0269h implements sre0 {
    public static final int BADGE_FIELD_NUMBER = 1;
    public static final int BENEFITS_FIELD_NUMBER = 8;
    private static final PlanCard DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_FIELD_NUMBER = 4;
    public static final int PRICE_CAPTION_FIELD_NUMBER = 7;
    public static final int PRICE_FIELD_NUMBER = 6;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 9;
    public static final int PRIMARY_URI_FIELD_NUMBER = 10;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 11;
    public static final int SECONDARY_URI_FIELD_NUMBER = 12;
    public static final int TIER_FIELD_NUMBER = 2;
    public static final int TIER_ICON_FIELD_NUMBER = 3;
    public static final int VISUAL_IDENTITY_COLOR_FIELD_NUMBER = 5;
    private String badge_ = "";
    private String tier_ = "";
    private String tierIcon_ = "";
    private String plan_ = "";
    private String visualIdentityColor_ = "";
    private String price_ = "";
    private String priceCaption_ = "";
    private ae50 benefits_ = AbstractC0269h.emptyProtobufList();
    private String primaryButton_ = "";
    private String primaryUri_ = "";
    private String secondaryButton_ = "";
    private String secondaryUri_ = "";
    private String disclaimer_ = "";

    static {
        PlanCard planCard = new PlanCard();
        DEFAULT_INSTANCE = planCard;
        AbstractC0269h.registerDefaultInstance(PlanCard.class, planCard);
    }

    private PlanCard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȚ\tȈ\nȈ\u000bȈ\fȈ\rȈ", new Object[]{"badge_", "tier_", "tierIcon_", "plan_", "visualIdentityColor_", "price_", "priceCaption_", "benefits_", "primaryButton_", "primaryUri_", "secondaryButton_", "secondaryUri_", "disclaimer_"});
        }
        if (iOrdinal == 3) {
            return new PlanCard();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 21);
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
        synchronized (PlanCard.class) {
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
    public final String m16569n() {
        return this.badge_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m16570o() {
        return this.benefits_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16571p() {
        return this.disclaimer_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16572q() {
        return this.plan_;
    }

    /* JADX INFO: renamed from: r */
    public final String m16573r() {
        return this.price_;
    }

    /* JADX INFO: renamed from: s */
    public final String m16574s() {
        return this.priceCaption_;
    }

    /* JADX INFO: renamed from: t */
    public final String m16575t() {
        return this.primaryButton_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m16576u() {
        return this.primaryUri_;
    }

    /* JADX INFO: renamed from: v */
    public final String m16577v() {
        return this.secondaryButton_;
    }

    /* JADX INFO: renamed from: w */
    public final String m16578w() {
        return this.secondaryUri_;
    }

    /* JADX INFO: renamed from: x */
    public final String m16579x() {
        return this.tier_;
    }

    /* JADX INFO: renamed from: y */
    public final String m16580y() {
        return this.tierIcon_;
    }

    /* JADX INFO: renamed from: z */
    public final String m16581z() {
        return this.visualIdentityColor_;
    }
}
