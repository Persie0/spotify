package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetBillingViewResponse extends AbstractC0269h implements sre0 {
    public static final int BILLING_DATE_ROW_FIELD_NUMBER = 5;
    private static final GetBillingViewResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PAST_RECEIPTS_ROW_FIELD_NUMBER = 6;
    public static final int PAYMENT_DETAILS_FIELD_NUMBER = 2;
    public static final int PAYMENT_HELP_ROW_FIELD_NUMBER = 4;
    public static final int PLAN_FIELD_NUMBER = 1;
    public static final int PRICE_ROW_FIELD_NUMBER = 3;
    private Action billingDateRow_;
    private int bitField0_;
    private Action pastReceiptsRow_;
    private PaymentDetails paymentDetails_;
    private Action paymentHelpRow_;
    private Plan plan_;
    private Action priceRow_;

    static {
        GetBillingViewResponse getBillingViewResponse = new GetBillingViewResponse();
        DEFAULT_INSTANCE = getBillingViewResponse;
        AbstractC0269h.registerDefaultInstance(GetBillingViewResponse.class, getBillingViewResponse);
    }

    private GetBillingViewResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "plan_", "paymentDetails_", "priceRow_", "paymentHelpRow_", "billingDateRow_", "pastReceiptsRow_"});
        }
        if (iOrdinal == 3) {
            return new GetBillingViewResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 5);
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
        synchronized (GetBillingViewResponse.class) {
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
    public final Action m16471n() {
        Action action = this.billingDateRow_;
        return action == null ? Action.m16391o() : action;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Action m16472o() {
        Action action = this.pastReceiptsRow_;
        return action == null ? Action.m16391o() : action;
    }

    /* JADX INFO: renamed from: p */
    public final PaymentDetails m16473p() {
        PaymentDetails paymentDetails = this.paymentDetails_;
        return paymentDetails == null ? PaymentDetails.m16549n() : paymentDetails;
    }

    /* JADX INFO: renamed from: q */
    public final Action m16474q() {
        Action action = this.paymentHelpRow_;
        return action == null ? Action.m16391o() : action;
    }

    /* JADX INFO: renamed from: r */
    public final Plan m16475r() {
        Plan plan = this.plan_;
        return plan == null ? Plan.m16553q() : plan;
    }

    /* JADX INFO: renamed from: s */
    public final Action m16476s() {
        Action action = this.priceRow_;
        return action == null ? Action.m16391o() : action;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16477t() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m16478u() {
        return (this.bitField0_ & 32) != 0;
    }
}
