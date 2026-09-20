package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$GetPaymentSessionResponse extends AbstractC0269h implements sre0 {
    public static final int ABORT_SESSION_FIELD_NUMBER = 3;
    private static final PaymentSdkNativeServiceProto$GetPaymentSessionResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int GET_NEW_PAYMENT_SESSION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_SESSION_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        PaymentSdkNativeServiceProto$GetPaymentSessionResponse paymentSdkNativeServiceProto$GetPaymentSessionResponse = new PaymentSdkNativeServiceProto$GetPaymentSessionResponse();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$GetPaymentSessionResponse;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$GetPaymentSessionResponse.class, paymentSdkNativeServiceProto$GetPaymentSessionResponse);
    }

    private PaymentSdkNativeServiceProto$GetPaymentSessionResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"response_", "responseCase_", PaymentSdkNativeServiceProto$PaymentSessionResponse.class, PaymentSdkNativeServiceProto$ResponseAction.GetNewSession.class, PaymentSdkNativeServiceProto$ResponseAction.AbortSession.class, PaymentSdkNativeServiceProto$ResponseAction.Error.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$GetPaymentSessionResponse();
        }
        if (iOrdinal == 4) {
            return new C1123l(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$GetPaymentSessionResponse.class) {
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
    public final PaymentSdkNativeServiceProto$ResponseAction.Error m16737n() {
        return this.responseCase_ == 4 ? (PaymentSdkNativeServiceProto$ResponseAction.Error) this.response_ : PaymentSdkNativeServiceProto$ResponseAction.Error.m16887n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PaymentSdkNativeServiceProto$PaymentSessionResponse m16738o() {
        return this.responseCase_ == 1 ? (PaymentSdkNativeServiceProto$PaymentSessionResponse) this.response_ : PaymentSdkNativeServiceProto$PaymentSessionResponse.m16776n();
    }

    /* JADX INFO: renamed from: p */
    public final int m16739p() {
        int i = this.responseCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
