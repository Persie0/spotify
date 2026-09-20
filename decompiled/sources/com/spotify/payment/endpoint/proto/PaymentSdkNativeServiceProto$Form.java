package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$Form extends AbstractC0269h implements sre0 {
    public static final int CTA_LABEL_FIELD_NUMBER = 3;
    public static final int CTA_MODULE_TEXT_FIELD_NUMBER = 2;
    private static final PaymentSdkNativeServiceProto$Form DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String id_ = "";
    private String ctaModuleText_ = "";
    private String ctaLabel_ = "";
    private ae50 fields_ = AbstractC0269h.emptyProtobufList();

    static {
        PaymentSdkNativeServiceProto$Form paymentSdkNativeServiceProto$Form = new PaymentSdkNativeServiceProto$Form();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$Form;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$Form.class, paymentSdkNativeServiceProto$Form);
    }

    private PaymentSdkNativeServiceProto$Form() {
    }

    /* JADX INFO: renamed from: p */
    public static PaymentSdkNativeServiceProto$Form m16723p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0005\u001b", new Object[]{"id_", "ctaModuleText_", "ctaLabel_", "fields_", PaymentSdkNativeServiceProto$FormField.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$Form();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 14);
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
        synchronized (PaymentSdkNativeServiceProto$Form.class) {
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

    public final String getId() {
        return this.id_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16724n() {
        return this.ctaLabel_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16725o() {
        return this.ctaModuleText_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m16726q() {
        return this.fields_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
