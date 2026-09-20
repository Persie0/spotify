package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cfn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest extends AbstractC0269h implements sre0 {
    public static final int ATTEMPT_FIELD_NUMBER = 2;
    private static final PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_PROVIDER_ID_FIELD_NUMBER = 3;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int PROCEED_DATA_FIELD_NUMBER = 4;
    private int attempt_;
    private int bitField0_;
    private PaymentSdkNativeServiceProto$CallbackProceedData proceedData_;
    private String paymentSessionId_ = "";
    private String paymentProviderId_ = "";

    static {
        PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest paymentSdkNativeServiceProto$CallbackProceedPaymentRequest = new PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$CallbackProceedPaymentRequest;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest.class, paymentSdkNativeServiceProto$CallbackProceedPaymentRequest);
    }

    private PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16698n(PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest paymentSdkNativeServiceProto$CallbackProceedPaymentRequest, int i) {
        paymentSdkNativeServiceProto$CallbackProceedPaymentRequest.attempt_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m16699o(PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest paymentSdkNativeServiceProto$CallbackProceedPaymentRequest, String str) {
        paymentSdkNativeServiceProto$CallbackProceedPaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$CallbackProceedPaymentRequest.paymentProviderId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m16700p(PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest paymentSdkNativeServiceProto$CallbackProceedPaymentRequest, String str) {
        paymentSdkNativeServiceProto$CallbackProceedPaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$CallbackProceedPaymentRequest.paymentSessionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16701q(PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest paymentSdkNativeServiceProto$CallbackProceedPaymentRequest, PaymentSdkNativeServiceProto$CallbackProceedData paymentSdkNativeServiceProto$CallbackProceedData) {
        paymentSdkNativeServiceProto$CallbackProceedPaymentRequest.getClass();
        paymentSdkNativeServiceProto$CallbackProceedData.getClass();
        paymentSdkNativeServiceProto$CallbackProceedPaymentRequest.proceedData_ = paymentSdkNativeServiceProto$CallbackProceedData;
        paymentSdkNativeServiceProto$CallbackProceedPaymentRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static cfn0 m16702r() {
        return (cfn0) DEFAULT_INSTANCE.createBuilder();
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
            return new PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest();
        }
        if (iOrdinal == 4) {
            return new cfn0(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest.class) {
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
