package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetCheckoutPageResponse extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_ITEM_UNAVAILABLE_FIELD_NUMBER = 4;
    public static final int CHECKOUT_STATUS_FIELD_NUMBER = 5;
    private static final GetCheckoutPageResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 7;
    public static final int GPB_CHECKOUT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECT_FIELD_NUMBER = 6;
    public static final int SPOTIFY_CHECKOUT_FIELD_NUMBER = 2;
    public static final int SPOTIFY_CHECKOUT_NATIVE_FIELD_NUMBER = 8;
    public static final int UCB_CHECKOUT_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    public static final class GpbCheckout extends AbstractC0269h implements sre0 {
        private static final GpbCheckout DEFAULT_INSTANCE;
        public static final int OBFUSCATED_PROFILE_ID_FIELD_NUMBER = 4;
        public static final int OTP_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int SUBSCRIPTIONS_FIELD_NUMBER = 5;
        public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
        public static final int SUCCESS_URL_FIELD_NUMBER = 3;
        public static final int TRACKING_DATA_FIELD_NUMBER = 10;
        private int bitField0_;
        private Object product_;
        private GpbCheckoutTrackingData trackingData_;
        private int productCase_ = 0;
        private String successUrl_ = "";
        private String obfuscatedProfileId_ = "";

        public static final class GpbCheckoutTrackingData extends AbstractC0269h implements sre0 {
            public static final int CONTEXT_FIELD_NUMBER = 1;
            private static final GpbCheckoutTrackingData DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER;
            private String context_ = "";

            static {
                GpbCheckoutTrackingData gpbCheckoutTrackingData = new GpbCheckoutTrackingData();
                DEFAULT_INSTANCE = gpbCheckoutTrackingData;
                AbstractC0269h.registerDefaultInstance(GpbCheckoutTrackingData.class, gpbCheckoutTrackingData);
            }

            private GpbCheckoutTrackingData() {
            }

            /* JADX INFO: renamed from: o */
            public static GpbCheckoutTrackingData m6081o() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"context_"});
                }
                if (iOrdinal == 3) {
                    return new GpbCheckoutTrackingData();
                }
                if (iOrdinal == 4) {
                    return new C0514p(DEFAULT_INSTANCE);
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
                synchronized (GpbCheckoutTrackingData.class) {
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
            public final String m6082n() {
                return this.context_;
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

        public static final class GpbOtp extends AbstractC0269h implements sre0 {
            private static final GpbOtp DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int PRODUCT_IDS_FIELD_NUMBER = 1;
            private ae50 productIds_ = AbstractC0269h.emptyProtobufList();

            static {
                GpbOtp gpbOtp = new GpbOtp();
                DEFAULT_INSTANCE = gpbOtp;
                AbstractC0269h.registerDefaultInstance(GpbOtp.class, gpbOtp);
            }

            private GpbOtp() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6083n(GpbOtp gpbOtp, Iterable iterable) {
                ae50 ae50Var = gpbOtp.productIds_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    gpbOtp.productIds_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                AbstractC2118m8.addAll(iterable, gpbOtp.productIds_);
            }

            /* JADX INFO: renamed from: o */
            public static GpbOtp m6084o() {
                return DEFAULT_INSTANCE;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static C0517q m6085q() {
                return (C0517q) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"productIds_"});
                }
                if (iOrdinal == 3) {
                    return new GpbOtp();
                }
                if (iOrdinal == 4) {
                    return new C0517q(DEFAULT_INSTANCE);
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
                synchronized (GpbOtp.class) {
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
            public final ae50 m6086p() {
                return this.productIds_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class GpbSubscription extends AbstractC0269h implements sre0 {
            public static final int BASE_PLAN_ID_FIELD_NUMBER = 5;
            public static final int CHANGE_SUB_FIELD_NUMBER = 4;
            private static final GpbSubscription DEFAULT_INSTANCE;
            public static final int OFFER_ID_FIELD_NUMBER = 6;
            private static volatile r2n0 PARSER = null;
            public static final int PRODUCT_ID_FIELD_NUMBER = 1;
            private int bitField0_;
            private GpbChangeSub changeSub_;
            private String productId_ = "";
            private String basePlanId_ = "";
            private String offerId_ = "";

            public static final class GpbChangeSub extends AbstractC0269h implements sre0 {
                private static final GpbChangeSub DEFAULT_INSTANCE;
                public static final int OLD_PURCHASE_TOKEN_FIELD_NUMBER = 1;
                private static volatile r2n0 PARSER = null;
                public static final int PRORATION_MODE_FIELD_NUMBER = 2;
                private String oldPurchaseToken_ = "";
                private String prorationMode_ = "";

                static {
                    GpbChangeSub gpbChangeSub = new GpbChangeSub();
                    DEFAULT_INSTANCE = gpbChangeSub;
                    AbstractC0269h.registerDefaultInstance(GpbChangeSub.class, gpbChangeSub);
                }

                private GpbChangeSub() {
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
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"oldPurchaseToken_", "prorationMode_"});
                    }
                    if (iOrdinal == 3) {
                        return new GpbChangeSub();
                    }
                    if (iOrdinal == 4) {
                        return new C0523s(DEFAULT_INSTANCE);
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
                    synchronized (GpbChangeSub.class) {
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
                GpbSubscription gpbSubscription = new GpbSubscription();
                DEFAULT_INSTANCE = gpbSubscription;
                AbstractC0269h.registerDefaultInstance(GpbSubscription.class, gpbSubscription);
            }

            private GpbSubscription() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001Ȉ\u0004ဉ\u0000\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "productId_", "changeSub_", "basePlanId_", "offerId_"});
                }
                if (iOrdinal == 3) {
                    return new GpbSubscription();
                }
                if (iOrdinal == 4) {
                    return new C0520r(DEFAULT_INSTANCE);
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
                synchronized (GpbSubscription.class) {
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

        public static final class GpbSubscriptions extends AbstractC0269h implements sre0 {
            public static final int CHANGE_SUB_FIELD_NUMBER = 1;
            public static final int CHANGE_SUB_PER_PRODUCT_FIELD_NUMBER = 3;
            private static final GpbSubscriptions DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int SUBSCRIPTION_ITEMS_FIELD_NUMBER = 2;
            private Object changeSubVariant_;
            private int changeSubVariantCase_ = 0;
            private ae50 subscriptionItems_ = AbstractC0269h.emptyProtobufList();

            public static final class GpbChangeSub extends AbstractC0269h implements sre0 {
                private static final GpbChangeSub DEFAULT_INSTANCE;
                public static final int OLD_PURCHASE_TOKEN_FIELD_NUMBER = 1;
                private static volatile r2n0 PARSER = null;
                public static final int PRORATION_MODE_FIELD_NUMBER = 2;
                private String oldPurchaseToken_ = "";
                private String prorationMode_ = "";

                static {
                    GpbChangeSub gpbChangeSub = new GpbChangeSub();
                    DEFAULT_INSTANCE = gpbChangeSub;
                    AbstractC0269h.registerDefaultInstance(GpbChangeSub.class, gpbChangeSub);
                }

                private GpbChangeSub() {
                }

                /* JADX INFO: renamed from: n */
                public static void m6097n(GpbChangeSub gpbChangeSub, String str) {
                    gpbChangeSub.getClass();
                    str.getClass();
                    gpbChangeSub.oldPurchaseToken_ = str;
                }

                /* JADX INFO: renamed from: o */
                public static void m6098o(GpbChangeSub gpbChangeSub, String str) {
                    gpbChangeSub.getClass();
                    gpbChangeSub.prorationMode_ = str;
                }

                /* JADX INFO: renamed from: p */
                public static GpbChangeSub m6099p() {
                    return DEFAULT_INSTANCE;
                }

                public static r2n0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: renamed from: s */
                public static C0527u m6100s() {
                    return (C0527u) DEFAULT_INSTANCE.createBuilder();
                }

                @Override // com.google.protobuf.AbstractC0269h
                public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                    r2n0 r110Var;
                    int iOrdinal = z110Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"oldPurchaseToken_", "prorationMode_"});
                    }
                    if (iOrdinal == 3) {
                        return new GpbChangeSub();
                    }
                    if (iOrdinal == 4) {
                        return new C0527u(DEFAULT_INSTANCE);
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
                    synchronized (GpbChangeSub.class) {
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
                public final String m6101q() {
                    return this.oldPurchaseToken_;
                }

                /* JADX INFO: renamed from: r */
                public final String m6102r() {
                    return this.prorationMode_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            public static final class GpbChangeSubPerProduct extends AbstractC0269h implements sre0 {
                private static final GpbChangeSubPerProduct DEFAULT_INSTANCE;
                public static final int OLD_PURCHASE_TOKEN_FIELD_NUMBER = 1;
                private static volatile r2n0 PARSER = null;
                public static final int PRODUCT_REPLACEMENT_FIELD_NUMBER = 2;
                private String oldPurchaseToken_ = "";
                private ae50 productReplacement_ = AbstractC0269h.emptyProtobufList();

                public static final class ProductReplacement extends AbstractC0269h implements sre0 {
                    private static final ProductReplacement DEFAULT_INSTANCE;
                    public static final int OLD_PRODUCT_ID_FIELD_NUMBER = 1;
                    private static volatile r2n0 PARSER = null;
                    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
                    public static final int REPLACEMENT_MODE_FIELD_NUMBER = 3;
                    private String oldProductId_ = "";
                    private String productId_ = "";
                    private String replacementMode_ = "";

                    static {
                        ProductReplacement productReplacement = new ProductReplacement();
                        DEFAULT_INSTANCE = productReplacement;
                        AbstractC0269h.registerDefaultInstance(ProductReplacement.class, productReplacement);
                    }

                    private ProductReplacement() {
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
                            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"oldProductId_", "productId_", "replacementMode_"});
                        }
                        if (iOrdinal == 3) {
                            return new ProductReplacement();
                        }
                        if (iOrdinal == 4) {
                            return new C0531w(DEFAULT_INSTANCE);
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
                        synchronized (ProductReplacement.class) {
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
                    public final String m6106n() {
                        return this.oldProductId_;
                    }

                    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                        return newBuilderForType();
                    }

                    /* JADX INFO: renamed from: o */
                    public final String m6107o() {
                        return this.productId_;
                    }

                    /* JADX INFO: renamed from: p */
                    public final String m6108p() {
                        return this.replacementMode_;
                    }

                    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                        return toBuilder();
                    }
                }

                static {
                    GpbChangeSubPerProduct gpbChangeSubPerProduct = new GpbChangeSubPerProduct();
                    DEFAULT_INSTANCE = gpbChangeSubPerProduct;
                    AbstractC0269h.registerDefaultInstance(GpbChangeSubPerProduct.class, gpbChangeSubPerProduct);
                }

                private GpbChangeSubPerProduct() {
                }

                /* JADX INFO: renamed from: n */
                public static GpbChangeSubPerProduct m6103n() {
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
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"oldPurchaseToken_", "productReplacement_", ProductReplacement.class});
                    }
                    if (iOrdinal == 3) {
                        return new GpbChangeSubPerProduct();
                    }
                    if (iOrdinal == 4) {
                        return new C0529v(DEFAULT_INSTANCE);
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
                    synchronized (GpbChangeSubPerProduct.class) {
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
                public final String m6104o() {
                    return this.oldPurchaseToken_;
                }

                /* JADX INFO: renamed from: p */
                public final ae50 m6105p() {
                    return this.productReplacement_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            public static final class GpbIdentifiers extends AbstractC0269h implements sre0 {
                public static final int BASE_PLAN_ID_FIELD_NUMBER = 2;
                private static final GpbIdentifiers DEFAULT_INSTANCE;
                public static final int OFFER_ID_FIELD_NUMBER = 3;
                private static volatile r2n0 PARSER = null;
                public static final int PRODUCT_ID_FIELD_NUMBER = 1;
                private String productId_ = "";
                private String basePlanId_ = "";
                private String offerId_ = "";

                static {
                    GpbIdentifiers gpbIdentifiers = new GpbIdentifiers();
                    DEFAULT_INSTANCE = gpbIdentifiers;
                    AbstractC0269h.registerDefaultInstance(GpbIdentifiers.class, gpbIdentifiers);
                }

                private GpbIdentifiers() {
                }

                /* JADX INFO: renamed from: n */
                public static void m6109n(GpbIdentifiers gpbIdentifiers, String str) {
                    gpbIdentifiers.getClass();
                    str.getClass();
                    gpbIdentifiers.basePlanId_ = str;
                }

                /* JADX INFO: renamed from: o */
                public static void m6110o(GpbIdentifiers gpbIdentifiers, String str) {
                    gpbIdentifiers.getClass();
                    str.getClass();
                    gpbIdentifiers.offerId_ = str;
                }

                /* JADX INFO: renamed from: p */
                public static void m6111p(GpbIdentifiers gpbIdentifiers, String str) {
                    gpbIdentifiers.getClass();
                    str.getClass();
                    gpbIdentifiers.productId_ = str;
                }

                public static r2n0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: renamed from: t */
                public static C0533x m6112t() {
                    return (C0533x) DEFAULT_INSTANCE.createBuilder();
                }

                @Override // com.google.protobuf.AbstractC0269h
                public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                    r2n0 r110Var;
                    int iOrdinal = z110Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"productId_", "basePlanId_", "offerId_"});
                    }
                    if (iOrdinal == 3) {
                        return new GpbIdentifiers();
                    }
                    if (iOrdinal == 4) {
                        return new C0533x(DEFAULT_INSTANCE);
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
                    synchronized (GpbIdentifiers.class) {
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
                public final String m6113q() {
                    return this.basePlanId_;
                }

                /* JADX INFO: renamed from: r */
                public final String m6114r() {
                    return this.offerId_;
                }

                /* JADX INFO: renamed from: s */
                public final String m6115s() {
                    return this.productId_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                GpbSubscriptions gpbSubscriptions = new GpbSubscriptions();
                DEFAULT_INSTANCE = gpbSubscriptions;
                AbstractC0269h.registerDefaultInstance(GpbSubscriptions.class, gpbSubscriptions);
            }

            private GpbSubscriptions() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6087n(GpbSubscriptions gpbSubscriptions, ArrayList arrayList) {
                ae50 ae50Var = gpbSubscriptions.subscriptionItems_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    gpbSubscriptions.subscriptionItems_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                AbstractC2118m8.addAll(arrayList, gpbSubscriptions.subscriptionItems_);
            }

            /* JADX INFO: renamed from: o */
            public static void m6088o(GpbSubscriptions gpbSubscriptions, GpbChangeSub gpbChangeSub) {
                gpbSubscriptions.getClass();
                gpbChangeSub.getClass();
                gpbSubscriptions.changeSubVariant_ = gpbChangeSub;
                gpbSubscriptions.changeSubVariantCase_ = 1;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: s */
            public static GpbSubscriptions m6089s() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: renamed from: w */
            public static C0525t m6090w() {
                return (C0525t) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001<\u0000\u0002\u001b\u0003<\u0000", new Object[]{"changeSubVariant_", "changeSubVariantCase_", GpbChangeSub.class, "subscriptionItems_", GpbIdentifiers.class, GpbChangeSubPerProduct.class});
                }
                if (iOrdinal == 3) {
                    return new GpbSubscriptions();
                }
                if (iOrdinal == 4) {
                    return new C0525t(DEFAULT_INSTANCE);
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
                synchronized (GpbSubscriptions.class) {
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
            public final GpbChangeSub m6091p() {
                return this.changeSubVariantCase_ == 1 ? (GpbChangeSub) this.changeSubVariant_ : GpbChangeSub.m6099p();
            }

            /* JADX INFO: renamed from: q */
            public final GpbChangeSubPerProduct m6092q() {
                return this.changeSubVariantCase_ == 3 ? (GpbChangeSubPerProduct) this.changeSubVariant_ : GpbChangeSubPerProduct.m6103n();
            }

            /* JADX INFO: renamed from: r */
            public final int m6093r() {
                int i = this.changeSubVariantCase_;
                if (i == 0) {
                    return 3;
                }
                if (i != 1) {
                    return i != 3 ? 0 : 2;
                }
                return 1;
            }

            /* JADX INFO: renamed from: t */
            public final ae50 m6094t() {
                return this.subscriptionItems_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            /* JADX INFO: renamed from: u */
            public final boolean m6095u() {
                return this.changeSubVariantCase_ == 1;
            }

            /* JADX INFO: renamed from: v */
            public final boolean m6096v() {
                return this.changeSubVariantCase_ == 3;
            }
        }

        static {
            GpbCheckout gpbCheckout = new GpbCheckout();
            DEFAULT_INSTANCE = gpbCheckout;
            AbstractC0269h.registerDefaultInstance(GpbCheckout.class, gpbCheckout);
        }

        private GpbCheckout() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6070n(GpbCheckout gpbCheckout, GpbOtp gpbOtp) {
            gpbCheckout.getClass();
            gpbOtp.getClass();
            gpbCheckout.product_ = gpbOtp;
            gpbCheckout.productCase_ = 2;
        }

        /* JADX INFO: renamed from: o */
        public static void m6071o(GpbCheckout gpbCheckout, GpbSubscriptions gpbSubscriptions) {
            gpbCheckout.getClass();
            gpbSubscriptions.getClass();
            gpbCheckout.product_ = gpbSubscriptions;
            gpbCheckout.productCase_ = 5;
        }

        /* JADX INFO: renamed from: p */
        public static void m6072p(GpbCheckout gpbCheckout) {
            gpbCheckout.getClass();
            gpbCheckout.successUrl_ = "https://fast.com/";
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static GpbCheckout m6073q() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: x */
        public static C0511o m6074x() {
            return (C0511o) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȉ\u0004Ȉ\u0005<\u0000\nဉ\u0000", new Object[]{"product_", "productCase_", "bitField0_", GpbSubscription.class, GpbOtp.class, "successUrl_", "obfuscatedProfileId_", GpbSubscriptions.class, "trackingData_"});
            }
            if (iOrdinal == 3) {
                return new GpbCheckout();
            }
            if (iOrdinal == 4) {
                return new C0511o(DEFAULT_INSTANCE);
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
            synchronized (GpbCheckout.class) {
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

        /* JADX INFO: renamed from: r */
        public final String m6075r() {
            return this.obfuscatedProfileId_;
        }

        /* JADX INFO: renamed from: s */
        public final GpbOtp m6076s() {
            return this.productCase_ == 2 ? (GpbOtp) this.product_ : GpbOtp.m6084o();
        }

        /* JADX INFO: renamed from: t */
        public final int m6077t() {
            int i = this.productCase_;
            if (i == 0) {
                return 4;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return i != 5 ? 0 : 3;
                }
            }
            return i2;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final GpbSubscriptions m6078u() {
            return this.productCase_ == 5 ? (GpbSubscriptions) this.product_ : GpbSubscriptions.m6089s();
        }

        /* JADX INFO: renamed from: v */
        public final String m6079v() {
            return this.successUrl_;
        }

        /* JADX INFO: renamed from: w */
        public final GpbCheckoutTrackingData m6080w() {
            GpbCheckoutTrackingData gpbCheckoutTrackingData = this.trackingData_;
            return gpbCheckoutTrackingData == null ? GpbCheckoutTrackingData.m6081o() : gpbCheckoutTrackingData;
        }
    }

    public static final class GpbUnavailable extends AbstractC0269h implements sre0 {
        public static final int CTA_FIELD_NUMBER = 2;
        private static final GpbUnavailable DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private FollowLinkCta cta_;
        private String message_ = "";

        static {
            GpbUnavailable gpbUnavailable = new GpbUnavailable();
            DEFAULT_INSTANCE = gpbUnavailable;
            AbstractC0269h.registerDefaultInstance(GpbUnavailable.class, gpbUnavailable);
        }

        private GpbUnavailable() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6116n(GpbUnavailable gpbUnavailable, FollowLinkCta followLinkCta) {
            gpbUnavailable.getClass();
            followLinkCta.getClass();
            gpbUnavailable.cta_ = followLinkCta;
            gpbUnavailable.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: o */
        public static void m6117o(GpbUnavailable gpbUnavailable) {
            gpbUnavailable.getClass();
            gpbUnavailable.message_ = "Google Play is unavailable as your Google Play country or region doesn't match Spotify's.";
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static GpbUnavailable m6118q() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: s */
        public static C0535y m6119s() {
            return (C0535y) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "message_", "cta_"});
            }
            if (iOrdinal == 3) {
                return new GpbUnavailable();
            }
            if (iOrdinal == 4) {
                return new C0535y(DEFAULT_INSTANCE);
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
            synchronized (GpbUnavailable.class) {
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

        /* JADX INFO: renamed from: p */
        public final FollowLinkCta m6120p() {
            FollowLinkCta followLinkCta = this.cta_;
            return followLinkCta == null ? FollowLinkCta.m6042p() : followLinkCta;
        }

        /* JADX INFO: renamed from: r */
        public final boolean m6121r() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class SpotifyCheckout extends AbstractC0269h implements sre0 {
        public static final int CHECKOUT_URL_FIELD_NUMBER = 1;
        private static final SpotifyCheckout DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private String checkoutUrl_ = "";

        static {
            SpotifyCheckout spotifyCheckout = new SpotifyCheckout();
            DEFAULT_INSTANCE = spotifyCheckout;
            AbstractC0269h.registerDefaultInstance(SpotifyCheckout.class, spotifyCheckout);
        }

        private SpotifyCheckout() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6122n(SpotifyCheckout spotifyCheckout, String str) {
            spotifyCheckout.getClass();
            str.getClass();
            spotifyCheckout.checkoutUrl_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static SpotifyCheckout m6123p() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C0537z m6124q() {
            return (C0537z) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"checkoutUrl_"});
            }
            if (iOrdinal == 3) {
                return new SpotifyCheckout();
            }
            if (iOrdinal == 4) {
                return new C0537z(DEFAULT_INSTANCE);
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
            synchronized (SpotifyCheckout.class) {
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
        public final String m6125o() {
            return this.checkoutUrl_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class UcbCheckout extends AbstractC0269h implements sre0 {
        public static final int BILLING_PROVIDER_SELECTOR_SUBTITLE_FIELD_NUMBER = 3;
        public static final int BILLING_PROVIDER_SELECTOR_TITLE_FIELD_NUMBER = 2;
        public static final int CHANGE_COUNTRY_FIELD_NUMBER = 10;
        public static final int CHANGE_PRODUCT_FOLLOW_LINK_FIELD_NUMBER = 11;
        private static final UcbCheckout DEFAULT_INSTANCE;
        public static final int EXPANSION_STATE_FIELD_NUMBER = 4;
        public static final int GOOGLE_PLAY_BILLING_FIELD_NUMBER = 5;
        public static final int GPB_CHECKOUT_FIELD_NUMBER = 8;
        public static final int GPB_UNAVAILABLE_FIELD_NUMBER = 9;
        public static final int PAGE_TITLE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int SPOTIFY_CHECKOUT_NATIVE_FIELD_NUMBER = 12;
        public static final int SPOTIFY_CHECKOUT_URL_FIELD_NUMBER = 7;
        public static final int SPOTIFY_FIELD_NUMBER = 6;
        private int bitField0_;
        private ChangeCountry changeCountry_;
        private Object changeProductAction_;
        private int expansionState_;
        private BillingProvider googlePlayBilling_;
        private Object gpbCheckoutAction_;
        private Object spotifyCheckoutAction_;
        private BillingProvider spotify_;
        private int spotifyCheckoutActionCase_ = 0;
        private int gpbCheckoutActionCase_ = 0;
        private int changeProductActionCase_ = 0;
        private String pageTitle_ = "";
        private String billingProviderSelectorTitle_ = "";
        private String billingProviderSelectorSubtitle_ = "";

        public static final class AndMorePaymentMethodLogos extends AbstractC0269h implements sre0 {
            public static final int ADDITIONAL_METHODS_LABEL_FIELD_NUMBER = 2;
            private static final AndMorePaymentMethodLogos DEFAULT_INSTANCE;
            public static final int LOGOS_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private ae50 logos_ = AbstractC0269h.emptyProtobufList();
            private String additionalMethodsLabel_ = "";

            static {
                AndMorePaymentMethodLogos andMorePaymentMethodLogos = new AndMorePaymentMethodLogos();
                DEFAULT_INSTANCE = andMorePaymentMethodLogos;
                AbstractC0269h.registerDefaultInstance(AndMorePaymentMethodLogos.class, andMorePaymentMethodLogos);
            }

            private AndMorePaymentMethodLogos() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6156n(AndMorePaymentMethodLogos andMorePaymentMethodLogos, List list) {
                ae50 ae50Var = andMorePaymentMethodLogos.logos_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    andMorePaymentMethodLogos.logos_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                AbstractC2118m8.addAll(list, andMorePaymentMethodLogos.logos_);
            }

            /* JADX INFO: renamed from: o */
            public static void m6157o(AndMorePaymentMethodLogos andMorePaymentMethodLogos) {
                andMorePaymentMethodLogos.getClass();
                andMorePaymentMethodLogos.additionalMethodsLabel_ = "and more";
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static AndMorePaymentMethodLogos m6158q() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: renamed from: s */
            public static C0470a0 m6159s() {
                return (C0470a0) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"logos_", Image.class, "additionalMethodsLabel_"});
                }
                if (iOrdinal == 3) {
                    return new AndMorePaymentMethodLogos();
                }
                if (iOrdinal == 4) {
                    return new C0470a0(DEFAULT_INSTANCE);
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
                synchronized (AndMorePaymentMethodLogos.class) {
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
            public final String m6160p() {
                return this.additionalMethodsLabel_;
            }

            /* JADX INFO: renamed from: r */
            public final ae50 m6161r() {
                return this.logos_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class BillingProvider extends AbstractC0269h implements sre0 {
            public static final int AND_MORE_PAYMENT_METHOD_LOGOS_FIELD_NUMBER = 4;
            public static final int BANNER_FIELD_NUMBER = 10;
            public static final int BANNER_WARNINGS_FIELD_NUMBER = 9;
            private static final BillingProvider DEFAULT_INSTANCE;
            public static final int DESCRIPTION_FIELD_NUMBER = 2;
            public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
            public static final int LINE_ITEM_FIELD_NUMBER = 8;
            private static volatile r2n0 PARSER = null;
            public static final int POP_OVER_PAYMENT_METHOD_LOGOS_FIELD_NUMBER = 5;
            public static final int PROCEED_BUTTON_LABEL_FIELD_NUMBER = 6;
            public static final int PROVIDER_LEGAL_TERMS_FIELD_NUMBER = 7;
            public static final int QUEBEC_STUDENT_TRIAL_TERM_FIELD_NUMBER = 100;
            public static final int SHOW_ALL_PAYMENT_METHOD_LOGOS_FIELD_NUMBER = 3;
            public static final int TRACKING_DATA_FIELD_NUMBER = 15;
            private Banner banner_;
            private int bitField0_;
            private LineItem lineItem_;
            private Object paymentMethodLogos_;
            private BillingProviderTrackingData trackingData_;
            private int paymentMethodLogosCase_ = 0;
            private String displayName_ = "";
            private String description_ = "";
            private String proceedButtonLabel_ = "";
            private ae50 providerLegalTerms_ = AbstractC0269h.emptyProtobufList();
            private ae50 bannerWarnings_ = AbstractC0269h.emptyProtobufList();
            private String quebecStudentTrialTerm_ = "";

            public static final class BillingProviderTrackingData extends AbstractC0269h implements sre0 {
                private static final BillingProviderTrackingData DEFAULT_INSTANCE;
                public static final int ID_FIELD_NUMBER = 1;
                private static volatile r2n0 PARSER;
                private String id_ = "";

                static {
                    BillingProviderTrackingData billingProviderTrackingData = new BillingProviderTrackingData();
                    DEFAULT_INSTANCE = billingProviderTrackingData;
                    AbstractC0269h.registerDefaultInstance(BillingProviderTrackingData.class, billingProviderTrackingData);
                }

                private BillingProviderTrackingData() {
                }

                /* JADX INFO: renamed from: n */
                public static void m6185n(BillingProviderTrackingData billingProviderTrackingData, String str) {
                    billingProviderTrackingData.getClass();
                    billingProviderTrackingData.id_ = str;
                }

                /* JADX INFO: renamed from: o */
                public static BillingProviderTrackingData m6186o() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: p */
                public static C0473b0 m6187p() {
                    return (C0473b0) DEFAULT_INSTANCE.createBuilder();
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
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"id_"});
                    }
                    if (iOrdinal == 3) {
                        return new BillingProviderTrackingData();
                    }
                    if (iOrdinal == 4) {
                        return new C0473b0(DEFAULT_INSTANCE);
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
                    synchronized (BillingProviderTrackingData.class) {
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
                BillingProvider billingProvider = new BillingProvider();
                DEFAULT_INSTANCE = billingProvider;
                AbstractC0269h.registerDefaultInstance(BillingProvider.class, billingProvider);
            }

            private BillingProvider() {
            }

            /* JADX INFO: renamed from: J */
            public static C0476c0 m6162J() {
                return (C0476c0) DEFAULT_INSTANCE.createBuilder();
            }

            /* JADX INFO: renamed from: n */
            public static void m6163n(BillingProvider billingProvider, Iterable iterable) {
                ae50 ae50Var = billingProvider.providerLegalTerms_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    billingProvider.providerLegalTerms_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                AbstractC2118m8.addAll(iterable, billingProvider.providerLegalTerms_);
            }

            /* JADX INFO: renamed from: o */
            public static void m6164o(BillingProvider billingProvider, AndMorePaymentMethodLogos andMorePaymentMethodLogos) {
                billingProvider.getClass();
                andMorePaymentMethodLogos.getClass();
                billingProvider.paymentMethodLogos_ = andMorePaymentMethodLogos;
                billingProvider.paymentMethodLogosCase_ = 4;
            }

            /* JADX INFO: renamed from: p */
            public static void m6165p(BillingProvider billingProvider, Banner banner) {
                billingProvider.getClass();
                banner.getClass();
                billingProvider.banner_ = banner;
                billingProvider.bitField0_ |= 2;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static void m6166q(BillingProvider billingProvider, String str) {
                billingProvider.getClass();
                billingProvider.description_ = str;
            }

            /* JADX INFO: renamed from: r */
            public static void m6167r(BillingProvider billingProvider, String str) {
                billingProvider.getClass();
                billingProvider.displayName_ = str;
            }

            /* JADX INFO: renamed from: s */
            public static void m6168s(BillingProvider billingProvider, LineItem lineItem) {
                billingProvider.getClass();
                billingProvider.lineItem_ = lineItem;
                billingProvider.bitField0_ |= 1;
            }

            /* JADX INFO: renamed from: t */
            public static void m6169t(BillingProvider billingProvider, PopOverPaymentMethodLogos popOverPaymentMethodLogos) {
                billingProvider.getClass();
                popOverPaymentMethodLogos.getClass();
                billingProvider.paymentMethodLogos_ = popOverPaymentMethodLogos;
                billingProvider.paymentMethodLogosCase_ = 5;
            }

            /* JADX INFO: renamed from: u */
            public static void m6170u(BillingProvider billingProvider, String str) {
                billingProvider.getClass();
                billingProvider.proceedButtonLabel_ = str;
            }

            /* JADX INFO: renamed from: v */
            public static void m6171v(BillingProvider billingProvider) {
                billingProvider.getClass();
                billingProvider.quebecStudentTrialTerm_ = "I confirm that I am not a resident of the province of Quebec";
            }

            /* JADX INFO: renamed from: w */
            public static void m6172w(BillingProvider billingProvider, BillingProviderTrackingData billingProviderTrackingData) {
                billingProvider.getClass();
                billingProviderTrackingData.getClass();
                billingProvider.trackingData_ = billingProviderTrackingData;
                billingProvider.bitField0_ |= 4;
            }

            /* JADX INFO: renamed from: z */
            public static BillingProvider m6173z() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: renamed from: A */
            public final LineItem m6174A() {
                LineItem lineItem = this.lineItem_;
                return lineItem == null ? LineItem.m6226p() : lineItem;
            }

            /* JADX INFO: renamed from: B */
            public final int m6175B() {
                int i = this.paymentMethodLogosCase_;
                if (i == 0) {
                    return 4;
                }
                if (i == 3) {
                    return 1;
                }
                if (i != 4) {
                    return i != 5 ? 0 : 3;
                }
                return 2;
            }

            /* JADX INFO: renamed from: C */
            public final PopOverPaymentMethodLogos m6176C() {
                return this.paymentMethodLogosCase_ == 5 ? (PopOverPaymentMethodLogos) this.paymentMethodLogos_ : PopOverPaymentMethodLogos.m6190p();
            }

            /* JADX INFO: renamed from: D */
            public final String m6177D() {
                return this.proceedButtonLabel_;
            }

            /* JADX INFO: renamed from: E */
            public final ae50 m6178E() {
                return this.providerLegalTerms_;
            }

            /* JADX INFO: renamed from: F */
            public final String m6179F() {
                return this.quebecStudentTrialTerm_;
            }

            /* JADX INFO: renamed from: G */
            public final ShowAllPaymentMethodLogos m6180G() {
                return this.paymentMethodLogosCase_ == 3 ? (ShowAllPaymentMethodLogos) this.paymentMethodLogos_ : ShowAllPaymentMethodLogos.m6195n();
            }

            /* JADX INFO: renamed from: H */
            public final BillingProviderTrackingData m6181H() {
                BillingProviderTrackingData billingProviderTrackingData = this.trackingData_;
                return billingProviderTrackingData == null ? BillingProviderTrackingData.m6186o() : billingProviderTrackingData;
            }

            /* JADX INFO: renamed from: I */
            public final boolean m6182I() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0001\u0001d\f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006Ȉ\u0007Ț\bဉ\u0000\tȚ\nဉ\u0001\u000fဉ\u0002dȈ", new Object[]{"paymentMethodLogos_", "paymentMethodLogosCase_", "bitField0_", "displayName_", "description_", ShowAllPaymentMethodLogos.class, AndMorePaymentMethodLogos.class, PopOverPaymentMethodLogos.class, "proceedButtonLabel_", "providerLegalTerms_", "lineItem_", "bannerWarnings_", "banner_", "trackingData_", "quebecStudentTrialTerm_"});
                }
                if (iOrdinal == 3) {
                    return new BillingProvider();
                }
                if (iOrdinal == 4) {
                    return new C0476c0(DEFAULT_INSTANCE);
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
                synchronized (BillingProvider.class) {
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

            public final String getDescription() {
                return this.description_;
            }

            public final String getDisplayName() {
                return this.displayName_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            /* JADX INFO: renamed from: x */
            public final AndMorePaymentMethodLogos m6183x() {
                return this.paymentMethodLogosCase_ == 4 ? (AndMorePaymentMethodLogos) this.paymentMethodLogos_ : AndMorePaymentMethodLogos.m6158q();
            }

            /* JADX INFO: renamed from: y */
            public final Banner m6184y() {
                Banner banner = this.banner_;
                return banner == null ? Banner.m5938r() : banner;
            }
        }

        public static final class PopOverPaymentMethodLogos extends AbstractC0269h implements sre0 {
            private static final PopOverPaymentMethodLogos DEFAULT_INSTANCE;
            public static final int INITIAL_LOGOS_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER = null;
            public static final int POP_OVER_LOGOS_FIELD_NUMBER = 2;
            private ae50 initialLogos_ = AbstractC0269h.emptyProtobufList();
            private ae50 popOverLogos_ = AbstractC0269h.emptyProtobufList();

            static {
                PopOverPaymentMethodLogos popOverPaymentMethodLogos = new PopOverPaymentMethodLogos();
                DEFAULT_INSTANCE = popOverPaymentMethodLogos;
                AbstractC0269h.registerDefaultInstance(PopOverPaymentMethodLogos.class, popOverPaymentMethodLogos);
            }

            private PopOverPaymentMethodLogos() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6188n(PopOverPaymentMethodLogos popOverPaymentMethodLogos, List list) {
                ae50 ae50Var = popOverPaymentMethodLogos.initialLogos_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    popOverPaymentMethodLogos.initialLogos_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                AbstractC2118m8.addAll(list, popOverPaymentMethodLogos.initialLogos_);
            }

            /* JADX INFO: renamed from: o */
            public static void m6189o(PopOverPaymentMethodLogos popOverPaymentMethodLogos, List list) {
                ae50 ae50Var = popOverPaymentMethodLogos.popOverLogos_;
                if (!((AbstractC1733c9) ae50Var).f35342a) {
                    popOverPaymentMethodLogos.popOverLogos_ = AbstractC0269h.mutableCopy(ae50Var);
                }
                AbstractC2118m8.addAll(list, popOverPaymentMethodLogos.popOverLogos_);
            }

            /* JADX INFO: renamed from: p */
            public static PopOverPaymentMethodLogos m6190p() {
                return DEFAULT_INSTANCE;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: t */
            public static C0485f0 m6191t() {
                return (C0485f0) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"initialLogos_", Image.class, "popOverLogos_", Image.class});
                }
                if (iOrdinal == 3) {
                    return new PopOverPaymentMethodLogos();
                }
                if (iOrdinal == 4) {
                    return new C0485f0(DEFAULT_INSTANCE);
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
                synchronized (PopOverPaymentMethodLogos.class) {
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
            public final ae50 m6192q() {
                return this.initialLogos_;
            }

            /* JADX INFO: renamed from: r */
            public final int m6193r() {
                return this.popOverLogos_.size();
            }

            /* JADX INFO: renamed from: s */
            public final ae50 m6194s() {
                return this.popOverLogos_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class ShowAllPaymentMethodLogos extends AbstractC0269h implements sre0 {
            private static final ShowAllPaymentMethodLogos DEFAULT_INSTANCE;
            public static final int LOGOS_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private ae50 logos_ = AbstractC0269h.emptyProtobufList();

            static {
                ShowAllPaymentMethodLogos showAllPaymentMethodLogos = new ShowAllPaymentMethodLogos();
                DEFAULT_INSTANCE = showAllPaymentMethodLogos;
                AbstractC0269h.registerDefaultInstance(ShowAllPaymentMethodLogos.class, showAllPaymentMethodLogos);
            }

            private ShowAllPaymentMethodLogos() {
            }

            /* JADX INFO: renamed from: n */
            public static ShowAllPaymentMethodLogos m6195n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"logos_", Image.class});
                }
                if (iOrdinal == 3) {
                    return new ShowAllPaymentMethodLogos();
                }
                if (iOrdinal == 4) {
                    return new C0488g0(DEFAULT_INSTANCE);
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
                synchronized (ShowAllPaymentMethodLogos.class) {
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
            public final ae50 m6196o() {
                return this.logos_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            UcbCheckout ucbCheckout = new UcbCheckout();
            DEFAULT_INSTANCE = ucbCheckout;
            AbstractC0269h.registerDefaultInstance(UcbCheckout.class, ucbCheckout);
        }

        private UcbCheckout() {
        }

        /* JADX INFO: renamed from: E */
        public static UcbCheckout m6126E() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: Q */
        public static C0479d0 m6127Q() {
            return (C0479d0) DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: renamed from: n */
        public static void m6128n(UcbCheckout ucbCheckout) {
            ucbCheckout.getClass();
            ucbCheckout.billingProviderSelectorSubtitle_ = "You can pay directly through Spotify or using your Google Play account";
        }

        /* JADX INFO: renamed from: o */
        public static void m6129o(UcbCheckout ucbCheckout) {
            ucbCheckout.getClass();
            ucbCheckout.billingProviderSelectorTitle_ = "Choose how to pay";
        }

        /* JADX INFO: renamed from: p */
        public static void m6130p(UcbCheckout ucbCheckout, ChangeCountry changeCountry) {
            ucbCheckout.getClass();
            changeCountry.getClass();
            ucbCheckout.changeCountry_ = changeCountry;
            ucbCheckout.bitField0_ |= 4;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m6131q(UcbCheckout ucbCheckout, FollowLinkCta followLinkCta) {
            ucbCheckout.getClass();
            followLinkCta.getClass();
            ucbCheckout.changeProductAction_ = followLinkCta;
            ucbCheckout.changeProductActionCase_ = 11;
        }

        /* JADX INFO: renamed from: r */
        public static void m6132r(UcbCheckout ucbCheckout) {
            ucbCheckout.getClass();
            ucbCheckout.expansionState_ = EnumC0482e0.EXPANSION_STATE_GOOGLE_EXPANDED.getNumber();
        }

        /* JADX INFO: renamed from: s */
        public static void m6133s(UcbCheckout ucbCheckout, BillingProvider billingProvider) {
            ucbCheckout.getClass();
            billingProvider.getClass();
            ucbCheckout.googlePlayBilling_ = billingProvider;
            ucbCheckout.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: t */
        public static void m6134t(UcbCheckout ucbCheckout, GpbCheckout gpbCheckout) {
            ucbCheckout.getClass();
            ucbCheckout.gpbCheckoutAction_ = gpbCheckout;
            ucbCheckout.gpbCheckoutActionCase_ = 8;
        }

        /* JADX INFO: renamed from: u */
        public static void m6135u(UcbCheckout ucbCheckout, GpbUnavailable gpbUnavailable) {
            ucbCheckout.getClass();
            gpbUnavailable.getClass();
            ucbCheckout.gpbCheckoutAction_ = gpbUnavailable;
            ucbCheckout.gpbCheckoutActionCase_ = 9;
        }

        /* JADX INFO: renamed from: v */
        public static void m6136v(UcbCheckout ucbCheckout) {
            ucbCheckout.getClass();
            ucbCheckout.pageTitle_ = "Checkout";
        }

        /* JADX INFO: renamed from: w */
        public static void m6137w(UcbCheckout ucbCheckout, BillingProvider billingProvider) {
            ucbCheckout.getClass();
            billingProvider.getClass();
            ucbCheckout.spotify_ = billingProvider;
            ucbCheckout.bitField0_ |= 2;
        }

        /* JADX INFO: renamed from: x */
        public static void m6138x(UcbCheckout ucbCheckout, SpotifyCheckoutNative spotifyCheckoutNative) {
            ucbCheckout.getClass();
            spotifyCheckoutNative.getClass();
            ucbCheckout.spotifyCheckoutAction_ = spotifyCheckoutNative;
            ucbCheckout.spotifyCheckoutActionCase_ = 12;
        }

        /* JADX INFO: renamed from: y */
        public static void m6139y(UcbCheckout ucbCheckout, SpotifyCheckout spotifyCheckout) {
            ucbCheckout.getClass();
            ucbCheckout.spotifyCheckoutAction_ = spotifyCheckout;
            ucbCheckout.spotifyCheckoutActionCase_ = 7;
        }

        /* JADX INFO: renamed from: A */
        public final String m6140A() {
            return this.billingProviderSelectorTitle_;
        }

        /* JADX INFO: renamed from: B */
        public final ChangeCountry m6141B() {
            ChangeCountry changeCountry = this.changeCountry_;
            return changeCountry == null ? ChangeCountry.m5944p() : changeCountry;
        }

        /* JADX INFO: renamed from: C */
        public final int m6142C() {
            int i = this.changeProductActionCase_;
            if (i != 0) {
                return i != 11 ? 0 : 1;
            }
            return 2;
        }

        /* JADX INFO: renamed from: D */
        public final FollowLinkCta m6143D() {
            return this.changeProductActionCase_ == 11 ? (FollowLinkCta) this.changeProductAction_ : FollowLinkCta.m6042p();
        }

        /* JADX INFO: renamed from: F */
        public final EnumC0482e0 m6144F() {
            EnumC0482e0 enumC0482e0;
            int i = this.expansionState_;
            if (i == 0) {
                enumC0482e0 = EnumC0482e0.EXPANSION_STATE_UNKNOWN;
            } else if (i == 1) {
                enumC0482e0 = EnumC0482e0.EXPANSION_STATE_SPOTIFY_EXPANDED;
            } else if (i != 2) {
                enumC0482e0 = i != 3 ? null : EnumC0482e0.EXPANSION_STATE_NONE_EXPANDED;
            } else {
                enumC0482e0 = EnumC0482e0.EXPANSION_STATE_GOOGLE_EXPANDED;
            }
            return enumC0482e0 == null ? EnumC0482e0.UNRECOGNIZED : enumC0482e0;
        }

        /* JADX INFO: renamed from: G */
        public final BillingProvider m6145G() {
            BillingProvider billingProvider = this.googlePlayBilling_;
            return billingProvider == null ? BillingProvider.m6173z() : billingProvider;
        }

        /* JADX INFO: renamed from: H */
        public final GpbCheckout m6146H() {
            return this.gpbCheckoutActionCase_ == 8 ? (GpbCheckout) this.gpbCheckoutAction_ : GpbCheckout.m6073q();
        }

        /* JADX INFO: renamed from: I */
        public final int m6147I() {
            int i = this.gpbCheckoutActionCase_;
            if (i == 0) {
                return 3;
            }
            if (i != 8) {
                return i != 9 ? 0 : 2;
            }
            return 1;
        }

        /* JADX INFO: renamed from: J */
        public final GpbUnavailable m6148J() {
            return this.gpbCheckoutActionCase_ == 9 ? (GpbUnavailable) this.gpbCheckoutAction_ : GpbUnavailable.m6118q();
        }

        /* JADX INFO: renamed from: K */
        public final String m6149K() {
            return this.pageTitle_;
        }

        /* JADX INFO: renamed from: L */
        public final BillingProvider m6150L() {
            BillingProvider billingProvider = this.spotify_;
            return billingProvider == null ? BillingProvider.m6173z() : billingProvider;
        }

        /* JADX INFO: renamed from: M */
        public final int m6151M() {
            int i = this.spotifyCheckoutActionCase_;
            if (i == 0) {
                return 3;
            }
            if (i != 7) {
                return i != 12 ? 0 : 2;
            }
            return 1;
        }

        /* JADX INFO: renamed from: N */
        public final SpotifyCheckoutNative m6152N() {
            return this.spotifyCheckoutActionCase_ == 12 ? (SpotifyCheckoutNative) this.spotifyCheckoutAction_ : SpotifyCheckoutNative.m6325A();
        }

        /* JADX INFO: renamed from: O */
        public final SpotifyCheckout m6153O() {
            return this.spotifyCheckoutActionCase_ == 7 ? (SpotifyCheckout) this.spotifyCheckoutAction_ : SpotifyCheckout.m6123p();
        }

        /* JADX INFO: renamed from: P */
        public final boolean m6154P() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0003\u0001\u0001\f\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005ဉ\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0001\t<\u0001\nဉ\u0002\u000b<\u0002\f<\u0000", new Object[]{"spotifyCheckoutAction_", "spotifyCheckoutActionCase_", "gpbCheckoutAction_", "gpbCheckoutActionCase_", "changeProductAction_", "changeProductActionCase_", "bitField0_", "pageTitle_", "billingProviderSelectorTitle_", "billingProviderSelectorSubtitle_", "expansionState_", "googlePlayBilling_", "spotify_", SpotifyCheckout.class, GpbCheckout.class, GpbUnavailable.class, "changeCountry_", FollowLinkCta.class, SpotifyCheckoutNative.class});
            }
            if (iOrdinal == 3) {
                return new UcbCheckout();
            }
            if (iOrdinal == 4) {
                return new C0479d0(DEFAULT_INSTANCE);
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
            synchronized (UcbCheckout.class) {
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

        /* JADX INFO: renamed from: z */
        public final String m6155z() {
            return this.billingProviderSelectorSubtitle_;
        }
    }

    static {
        GetCheckoutPageResponse getCheckoutPageResponse = new GetCheckoutPageResponse();
        DEFAULT_INSTANCE = getCheckoutPageResponse;
        AbstractC0269h.registerDefaultInstance(GetCheckoutPageResponse.class, getCheckoutPageResponse);
    }

    private GetCheckoutPageResponse() {
    }

    /* JADX INFO: renamed from: E */
    public static C0508n m6052E() {
        return (C0508n) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m6053n(GetCheckoutPageResponse getCheckoutPageResponse, CheckoutItemUnavailable checkoutItemUnavailable) {
        getCheckoutPageResponse.getClass();
        checkoutItemUnavailable.getClass();
        getCheckoutPageResponse.response_ = checkoutItemUnavailable;
        getCheckoutPageResponse.responseCase_ = 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m6054o(GetCheckoutPageResponse getCheckoutPageResponse, CheckoutStatus checkoutStatus) {
        getCheckoutPageResponse.getClass();
        checkoutStatus.getClass();
        getCheckoutPageResponse.response_ = checkoutStatus;
        getCheckoutPageResponse.responseCase_ = 5;
    }

    /* JADX INFO: renamed from: p */
    public static void m6055p(GetCheckoutPageResponse getCheckoutPageResponse, Error error) {
        getCheckoutPageResponse.getClass();
        error.getClass();
        getCheckoutPageResponse.response_ = error;
        getCheckoutPageResponse.responseCase_ = 7;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6056q(GetCheckoutPageResponse getCheckoutPageResponse, GpbCheckout gpbCheckout) {
        getCheckoutPageResponse.getClass();
        getCheckoutPageResponse.response_ = gpbCheckout;
        getCheckoutPageResponse.responseCase_ = 3;
    }

    /* JADX INFO: renamed from: r */
    public static void m6057r(GetCheckoutPageResponse getCheckoutPageResponse, Redirect redirect) {
        getCheckoutPageResponse.getClass();
        redirect.getClass();
        getCheckoutPageResponse.response_ = redirect;
        getCheckoutPageResponse.responseCase_ = 6;
    }

    /* JADX INFO: renamed from: s */
    public static void m6058s(GetCheckoutPageResponse getCheckoutPageResponse, SpotifyCheckout spotifyCheckout) {
        getCheckoutPageResponse.getClass();
        spotifyCheckout.getClass();
        getCheckoutPageResponse.response_ = spotifyCheckout;
        getCheckoutPageResponse.responseCase_ = 2;
    }

    /* JADX INFO: renamed from: t */
    public static void m6059t(GetCheckoutPageResponse getCheckoutPageResponse, SpotifyCheckoutNative spotifyCheckoutNative) {
        getCheckoutPageResponse.getClass();
        spotifyCheckoutNative.getClass();
        getCheckoutPageResponse.response_ = spotifyCheckoutNative;
        getCheckoutPageResponse.responseCase_ = 8;
    }

    /* JADX INFO: renamed from: u */
    public static void m6060u(GetCheckoutPageResponse getCheckoutPageResponse, UcbCheckout ucbCheckout) {
        getCheckoutPageResponse.getClass();
        ucbCheckout.getClass();
        getCheckoutPageResponse.response_ = ucbCheckout;
        getCheckoutPageResponse.responseCase_ = 1;
    }

    /* JADX INFO: renamed from: A */
    public final int m6061A() {
        switch (this.responseCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: B */
    public final SpotifyCheckout m6062B() {
        return this.responseCase_ == 2 ? (SpotifyCheckout) this.response_ : SpotifyCheckout.m6123p();
    }

    /* JADX INFO: renamed from: C */
    public final SpotifyCheckoutNative m6063C() {
        return this.responseCase_ == 8 ? (SpotifyCheckoutNative) this.response_ : SpotifyCheckoutNative.m6325A();
    }

    /* JADX INFO: renamed from: D */
    public final UcbCheckout m6064D() {
        return this.responseCase_ == 1 ? (UcbCheckout) this.response_ : UcbCheckout.m6126E();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"response_", "responseCase_", UcbCheckout.class, SpotifyCheckout.class, GpbCheckout.class, CheckoutItemUnavailable.class, CheckoutStatus.class, Redirect.class, Error.class, SpotifyCheckoutNative.class});
        }
        if (iOrdinal == 3) {
            return new GetCheckoutPageResponse();
        }
        if (iOrdinal == 4) {
            return new C0508n(DEFAULT_INSTANCE);
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
        synchronized (GetCheckoutPageResponse.class) {
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

    /* JADX INFO: renamed from: v */
    public final CheckoutItemUnavailable m6065v() {
        return this.responseCase_ == 4 ? (CheckoutItemUnavailable) this.response_ : CheckoutItemUnavailable.m5986r();
    }

    /* JADX INFO: renamed from: w */
    public final CheckoutStatus m6066w() {
        return this.responseCase_ == 5 ? (CheckoutStatus) this.response_ : CheckoutStatus.m5994s();
    }

    /* JADX INFO: renamed from: x */
    public final Error m6067x() {
        return this.responseCase_ == 7 ? (Error) this.response_ : Error.m6010y();
    }

    /* JADX INFO: renamed from: y */
    public final GpbCheckout m6068y() {
        return this.responseCase_ == 3 ? (GpbCheckout) this.response_ : GpbCheckout.m6073q();
    }

    /* JADX INFO: renamed from: z */
    public final Redirect m6069z() {
        return this.responseCase_ == 6 ? (Redirect) this.response_ : Redirect.m6323o();
    }
}
