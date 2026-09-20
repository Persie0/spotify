package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
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
public final class LineItem extends AbstractC0269h implements sre0 {
    private static final LineItem DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SIMPLE_FIELD_NUMBER = 1;
    public static final int V2_FIELD_NUMBER = 2;
    private int typeCase_ = 0;
    private Object type_;

    public static final class LineItemV2 extends AbstractC0269h implements sre0 {
        public static final int ADDITIONAL_PRODUCT_INFORMATION_FIELD_NUMBER = 4;
        private static final LineItemV2 DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 1;
        public static final int OVERLAY_MESSAGE_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int TIMELINE_FIELD_NUMBER = 3;
        private int bitField0_;
        private Header header_;
        private TimelineV2 timeline_;
        private String overlayMessage_ = "";
        private ae50 additionalProductInformation_ = AbstractC0269h.emptyProtobufList();

        public static final class Header extends AbstractC0269h implements sre0 {
            private static final Header DEFAULT_INSTANCE;
            public static final int IMAGE_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER = null;
            public static final int PRICE_FIELD_NUMBER = 5;
            public static final int RECEIVING_USER_FIELD_NUMBER = 2;
            public static final int SUBTITLE_FIELD_NUMBER = 4;
            public static final int TITLE_FIELD_NUMBER = 3;
            private int bitField0_;
            private Image image_;
            private PriceInfo price_;
            private Face receivingUser_;
            private String title_ = "";
            private String subtitle_ = "";

            static {
                Header header = new Header();
                DEFAULT_INSTANCE = header;
                AbstractC0269h.registerDefaultInstance(Header.class, header);
            }

            private Header() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6241n(Header header, Image image) {
                header.getClass();
                image.getClass();
                header.image_ = image;
                header.bitField0_ |= 1;
            }

            /* JADX INFO: renamed from: o */
            public static void m6242o(Header header, PriceInfo priceInfo) {
                header.getClass();
                priceInfo.getClass();
                header.price_ = priceInfo;
                header.bitField0_ |= 4;
            }

