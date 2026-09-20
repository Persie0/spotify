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
public final class PaymentSdkNativeServiceProto$FormField extends AbstractC0269h implements sre0 {
    public static final int CHECKBOX_FIELD_FIELD_NUMBER = 6;
    public static final int CHIPS_FIELD_FIELD_NUMBER = 4;
    private static final PaymentSdkNativeServiceProto$FormField DEFAULT_INSTANCE;
    public static final int DROPDOWN_FIELD_FIELD_NUMBER = 3;
    public static final int INFORMATION_BANNER_FIELD_FIELD_NUMBER = 7;
    public static final int INPUT_FIELD_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PCI_FIELD_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_FIELD_NUMBER = 1;
    private int fieldCase_ = 0;
    private Object field_;

    static {
        PaymentSdkNativeServiceProto$FormField paymentSdkNativeServiceProto$FormField = new PaymentSdkNativeServiceProto$FormField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$FormField;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$FormField.class, paymentSdkNativeServiceProto$FormField);
    }

    private PaymentSdkNativeServiceProto$FormField() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"field_", "fieldCase_", PaymentSdkNativeServiceProto$TextField.class, PaymentSdkNativeServiceProto$InputField.class, PaymentSdkNativeServiceProto$DropdownField.class, PaymentSdkNativeServiceProto$ChipsField.class, PaymentSdkNativeServiceProto$PciField.class, PaymentSdkNativeServiceProto$CheckboxField.class, PaymentSdkNativeServiceProto$InformationBannerField.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$FormField();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 15);
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
        synchronized (PaymentSdkNativeServiceProto$FormField.class) {
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
    public final PaymentSdkNativeServiceProto$CheckboxField m16727n() {
        return this.fieldCase_ == 6 ? (PaymentSdkNativeServiceProto$CheckboxField) this.field_ : PaymentSdkNativeServiceProto$CheckboxField.m16710n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PaymentSdkNativeServiceProto$ChipsField m16728o() {
        return this.fieldCase_ == 4 ? (PaymentSdkNativeServiceProto$ChipsField) this.field_ : PaymentSdkNativeServiceProto$ChipsField.m16713o();
    }

    /* JADX INFO: renamed from: p */
    public final PaymentSdkNativeServiceProto$DropdownField m16729p() {
        return this.fieldCase_ == 3 ? (PaymentSdkNativeServiceProto$DropdownField) this.field_ : PaymentSdkNativeServiceProto$DropdownField.m16718o();
    }

    /* JADX INFO: renamed from: q */
    public final int m16730q() {
        switch (this.fieldCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: r */
    public final PaymentSdkNativeServiceProto$InformationBannerField m16731r() {
        return this.fieldCase_ == 7 ? (PaymentSdkNativeServiceProto$InformationBannerField) this.field_ : PaymentSdkNativeServiceProto$InformationBannerField.m16740o();
    }

    /* JADX INFO: renamed from: s */
    public final PaymentSdkNativeServiceProto$InputField m16732s() {
        return this.fieldCase_ == 2 ? (PaymentSdkNativeServiceProto$InputField) this.field_ : PaymentSdkNativeServiceProto$InputField.m16742n();
    }

    /* JADX INFO: renamed from: t */
    public final PaymentSdkNativeServiceProto$PciField m16733t() {
        return this.fieldCase_ == 5 ? (PaymentSdkNativeServiceProto$PciField) this.field_ : PaymentSdkNativeServiceProto$PciField.m16787p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final PaymentSdkNativeServiceProto$TextField m16734u() {
        return this.fieldCase_ == 1 ? (PaymentSdkNativeServiceProto$TextField) this.field_ : PaymentSdkNativeServiceProto$TextField.m16899o();
    }
}
