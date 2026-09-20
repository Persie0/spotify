package com.spotify.payment.endpoint.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ifn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaymentSdkNativeServiceProto$ResponseAction extends AbstractC0269h implements sre0 {
    public static final int ABORT_SESSION_FIELD_NUMBER = 9;
    public static final int AUTHENTICATED_REDIRECT_FIELD_NUMBER = 17;
    public static final int COUNTRY_MISMATCH_ERROR_FIELD_NUMBER = 15;
    private static final PaymentSdkNativeServiceProto$ResponseAction DEFAULT_INSTANCE;
    public static final int DELIVERED_FIELD_NUMBER = 2;
    public static final int DISCOUNT_BLOCKER_ERROR_FIELD_NUMBER = 13;
    public static final int DISPLAY_PENDING_FIELD_NUMBER = 16;
    public static final int EJECT_TO_WEB_FIELD_NUMBER = 12;
    public static final int ERROR_FIELD_NUMBER = 1;
    public static final int FORM_FIELD_NUMBER = 4;
    public static final int GET_NEW_PAYMENT_SESSION_FIELD_NUMBER = 8;
    public static final int LAUNCH_INTENT_AND_WAIT_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_METHOD_DISCOUNT_BLOCKER_ERROR_FIELD_NUMBER = 14;
    public static final int QR_CODE_FIELD_NUMBER = 7;
    public static final int REDIRECT_FIELD_NUMBER = 11;
    public static final int WAIT_FIELD_NUMBER = 5;
    public static final int WAIT_WITH_COUNTDOWN_FIELD_NUMBER = 6;
    private int responseActionCase_ = 0;
    private Object responseAction_;

    public static final class AbortSession extends AbstractC0269h implements sre0 {
        private static final AbortSession DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            AbortSession abortSession = new AbortSession();
            DEFAULT_INSTANCE = abortSession;
            AbstractC0269h.registerDefaultInstance(AbortSession.class, abortSession);
        }

        private AbortSession() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new AbortSession();
            }
            if (iOrdinal == 4) {
                return new C1108d0(DEFAULT_INSTANCE);
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
            synchronized (AbortSession.class) {
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

    public static final class AuthenticatedRedirect extends AbstractC0269h implements sre0 {
        private static final AuthenticatedRedirect DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            AuthenticatedRedirect authenticatedRedirect = new AuthenticatedRedirect();
            DEFAULT_INSTANCE = authenticatedRedirect;
            AbstractC0269h.registerDefaultInstance(AuthenticatedRedirect.class, authenticatedRedirect);
        }

        private AuthenticatedRedirect() {
        }

        /* JADX INFO: renamed from: n */
        public static AuthenticatedRedirect m16854n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
            }
            if (iOrdinal == 3) {
                return new AuthenticatedRedirect();
            }
            if (iOrdinal == 4) {
                return new C1110e0(DEFAULT_INSTANCE);
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
            synchronized (AuthenticatedRedirect.class) {
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

        public final String getUrl() {
            return this.url_;
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

    public static final class CountryMismatchError extends AbstractC0269h implements sre0 {
        private static final CountryMismatchError DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        public static final int MESSAGE_WITH_COUNTRY_PICKER_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String messageWithCountryPicker_ = "";
        private String message_ = "";

        static {
            CountryMismatchError countryMismatchError = new CountryMismatchError();
            DEFAULT_INSTANCE = countryMismatchError;
            AbstractC0269h.registerDefaultInstance(CountryMismatchError.class, countryMismatchError);
        }

        private CountryMismatchError() {
        }

        /* JADX INFO: renamed from: n */
        public static CountryMismatchError m16855n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"messageWithCountryPicker_", "message_"});
            }
            if (iOrdinal == 3) {
                return new CountryMismatchError();
            }
            if (iOrdinal == 4) {
                return new C1114g0(DEFAULT_INSTANCE);
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
            synchronized (CountryMismatchError.class) {
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

        public final String getMessage() {
            return this.message_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m16856o() {
            return this.messageWithCountryPicker_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Delivered extends AbstractC0269h implements sre0 {
        private static final Delivered DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            Delivered delivered = new Delivered();
            DEFAULT_INSTANCE = delivered;
            AbstractC0269h.registerDefaultInstance(Delivered.class, delivered);
        }

        private Delivered() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Delivered();
            }
            if (iOrdinal == 4) {
                return new C1116h0(DEFAULT_INSTANCE);
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
            synchronized (Delivered.class) {
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

    public static final class DiscountBlockerError extends AbstractC0269h implements sre0 {
        private static final DiscountBlockerError DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        public static final int MESSAGE_WITH_ALTERNATIVE_OFFER_PLACEHOLDER_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String messageWithAlternativeOfferPlaceholder_ = "";
        private String message_ = "";

        static {
            DiscountBlockerError discountBlockerError = new DiscountBlockerError();
            DEFAULT_INSTANCE = discountBlockerError;
            AbstractC0269h.registerDefaultInstance(DiscountBlockerError.class, discountBlockerError);
        }

        private DiscountBlockerError() {
        }

        /* JADX INFO: renamed from: n */
        public static DiscountBlockerError m16857n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"messageWithAlternativeOfferPlaceholder_", "message_"});
            }
            if (iOrdinal == 3) {
                return new DiscountBlockerError();
            }
            if (iOrdinal == 4) {
                return new C1118i0(DEFAULT_INSTANCE);
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
            synchronized (DiscountBlockerError.class) {
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

        public final String getMessage() {
            return this.message_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m16858o() {
            return this.messageWithAlternativeOfferPlaceholder_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class DisplayPending extends AbstractC0269h implements sre0 {
        public static final int CANCEL_BUTTON_LABEL_FIELD_NUMBER = 2;
        private static final DisplayPending DEFAULT_INSTANCE;
        public static final int DEFERRED_REQUEST_FIELD_NUMBER = 4;
        public static final int DISCLAIMER_FIELD_NUMBER = 7;
        public static final int FORM_FIELD_NUMBER = 6;
        public static final int HEADER_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int QR_CODE_FIELD_NUMBER = 5;
        public static final int STEPS_FIELD_NUMBER = 3;
        private int bitField0_;
        private DeferredRequest deferredRequest_;
        private Form form_;
        private QrCode qrCode_;
        private String header_ = "";
        private String cancelButtonLabel_ = "";
        private ae50 steps_ = AbstractC0269h.emptyProtobufList();
        private String disclaimer_ = "";

        public static final class DeferredRequest extends AbstractC0269h implements sre0 {
            public static final int COUNTDOWN_FIELD_NUMBER = 2;
            private static final DeferredRequest DEFAULT_INSTANCE;
            public static final int DELAY_MILLIS_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private int bitField0_;
            private Countdown countdown_;
            private long delayMillis_;

            public static final class Countdown extends AbstractC0269h implements sre0 {
                public static final int BODY_FIELD_NUMBER = 2;
                public static final int DEADLINE_SECONDS_FIELD_NUMBER = 1;
                private static final Countdown DEFAULT_INSTANCE;
                private static volatile r2n0 PARSER;
                private String body_ = "";
                private long deadlineSeconds_;

                static {
                    Countdown countdown = new Countdown();
                    DEFAULT_INSTANCE = countdown;
                    AbstractC0269h.registerDefaultInstance(Countdown.class, countdown);
                }

                private Countdown() {
                }

                /* JADX INFO: renamed from: p */
                public static Countdown m16875p() {
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
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"deadlineSeconds_", "body_"});
                    }
                    if (iOrdinal == 3) {
                        return new Countdown();
                    }
                    if (iOrdinal == 4) {
                        return new C1124l0(DEFAULT_INSTANCE);
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
                    synchronized (Countdown.class) {
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
                public final String m16876n() {
                    return this.body_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                    return newBuilderForType();
                }

                /* JADX INFO: renamed from: o */
                public final long m16877o() {
                    return this.deadlineSeconds_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                DeferredRequest deferredRequest = new DeferredRequest();
                DEFAULT_INSTANCE = deferredRequest;
                AbstractC0269h.registerDefaultInstance(DeferredRequest.class, deferredRequest);
            }

            private DeferredRequest() {
            }

            /* JADX INFO: renamed from: o */
            public static DeferredRequest m16871o() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002ဉ\u0000", new Object[]{"bitField0_", "delayMillis_", "countdown_"});
                }
                if (iOrdinal == 3) {
                    return new DeferredRequest();
                }
                if (iOrdinal == 4) {
                    return new C1122k0(DEFAULT_INSTANCE);
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
                synchronized (DeferredRequest.class) {
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
            public final Countdown m16872n() {
                Countdown countdown = this.countdown_;
                return countdown == null ? Countdown.m16875p() : countdown;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: p */
            public final long m16873p() {
                return this.delayMillis_;
            }

            /* JADX INFO: renamed from: q */
            public final boolean m16874q() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Form extends AbstractC0269h implements sre0 {
            public static final int CTA_LABEL_FIELD_NUMBER = 2;
            private static final Form DEFAULT_INSTANCE;
            public static final int ERROR_MESSAGE_FIELD_NUMBER = 4;
            public static final int FIELDS_FIELD_NUMBER = 3;
            public static final int ID_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private String id_ = "";
            private String ctaLabel_ = "";
            private ae50 fields_ = AbstractC0269h.emptyProtobufList();
            private String errorMessage_ = "";

            static {
                Form form = new Form();
                DEFAULT_INSTANCE = form;
                AbstractC0269h.registerDefaultInstance(Form.class, form);
            }

            private Form() {
            }

            /* JADX INFO: renamed from: o */
            public static Form m16878o() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ", new Object[]{"id_", "ctaLabel_", "fields_", PaymentSdkNativeServiceProto$FormField.class, "errorMessage_"});
                }
                if (iOrdinal == 3) {
                    return new Form();
                }
                if (iOrdinal == 4) {
                    return new C1126m0(DEFAULT_INSTANCE);
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
                synchronized (Form.class) {
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
            public final String m16879n() {
                return this.ctaLabel_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: p */
            public final String m16880p() {
                return this.errorMessage_;
            }

            /* JADX INFO: renamed from: q */
            public final ae50 m16881q() {
                return this.fields_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class QrCode extends AbstractC0269h implements sre0 {
            private static final QrCode DEFAULT_INSTANCE;
            public static final int IMAGE_DATA_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER = null;
            public static final int TEXT_CODE_FIELD_NUMBER = 2;
            private String imageData_ = "";
            private String textCode_ = "";

            static {
                QrCode qrCode = new QrCode();
                DEFAULT_INSTANCE = qrCode;
                AbstractC0269h.registerDefaultInstance(QrCode.class, qrCode);
            }

            private QrCode() {
            }

            /* JADX INFO: renamed from: n */
            public static QrCode m16882n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"imageData_", "textCode_"});
                }
                if (iOrdinal == 3) {
                    return new QrCode();
                }
                if (iOrdinal == 4) {
                    return new C1128n0(DEFAULT_INSTANCE);
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
                synchronized (QrCode.class) {
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
            public final String m16883o() {
                return this.imageData_;
            }

            /* JADX INFO: renamed from: p */
            public final String m16884p() {
                return this.textCode_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Step extends AbstractC0269h implements sre0 {
            public static final int BODY_FIELD_NUMBER = 2;
            private static final Step DEFAULT_INSTANCE;
            public static final int ICON_FIELD_NUMBER = 3;
            private static volatile r2n0 PARSER = null;
            public static final int TITLE_FIELD_NUMBER = 1;
            private int icon_;
            private String title_ = "";
            private String body_ = "";

            static {
                Step step = new Step();
                DEFAULT_INSTANCE = step;
                AbstractC0269h.registerDefaultInstance(Step.class, step);
            }

            private Step() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"title_", "body_", "icon_"});
                }
                if (iOrdinal == 3) {
                    return new Step();
                }
                if (iOrdinal == 4) {
                    return new C1130o0(DEFAULT_INSTANCE);
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
                synchronized (Step.class) {
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
            public final String m16885n() {
                return this.body_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: o */
            public final ifn0 m16886o() {
                ifn0 ifn0Var;
                int i = this.icon_;
                if (i == 0) {
                    ifn0Var = ifn0.ENCORE_ICON_UNKNOWN;
                } else if (i == 1) {
                    ifn0Var = ifn0.ENCORE_ICON_CHECK_ALT;
                } else if (i == 2) {
                    ifn0Var = ifn0.ENCORE_ICON_UNDO;
                } else if (i == 3) {
                    ifn0Var = ifn0.ENCORE_ICON_EXTERNAL_LINK;
                } else if (i != 4) {
                    ifn0Var = i != 5 ? null : ifn0.ENCORE_ICON_MESSAGES;
                } else {
                    ifn0Var = ifn0.ENCORE_ICON_CAMERA;
                }
                return ifn0Var == null ? ifn0.UNRECOGNIZED : ifn0Var;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            DisplayPending displayPending = new DisplayPending();
            DEFAULT_INSTANCE = displayPending;
            AbstractC0269h.registerDefaultInstance(DisplayPending.class, displayPending);
        }

        private DisplayPending() {
        }

        /* JADX INFO: renamed from: o */
        public static DisplayPending m16859o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ለ\u0003", new Object[]{"bitField0_", "header_", "cancelButtonLabel_", "steps_", Step.class, "deferredRequest_", "qrCode_", "form_", "disclaimer_"});
            }
            if (iOrdinal == 3) {
                return new DisplayPending();
            }
            if (iOrdinal == 4) {
                return new C1120j0(DEFAULT_INSTANCE);
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
            synchronized (DisplayPending.class) {
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
        public final String m16860n() {
            return this.cancelButtonLabel_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final DeferredRequest m16861p() {
            DeferredRequest deferredRequest = this.deferredRequest_;
            return deferredRequest == null ? DeferredRequest.m16871o() : deferredRequest;
        }

        /* JADX INFO: renamed from: q */
        public final String m16862q() {
            return this.disclaimer_;
        }

        /* JADX INFO: renamed from: r */
        public final Form m16863r() {
            Form form = this.form_;
            return form == null ? Form.m16878o() : form;
        }

        /* JADX INFO: renamed from: s */
        public final String m16864s() {
            return this.header_;
        }

        /* JADX INFO: renamed from: t */
        public final QrCode m16865t() {
            QrCode qrCode = this.qrCode_;
            return qrCode == null ? QrCode.m16882n() : qrCode;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final ae50 m16866u() {
            return this.steps_;
        }

        /* JADX INFO: renamed from: v */
        public final boolean m16867v() {
            return (this.bitField0_ & 1) != 0;
        }

        /* JADX INFO: renamed from: w */
        public final boolean m16868w() {
            return (this.bitField0_ & 8) != 0;
        }

        /* JADX INFO: renamed from: x */
        public final boolean m16869x() {
            return (this.bitField0_ & 4) != 0;
        }

        /* JADX INFO: renamed from: y */
        public final boolean m16870y() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public static final class EjectToWeb extends AbstractC0269h implements sre0 {
        private static final EjectToWeb DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;

        static {
            EjectToWeb ejectToWeb = new EjectToWeb();
            DEFAULT_INSTANCE = ejectToWeb;
            AbstractC0269h.registerDefaultInstance(EjectToWeb.class, ejectToWeb);
        }

        private EjectToWeb() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new EjectToWeb();
            }
            if (iOrdinal == 4) {
                return new C1132p0(DEFAULT_INSTANCE);
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
            synchronized (EjectToWeb.class) {
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

    public static final class Error extends AbstractC0269h implements sre0 {
        private static final Error DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String errorMessage_ = "";

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            AbstractC0269h.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        /* JADX INFO: renamed from: n */
        public static Error m16887n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"errorMessage_"});
            }
            if (iOrdinal == 3) {
                return new Error();
            }
            if (iOrdinal == 4) {
                return new C1134q0(DEFAULT_INSTANCE);
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
            synchronized (Error.class) {
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
        public final String m16888o() {
            return this.errorMessage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class FormAction extends AbstractC0269h implements sre0 {
        private static final FormAction DEFAULT_INSTANCE;
        public static final int FORM_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private PaymentSdkNativeServiceProto$Form form_;

        static {
            FormAction formAction = new FormAction();
            DEFAULT_INSTANCE = formAction;
            AbstractC0269h.registerDefaultInstance(FormAction.class, formAction);
        }

        private FormAction() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "form_"});
            }
            if (iOrdinal == 3) {
                return new FormAction();
            }
            if (iOrdinal == 4) {
                return new C1136r0(DEFAULT_INSTANCE);
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
            synchronized (FormAction.class) {
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

    public static final class GetNewSession extends AbstractC0269h implements sre0 {
        private static final GetNewSession DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TRIGGER_AUTOMATIC_RETRY_FIELD_NUMBER = 1;
        private boolean triggerAutomaticRetry_;

        static {
            GetNewSession getNewSession = new GetNewSession();
            DEFAULT_INSTANCE = getNewSession;
            AbstractC0269h.registerDefaultInstance(GetNewSession.class, getNewSession);
        }

        private GetNewSession() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"triggerAutomaticRetry_"});
            }
            if (iOrdinal == 3) {
                return new GetNewSession();
            }
            if (iOrdinal == 4) {
                return new C1138s0(DEFAULT_INSTANCE);
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
            synchronized (GetNewSession.class) {
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

    public static final class LaunchIntentAndWait extends AbstractC0269h implements sre0 {
        public static final int APP_UNAVAILABLE_ERROR_MESSAGE_FIELD_NUMBER = 3;
        private static final LaunchIntentAndWait DEFAULT_INSTANCE;
        public static final int INTENT_URI_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 1;
        private long period_;
        private String intentUri_ = "";
        private String appUnavailableErrorMessage_ = "";

        static {
            LaunchIntentAndWait launchIntentAndWait = new LaunchIntentAndWait();
            DEFAULT_INSTANCE = launchIntentAndWait;
            AbstractC0269h.registerDefaultInstance(LaunchIntentAndWait.class, launchIntentAndWait);
        }

        private LaunchIntentAndWait() {
        }

        /* JADX INFO: renamed from: o */
        public static LaunchIntentAndWait m16889o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ", new Object[]{"period_", "intentUri_", "appUnavailableErrorMessage_"});
            }
            if (iOrdinal == 3) {
                return new LaunchIntentAndWait();
            }
            if (iOrdinal == 4) {
                return new C1140t0(DEFAULT_INSTANCE);
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
            synchronized (LaunchIntentAndWait.class) {
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
        public final String m16890n() {
            return this.appUnavailableErrorMessage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final String m16891p() {
            return this.intentUri_;
        }

        /* JADX INFO: renamed from: q */
        public final long m16892q() {
            return this.period_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PaymentMethodDiscountBlockerError extends AbstractC0269h implements sre0 {
        private static final PaymentMethodDiscountBlockerError DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        public static final int MESSAGE_WITH_ALTERNATIVE_OFFER_PLACEHOLDER_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String messageWithAlternativeOfferPlaceholder_ = "";
        private String message_ = "";

        static {
            PaymentMethodDiscountBlockerError paymentMethodDiscountBlockerError = new PaymentMethodDiscountBlockerError();
            DEFAULT_INSTANCE = paymentMethodDiscountBlockerError;
            AbstractC0269h.registerDefaultInstance(PaymentMethodDiscountBlockerError.class, paymentMethodDiscountBlockerError);
        }

        private PaymentMethodDiscountBlockerError() {
        }

        /* JADX INFO: renamed from: n */
        public static PaymentMethodDiscountBlockerError m16893n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"messageWithAlternativeOfferPlaceholder_", "message_"});
            }
            if (iOrdinal == 3) {
                return new PaymentMethodDiscountBlockerError();
            }
            if (iOrdinal == 4) {
                return new C1142u0(DEFAULT_INSTANCE);
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
            synchronized (PaymentMethodDiscountBlockerError.class) {
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

        public final String getMessage() {
            return this.message_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m16894o() {
            return this.messageWithAlternativeOfferPlaceholder_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class QrCode extends AbstractC0269h implements sre0 {
        private static final QrCode DEFAULT_INSTANCE;
        public static final int EXPLANATION_FIELD_NUMBER = 2;
        public static final int IMAGE_DATA_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 1;
        private String explanation_ = "";
        private String imageData_ = "";
        private long period_;

        static {
            QrCode qrCode = new QrCode();
            DEFAULT_INSTANCE = qrCode;
            AbstractC0269h.registerDefaultInstance(QrCode.class, qrCode);
        }

        private QrCode() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ", new Object[]{"period_", "explanation_", "imageData_"});
            }
            if (iOrdinal == 3) {
                return new QrCode();
            }
            if (iOrdinal == 4) {
                return new C1144v0(DEFAULT_INSTANCE);
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
            synchronized (QrCode.class) {
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

    public static final class Redirect extends AbstractC0269h implements sre0 {
        public static final int AUTHENTICATION_URL_FIELD_NUMBER = 2;
        private static final Redirect DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";
        private String authenticationUrl_ = "";

        static {
            Redirect redirect = new Redirect();
            DEFAULT_INSTANCE = redirect;
            AbstractC0269h.registerDefaultInstance(Redirect.class, redirect);
        }

        private Redirect() {
        }

        /* JADX INFO: renamed from: o */
        public static Redirect m16895o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"url_", "authenticationUrl_"});
            }
            if (iOrdinal == 3) {
                return new Redirect();
            }
            if (iOrdinal == 4) {
                return new C1146w0(DEFAULT_INSTANCE);
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
            synchronized (Redirect.class) {
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

        public final String getUrl() {
            return this.url_;
        }

        /* JADX INFO: renamed from: n */
        public final String m16896n() {
            return this.authenticationUrl_;
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

    public static final class Wait extends AbstractC0269h implements sre0 {
        private static final Wait DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 1;
        private long period_;

        static {
            Wait wait = new Wait();
            DEFAULT_INSTANCE = wait;
            AbstractC0269h.registerDefaultInstance(Wait.class, wait);
        }

        private Wait() {
        }

        /* JADX INFO: renamed from: n */
        public static Wait m16897n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"period_"});
            }
            if (iOrdinal == 3) {
                return new Wait();
            }
            if (iOrdinal == 4) {
                return new C1148x0(DEFAULT_INSTANCE);
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
            synchronized (Wait.class) {
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
        public final long m16898o() {
            return this.period_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class WaitWithCountdown extends AbstractC0269h implements sre0 {
        public static final int BODY_APPROVE_FIELD_NUMBER = 7;
        public static final int BODY_COME_BACK_FIELD_NUMBER = 9;
        public static final int BODY_OPEN_FIELD_NUMBER = 5;
        public static final int BODY_TIME_REMAINING_FIELD_NUMBER = 10;
        private static final WaitWithCountdown DEFAULT_INSTANCE;
        public static final int HEADER_APPROVE_FIELD_NUMBER = 6;
        public static final int HEADER_COME_BACK_FIELD_NUMBER = 8;
        public static final int HEADER_FIELD_NUMBER = 3;
        public static final int HEADER_OPEN_FIELD_NUMBER = 4;
        public static final int MAX_WAIT_SECONDS_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 1;
        private long maxWaitSeconds_;
        private long period_;
        private String header_ = "";
        private String headerOpen_ = "";
        private String bodyOpen_ = "";
        private String headerApprove_ = "";
        private String bodyApprove_ = "";
        private String headerComeBack_ = "";
        private String bodyComeBack_ = "";
        private String bodyTimeRemaining_ = "";

        static {
            WaitWithCountdown waitWithCountdown = new WaitWithCountdown();
            DEFAULT_INSTANCE = waitWithCountdown;
            AbstractC0269h.registerDefaultInstance(WaitWithCountdown.class, waitWithCountdown);
        }

        private WaitWithCountdown() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"period_", "maxWaitSeconds_", "header_", "headerOpen_", "bodyOpen_", "headerApprove_", "bodyApprove_", "headerComeBack_", "bodyComeBack_", "bodyTimeRemaining_"});
            }
            if (iOrdinal == 3) {
                return new WaitWithCountdown();
            }
            if (iOrdinal == 4) {
                return new C1150y0(DEFAULT_INSTANCE);
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
            synchronized (WaitWithCountdown.class) {
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

    static {
        PaymentSdkNativeServiceProto$ResponseAction paymentSdkNativeServiceProto$ResponseAction = new PaymentSdkNativeServiceProto$ResponseAction();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$ResponseAction;
        AbstractC0269h.registerDefaultInstance(PaymentSdkNativeServiceProto$ResponseAction.class, paymentSdkNativeServiceProto$ResponseAction);
    }

    private PaymentSdkNativeServiceProto$ResponseAction() {
    }

    /* JADX INFO: renamed from: p */
    public static PaymentSdkNativeServiceProto$ResponseAction m16843p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0000\u0001\u0011\u0010\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000", new Object[]{"responseAction_", "responseActionCase_", Error.class, Delivered.class, FormAction.class, Wait.class, WaitWithCountdown.class, QrCode.class, GetNewSession.class, AbortSession.class, LaunchIntentAndWait.class, Redirect.class, EjectToWeb.class, DiscountBlockerError.class, PaymentMethodDiscountBlockerError.class, CountryMismatchError.class, DisplayPending.class, AuthenticatedRedirect.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$ResponseAction();
        }
        if (iOrdinal == 4) {
            return new C1112f0(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$ResponseAction.class) {
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
    public final AuthenticatedRedirect m16844n() {
        return this.responseActionCase_ == 17 ? (AuthenticatedRedirect) this.responseAction_ : AuthenticatedRedirect.m16854n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CountryMismatchError m16845o() {
        return this.responseActionCase_ == 15 ? (CountryMismatchError) this.responseAction_ : CountryMismatchError.m16855n();
    }

    /* JADX INFO: renamed from: q */
    public final DiscountBlockerError m16846q() {
        return this.responseActionCase_ == 13 ? (DiscountBlockerError) this.responseAction_ : DiscountBlockerError.m16857n();
    }

    /* JADX INFO: renamed from: r */
    public final DisplayPending m16847r() {
        return this.responseActionCase_ == 16 ? (DisplayPending) this.responseAction_ : DisplayPending.m16859o();
    }

    /* JADX INFO: renamed from: s */
    public final Error m16848s() {
        return this.responseActionCase_ == 1 ? (Error) this.responseAction_ : Error.m16887n();
    }

    /* JADX INFO: renamed from: t */
    public final LaunchIntentAndWait m16849t() {
        return this.responseActionCase_ == 10 ? (LaunchIntentAndWait) this.responseAction_ : LaunchIntentAndWait.m16889o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final PaymentMethodDiscountBlockerError m16850u() {
        return this.responseActionCase_ == 14 ? (PaymentMethodDiscountBlockerError) this.responseAction_ : PaymentMethodDiscountBlockerError.m16893n();
    }

    /* JADX INFO: renamed from: v */
    public final Redirect m16851v() {
        return this.responseActionCase_ == 11 ? (Redirect) this.responseAction_ : Redirect.m16895o();
    }

    /* JADX INFO: renamed from: w */
    public final int m16852w() {
        switch (this.responseActionCase_) {
            case 0:
                return 17;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
            default:
                return 0;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
        }
    }

    /* JADX INFO: renamed from: x */
    public final Wait m16853x() {
        return this.responseActionCase_ == 5 ? (Wait) this.responseAction_ : Wait.m16897n();
    }
}
