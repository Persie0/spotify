package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c0n0;
import p204p.ffn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$LegalTerm extends AbstractC0269h implements sre0 {
    private static final PaymentSdkNativeServiceProto$LegalTerm DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int HTML_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    private String html_ = "";
    private String error_ = "";

    static {
        PaymentSdkNativeServiceProto$LegalTerm paymentSdkNativeServiceProto$LegalTerm = new PaymentSdkNativeServiceProto$LegalTerm();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$LegalTerm;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$LegalTerm.class, paymentSdkNativeServiceProto$LegalTerm);
    }

    private PaymentSdkNativeServiceProto$LegalTerm() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "html_", "error_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$LegalTerm();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 17);
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
        synchronized (PaymentSdkNativeServiceProto$LegalTerm.class) {
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
    public final String m16758n() {
        return this.error_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16759o() {
        return this.html_;
    }

    /* JADX INFO: renamed from: p */
    public final ffn0 m16760p() {
        ffn0 ffn0Var;
        int i = this.type_;
        if (i == 0) {
            ffn0Var = ffn0.LEGAL_TERM_TYPE_UNKNOWN;
        } else if (i == 1) {
            ffn0Var = ffn0.LEGAL_TERM_TYPE_TEXT;
        } else if (i == 2) {
            ffn0Var = ffn0.LEGAL_TERM_TYPE_CONSPICUOUS_TEXT;
        } else if (i != 3) {
            ffn0Var = i != 4 ? null : ffn0.LEGAL_TERM_TYPE_CONSPICUOUS_CHECKBOX;
        } else {
            ffn0Var = ffn0.LEGAL_TERM_TYPE_CHECKBOX;
        }
        return ffn0Var == null ? ffn0.UNRECOGNIZED : ffn0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
