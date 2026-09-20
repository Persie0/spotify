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
public final class PaymentSdkNativeServiceProto$PciField extends AbstractC0269h implements sre0 {
    public static final int CVC_LENGTH_FIELD_NUMBER = 9;
    public static final int CVC_ONLY_FIELD_NUMBER = 8;
    private static final PaymentSdkNativeServiceProto$PciField DEFAULT_INSTANCE;
    public static final int ENABLE_KOREA_FIELDS_FIELD_NUMBER = 7;
    public static final int ERROR_MESSAGES_FIELD_NUMBER = 5;
    public static final int IS_RTL_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NETWORKS_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PRELOAD_ENABLED_FIELD_NUMBER = 11;
    public static final int PROVIDERS_FIELD_NUMBER = 3;
    public static final int TRANSLATIONS_FIELD_NUMBER = 4;
    public static final int WEBVIEW_BRIDGE_URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private int cvcLength_;
    private boolean cvcOnly_;
    private boolean enableKoreaFields_;
    private PciErrorMessages errorMessages_;
    private boolean isRtl_;
    private boolean preloadEnabled_;
    private PciTranslations translations_;
    private String name_ = "";
    private String webviewBridgeUrl_ = "";
    private ae50 providers_ = AbstractC0269h.emptyProtobufList();
    private ae50 networks_ = AbstractC0269h.emptyProtobufList();

    public static final class PciCardNetwork extends AbstractC0269h implements sre0 {
        private static final PciCardNetwork DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LOGO_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private String id_ = "";
        private String name_ = "";
        private String logo_ = "";

        static {
            PciCardNetwork pciCardNetwork = new PciCardNetwork();
            DEFAULT_INSTANCE = pciCardNetwork;
            AbstractC0269h.registerDefaultInstance(PciCardNetwork.class, pciCardNetwork);
        }

