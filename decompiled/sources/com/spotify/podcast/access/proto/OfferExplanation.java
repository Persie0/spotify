package com.spotify.podcast.access.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class OfferExplanation extends AbstractC0269h implements sre0 {
    private static final OfferExplanation DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 2;
    public static final int TERMS_FOOTER_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int UNAVAILABLE_FOOTER_FIELD_NUMBER = 5;
    private Object footer_;
    private int footerCase_ = 0;
    private String title_ = "";
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();

    public static final class Cta extends AbstractC0269h implements sre0 {
        public static final int CTA_TEXT_FIELD_NUMBER = 3;
        public static final int CTA_TYPE_FIELD_NUMBER = 1;
        public static final int CTA_URI_FIELD_NUMBER = 2;
        private static final Cta DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private int ctaType_;
        private String ctaUri_ = "";
        private String ctaText_ = "";

        static {
            Cta cta = new Cta();
            DEFAULT_INSTANCE = cta;
            AbstractC0269h.registerDefaultInstance(Cta.class, cta);
        }

        private Cta() {
        }

        /* JADX INFO: renamed from: p */
        public static Cta m19472p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"ctaType_", "ctaUri_", "ctaText_"});
            }
            if (iOrdinal == 3) {
                return new Cta();
            }
            if (iOrdinal == 4) {
                return new C1228b(DEFAULT_INSTANCE);
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
            synchronized (Cta.class) {
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
        public final String m19473n() {
            return this.ctaText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m19474o() {
            return this.ctaUri_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Section extends AbstractC0269h implements sre0 {
        public static final int BODY_FIELD_NUMBER = 3;
        private static final Section DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 2;
        public static final int ICON_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private Body body_;
        private String header_ = "";
        private int icon_;

        public static final class Body extends AbstractC0269h implements sre0 {
            private static final Body DEFAULT_INSTANCE;
            public static final int ITEMS_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER;
            private ae50 items_ = AbstractC0269h.emptyProtobufList();

            static {
                Body body = new Body();
                DEFAULT_INSTANCE = body;
                AbstractC0269h.registerDefaultInstance(Body.class, body);
            }

            private Body() {
            }

            /* JADX INFO: renamed from: n */
            public static Body m19478n() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"items_"});
                }
                if (iOrdinal == 3) {
                    return new Body();
                }
                if (iOrdinal == 4) {
                    return new C1229c(DEFAULT_INSTANCE);
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
                synchronized (Body.class) {
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

            public final List getItemsList() {
                return this.items_;
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
            Section section = new Section();
            DEFAULT_INSTANCE = section;
            AbstractC0269h.registerDefaultInstance(Section.class, section);
        }

        private Section() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "icon_", "header_", "body_"});
            }
            if (iOrdinal == 3) {
                return new Section();
            }
            if (iOrdinal == 4) {
                return new C1230d(DEFAULT_INSTANCE);
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
            synchronized (Section.class) {
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
        public final Body m19475n() {
            Body body = this.body_;
            return body == null ? Body.m19478n() : body;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m19476o() {
            return this.header_;
        }

        /* JADX INFO: renamed from: p */
        public final EnumC1231e m19477p() {
            EnumC1231e enumC1231e;
            int i = this.icon_;
            if (i == 0) {
                enumC1231e = EnumC1231e.NONE;
            } else if (i != 1) {
                enumC1231e = i != 2 ? null : EnumC1231e.PADLOCK;
            } else {
                enumC1231e = EnumC1231e.HEART;
            }
            return enumC1231e == null ? EnumC1231e.UNRECOGNIZED : enumC1231e;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class TermsFooter extends AbstractC0269h implements sre0 {
        public static final int BODY_FIELD_NUMBER = 1;
        public static final int CTA_FIELD_NUMBER = 2;
        private static final TermsFooter DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TERMS_TEXT_FIELD_NUMBER = 4;
        public static final int TERMS_URI_FIELD_NUMBER = 3;
        private int bitField0_;
        private Cta cta_;
        private String body_ = "";
        private String termsUri_ = "";
        private String termsText_ = "";

        static {
            TermsFooter termsFooter = new TermsFooter();
            DEFAULT_INSTANCE = termsFooter;
            AbstractC0269h.registerDefaultInstance(TermsFooter.class, termsFooter);
        }

        private TermsFooter() {
        }

        /* JADX INFO: renamed from: p */
        public static TermsFooter m19479p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "body_", "cta_", "termsUri_", "termsText_"});
            }
            if (iOrdinal == 3) {
                return new TermsFooter();
            }
            if (iOrdinal == 4) {
                return new C1232f(DEFAULT_INSTANCE);
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
            synchronized (TermsFooter.class) {
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
        public final String m19480n() {
            return this.body_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final Cta m19481o() {
            Cta cta = this.cta_;
            return cta == null ? Cta.m19472p() : cta;
        }

        /* JADX INFO: renamed from: q */
        public final String m19482q() {
            return this.termsText_;
        }

        /* JADX INFO: renamed from: r */
        public final String m19483r() {
            return this.termsUri_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class UnavailableFooter extends AbstractC0269h implements sre0 {
        public static final int BODY_FIELD_NUMBER = 1;
        private static final UnavailableFooter DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private String body_ = "";

        static {
            UnavailableFooter unavailableFooter = new UnavailableFooter();
            DEFAULT_INSTANCE = unavailableFooter;
            AbstractC0269h.registerDefaultInstance(UnavailableFooter.class, unavailableFooter);
        }

        private UnavailableFooter() {
        }

        /* JADX INFO: renamed from: o */
        public static UnavailableFooter m19484o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"body_"});
            }
            if (iOrdinal == 3) {
                return new UnavailableFooter();
            }
            if (iOrdinal == 4) {
                return new C1233g(DEFAULT_INSTANCE);
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
            synchronized (UnavailableFooter.class) {
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
        public final String m19485n() {
            return this.body_;
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
        OfferExplanation offerExplanation = new OfferExplanation();
        DEFAULT_INSTANCE = offerExplanation;
        AbstractC0269h.registerDefaultInstance(OfferExplanation.class, offerExplanation);
    }

    private OfferExplanation() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static OfferExplanation m19466s(byte[] bArr) {
        return (OfferExplanation) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0004<\u0000\u0005<\u0000", new Object[]{"footer_", "footerCase_", "title_", "sections_", Section.class, TermsFooter.class, UnavailableFooter.class});
        }
        if (iOrdinal == 3) {
            return new OfferExplanation();
        }
        if (iOrdinal == 4) {
            return new C1227a(DEFAULT_INSTANCE);
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
        synchronized (OfferExplanation.class) {
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
    public final ae50 m19467n() {
        return this.sections_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TermsFooter m19468o() {
        return this.footerCase_ == 4 ? (TermsFooter) this.footer_ : TermsFooter.m19479p();
    }

    /* JADX INFO: renamed from: p */
    public final UnavailableFooter m19469p() {
        return this.footerCase_ == 5 ? (UnavailableFooter) this.footer_ : UnavailableFooter.m19484o();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m19470q() {
        return this.footerCase_ == 4;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m19471r() {
        return this.footerCase_ == 5;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
