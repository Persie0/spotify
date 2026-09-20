package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hfn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$ProceedPaymentRequest extends AbstractC0269h implements sre0 {
    public static final int ATTEMPT_FIELD_NUMBER = 2;
    private static final PaymentSdkNativeServiceProto$ProceedPaymentRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_PROVIDER_ID_FIELD_NUMBER = 3;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int PROCEED_DATA_FIELD_NUMBER = 4;
    private int attempt_;
    private int bitField0_;
    private PaymentSdkNativeServiceProto$ProceedData proceedData_;
    private String paymentSessionId_ = "";
    private String paymentProviderId_ = "";

    static {
        PaymentSdkNativeServiceProto$ProceedPaymentRequest paymentSdkNativeServiceProto$ProceedPaymentRequest = new PaymentSdkNativeServiceProto$ProceedPaymentRequest();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$ProceedPaymentRequest;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$ProceedPaymentRequest.class, paymentSdkNativeServiceProto$ProceedPaymentRequest);
    }

    private PaymentSdkNativeServiceProto$ProceedPaymentRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16837n(PaymentSdkNativeServiceProto$ProceedPaymentRequest paymentSdkNativeServiceProto$ProceedPaymentRequest, int i) {
        paymentSdkNativeServiceProto$ProceedPaymentRequest.attempt_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m16838o(PaymentSdkNativeServiceProto$ProceedPaymentRequest paymentSdkNativeServiceProto$ProceedPaymentRequest, String str) {
        paymentSdkNativeServiceProto$ProceedPaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$ProceedPaymentRequest.paymentProviderId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m16839p(PaymentSdkNativeServiceProto$ProceedPaymentRequest paymentSdkNativeServiceProto$ProceedPaymentRequest, String str) {
        paymentSdkNativeServiceProto$ProceedPaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$ProceedPaymentRequest.paymentSessionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16840q(PaymentSdkNativeServiceProto$ProceedPaymentRequest paymentSdkNativeServiceProto$ProceedPaymentRequest, PaymentSdkNativeServiceProto$ProceedData paymentSdkNativeServiceProto$ProceedData) {
        paymentSdkNativeServiceProto$ProceedPaymentRequest.getClass();
        paymentSdkNativeServiceProto$ProceedData.getClass();
        paymentSdkNativeServiceProto$ProceedPaymentRequest.proceedData_ = paymentSdkNativeServiceProto$ProceedData;
        paymentSdkNativeServiceProto$ProceedPaymentRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static hfn0 m16841r() {
        return (hfn0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "paymentSessionId_", "attempt_", "paymentProviderId_", "proceedData_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$ProceedPaymentRequest();
        }
        if (iOrdinal == 4) {
            return new hfn0(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$ProceedPaymentRequest.class) {
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
