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
public final class PaymentSdkNativeServiceProto$PaintedDoorConfig extends AbstractC0269h implements sre0 {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int BUTTON_LABEL_FIELD_NUMBER = 3;
    private static final PaymentSdkNativeServiceProto$PaintedDoorConfig DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String body_ = "";
    private String buttonLabel_ = "";

    static {
        PaymentSdkNativeServiceProto$PaintedDoorConfig paymentSdkNativeServiceProto$PaintedDoorConfig = new PaymentSdkNativeServiceProto$PaintedDoorConfig();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PaintedDoorConfig;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$PaintedDoorConfig.class, paymentSdkNativeServiceProto$PaintedDoorConfig);
    }

    private PaymentSdkNativeServiceProto$PaintedDoorConfig() {
    }

    /* JADX INFO: renamed from: p */
    public static PaymentSdkNativeServiceProto$PaintedDoorConfig m16761p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "body_", "buttonLabel_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PaintedDoorConfig();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 18);
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
        synchronized (PaymentSdkNativeServiceProto$PaintedDoorConfig.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16762n() {
        return this.body_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16763o() {
        return this.buttonLabel_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
