package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SpotifyCheckoutNative extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_SECTION_FIELD_NUMBER = 4;
    public static final int BANNER_FIELD_NUMBER = 10;
    public static final int CHANGE_COUNTRY_FIELD_NUMBER = 5;
    public static final int CHANGE_PRODUCT_FOLLOW_LINK_FIELD_NUMBER = 2;
    private static final SpotifyCheckoutNative DEFAULT_INSTANCE;
    public static final int LINE_ITEM_FIELD_NUMBER = 3;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_SECTION_FIELD_NUMBER = 6;
    public static final int SUCCESS_URL_FIELD_NUMBER = 8;
    public static final int SUMMARY_SECTION_FIELD_NUMBER = 7;
    public static final int UPDATE_SUBSCRIPTION_CTA_FIELD_NUMBER = 9;
    private AddressSection addressSection_;
    private Banner banner_;
    private int bitField0_;
    private ChangeCountry changeCountry_;
    private Object changeProductAction_;
    private LineItem lineItem_;
    private PaymentSection paymentSection_;
    private SummarySection summarySection_;
    private UpdateSubscriptionCta updateSubscriptionCta_;
    private int changeProductActionCase_ = 0;
    private String pageTitle_ = "";
    private String successUrl_ = "";

    public static final class AddressSection extends AbstractC0269h implements sre0 {
        public static final int ADDRESS_COLLECTION_FIELD_NUMBER = 3;
        private static final AddressSection DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private Any addressCollection_;
        private int bitField0_;
        private String title_ = "";
        private String subtitle_ = "";

        static {
            AddressSection addressSection = new AddressSection();
            DEFAULT_INSTANCE = addressSection;
            AbstractC0269h.registerDefaultInstance(AddressSection.class, addressSection);
        }

        private AddressSection() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6354n(AddressSection addressSection, Any any) {
            addressSection.getClass();
            any.getClass();
            addressSection.addressCollection_ = any;
            addressSection.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: o */
        public static void m6355o(AddressSection addressSection) {
            addressSection.getClass();
            addressSection.subtitle_ = "Sales tax is calculated based on your address.";
        }

        /* JADX INFO: renamed from: p */
        public static void m6356p(AddressSection addressSection) {
            addressSection.getClass();
            addressSection.title_ = "Address";
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: r */
        public static AddressSection m6357r() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: s */
        public static C0528u0 m6358s() {
            return (C0528u0) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "title_", "subtitle_", "addressCollection_"});
            }
            if (iOrdinal == 3) {
                return new AddressSection();
            }
            if (iOrdinal == 4) {
                return new C0528u0(DEFAULT_INSTANCE);
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
            synchronized (AddressSection.class) {
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

        public final String getSubtitle() {
            return this.subtitle_;
        }

        public final String getTitle() {
            return this.title_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: q */
        public final Any m6359q() {
            Any any = this.addressCollection_;
            return any == null ? Any.m1909p() : any;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PaymentSection extends AbstractC0269h implements sre0 {
        public static final int CURRENT_PAYMENT_DETAILS_FIELD_NUMBER = 4;
        private static final PaymentSection DEFAULT_INSTANCE;
        public static final int LEGAL_TERMS_FIELD_NUMBER = 5;
        private static volatile r2n0 PARSER = null;
        public static final int PAYMENT_ARGS_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int WEB_EJECTION_URLS_FIELD_NUMBER = 3;
        private int bitField0_;
        private CurrentPaymentDetails currentPaymentDetails_;
        private PaymentArgs paymentArgs_;
        private ihc0 webEjectionUrls_ = ihc0.f102235b;
        private String title_ = "";
        private ae50 legalTerms_ = AbstractC0269h.emptyProtobufList();

        public static final class CurrentPaymentDetails extends AbstractC0269h implements sre0 {
            private static final CurrentPaymentDetails DEFAULT_INSTANCE;
            public static final int IMAGE_FIELD_NUMBER = 1;
            public static final int NATIVE_FIELD_NUMBER = 5;
            private static volatile r2n0 PARSER = null;
            public static final int SUBTITLE_FIELD_NUMBER = 3;
            public static final int TITLE_FIELD_NUMBER = 2;
            public static final int WEB_VIEW_FIELD_NUMBER = 4;
            private int bitField0_;
            private Object changePayment_;
            private Image image_;
            private int changePaymentCase_ = 0;
            private String title_ = "";
            private String subtitle_ = "";

            public static final class NativePaymentCta extends AbstractC0269h implements sre0 {
                private static final NativePaymentCta DEFAULT_INSTANCE;
                public static final int LABEL_FIELD_NUMBER = 1;
                public static final int NEW_PAYMENT_FIELD_NUMBER = 3;
                private static volatile r2n0 PARSER;
                private int bitField0_;
                private String label_ = "";
                private PaymentArgs newPayment_;

                static {
                    NativePaymentCta nativePaymentCta = new NativePaymentCta();
                    DEFAULT_INSTANCE = nativePaymentCta;
                    AbstractC0269h.registerDefaultInstance(NativePaymentCta.class, nativePaymentCta);
                }

                private NativePaymentCta() {
                }

                /* JADX INFO: renamed from: n */
                public static NativePaymentCta m6385n() {
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
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "label_", "newPayment_"});
                    }
                    if (iOrdinal == 3) {
                        return new NativePaymentCta();
                    }
                    if (iOrdinal == 4) {
                        return new C0536y0(DEFAULT_INSTANCE);
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
                    synchronized (NativePaymentCta.class) {
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
                public final String m6386o() {
                    return this.label_;
                }

                /* JADX INFO: renamed from: p */
                public final PaymentArgs m6387p() {
                    PaymentArgs paymentArgs = this.newPayment_;
                    return paymentArgs == null ? PaymentArgs.m6396q() : paymentArgs;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                CurrentPaymentDetails currentPaymentDetails = new CurrentPaymentDetails();
                DEFAULT_INSTANCE = currentPaymentDetails;
                AbstractC0269h.registerDefaultInstance(CurrentPaymentDetails.class, currentPaymentDetails);
            }

            private CurrentPaymentDetails() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6373n(CurrentPaymentDetails currentPaymentDetails, Image image) {
                currentPaymentDetails.getClass();
                image.getClass();
                currentPaymentDetails.image_ = image;
                currentPaymentDetails.bitField0_ |= 1;
            }

            /* JADX INFO: renamed from: o */
            public static void m6374o(CurrentPaymentDetails currentPaymentDetails) {
                currentPaymentDetails.getClass();
                currentPaymentDetails.subtitle_ = "Expires: 10/30";
            }

            /* JADX INFO: renamed from: p */
            public static void m6375p(CurrentPaymentDetails currentPaymentDetails) {
                currentPaymentDetails.getClass();
                currentPaymentDetails.title_ = "Visa ending in 1111";
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static void m6376q(CurrentPaymentDetails currentPaymentDetails, FollowLinkCta followLinkCta) {
                currentPaymentDetails.getClass();
                followLinkCta.getClass();
                currentPaymentDetails.changePayment_ = followLinkCta;
                currentPaymentDetails.changePaymentCase_ = 4;
            }

            /* JADX INFO: renamed from: s */
            public static CurrentPaymentDetails m6377s() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: renamed from: y */
            public static C0534x0 m6378y() {
                return (C0534x0) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000", new Object[]{"changePayment_", "changePaymentCase_", "bitField0_", "image_", "title_", "subtitle_", FollowLinkCta.class, NativePaymentCta.class});
                }
                if (iOrdinal == 3) {
                    return new CurrentPaymentDetails();
                }
                if (iOrdinal == 4) {
                    return new C0534x0(DEFAULT_INSTANCE);
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
                synchronized (CurrentPaymentDetails.class) {
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

            public final String getSubtitle() {
                return this.subtitle_;
            }

            public final String getTitle() {
                return this.title_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: r */
            public final int m6379r() {
                int i = this.changePaymentCase_;
                if (i == 0) {
                    return 3;
                }
                if (i != 4) {
                    return i != 5 ? 0 : 2;
                }
                return 1;
            }

            /* JADX INFO: renamed from: t */
            public final Image m6380t() {
                Image image = this.image_;
                return image == null ? Image.m6221q() : image;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            /* JADX INFO: renamed from: u */
            public final NativePaymentCta m6381u() {
                return this.changePaymentCase_ == 5 ? (NativePaymentCta) this.changePayment_ : NativePaymentCta.m6385n();
            }

            /* JADX INFO: renamed from: v */
            public final FollowLinkCta m6382v() {
                return this.changePaymentCase_ == 4 ? (FollowLinkCta) this.changePayment_ : FollowLinkCta.m6042p();
            }

            /* JADX INFO: renamed from: w */
            public final boolean m6383w() {
                return this.changePaymentCase_ == 5;
            }

            /* JADX INFO: renamed from: x */
            public final boolean m6384x() {
                return this.changePaymentCase_ == 4;
            }
        }

        public static final class LegalTerm extends AbstractC0269h implements sre0 {
            private static final LegalTerm DEFAULT_INSTANCE;
            public static final int ERROR_FIELD_NUMBER = 3;
            public static final int HTML_FIELD_NUMBER = 2;
            private static volatile r2n0 PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private int type_;
            private String html_ = "";
            private String error_ = "";

            static {
                LegalTerm legalTerm = new LegalTerm();
                DEFAULT_INSTANCE = legalTerm;
                AbstractC0269h.registerDefaultInstance(LegalTerm.class, legalTerm);
            }

            private LegalTerm() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6388n(LegalTerm legalTerm, String str) {
                legalTerm.getClass();
                legalTerm.error_ = str;
            }

            /* JADX INFO: renamed from: o */
            public static void m6389o(LegalTerm legalTerm, String str) {
                legalTerm.getClass();
                legalTerm.html_ = str;
            }

            /* JADX INFO: renamed from: p */
            public static void m6390p(LegalTerm legalTerm, EnumC0471a1 enumC0471a1) {
                legalTerm.getClass();
                legalTerm.type_ = enumC0471a1.getNumber();
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: t */
            public static C0538z0 m6391t() {
                return (C0538z0) DEFAULT_INSTANCE.createBuilder();
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
                    return new LegalTerm();
                }
                if (iOrdinal == 4) {
                    return new C0538z0(DEFAULT_INSTANCE);
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
                synchronized (LegalTerm.class) {
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

            /* JADX INFO: renamed from: q */
            public final String m6392q() {
                return this.error_;
            }

            /* JADX INFO: renamed from: r */
            public final String m6393r() {
                return this.html_;
            }

            /* JADX INFO: renamed from: s */
            public final EnumC0471a1 m6394s() {
                EnumC0471a1 enumC0471a1;
                int i = this.type_;
                if (i == 0) {
                    enumC0471a1 = EnumC0471a1.CHECKBOX;
                } else if (i == 1) {
                    enumC0471a1 = EnumC0471a1.TEXT;
                } else if (i != 2) {
                    enumC0471a1 = i != 3 ? null : EnumC0471a1.CONSPICUOUS_CHECKBOX;
                } else {
                    enumC0471a1 = EnumC0471a1.CONSPICUOUS_TEXT;
                }
                return enumC0471a1 == null ? EnumC0471a1.UNRECOGNIZED : enumC0471a1;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class PaymentArgs extends AbstractC0269h implements sre0 {
            public static final int CLIENT_CONTEXT_FIELD_NUMBER = 2;
            public static final int CTA_LABEL_FIELD_NUMBER = 3;
            private static final PaymentArgs DEFAULT_INSTANCE;
            public static final int DISCOUNT_BLOCKER_FIELD_NUMBER = 4;
            private static volatile r2n0 PARSER = null;
            public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 1;
            private int bitField0_;
            private DiscountBlocker discountBlocker_;
            private String paymentSessionId_ = "";
            private String clientContext_ = "";
            private String ctaLabel_ = "";

            public static final class DiscountBlocker extends AbstractC0269h implements sre0 {
                private static final DiscountBlocker DEFAULT_INSTANCE;
                public static final int FULL_PRICE_URL_FIELD_NUMBER = 1;
                private static volatile r2n0 PARSER = null;
                public static final int PRODUCT_NAME_FIELD_NUMBER = 2;
                private String fullPriceUrl_ = "";
                private String productName_ = "";

                static {
                    DiscountBlocker discountBlocker = new DiscountBlocker();
                    DEFAULT_INSTANCE = discountBlocker;
                    AbstractC0269h.registerDefaultInstance(DiscountBlocker.class, discountBlocker);
                }

                private DiscountBlocker() {
                }

                /* JADX INFO: renamed from: n */
                public static DiscountBlocker m6403n() {
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
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"fullPriceUrl_", "productName_"});
                    }
                    if (iOrdinal == 3) {
                        return new DiscountBlocker();
                    }
                    if (iOrdinal == 4) {
                        return new C0477c1(DEFAULT_INSTANCE);
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
                    synchronized (DiscountBlocker.class) {
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
                public final String m6404o() {
                    return this.fullPriceUrl_;
                }

                /* JADX INFO: renamed from: p */
                public final String m6405p() {
                    return this.productName_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                PaymentArgs paymentArgs = new PaymentArgs();
                DEFAULT_INSTANCE = paymentArgs;
                AbstractC0269h.registerDefaultInstance(PaymentArgs.class, paymentArgs);
            }

            private PaymentArgs() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6395n(PaymentArgs paymentArgs) {
                paymentArgs.getClass();
                paymentArgs.paymentSessionId_ = "002b8389-c56f-456c-8006-c72d9fad77cc";
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static PaymentArgs m6396q() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: renamed from: u */
            public static C0474b1 m6397u() {
                return (C0474b1) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "paymentSessionId_", "clientContext_", "ctaLabel_", "discountBlocker_"});
                }
                if (iOrdinal == 3) {
                    return new PaymentArgs();
                }
                if (iOrdinal == 4) {
                    return new C0474b1(DEFAULT_INSTANCE);
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
                synchronized (PaymentArgs.class) {
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
            public final String m6398o() {
                return this.clientContext_;
            }

            /* JADX INFO: renamed from: p */
            public final String m6399p() {
                return this.ctaLabel_;
            }

            /* JADX INFO: renamed from: r */
            public final DiscountBlocker m6400r() {
                DiscountBlocker discountBlocker = this.discountBlocker_;
                return discountBlocker == null ? DiscountBlocker.m6403n() : discountBlocker;
            }

            /* JADX INFO: renamed from: s */
            public final String m6401s() {
                return this.paymentSessionId_;
            }

            /* JADX INFO: renamed from: t */
            public final boolean m6402t() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            PaymentSection paymentSection = new PaymentSection();
            DEFAULT_INSTANCE = paymentSection;
            AbstractC0269h.registerDefaultInstance(PaymentSection.class, paymentSection);
        }

        private PaymentSection() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6360n(PaymentSection paymentSection, Iterable iterable) {
            ae50 ae50Var = paymentSection.legalTerms_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                paymentSection.legalTerms_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(iterable, paymentSection.legalTerms_);
        }

        /* JADX INFO: renamed from: o */
        public static void m6361o(PaymentSection paymentSection, CurrentPaymentDetails currentPaymentDetails) {
            paymentSection.getClass();
            currentPaymentDetails.getClass();
            paymentSection.currentPaymentDetails_ = currentPaymentDetails;
            paymentSection.bitField0_ |= 2;
        }

        /* JADX INFO: renamed from: p */
        public static void m6362p(PaymentSection paymentSection, PaymentArgs paymentArgs) {
            paymentSection.getClass();
            paymentArgs.getClass();
            paymentSection.paymentArgs_ = paymentArgs;
            paymentSection.bitField0_ |= 1;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m6363q(PaymentSection paymentSection, String str) {
            paymentSection.getClass();
            paymentSection.title_ = str;
        }

        /* JADX INFO: renamed from: t */
        public static PaymentSection m6364t() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: z */
        public static C0532w0 m6365z() {
            return (C0532w0) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u00032\u0004ဉ\u0001\u0005\u001b", new Object[]{"bitField0_", "title_", "paymentArgs_", "webEjectionUrls_", AbstractC0480d1.f3308a, "currentPaymentDetails_", "legalTerms_", LegalTerm.class});
            }
            if (iOrdinal == 3) {
                return new PaymentSection();
            }
            if (iOrdinal == 4) {
                return new C0532w0(DEFAULT_INSTANCE);
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
            synchronized (PaymentSection.class) {
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: r */
        public final boolean m6366r(String str) {
            str.getClass();
            return this.webEjectionUrls_.containsKey(str);
        }

        /* JADX INFO: renamed from: s */
        public final CurrentPaymentDetails m6367s() {
            CurrentPaymentDetails currentPaymentDetails = this.currentPaymentDetails_;
            return currentPaymentDetails == null ? CurrentPaymentDetails.m6377s() : currentPaymentDetails;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final ae50 m6368u() {
            return this.legalTerms_;
        }

        /* JADX INFO: renamed from: v */
        public final PaymentArgs m6369v() {
            PaymentArgs paymentArgs = this.paymentArgs_;
            return paymentArgs == null ? PaymentArgs.m6396q() : paymentArgs;
        }

        /* JADX INFO: renamed from: w */
        public final String m6370w(String str) {
            str.getClass();
            ihc0 ihc0Var = this.webEjectionUrls_;
            if (ihc0Var.containsKey(str)) {
                return (String) ihc0Var.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* JADX INFO: renamed from: x */
        public final boolean m6371x() {
            return (this.bitField0_ & 2) != 0;
        }

        /* JADX INFO: renamed from: y */
        public final boolean m6372y() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public static final class SummarySection extends AbstractC0269h implements sre0 {
        public static final int ADDITIONAL_PRODUCT_INFORMATION_FIELD_NUMBER = 9;
        public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 5;
        public static final int ADDRESS_ROW_FIELD_NUMBER = 4;
        private static final SummarySection DEFAULT_INSTANCE;
        public static final int ITEM_ROW_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int TIMELINEV2_FIELD_NUMBER = 8;
        public static final int TIMELINE_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int TOTAL_LABEL_FIELD_NUMBER = 6;
        public static final int TOTAL_PRICE_FIELD_NUMBER = 7;
        private AddressRow addressRow_;
        private int bitField0_;
        private ItemRow itemRow_;
        private Object tl_;
        private int tlCase_ = 0;
        private String title_ = "";
        private String additionalTaxLabel_ = "";
        private String totalLabel_ = "";
        private String totalPrice_ = "";
        private ae50 additionalProductInformation_ = AbstractC0269h.emptyProtobufList();

        public static final class AddressRow extends AbstractC0269h implements sre0 {
            public static final int ADDRESS_FIELD_NUMBER = 2;
            private static final AddressRow DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int PRICE_FIELD_NUMBER = 4;
            public static final int ROW_TITLE_FIELD_NUMBER = 1;
            public static final int TAX_LABEL_FIELD_NUMBER = 3;
            private String rowTitle_ = "";
            private String address_ = "";
            private String taxLabel_ = "";
            private String price_ = "";

            static {
                AddressRow addressRow = new AddressRow();
                DEFAULT_INSTANCE = addressRow;
                AbstractC0269h.registerDefaultInstance(AddressRow.class, addressRow);
            }

            private AddressRow() {
            }

            /* JADX INFO: renamed from: o */
            public static AddressRow m6425o() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"rowTitle_", "address_", "taxLabel_", "price_"});
                }
                if (iOrdinal == 3) {
                    return new AddressRow();
                }
                if (iOrdinal == 4) {
                    return new C0483e1(DEFAULT_INSTANCE);
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
                synchronized (AddressRow.class) {
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
            public final String m6426n() {
                return this.address_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: p */
            public final String m6427p() {
                return this.price_;
            }

            /* JADX INFO: renamed from: q */
            public final String m6428q() {
                return this.rowTitle_;
            }

            /* JADX INFO: renamed from: r */
            public final String m6429r() {
                return this.taxLabel_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class ItemRow extends AbstractC0269h implements sre0 {
            private static final ItemRow DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int PRODUCT_IMAGE_FIELD_NUMBER = 2;
            public static final int PRODUCT_PRICE_DURATION_FIELD_NUMBER = 5;
            public static final int PRODUCT_PRICE_FIELD_NUMBER = 4;
            public static final int PRODUCT_TITLE_FIELD_NUMBER = 3;
            public static final int ROW_TITLE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Image productImage_;
            private String rowTitle_ = "";
            private String productTitle_ = "";
            private String productPrice_ = "";
            private String productPriceDuration_ = "";

            static {
                ItemRow itemRow = new ItemRow();
                DEFAULT_INSTANCE = itemRow;
                AbstractC0269h.registerDefaultInstance(ItemRow.class, itemRow);
            }

            private ItemRow() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6430n(ItemRow itemRow, Image image) {
                itemRow.getClass();
                image.getClass();
                itemRow.productImage_ = image;
                itemRow.bitField0_ |= 1;
            }

            /* JADX INFO: renamed from: o */
            public static void m6431o(ItemRow itemRow) {
                itemRow.getClass();
                itemRow.productPrice_ = "$9.99";
            }

            /* JADX INFO: renamed from: p */
            public static void m6432p(ItemRow itemRow) {
                itemRow.getClass();
                itemRow.productPriceDuration_ = "For 3 months";
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static void m6433q(ItemRow itemRow) {
                itemRow.getClass();
                itemRow.productTitle_ = "LineItemV2 title";
            }

            /* JADX INFO: renamed from: r */
            public static void m6434r(ItemRow itemRow) {
                itemRow.getClass();
                itemRow.rowTitle_ = "Items";
            }

            /* JADX INFO: renamed from: s */
            public static ItemRow m6435s() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: renamed from: y */
            public static C0489g1 m6436y() {
                return (C0489g1) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "rowTitle_", "productImage_", "productTitle_", "productPrice_", "productPriceDuration_"});
                }
                if (iOrdinal == 3) {
                    return new ItemRow();
                }
                if (iOrdinal == 4) {
                    return new C0489g1(DEFAULT_INSTANCE);
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
                synchronized (ItemRow.class) {
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

            /* JADX INFO: renamed from: t */
            public final Image m6437t() {
                Image image = this.productImage_;
                return image == null ? Image.m6221q() : image;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            /* JADX INFO: renamed from: u */
            public final String m6438u() {
                return this.productPrice_;
            }

            /* JADX INFO: renamed from: v */
            public final String m6439v() {
                return this.productPriceDuration_;
            }

            /* JADX INFO: renamed from: w */
            public final String m6440w() {
                return this.productTitle_;
            }

            /* JADX INFO: renamed from: x */
            public final String m6441x() {
                return this.rowTitle_;
            }
        }

        static {
            SummarySection summarySection = new SummarySection();
            DEFAULT_INSTANCE = summarySection;
            AbstractC0269h.registerDefaultInstance(SummarySection.class, summarySection);
        }

        private SummarySection() {
        }

        /* JADX INFO: renamed from: F */
        public static C0486f1 m6406F() {
            return (C0486f1) DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: renamed from: n */
        public static void m6407n(SummarySection summarySection, List list) {
            ae50 ae50Var = summarySection.additionalProductInformation_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                summarySection.additionalProductInformation_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(list, summarySection.additionalProductInformation_);
        }

        /* JADX INFO: renamed from: o */
        public static void m6408o(SummarySection summarySection, ItemRow itemRow) {
            summarySection.getClass();
            itemRow.getClass();
            summarySection.itemRow_ = itemRow;
            summarySection.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: p */
        public static void m6409p(SummarySection summarySection, TimelineV2 timelineV2) {
            summarySection.getClass();
            timelineV2.getClass();
            summarySection.tl_ = timelineV2;
            summarySection.tlCase_ = 8;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m6410q(SummarySection summarySection) {
            summarySection.getClass();
            summarySection.title_ = "Summary";
        }

        /* JADX INFO: renamed from: r */
        public static void m6411r(SummarySection summarySection) {
            summarySection.getClass();
            summarySection.totalLabel_ = "Total now";
        }

        /* JADX INFO: renamed from: s */
        public static void m6412s(SummarySection summarySection) {
            summarySection.getClass();
            summarySection.totalPrice_ = "$9.99";
        }

        /* JADX INFO: renamed from: w */
        public static SummarySection m6413w() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: A */
        public final int m6414A() {
            int i = this.tlCase_;
            if (i == 0) {
                return 3;
            }
            if (i != 3) {
                return i != 8 ? 0 : 2;
            }
            return 1;
        }

        /* JADX INFO: renamed from: B */
        public final String m6415B() {
            return this.totalLabel_;
        }

        /* JADX INFO: renamed from: C */
        public final String m6416C() {
            return this.totalPrice_;
        }

        /* JADX INFO: renamed from: D */
        public final boolean m6417D() {
            return (this.bitField0_ & 2) != 0;
        }

        /* JADX INFO: renamed from: E */
        public final boolean m6418E() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004ဉ\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ\b<\u0000\tȚ", new Object[]{"tl_", "tlCase_", "bitField0_", "title_", "itemRow_", Timeline.class, "addressRow_", "additionalTaxLabel_", "totalLabel_", "totalPrice_", TimelineV2.class, "additionalProductInformation_"});
            }
            if (iOrdinal == 3) {
                return new SummarySection();
            }
            if (iOrdinal == 4) {
                return new C0486f1(DEFAULT_INSTANCE);
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
            synchronized (SummarySection.class) {
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: t */
        public final ae50 m6419t() {
            return this.additionalProductInformation_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final String m6420u() {
            return this.additionalTaxLabel_;
        }

        /* JADX INFO: renamed from: v */
        public final AddressRow m6421v() {
            AddressRow addressRow = this.addressRow_;
            return addressRow == null ? AddressRow.m6425o() : addressRow;
        }

        /* JADX INFO: renamed from: x */
        public final ItemRow m6422x() {
            ItemRow itemRow = this.itemRow_;
            return itemRow == null ? ItemRow.m6435s() : itemRow;
        }

        /* JADX INFO: renamed from: y */
        public final Timeline m6423y() {
            return this.tlCase_ == 3 ? (Timeline) this.tl_ : Timeline.m6483o();
        }

        /* JADX INFO: renamed from: z */
        public final TimelineV2 m6424z() {
            return this.tlCase_ == 8 ? (TimelineV2) this.tl_ : TimelineV2.m6490o();
        }
    }

    public static final class UpdateSubscriptionCta extends AbstractC0269h implements sre0 {
        public static final int ACTION_CLOSE_FIELD_NUMBER = 2;
        public static final int ACTION_LINK_FIELD_NUMBER = 3;
        private static final UpdateSubscriptionCta DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PRIMARY_CTA_FIELD_NUMBER = 1;
        private Object secondaryCta_;
        private int secondaryCtaCase_ = 0;
        private String primaryCta_ = "";

        static {
            UpdateSubscriptionCta updateSubscriptionCta = new UpdateSubscriptionCta();
            DEFAULT_INSTANCE = updateSubscriptionCta;
            AbstractC0269h.registerDefaultInstance(UpdateSubscriptionCta.class, updateSubscriptionCta);
        }

        private UpdateSubscriptionCta() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6442n(UpdateSubscriptionCta updateSubscriptionCta, Error.CloseCta closeCta) {
            updateSubscriptionCta.getClass();
            closeCta.getClass();
            updateSubscriptionCta.secondaryCta_ = closeCta;
            updateSubscriptionCta.secondaryCtaCase_ = 2;
        }

        /* JADX INFO: renamed from: o */
        public static void m6443o(UpdateSubscriptionCta updateSubscriptionCta, String str) {
            updateSubscriptionCta.getClass();
            updateSubscriptionCta.primaryCta_ = str;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: r */
        public static UpdateSubscriptionCta m6444r() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: v */
        public static C0492h1 m6445v() {
            return (C0492h1) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"secondaryCta_", "secondaryCtaCase_", "primaryCta_", Error.CloseCta.class, FollowLinkCta.class});
            }
            if (iOrdinal == 3) {
                return new UpdateSubscriptionCta();
            }
            if (iOrdinal == 4) {
                return new C0492h1(DEFAULT_INSTANCE);
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
            synchronized (UpdateSubscriptionCta.class) {
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

        /* JADX INFO: renamed from: p */
        public final Error.CloseCta m6446p() {
            return this.secondaryCtaCase_ == 2 ? (Error.CloseCta) this.secondaryCta_ : Error.CloseCta.m6018o();
        }

        /* JADX INFO: renamed from: q */
        public final FollowLinkCta m6447q() {
            return this.secondaryCtaCase_ == 3 ? (FollowLinkCta) this.secondaryCta_ : FollowLinkCta.m6042p();
        }

        /* JADX INFO: renamed from: s */
        public final String m6448s() {
            return this.primaryCta_;
        }

        /* JADX INFO: renamed from: t */
        public final boolean m6449t() {
            return this.secondaryCtaCase_ == 2;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final boolean m6450u() {
            return this.secondaryCtaCase_ == 3;
        }
    }

    static {
        SpotifyCheckoutNative spotifyCheckoutNative = new SpotifyCheckoutNative();
        DEFAULT_INSTANCE = spotifyCheckoutNative;
        AbstractC0269h.registerDefaultInstance(SpotifyCheckoutNative.class, spotifyCheckoutNative);
    }

    private SpotifyCheckoutNative() {
    }

    /* JADX INFO: renamed from: A */
    public static SpotifyCheckoutNative m6325A() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static C0530v0 m6326N() {
        return (C0530v0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: O */
    public static C0530v0 m6327O(SpotifyCheckoutNative spotifyCheckoutNative) {
        return (C0530v0) DEFAULT_INSTANCE.createBuilder(spotifyCheckoutNative);
    }

    /* JADX INFO: renamed from: P */
    public static SpotifyCheckoutNative m6328P(byte[] bArr) {
        return (SpotifyCheckoutNative) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: renamed from: n */
    public static void m6329n(SpotifyCheckoutNative spotifyCheckoutNative, AddressSection addressSection) {
        spotifyCheckoutNative.getClass();
        addressSection.getClass();
        spotifyCheckoutNative.addressSection_ = addressSection;
        spotifyCheckoutNative.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m6330o(SpotifyCheckoutNative spotifyCheckoutNative, ChangeCountry changeCountry) {
        spotifyCheckoutNative.getClass();
        changeCountry.getClass();
        spotifyCheckoutNative.changeCountry_ = changeCountry;
        spotifyCheckoutNative.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: p */
    public static void m6331p(SpotifyCheckoutNative spotifyCheckoutNative, FollowLinkCta followLinkCta) {
        spotifyCheckoutNative.getClass();
        followLinkCta.getClass();
        spotifyCheckoutNative.changeProductAction_ = followLinkCta;
        spotifyCheckoutNative.changeProductActionCase_ = 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6332q(SpotifyCheckoutNative spotifyCheckoutNative, LineItem lineItem) {
        spotifyCheckoutNative.getClass();
        lineItem.getClass();
        spotifyCheckoutNative.lineItem_ = lineItem;
        spotifyCheckoutNative.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m6333r(SpotifyCheckoutNative spotifyCheckoutNative, String str) {
        spotifyCheckoutNative.getClass();
        spotifyCheckoutNative.pageTitle_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m6334s(SpotifyCheckoutNative spotifyCheckoutNative, PaymentSection paymentSection) {
        spotifyCheckoutNative.getClass();
        paymentSection.getClass();
        spotifyCheckoutNative.paymentSection_ = paymentSection;
        spotifyCheckoutNative.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: t */
    public static void m6335t(SpotifyCheckoutNative spotifyCheckoutNative) {
        spotifyCheckoutNative.getClass();
        spotifyCheckoutNative.successUrl_ = "https://www.success.com/";
    }

    /* JADX INFO: renamed from: u */
    public static void m6336u(SpotifyCheckoutNative spotifyCheckoutNative, SummarySection summarySection) {
        spotifyCheckoutNative.getClass();
        summarySection.getClass();
        spotifyCheckoutNative.summarySection_ = summarySection;
        spotifyCheckoutNative.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: v */
    public static void m6337v(SpotifyCheckoutNative spotifyCheckoutNative, UpdateSubscriptionCta updateSubscriptionCta) {
        spotifyCheckoutNative.getClass();
        updateSubscriptionCta.getClass();
        spotifyCheckoutNative.updateSubscriptionCta_ = updateSubscriptionCta;
        spotifyCheckoutNative.bitField0_ |= 32;
    }

    /* JADX INFO: renamed from: B */
    public final LineItem m6338B() {
        LineItem lineItem = this.lineItem_;
        return lineItem == null ? LineItem.m6226p() : lineItem;
    }

    /* JADX INFO: renamed from: C */
    public final String m6339C() {
        return this.pageTitle_;
    }

    /* JADX INFO: renamed from: D */
    public final PaymentSection m6340D() {
        PaymentSection paymentSection = this.paymentSection_;
        return paymentSection == null ? PaymentSection.m6364t() : paymentSection;
    }

    /* JADX INFO: renamed from: E */
    public final String m6341E() {
        return this.successUrl_;
    }

    /* JADX INFO: renamed from: F */
    public final SummarySection m6342F() {
        SummarySection summarySection = this.summarySection_;
        return summarySection == null ? SummarySection.m6413w() : summarySection;
    }

    /* JADX INFO: renamed from: G */
    public final UpdateSubscriptionCta m6343G() {
        UpdateSubscriptionCta updateSubscriptionCta = this.updateSubscriptionCta_;
        return updateSubscriptionCta == null ? UpdateSubscriptionCta.m6444r() : updateSubscriptionCta;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m6344H() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m6345I() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m6346J() {
        return this.changeProductActionCase_ == 2;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m6347K() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m6348L() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m6349M() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bȈ\tဉ\u0005\nဉ\u0006", new Object[]{"changeProductAction_", "changeProductActionCase_", "bitField0_", "pageTitle_", FollowLinkCta.class, "lineItem_", "addressSection_", "changeCountry_", "paymentSection_", "summarySection_", "successUrl_", "updateSubscriptionCta_", "banner_"});
        }
        if (iOrdinal == 3) {
            return new SpotifyCheckoutNative();
        }
        if (iOrdinal == 4) {
            return new C0530v0(DEFAULT_INSTANCE);
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
        synchronized (SpotifyCheckoutNative.class) {
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

    /* JADX INFO: renamed from: w */
    public final AddressSection m6350w() {
        AddressSection addressSection = this.addressSection_;
        return addressSection == null ? AddressSection.m6357r() : addressSection;
    }

    /* JADX INFO: renamed from: x */
    public final ChangeCountry m6351x() {
        ChangeCountry changeCountry = this.changeCountry_;
        return changeCountry == null ? ChangeCountry.m5944p() : changeCountry;
    }

    /* JADX INFO: renamed from: y */
    public final int m6352y() {
        int i = this.changeProductActionCase_;
        if (i != 0) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: z */
    public final FollowLinkCta m6353z() {
        return this.changeProductActionCase_ == 2 ? (FollowLinkCta) this.changeProductAction_ : FollowLinkCta.m6042p();
    }
}
