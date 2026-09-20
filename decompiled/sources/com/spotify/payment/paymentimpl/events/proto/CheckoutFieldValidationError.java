package com.spotify.payment.paymentimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nzd;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CheckoutFieldValidationError extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 1;
    private static final CheckoutFieldValidationError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 4;
    public static final int FLOW_ID_FIELD_NUMBER = 3;
    public static final int FORM_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 6;
    private int bitField0_;
    private String checkoutViewId_ = "";
    private String formId_ = "";
    private String flowId_ = "";
    private String field_ = "";
    private String errorCode_ = "";
    private String paymentSessionId_ = "";

    static {
        CheckoutFieldValidationError checkoutFieldValidationError = new CheckoutFieldValidationError();
        DEFAULT_INSTANCE = checkoutFieldValidationError;
        AbstractC0269h.registerDefaultInstance(CheckoutFieldValidationError.class, checkoutFieldValidationError);
    }

    private CheckoutFieldValidationError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16916n(CheckoutFieldValidationError checkoutFieldValidationError, String str) {
        checkoutFieldValidationError.getClass();
        str.getClass();
        checkoutFieldValidationError.bitField0_ |= 1;
        checkoutFieldValidationError.checkoutViewId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16917o(CheckoutFieldValidationError checkoutFieldValidationError, String str) {
        checkoutFieldValidationError.getClass();
        str.getClass();
        checkoutFieldValidationError.bitField0_ |= 16;
        checkoutFieldValidationError.errorCode_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m16918p(CheckoutFieldValidationError checkoutFieldValidationError, String str) {
        checkoutFieldValidationError.getClass();
        str.getClass();
        checkoutFieldValidationError.bitField0_ |= 8;
        checkoutFieldValidationError.field_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16919q(CheckoutFieldValidationError checkoutFieldValidationError, String str) {
        checkoutFieldValidationError.getClass();
        str.getClass();
        checkoutFieldValidationError.bitField0_ |= 4;
        checkoutFieldValidationError.flowId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m16920r(CheckoutFieldValidationError checkoutFieldValidationError, String str) {
        checkoutFieldValidationError.getClass();
        str.getClass();
        checkoutFieldValidationError.bitField0_ |= 2;
        checkoutFieldValidationError.formId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static nzd m16921s() {
        return (nzd) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "checkoutViewId_", "formId_", "flowId_", "field_", "errorCode_", "paymentSessionId_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutFieldValidationError();
        }
        if (iOrdinal == 4) {
            return new nzd(DEFAULT_INSTANCE);
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
        synchronized (CheckoutFieldValidationError.class) {
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
