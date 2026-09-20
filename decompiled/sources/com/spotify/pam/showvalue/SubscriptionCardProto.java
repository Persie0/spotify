package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class SubscriptionCardProto extends AbstractC0269h implements sre0 {
    private static final SubscriptionCardProto DEFAULT_INSTANCE;
    public static final int DISPLAY_PREMIUM_LOGO_FIELD_NUMBER = 7;
    public static final int EXPIRATION_TEXT_FIELD_NUMBER = 6;
    public static final int MEMBERS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_NAME_FIELD_NUMBER = 1;
    public static final int PRIMARY_COLOR_FIELD_NUMBER = 3;
    public static final int SECONDARY_COLOR_FIELD_NUMBER = 4;
    public static final int SHORT_PLAN_NAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean displayPremiumLogo_;
    private String planName_ = "";
    private String shortPlanName_ = "";
    private String primaryColor_ = "";
    private String secondaryColor_ = "";
    private ae50 members_ = AbstractC0269h.emptyProtobufList();
    private String expirationText_ = "";

    static {
        SubscriptionCardProto subscriptionCardProto = new SubscriptionCardProto();
        DEFAULT_INSTANCE = subscriptionCardProto;
        AbstractC0269h.registerDefaultInstance(SubscriptionCardProto.class, subscriptionCardProto);
    }

    private SubscriptionCardProto() {
    }

    /* JADX INFO: renamed from: n */
    public static SubscriptionCardProto m16324n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006ለ\u0000\u0007\u0007", new Object[]{"bitField0_", "planName_", "shortPlanName_", "primaryColor_", "secondaryColor_", "members_", Member.class, "expirationText_", "displayPremiumLogo_"});
        }
        if (iOrdinal == 3) {
            return new SubscriptionCardProto();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 12);
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
        synchronized (SubscriptionCardProto.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16325o() {
        return this.displayPremiumLogo_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16326p() {
        return this.expirationText_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m16327q() {
        return this.members_;
    }

    /* JADX INFO: renamed from: r */
    public final String m16328r() {
        return this.primaryColor_;
    }

    /* JADX INFO: renamed from: s */
    public final String m16329s() {
        return this.secondaryColor_;
    }

    /* JADX INFO: renamed from: t */
    public final String m16330t() {
        return this.shortPlanName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m16331u() {
        return (this.bitField0_ & 1) != 0;
    }
}
