package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gfn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$PreparePaymentRequest extends AbstractC0269h implements sre0 {
    public static final int ATTEMPT_ID_FIELD_NUMBER = 5;
    public static final int CANCEL_URL_FIELD_NUMBER = 7;
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 4;
    public static final int CLIENT_CONTEXT_FIELD_NUMBER = 2;
    private static final PaymentSdkNativeServiceProto$PreparePaymentRequest DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_PROVIDER_ID_FIELD_NUMBER = 3;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int PROCEED_DATA_FIELD_NUMBER = 10;
    public static final int RISK_DEVICE_ID_FIELD_NUMBER = 8;
    private int bitField0_;
    private PaymentSdkNativeServiceProto$ProceedData proceedData_;
    private String paymentSessionId_ = "";
    private String clientContext_ = "";
    private String paymentProviderId_ = "";
    private String checkoutViewId_ = "";
    private String attemptId_ = "";
    private String flowId_ = "";
    private String cancelUrl_ = "";
    private String riskDeviceId_ = "";

    static {
        PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest = new PaymentSdkNativeServiceProto$PreparePaymentRequest();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PreparePaymentRequest;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$PreparePaymentRequest.class, paymentSdkNativeServiceProto$PreparePaymentRequest);
    }

    private PaymentSdkNativeServiceProto$PreparePaymentRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16818n(PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, String str) {
        paymentSdkNativeServiceProto$PreparePaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$PreparePaymentRequest.attemptId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16819o(PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, String str) {
        paymentSdkNativeServiceProto$PreparePaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$PreparePaymentRequest.cancelUrl_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m16820p(PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, String str) {
        paymentSdkNativeServiceProto$PreparePaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$PreparePaymentRequest.checkoutViewId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16821q(PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, String str) {
        paymentSdkNativeServiceProto$PreparePaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$PreparePaymentRequest.clientContext_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m16822r(PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, String str) {
        paymentSdkNativeServiceProto$PreparePaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$PreparePaymentRequest.flowId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m16823s(PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, String str) {
        paymentSdkNativeServiceProto$PreparePaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$PreparePaymentRequest.paymentProviderId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m16824t(PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, String str) {
        paymentSdkNativeServiceProto$PreparePaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$PreparePaymentRequest.paymentSessionId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m16825u(PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, PaymentSdkNativeServiceProto$ProceedData paymentSdkNativeServiceProto$ProceedData) {
        paymentSdkNativeServiceProto$PreparePaymentRequest.getClass();
        paymentSdkNativeServiceProto$ProceedData.getClass();
        paymentSdkNativeServiceProto$PreparePaymentRequest.proceedData_ = paymentSdkNativeServiceProto$ProceedData;
        paymentSdkNativeServiceProto$PreparePaymentRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: v */
    public static void m16826v(PaymentSdkNativeServiceProto$PreparePaymentRequest paymentSdkNativeServiceProto$PreparePaymentRequest, String str) {
        paymentSdkNativeServiceProto$PreparePaymentRequest.getClass();
        str.getClass();
        paymentSdkNativeServiceProto$PreparePaymentRequest.riskDeviceId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static gfn0 m16827w() {
        return (gfn0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\nဉ\u0000", new Object[]{"bitField0_", "paymentSessionId_", "clientContext_", "paymentProviderId_", "checkoutViewId_", "attemptId_", "flowId_", "cancelUrl_", "riskDeviceId_", "proceedData_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PreparePaymentRequest();
        }
        if (iOrdinal == 4) {
            return new gfn0(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$PreparePaymentRequest.class) {
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
