package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$PreparePaymentResponse extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int ATTEMPT_FIELD_NUMBER = 2;
    private static final PaymentSdkNativeServiceProto$PreparePaymentResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private PaymentSdkNativeServiceProto$ResponseAction action_;
    private int attempt_;
    private int bitField0_;

    static {
        PaymentSdkNativeServiceProto$PreparePaymentResponse paymentSdkNativeServiceProto$PreparePaymentResponse = new PaymentSdkNativeServiceProto$PreparePaymentResponse();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PreparePaymentResponse;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$PreparePaymentResponse.class, paymentSdkNativeServiceProto$PreparePaymentResponse);
    }

    private PaymentSdkNativeServiceProto$PreparePaymentResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "action_", "attempt_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PreparePaymentResponse();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 21);
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
        synchronized (PaymentSdkNativeServiceProto$PreparePaymentResponse.class) {
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
    public final PaymentSdkNativeServiceProto$ResponseAction m16828n() {
        PaymentSdkNativeServiceProto$ResponseAction paymentSdkNativeServiceProto$ResponseAction = this.action_;
        return paymentSdkNativeServiceProto$ResponseAction == null ? PaymentSdkNativeServiceProto$ResponseAction.m16843p() : paymentSdkNativeServiceProto$ResponseAction;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m16829o() {
        return this.attempt_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
