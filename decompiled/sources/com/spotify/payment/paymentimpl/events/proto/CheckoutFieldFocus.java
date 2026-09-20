package com.spotify.payment.paymentimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mzd;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CheckoutFieldFocus extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 1;
    private static final CheckoutFieldFocus DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 4;
    public static final int FLOW_ID_FIELD_NUMBER = 3;
    public static final int FORM_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private String checkoutViewId_ = "";
    private String formId_ = "";
    private String flowId_ = "";
    private String field_ = "";
    private String paymentSessionId_ = "";

    static {
        CheckoutFieldFocus checkoutFieldFocus = new CheckoutFieldFocus();
        DEFAULT_INSTANCE = checkoutFieldFocus;
        AbstractC0269h.registerDefaultInstance(CheckoutFieldFocus.class, checkoutFieldFocus);
    }

    private CheckoutFieldFocus() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16911n(CheckoutFieldFocus checkoutFieldFocus, String str) {
        checkoutFieldFocus.getClass();
        str.getClass();
        checkoutFieldFocus.bitField0_ |= 1;
        checkoutFieldFocus.checkoutViewId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16912o(CheckoutFieldFocus checkoutFieldFocus, String str) {
        checkoutFieldFocus.getClass();
        str.getClass();
        checkoutFieldFocus.bitField0_ |= 8;
        checkoutFieldFocus.field_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m16913p(CheckoutFieldFocus checkoutFieldFocus, String str) {
        checkoutFieldFocus.getClass();
        str.getClass();
        checkoutFieldFocus.bitField0_ |= 4;
        checkoutFieldFocus.flowId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16914q(CheckoutFieldFocus checkoutFieldFocus, String str) {
        checkoutFieldFocus.getClass();
        str.getClass();
        checkoutFieldFocus.bitField0_ |= 2;
        checkoutFieldFocus.formId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static mzd m16915r() {
        return (mzd) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "checkoutViewId_", "formId_", "flowId_", "field_", "paymentSessionId_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutFieldFocus();
        }
        if (iOrdinal == 4) {
            return new mzd(DEFAULT_INSTANCE);
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
        synchronized (CheckoutFieldFocus.class) {
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
