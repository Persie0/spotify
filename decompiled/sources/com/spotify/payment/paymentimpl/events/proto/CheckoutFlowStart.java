package com.spotify.payment.paymentimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.ozd;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CheckoutFlowStart extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 1;
    private static final CheckoutFlowStart DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 2;
    public static final int HAS_STORED_DETAILS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_METHOD_FIELD_NUMBER = 3;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean hasStoredDetails_;
    private String checkoutViewId_ = "";
    private String flowId_ = "";
    private String paymentMethod_ = "";
    private String paymentSessionId_ = "";

    static {
        CheckoutFlowStart checkoutFlowStart = new CheckoutFlowStart();
        DEFAULT_INSTANCE = checkoutFlowStart;
        AbstractC0269h.registerDefaultInstance(CheckoutFlowStart.class, checkoutFlowStart);
    }

    private CheckoutFlowStart() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16922n(CheckoutFlowStart checkoutFlowStart, String str) {
        checkoutFlowStart.getClass();
        str.getClass();
        checkoutFlowStart.bitField0_ |= 1;
        checkoutFlowStart.checkoutViewId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16923o(CheckoutFlowStart checkoutFlowStart, String str) {
        checkoutFlowStart.getClass();
        str.getClass();
        checkoutFlowStart.bitField0_ |= 2;
        checkoutFlowStart.flowId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m16924p(CheckoutFlowStart checkoutFlowStart, boolean z) {
        checkoutFlowStart.bitField0_ |= 8;
        checkoutFlowStart.hasStoredDetails_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16925q(CheckoutFlowStart checkoutFlowStart, String str) {
        checkoutFlowStart.getClass();
        str.getClass();
        checkoutFlowStart.bitField0_ |= 4;
        checkoutFlowStart.paymentMethod_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static ozd m16926r() {
        return (ozd) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "checkoutViewId_", "flowId_", "paymentMethod_", "hasStoredDetails_", "paymentSessionId_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutFlowStart();
        }
        if (iOrdinal == 4) {
            return new ozd(DEFAULT_INSTANCE);
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
        synchronized (CheckoutFlowStart.class) {
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
