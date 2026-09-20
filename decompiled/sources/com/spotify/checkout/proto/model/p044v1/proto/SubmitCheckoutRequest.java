package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gs51;
import p204p.hs51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SubmitCheckoutRequest extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final SubmitCheckoutRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REUSE_SUBSCRIPTION_PAYMENT_DETAILS_FIELD_NUMBER = 3;
    public static final int SELECTED_PROVIDER_FIELD_NUMBER = 2;
    private String checkoutSessionId_ = "";
    private boolean reuseSubscriptionPaymentDetails_;
    private int selectedProvider_;

    static {
        SubmitCheckoutRequest submitCheckoutRequest = new SubmitCheckoutRequest();
        DEFAULT_INSTANCE = submitCheckoutRequest;
        AbstractC0269h.registerDefaultInstance(SubmitCheckoutRequest.class, submitCheckoutRequest);
    }

    private SubmitCheckoutRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6451n(SubmitCheckoutRequest submitCheckoutRequest, String str) {
        submitCheckoutRequest.getClass();
        str.getClass();
        submitCheckoutRequest.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6452o(SubmitCheckoutRequest submitCheckoutRequest, boolean z) {
        submitCheckoutRequest.reuseSubscriptionPaymentDetails_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m6453p(SubmitCheckoutRequest submitCheckoutRequest, hs51 hs51Var) {
        submitCheckoutRequest.getClass();
        submitCheckoutRequest.selectedProvider_ = hs51Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static gs51 m6454q() {
        return (gs51) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0007", new Object[]{"checkoutSessionId_", "selectedProvider_", "reuseSubscriptionPaymentDetails_"});
        }
        if (iOrdinal == 3) {
            return new SubmitCheckoutRequest();
        }
        if (iOrdinal == 4) {
            return new gs51(DEFAULT_INSTANCE);
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
        synchronized (SubmitCheckoutRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