            /* JADX INFO: renamed from: p */
            public static void m6243p(Header header) {
                header.getClass();
                header.subtitle_ = "1 Premium account that will hopefully also take two lines";
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static void m6244q(Header header) {
                header.getClass();
                header.title_ = "LineItemV2 title";
            }

            /* JADX INFO: renamed from: r */
            public static Header m6245r() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: renamed from: y */
            public static C0497j0 m6246y() {
                return (C0497j0) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005ဉ\u0002", new Object[]{"bitField0_", "image_", "receivingUser_", "title_", "subtitle_", "price_"});
                }
                if (iOrdinal == 3) {
                    return new Header();
                }
                if (iOrdinal == 4) {
                    return new C0497j0(DEFAULT_INSTANCE);
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
                synchronized (Header.class) {
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

            /* JADX INFO: renamed from: s */
            public final Image m6247s() {
                Image image = this.image_;
                return image == null ? Image.m6221q() : image;
            }

            /* JADX INFO: renamed from: t */
            public final PriceInfo m6248t() {
                PriceInfo priceInfo = this.price_;
                return priceInfo == null ? PriceInfo.m6254o() : priceInfo;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            /* JADX INFO: renamed from: u */
            public final Face m6249u() {
                Face face = this.receivingUser_;
                return face == null ? Face.m6037s() : face;
            }

            /* JADX INFO: renamed from: v */
            public final boolean m6250v() {
                return (this.bitField0_ & 1) != 0;
            }

            /* JADX INFO: renamed from: w */
            public final boolean m6251w() {
                return (this.bitField0_ & 4) != 0;
            }

            /* JADX INFO: renamed from: x */
            public final boolean m6252x() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        static {
            LineItemV2 lineItemV2 = new LineItemV2();
            DEFAULT_INSTANCE = lineItemV2;
            AbstractC0269h.registerDefaultInstance(LineItemV2.class, lineItemV2);
        }

        private LineItemV2() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6231n(LineItemV2 lineItemV2, List list) {
            ae50 ae50Var = lineItemV2.additionalProductInformation_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                lineItemV2.additionalProductInformation_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(list, lineItemV2.additionalProductInformation_);
        }

        /* JADX INFO: renamed from: o */
        public static void m6232o(LineItemV2 lineItemV2, Header header) {
            lineItemV2.getClass();
            header.getClass();
            lineItemV2.header_ = header;
            lineItemV2.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: p */
        public static void m6233p(LineItemV2 lineItemV2, TimelineV2 timelineV2) {
            lineItemV2.getClass();
            timelineV2.getClass();
            lineItemV2.timeline_ = timelineV2;
            lineItemV2.bitField0_ |= 2;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: r */
        public static LineItemV2 m6234r() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: w */
        public static C0494i0 m6235w() {
            return (C0494i0) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004Ț", new Object[]{"bitField0_", "header_", "overlayMessage_", "timeline_", "additionalProductInformation_"});
            }
            if (iOrdinal == 3) {
                return new LineItemV2();
            }
            if (iOrdinal == 4) {
                return new C0494i0(DEFAULT_INSTANCE);
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
            synchronized (LineItemV2.class) {
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
        public final ae50 m6236q() {
            return this.additionalProductInformation_;
        }

        /* JADX INFO: renamed from: s */
        public final Header m6237s() {
            Header header = this.header_;
            return header == null ? Header.m6245r() : header;
        }

        /* JADX INFO: renamed from: t */
        public final String m6238t() {
            return this.overlayMessage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final TimelineV2 m6239u() {
            TimelineV2 timelineV2 = this.timeline_;
            return timelineV2 == null ? TimelineV2.m6490o() : timelineV2;
        }

        /* JADX INFO: renamed from: v */
        public final boolean m6240v() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public static final class PriceInfo extends AbstractC0269h implements sre0 {
        private static final PriceInfo DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int V1_FIELD_NUMBER = 1;
        private int variationCase_ = 0;
        private Object variation_;

        public static final class PriceInfoV1 extends AbstractC0269h implements sre0 {
            private static final PriceInfoV1 DEFAULT_INSTANCE;
            private static volatile r2n0 PARSER = null;
            public static final int SUBTITLE_FIELD_NUMBER = 2;
            public static final int TITLE_FIELD_NUMBER = 1;
            public static final int TITLE_SUFFIX_FIELD_NUMBER = 3;
            private String title_ = "";
            private String subtitle_ = "";
            private String titleSuffix_ = "";

            static {
                PriceInfoV1 priceInfoV1 = new PriceInfoV1();
                DEFAULT_INSTANCE = priceInfoV1;
                AbstractC0269h.registerDefaultInstance(PriceInfoV1.class, priceInfoV1);
            }

            private PriceInfoV1() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6257n(PriceInfoV1 priceInfoV1) {
                priceInfoV1.getClass();
                priceInfoV1.subtitle_ = "For 3 months";
            }

            /* JADX INFO: renamed from: o */
            public static void m6258o(PriceInfoV1 priceInfoV1) {
                priceInfoV1.getClass();
                priceInfoV1.title_ = "$9.99";
            }

            /* JADX INFO: renamed from: p */
            public static void m6259p(PriceInfoV1 priceInfoV1) {
                priceInfoV1.getClass();
                priceInfoV1.titleSuffix_ = "+ tax";
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static PriceInfoV1 m6260q() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: renamed from: s */
            public static C0503l0 m6261s() {
                return (C0503l0) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "subtitle_", "titleSuffix_"});
                }
                if (iOrdinal == 3) {
                    return new PriceInfoV1();
                }
                if (iOrdinal == 4) {
                    return new C0503l0(DEFAULT_INSTANCE);
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
                synchronized (PriceInfoV1.class) {
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
            public final String m6262r() {
                return this.titleSuffix_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            PriceInfo priceInfo = new PriceInfo();
            DEFAULT_INSTANCE = priceInfo;
            AbstractC0269h.registerDefaultInstance(PriceInfo.class, priceInfo);
        }

        private PriceInfo() {
        }

        /* JADX INFO: renamed from: n */
        public static void m6253n(PriceInfo priceInfo, PriceInfoV1 priceInfoV1) {
            priceInfo.getClass();
            priceInfoV1.getClass();
            priceInfo.variation_ = priceInfoV1;
            priceInfo.variationCase_ = 1;
        }

        /* JADX INFO: renamed from: o */
        public static PriceInfo m6254o() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C0500k0 m6255q() {
            return (C0500k0) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"variation_", "variationCase_", PriceInfoV1.class});
            }
            if (iOrdinal == 3) {
                return new PriceInfo();
            }
            if (iOrdinal == 4) {
                return new C0500k0(DEFAULT_INSTANCE);
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
            synchronized (PriceInfo.class) {
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
        public final PriceInfoV1 m6256p() {
            return this.variationCase_ == 1 ? (PriceInfoV1) this.variation_ : PriceInfoV1.m6260q();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class SimpleLineItem extends AbstractC0269h implements sre0 {
        public static final int ADDITIONAL_PRODUCT_INFORMATION_FIELD_NUMBER = 4;
        public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 6;
        private static final SimpleLineItem DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 11;
        public static final int IMAGE_FIELD_NUMBER = 1;
        public static final int OVERLAY_MESSAGE_FIELD_NUMBER = 7;
        private static volatile r2n0 PARSER = null;
        public static final int PRICE_DETAILS_FIELD_NUMBER = 10;
        public static final int PRICE_FIELD_NUMBER = 5;
        public static final int PRODUCT_BREAKDOWN_FIELD_NUMBER = 12;
        public static final int RECEIVING_USER_FIELD_NUMBER = 9;
        public static final int SUBTITLE_FIELD_NUMBER = 3;
        public static final int TIMELINE_FIELD_NUMBER = 8;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private Header header_;
        private Image image_;
        private ProductBreakdown productBreakdown_;
        private Face receivingUser_;
        private Timeline timeline_;
        private String title_ = "";
        private String subtitle_ = "";
        private ae50 additionalProductInformation_ = AbstractC0269h.emptyProtobufList();
        private String price_ = "";
        private String additionalTaxLabel_ = "";
        private String overlayMessage_ = "";
        private String priceDetails_ = "";

        public static final class Header extends AbstractC0269h implements sre0 {
            private static final Header DEFAULT_INSTANCE;
            public static final int IMAGE_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER = null;
            public static final int PRICE_FIELD_NUMBER = 5;
            public static final int RECEIVING_USER_FIELD_NUMBER = 2;
            public static final int SUBTITLE_FIELD_NUMBER = 4;
            public static final int TITLE_FIELD_NUMBER = 3;
            private int bitField0_;
            private Image image_;
            private Price price_;
            private Face receivingUser_;
            private String title_ = "";
            private String subtitle_ = "";

            public static final class Price extends AbstractC0269h implements sre0 {
                public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 2;
                private static final Price DEFAULT_INSTANCE;
                private static volatile r2n0 PARSER = null;
                public static final int PRICE_DETAILS_FIELD_NUMBER = 3;
                public static final int PRICE_FIELD_NUMBER = 1;
                private String price_ = "";
                private String additionalTaxLabel_ = "";
                private String priceDetails_ = "";

                static {
                    Price price = new Price();
                    DEFAULT_INSTANCE = price;
                    AbstractC0269h.registerDefaultInstance(Price.class, price);
                }

                private Price() {
                }

                /* JADX INFO: renamed from: n */
                public static void m6289n(Price price) {
                    price.getClass();
                    price.additionalTaxLabel_ = "+ tax";
                }

                /* JADX INFO: renamed from: o */
                public static void m6290o(Price price) {
                    price.getClass();
                    price.price_ = "$9.99";
                }

                /* JADX INFO: renamed from: p */
                public static void m6291p(Price price) {
                    price.getClass();
                    price.priceDetails_ = "For 3 months";
                }

                public static r2n0 parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: renamed from: r */
                public static Price m6292r() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: u */
                public static C0512o0 m6293u() {
                    return (C0512o0) DEFAULT_INSTANCE.createBuilder();
                }

                @Override // com.google.protobuf.AbstractC0269h
                public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                    r2n0 r110Var;
                    int iOrdinal = z110Var.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"price_", "additionalTaxLabel_", "priceDetails_"});
                    }
                    if (iOrdinal == 3) {
                        return new Price();
                    }
                    if (iOrdinal == 4) {
                        return new C0512o0(DEFAULT_INSTANCE);
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
                    synchronized (Price.class) {
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
                public final String m6294q() {
                    return this.additionalTaxLabel_;
                }

                /* JADX INFO: renamed from: s */
                public final String m6295s() {
                    return this.price_;
                }

                /* JADX INFO: renamed from: t */
                public final String m6296t() {
                    return this.priceDetails_;
                }

                @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
                public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                Header header = new Header();
                DEFAULT_INSTANCE = header;
                AbstractC0269h.registerDefaultInstance(Header.class, header);
            }

            private Header() {
            }

            /* JADX INFO: renamed from: n */
            public static void m6277n(Header header, Image image) {
                header.getClass();
                image.getClass();
                header.image_ = image;
                header.bitField0_ |= 1;
            }

            /* JADX INFO: renamed from: o */
            public static void m6278o(Header header, Price price) {
                header.getClass();
                price.getClass();
                header.price_ = price;
                header.bitField0_ |= 4;
            }

            /* JADX INFO: renamed from: p */
            public static void m6279p(Header header, Face face) {
                header.getClass();
                face.getClass();
                header.receivingUser_ = face;
                header.bitField0_ |= 2;
            }

            public static r2n0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: renamed from: q */
            public static void m6280q(Header header, String str) {
                header.getClass();
                header.subtitle_ = str;
            }

            /* JADX INFO: renamed from: r */
            public static void m6281r(Header header, String str) {
                header.getClass();
                header.title_ = str;
            }

            /* JADX INFO: renamed from: s */
            public static Header m6282s() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: renamed from: y */
            public static C0509n0 m6283y() {
                return (C0509n0) DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.AbstractC0269h
            public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
                r2n0 r110Var;
                int iOrdinal = z110Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005ဉ\u0002", new Object[]{"bitField0_", "image_", "receivingUser_", "title_", "subtitle_", "price_"});
                }
                if (iOrdinal == 3) {
                    return new Header();
                }
                if (iOrdinal == 4) {
                    return new C0509n0(DEFAULT_INSTANCE);
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
                synchronized (Header.class) {
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

            /* JADX INFO: renamed from: t */
            public final Image m6284t() {
                Image image = this.image_;
                return image == null ? Image.m6221q() : image;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }

            /* JADX INFO: renamed from: u */
            public final Price m6285u() {
                Price price = this.price_;
                return price == null ? Price.m6292r() : price;
            }

            /* JADX INFO: renamed from: v */
            public final Face m6286v() {
                Face face = this.receivingUser_;
                return face == null ? Face.m6037s() : face;
            }

            /* JADX INFO: renamed from: w */
            public final boolean m6287w() {
                return (this.bitField0_ & 4) != 0;
            }

            /* JADX INFO: renamed from: x */
            public final boolean m6288x() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        static {
            SimpleLineItem simpleLineItem = new SimpleLineItem();
            DEFAULT_INSTANCE = simpleLineItem;
            AbstractC0269h.registerDefaultInstance(SimpleLineItem.class, simpleLineItem);
        }

        private SimpleLineItem() {
        }

        /* JADX INFO: renamed from: A */
        public static C0506m0 m6263A() {
            return (C0506m0) DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: renamed from: n */
        public static void m6264n(SimpleLineItem simpleLineItem, List list) {
            ae50 ae50Var = simpleLineItem.additionalProductInformation_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                simpleLineItem.additionalProductInformation_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(list, simpleLineItem.additionalProductInformation_);
        }

        /* JADX INFO: renamed from: o */
        public static void m6265o(SimpleLineItem simpleLineItem, Header header) {
            simpleLineItem.getClass();
            header.getClass();
            simpleLineItem.header_ = header;
            simpleLineItem.bitField0_ |= 8;
        }

        /* JADX INFO: renamed from: p */
        public static void m6266p(SimpleLineItem simpleLineItem) {
            simpleLineItem.getClass();
            simpleLineItem.overlayMessage_ = "This item is no longer available";
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m6267q(SimpleLineItem simpleLineItem, ProductBreakdown productBreakdown) {
            simpleLineItem.getClass();
            productBreakdown.getClass();
            simpleLineItem.productBreakdown_ = productBreakdown;
            simpleLineItem.bitField0_ |= 16;
        }

        /* JADX INFO: renamed from: r */
        public static void m6268r(SimpleLineItem simpleLineItem, Timeline timeline) {
            simpleLineItem.getClass();
            timeline.getClass();
            simpleLineItem.timeline_ = timeline;
            simpleLineItem.bitField0_ |= 2;
        }

        /* JADX INFO: renamed from: t */
        public static SimpleLineItem m6269t() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ț\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0001\tဉ\u0002\nȈ\u000bဉ\u0003\fဉ\u0004", new Object[]{"bitField0_", "image_", "title_", "subtitle_", "additionalProductInformation_", "price_", "additionalTaxLabel_", "overlayMessage_", "timeline_", "receivingUser_", "priceDetails_", "header_", "productBreakdown_"});
            }
            if (iOrdinal == 3) {
                return new SimpleLineItem();
            }
            if (iOrdinal == 4) {
                return new C0506m0(DEFAULT_INSTANCE);
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
            synchronized (SimpleLineItem.class) {
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

        /* JADX INFO: renamed from: s */
        public final ae50 m6270s() {
            return this.additionalProductInformation_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final Header m6271u() {
            Header header = this.header_;
            return header == null ? Header.m6282s() : header;
        }

        /* JADX INFO: renamed from: v */
        public final String m6272v() {
            return this.overlayMessage_;
        }

        /* JADX INFO: renamed from: w */
        public final ProductBreakdown m6273w() {
            ProductBreakdown productBreakdown = this.productBreakdown_;
            return productBreakdown == null ? ProductBreakdown.m6301s() : productBreakdown;
        }

        /* JADX INFO: renamed from: x */
        public final Timeline m6274x() {
            Timeline timeline = this.timeline_;
            return timeline == null ? Timeline.m6483o() : timeline;
        }

        /* JADX INFO: renamed from: y */
        public final boolean m6275y() {
            return (this.bitField0_ & 8) != 0;
        }

        /* JADX INFO: renamed from: z */
        public final boolean m6276z() {
            return (this.bitField0_ & 16) != 0;
        }
    }

    static {
        LineItem lineItem = new LineItem();
        DEFAULT_INSTANCE = lineItem;
        AbstractC0269h.registerDefaultInstance(LineItem.class, lineItem);
    }

    private LineItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6224n(LineItem lineItem, SimpleLineItem simpleLineItem) {
        lineItem.getClass();
        simpleLineItem.getClass();
        lineItem.type_ = simpleLineItem;
        lineItem.typeCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m6225o(LineItem lineItem, LineItemV2 lineItemV2) {
        lineItem.getClass();
        lineItemV2.getClass();
        lineItem.type_ = lineItemV2;
        lineItem.typeCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static LineItem m6226p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static C0491h0 m6227t() {
        return (C0491h0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", SimpleLineItem.class, LineItemV2.class});
        }
        if (iOrdinal == 3) {
            return new LineItem();
        }
        if (iOrdinal == 4) {
            return new C0491h0(DEFAULT_INSTANCE);
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
        synchronized (LineItem.class) {
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
    public final SimpleLineItem m6228q() {
        return this.typeCase_ == 1 ? (SimpleLineItem) this.type_ : SimpleLineItem.m6269t();
    }

    /* JADX INFO: renamed from: r */
    public final int m6229r() {
        int i = this.typeCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public final LineItemV2 m6230s() {
        return this.typeCase_ == 2 ? (LineItemV2) this.type_ : LineItemV2.m6234r();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
