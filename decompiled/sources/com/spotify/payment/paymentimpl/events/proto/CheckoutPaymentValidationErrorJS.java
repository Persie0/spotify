package com.spotify.payment.paymentimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uzd;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CheckoutPaymentValidationErrorJS extends AbstractC0269h implements sre0 {
    public static final int ATTEMPT_ID_FIELD_NUMBER = 5;
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 1;
    private static final CheckoutPaymentValidationErrorJS DEFAULT_INSTANCE;
    public static final int ERROR_TYPE_FIELD_NUMBER = 7;
    public static final int FIELD_FIELD_NUMBER = 6;
    public static final int FLOW_ID_FIELD_NUMBER = 4;
    public static final int FORM_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_METHOD_FIELD_NUMBER = 2;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 8;
    private int bitField0_;
    private String checkoutViewId_ = "";
    private String paymentMethod_ = "";
    private String formId_ = "";
    private String flowId_ = "";
    private String attemptId_ = "";
    private String field_ = "";
    private String errorType_ = "";
    private String paymentSessionId_ = "";

    static {
        CheckoutPaymentValidationErrorJS checkoutPaymentValidationErrorJS = new CheckoutPaymentValidationErrorJS();
        DEFAULT_INSTANCE = checkoutPaymentValidationErrorJS;
        AbstractC0269h.registerDefaultInstance(CheckoutPaymentValidationErrorJS.class, checkoutPaymentValidationErrorJS);
    }

    private CheckoutPaymentValidationErrorJS() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16939n(CheckoutPaymentValidationErrorJS checkoutPaymentValidationErrorJS, String str) {
        checkoutPaymentValidationErrorJS.getClass();
        str.getClass();
        checkoutPaymentValidationErrorJS.bitField0_ |= 16;
        checkoutPaymentValidationErrorJS.attemptId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16940o(CheckoutPaymentValidationErrorJS checkoutPaymentValidationErrorJS, String str) {
        checkoutPaymentValidationErrorJS.getClass();
        str.getClass();
        checkoutPaymentValidationErrorJS.bitField0_ |= 1;
        checkoutPaymentValidationErrorJS.checkoutViewId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m16941p(CheckoutPaymentValidationErrorJS checkoutPaymentValidationErrorJS, String str) {
        checkoutPaymentValidationErrorJS.getClass();
        str.getClass();
        checkoutPaymentValidationErrorJS.bitField0_ |= 64;
        checkoutPaymentValidationErrorJS.errorType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16942q(CheckoutPaymentValidationErrorJS checkoutPaymentValidationErrorJS, String str) {
        checkoutPaymentValidationErrorJS.getClass();
        str.getClass();
        checkoutPaymentValidationErrorJS.bitField0_ |= 8;
        checkoutPaymentValidationErrorJS.flowId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m16943r(CheckoutPaymentValidationErrorJS checkoutPaymentValidationErrorJS, String str) {
        checkoutPaymentValidationErrorJS.getClass();
        str.getClass();
        checkoutPaymentValidationErrorJS.bitField0_ |= 4;
        checkoutPaymentValidationErrorJS.formId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m16944s(CheckoutPaymentValidationErrorJS checkoutPaymentValidationErrorJS, String str) {
        checkoutPaymentValidationErrorJS.getClass();
        str.getClass();
        checkoutPaymentValidationErrorJS.bitField0_ |= 2;
        checkoutPaymentValidationErrorJS.paymentMethod_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static uzd m16945t() {
        return (uzd) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"bitField0_", "checkoutViewId_", "paymentMethod_", "formId_", "flowId_", "attemptId_", "field_", "errorType_", "paymentSessionId_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutPaymentValidationErrorJS();
        }
        if (iOrdinal == 4) {
            return new uzd(DEFAULT_INSTANCE);
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
        synchronized (CheckoutPaymentValidationErrorJS.class) {
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
