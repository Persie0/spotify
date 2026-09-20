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
public final class PaymentSdkNativeServiceProto$CheckboxField extends AbstractC0269h implements sre0 {
    private static final PaymentSdkNativeServiceProto$CheckboxField DEFAULT_INSTANCE;
    public static final int HINT_MESSAGE_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String name_ = "";
    private String label_ = "";
    private String hintMessage_ = "";

    static {
        PaymentSdkNativeServiceProto$CheckboxField paymentSdkNativeServiceProto$CheckboxField = new PaymentSdkNativeServiceProto$CheckboxField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$CheckboxField;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$CheckboxField.class, paymentSdkNativeServiceProto$CheckboxField);
    }

    private PaymentSdkNativeServiceProto$CheckboxField() {
    }

    /* JADX INFO: renamed from: n */
    public static PaymentSdkNativeServiceProto$CheckboxField m16710n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "label_", "hintMessage_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$CheckboxField();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 13);
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
        synchronized (PaymentSdkNativeServiceProto$CheckboxField.class) {
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

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16711o() {
        return this.hintMessage_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16712p() {
        return this.label_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
