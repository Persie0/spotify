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
public final class PaymentSdkNativeServiceProto$PaymentMethod extends AbstractC0269h implements sre0 {
    public static final int BRAND_SELECTION_FIELD_NUMBER = 6;
    private static final PaymentSdkNativeServiceProto$PaymentMethod DEFAULT_INSTANCE;
    public static final int GRAYED_OUT_MESSAGE_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INITIAL_FORM_FIELD_NUMBER = 5;
    public static final int IS_METHOD_SUPPORTED_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 7;
    public static final int LABEL_SUBTITLE_FIELD_NUMBER = 9;
    public static final int LEGAL_TERMS_FIELD_NUMBER = 4;
    public static final int LOGOS_FIELD_NUMBER = 10;
    public static final int PAINTED_DOOR_CONFIG_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int STORED_METHOD_ID_FIELD_NUMBER = 11;
    public static final int SUBTITLE_FIELD_NUMBER = 8;
    private int bitField0_;
    private PaymentSdkNativeServiceProto$BrandSelection brandSelection_;
    private PaymentSdkNativeServiceProto$Form initialForm_;
    private boolean isMethodSupported_;
    private PaymentSdkNativeServiceProto$PaintedDoorConfig paintedDoorConfig_;
    private String id_ = "";
    private String grayedOutMessage_ = "";
    private ae50 legalTerms_ = AbstractC0269h.emptyProtobufList();
    private String label_ = "";
    private String subtitle_ = "";
    private String labelSubtitle_ = "";
    private ae50 logos_ = AbstractC0269h.emptyProtobufList();
    private String storedMethodId_ = "";

    static {
        PaymentSdkNativeServiceProto$PaymentMethod paymentSdkNativeServiceProto$PaymentMethod = new PaymentSdkNativeServiceProto$PaymentMethod();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PaymentMethod;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$PaymentMethod.class, paymentSdkNativeServiceProto$PaymentMethod);
    }

    private PaymentSdkNativeServiceProto$PaymentMethod() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004\u001b\u0005ဉ\u0000\u0006ဉ\u0001\u0007Ȉ\bȈ\tȈ\nȚ\u000bȈ\fဉ\u0002", new Object[]{"bitField0_", "id_", "grayedOutMessage_", "isMethodSupported_", "legalTerms_", PaymentSdkNativeServiceProto$LegalTerm.class, "initialForm_", "brandSelection_", "label_", "subtitle_", "labelSubtitle_", "logos_", "storedMethodId_", "paintedDoorConfig_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PaymentMethod();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 19);
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
        synchronized (PaymentSdkNativeServiceProto$PaymentMethod.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16764n() {
        return this.grayedOutMessage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PaymentSdkNativeServiceProto$Form m16765o() {
        PaymentSdkNativeServiceProto$Form paymentSdkNativeServiceProto$Form = this.initialForm_;
        return paymentSdkNativeServiceProto$Form == null ? PaymentSdkNativeServiceProto$Form.m16723p() : paymentSdkNativeServiceProto$Form;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16766p() {
        return this.isMethodSupported_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16767q() {
        return this.label_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m16768r() {
        return this.legalTerms_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m16769s() {
        return this.logos_;
    }

    /* JADX INFO: renamed from: t */
    public final PaymentSdkNativeServiceProto$PaintedDoorConfig m16770t() {
        PaymentSdkNativeServiceProto$PaintedDoorConfig paymentSdkNativeServiceProto$PaintedDoorConfig = this.paintedDoorConfig_;
        return paymentSdkNativeServiceProto$PaintedDoorConfig == null ? PaymentSdkNativeServiceProto$PaintedDoorConfig.m16761p() : paymentSdkNativeServiceProto$PaintedDoorConfig;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m16771u() {
        return this.storedMethodId_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m16772v() {
        return (this.bitField0_ & 4) != 0;
    }
}