        private PciCardNetwork() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"id_", "name_", "logo_"});
            }
            if (iOrdinal == 3) {
                return new PciCardNetwork();
            }
            if (iOrdinal == 4) {
                return new C1145w(DEFAULT_INSTANCE);
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
            synchronized (PciCardNetwork.class) {
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PciErrorMessages extends AbstractC0269h implements sre0 {
        private static final PciErrorMessages DEFAULT_INSTANCE;
        public static final int EXPIRED_EXPIRY_DATE_FIELD_NUMBER = 4;
        public static final int INVALID_BIRTH_DATE_FIELD_NUMBER = 5;
        public static final int INVALID_CARD_NUMBER_FIELD_NUMBER = 1;
        public static final int INVALID_CORPORATE_REGISTRATION_NUMBER_FIELD_NUMBER = 6;
        public static final int INVALID_CVC_FIELD_NUMBER = 2;
        public static final int INVALID_EXPIRY_DATE_FIELD_NUMBER = 3;
        public static final int INVALID_TWO_DIGIT_PIN_FIELD_NUMBER = 7;
        private static volatile r2n0 PARSER;
        private String invalidCardNumber_ = "";
        private String invalidCvc_ = "";
        private String invalidExpiryDate_ = "";
        private String expiredExpiryDate_ = "";
        private String invalidBirthDate_ = "";
        private String invalidCorporateRegistrationNumber_ = "";
        private String invalidTwoDigitPin_ = "";

        static {
            PciErrorMessages pciErrorMessages = new PciErrorMessages();
            DEFAULT_INSTANCE = pciErrorMessages;
            AbstractC0269h.registerDefaultInstance(PciErrorMessages.class, pciErrorMessages);
        }

        private PciErrorMessages() {
        }

        /* JADX INFO: renamed from: n */
        public static PciErrorMessages m16797n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"invalidCardNumber_", "invalidCvc_", "invalidExpiryDate_", "expiredExpiryDate_", "invalidBirthDate_", "invalidCorporateRegistrationNumber_", "invalidTwoDigitPin_"});
            }
            if (iOrdinal == 3) {
                return new PciErrorMessages();
            }
            if (iOrdinal == 4) {
                return new C1147x(DEFAULT_INSTANCE);
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
            synchronized (PciErrorMessages.class) {
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
        public final String m16798o() {
            return this.expiredExpiryDate_;
        }

        /* JADX INFO: renamed from: p */
        public final String m16799p() {
            return this.invalidBirthDate_;
        }

        /* JADX INFO: renamed from: q */
        public final String m16800q() {
            return this.invalidCardNumber_;
        }

        /* JADX INFO: renamed from: r */
        public final String m16801r() {
            return this.invalidCorporateRegistrationNumber_;
        }

        /* JADX INFO: renamed from: s */
        public final String m16802s() {
            return this.invalidCvc_;
        }

        /* JADX INFO: renamed from: t */
        public final String m16803t() {
            return this.invalidExpiryDate_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final String m16804u() {
            return this.invalidTwoDigitPin_;
        }
    }

    public static final class PciTranslations extends AbstractC0269h implements sre0 {
        public static final int BIRTH_DATE_LABEL_FIELD_NUMBER = 7;
        public static final int BIRTH_DATE_PLACEHOLDER_FIELD_NUMBER = 8;
        public static final int CARD_NUMBER_LABEL_FIELD_NUMBER = 1;
        public static final int CORPORATE_CARD_LABEL_FIELD_NUMBER = 6;
        public static final int CORPORATE_REGISTRATION_NUMBER_LABEL_FIELD_NUMBER = 9;
        public static final int CORPORATE_REGISTRATION_NUMBER_PLACEHOLDER_FIELD_NUMBER = 10;
        private static final PciTranslations DEFAULT_INSTANCE;
        public static final int EXPIRATION_DATE_LABEL_FIELD_NUMBER = 3;
        public static final int EXPIRATION_DATE_PLACEHOLDER_FIELD_NUMBER = 4;
        private static volatile r2n0 PARSER = null;
        public static final int PERSONAL_CARD_LABEL_FIELD_NUMBER = 5;
        public static final int SECURITY_CODE_LABEL_FIELD_NUMBER = 2;
        public static final int TWO_DIGIT_PIN_LABEL_FIELD_NUMBER = 11;
        public static final int TWO_DIGIT_PIN_PLACEHOLDER_FIELD_NUMBER = 12;
        private String cardNumberLabel_ = "";
        private String securityCodeLabel_ = "";
        private String expirationDateLabel_ = "";
        private String expirationDatePlaceholder_ = "";
        private String personalCardLabel_ = "";
        private String corporateCardLabel_ = "";
        private String birthDateLabel_ = "";
        private String birthDatePlaceholder_ = "";
        private String corporateRegistrationNumberLabel_ = "";
        private String corporateRegistrationNumberPlaceholder_ = "";
        private String twoDigitPinLabel_ = "";
        private String twoDigitPinPlaceholder_ = "";

        static {
            PciTranslations pciTranslations = new PciTranslations();
            DEFAULT_INSTANCE = pciTranslations;
            AbstractC0269h.registerDefaultInstance(PciTranslations.class, pciTranslations);
        }

        private PciTranslations() {
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: t */
        public static PciTranslations m16805t() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ", new Object[]{"cardNumberLabel_", "securityCodeLabel_", "expirationDateLabel_", "expirationDatePlaceholder_", "personalCardLabel_", "corporateCardLabel_", "birthDateLabel_", "birthDatePlaceholder_", "corporateRegistrationNumberLabel_", "corporateRegistrationNumberPlaceholder_", "twoDigitPinLabel_", "twoDigitPinPlaceholder_"});
            }
            if (iOrdinal == 3) {
                return new PciTranslations();
            }
            if (iOrdinal == 4) {
                return new C1149y(DEFAULT_INSTANCE);
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
            synchronized (PciTranslations.class) {
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
        public final String m16806n() {
            return this.birthDateLabel_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m16807o() {
            return this.birthDatePlaceholder_;
        }

        /* JADX INFO: renamed from: p */
        public final String m16808p() {
            return this.cardNumberLabel_;
        }

        /* JADX INFO: renamed from: q */
        public final String m16809q() {
            return this.corporateCardLabel_;
        }

        /* JADX INFO: renamed from: r */
        public final String m16810r() {
            return this.corporateRegistrationNumberLabel_;
        }

        /* JADX INFO: renamed from: s */
        public final String m16811s() {
            return this.corporateRegistrationNumberPlaceholder_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final String m16812u() {
            return this.expirationDateLabel_;
        }

        /* JADX INFO: renamed from: v */
        public final String m16813v() {
            return this.expirationDatePlaceholder_;
        }

        /* JADX INFO: renamed from: w */
        public final String m16814w() {
            return this.personalCardLabel_;
        }

        /* JADX INFO: renamed from: x */
        public final String m16815x() {
            return this.securityCodeLabel_;
        }

        /* JADX INFO: renamed from: y */
        public final String m16816y() {
            return this.twoDigitPinLabel_;
        }

        /* JADX INFO: renamed from: z */
        public final String m16817z() {
            return this.twoDigitPinPlaceholder_;
        }
    }

    static {
        PaymentSdkNativeServiceProto$PciField paymentSdkNativeServiceProto$PciField = new PaymentSdkNativeServiceProto$PciField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PciField;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$PciField.class, paymentSdkNativeServiceProto$PciField);
    }

    private PaymentSdkNativeServiceProto$PciField() {
    }

    /* JADX INFO: renamed from: p */
    public static PaymentSdkNativeServiceProto$PciField m16787p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004ဉ\u0000\u0005ဉ\u0001\u0006\u0007\u0007\u0007\b\u0007\t\u0004\n\u001b\u000b\u0007", new Object[]{"bitField0_", "name_", "webviewBridgeUrl_", "providers_", "translations_", "errorMessages_", "isRtl_", "enableKoreaFields_", "cvcOnly_", "cvcLength_", "networks_", PciCardNetwork.class, "preloadEnabled_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PciField();
        }
        if (iOrdinal == 4) {
            return new C1143v(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$PciField.class) {
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

    /* JADX INFO: renamed from: n */
    public final int m16788n() {
        return this.cvcLength_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16789o() {
        return this.cvcOnly_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16790q() {
        return this.enableKoreaFields_;
    }

    /* JADX INFO: renamed from: r */
    public final PciErrorMessages m16791r() {
        PciErrorMessages pciErrorMessages = this.errorMessages_;
        return pciErrorMessages == null ? PciErrorMessages.m16797n() : pciErrorMessages;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16792s() {
        return this.isRtl_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16793t() {
        return this.preloadEnabled_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m16794u() {
        return this.providers_;
    }

    /* JADX INFO: renamed from: v */
    public final PciTranslations m16795v() {
        PciTranslations pciTranslations = this.translations_;
        return pciTranslations == null ? PciTranslations.m16805t() : pciTranslations;
    }

    /* JADX INFO: renamed from: w */
    public final String m16796w() {
        return this.webviewBridgeUrl_;
    }
}
