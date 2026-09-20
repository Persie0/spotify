package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$PaymentSessionResponse extends AbstractC0269h implements sre0 {
    private static final PaymentSdkNativeServiceProto$PaymentSessionResponse DEFAULT_INSTANCE;
    public static final int INITIAL_ERROR_FIELD_NUMBER = 6;
    public static final int INITIAL_PROVIDER_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_METHODS_FIELD_NUMBER = 1;
    public static final int SESSION_FIELD_NUMBER = 5;
    public static final int STRINGS_FIELD_NUMBER = 4;
    private int bitField0_;
    private PaymentSdkNativeServiceProto$ResponseAction.Error initialError_;
    private PaymentSdkNativeServiceProto$PaymentSessionData session_;
    private Strings strings_;
    private ae50 paymentMethods_ = AbstractC0269h.emptyProtobufList();
    private String initialProviderId_ = "";

    public static final class Strings extends AbstractC0269h implements sre0 {
        public static final int BACK_TO_PAYMENT_DETAILS_LABEL_FIELD_NUMBER = 6;
        public static final int CHANGE_PAYMENT_METHOD_LABEL_FIELD_NUMBER = 4;
        private static final Strings DEFAULT_INSTANCE;
        public static final int FALLBACK_CTA_LABEL_FIELD_NUMBER = 1;
        public static final int GLOBAL_ERROR_MESSAGE_FIELD_NUMBER = 3;
        public static final int MORE_PROVIDER_LOGOS_LABEL_FIELD_NUMBER = 5;
        private static volatile r2n0 PARSER = null;
        public static final int REDIRECT_MESSAGE_FIELD_NUMBER = 2;
        private String fallbackCtaLabel_ = "";
        private String redirectMessage_ = "";
        private String globalErrorMessage_ = "";
        private String changePaymentMethodLabel_ = "";
        private String moreProviderLogosLabel_ = "";
        private String backToPaymentDetailsLabel_ = "";

        static {
            Strings strings = new Strings();
            DEFAULT_INSTANCE = strings;
            AbstractC0269h.registerDefaultInstance(Strings.class, strings);
        }

        private Strings() {
        }

        /* JADX INFO: renamed from: p */
        public static Strings m16782p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"fallbackCtaLabel_", "redirectMessage_", "globalErrorMessage_", "changePaymentMethodLabel_", "moreProviderLogosLabel_", "backToPaymentDetailsLabel_"});
            }
            if (iOrdinal == 3) {
                return new Strings();
            }
            if (iOrdinal == 4) {
                return new C1141u(DEFAULT_INSTANCE);
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
            synchronized (Strings.class) {
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
        public final String m16783n() {
            return this.backToPaymentDetailsLabel_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m16784o() {
            return this.changePaymentMethodLabel_;
        }

        /* JADX INFO: renamed from: q */
        public final String m16785q() {
            return this.fallbackCtaLabel_;
        }

        /* JADX INFO: renamed from: r */
        public final String m16786r() {
            return this.globalErrorMessage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaymentSdkNativeServiceProto$PaymentSessionResponse paymentSdkNativeServiceProto$PaymentSessionResponse = new PaymentSdkNativeServiceProto$PaymentSessionResponse();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PaymentSessionResponse;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$PaymentSessionResponse.class, paymentSdkNativeServiceProto$PaymentSessionResponse);
    }

    private PaymentSdkNativeServiceProto$PaymentSessionResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static PaymentSdkNativeServiceProto$PaymentSessionResponse m16776n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "paymentMethods_", PaymentSdkNativeServiceProto$PaymentMethod.class, "initialProviderId_", "strings_", "session_", "initialError_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PaymentSessionResponse();
        }
        if (iOrdinal == 4) {
            return new C1139t(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$PaymentSessionResponse.class) {
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

    /* JADX INFO: renamed from: o */
    public final PaymentSdkNativeServiceProto$ResponseAction.Error m16777o() {
        PaymentSdkNativeServiceProto$ResponseAction.Error error = this.initialError_;
        return error == null ? PaymentSdkNativeServiceProto$ResponseAction.Error.m16887n() : error;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m16778p() {
        return this.paymentMethods_;
    }

    /* JADX INFO: renamed from: q */
    public final PaymentSdkNativeServiceProto$PaymentSessionData m16779q() {
        PaymentSdkNativeServiceProto$PaymentSessionData paymentSdkNativeServiceProto$PaymentSessionData = this.session_;
        return paymentSdkNativeServiceProto$PaymentSessionData == null ? PaymentSdkNativeServiceProto$PaymentSessionData.m16773p() : paymentSdkNativeServiceProto$PaymentSessionData;
    }

    /* JADX INFO: renamed from: r */
    public final Strings m16780r() {
        Strings strings = this.strings_;
        return strings == null ? Strings.m16782p() : strings;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16781s() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
