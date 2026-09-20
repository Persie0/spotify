package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c0n0;
import p204p.jfn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$TextField extends AbstractC0269h implements sre0 {
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final PaymentSdkNativeServiceProto$TextField DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VARIANT_FIELD_NUMBER = 2;
    private String content_ = "";
    private int variant_;

    static {
        PaymentSdkNativeServiceProto$TextField paymentSdkNativeServiceProto$TextField = new PaymentSdkNativeServiceProto$TextField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$TextField;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$TextField.class, paymentSdkNativeServiceProto$TextField);
    }

    private PaymentSdkNativeServiceProto$TextField() {
    }

    /* JADX INFO: renamed from: o */
    public static PaymentSdkNativeServiceProto$TextField m16899o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"content_", "variant_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$TextField();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 23);
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
        synchronized (PaymentSdkNativeServiceProto$TextField.class) {
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
    public final String m16900n() {
        return this.content_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final jfn0 m16901p() {
        jfn0 jfn0Var;
        int i = this.variant_;
        if (i == 0) {
            jfn0Var = jfn0.TEXT_VARIANT_UNKNOWN;
        } else if (i == 1) {
            jfn0Var = jfn0.TEXT_VARIANT_BODY_MEDIUM;
        } else if (i != 2) {
            jfn0Var = i != 3 ? null : jfn0.TEXT_VARIANT_BODY_SMALL;
        } else {
            jfn0Var = jfn0.TEXT_VARIANT_MARGINAL;
        }
        return jfn0Var == null ? jfn0.UNRECOGNIZED : jfn0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
