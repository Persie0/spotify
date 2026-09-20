package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ExtraFields extends AbstractC0269h implements sre0 {
    private static final ExtraFields DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int LEARN_MORE_EXPLANATION_FIELD_NUMBER = 3;
    public static final int LEGAL_TERMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Header header_;
    private LearnMoreExplanation learnMoreExplanation_;
    private ae50 legalTerms_ = AbstractC0269h.emptyProtobufList();

    public static final class Header extends AbstractC0269h implements sre0 {
        private static final Header DEFAULT_INSTANCE;
        public static final int LEARN_MORE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int TITLE_ADDRESS_FIELD_NUMBER = 3;
        public static final int TITLE_ENTER_BILLING_ADDRESS_FIELD_NUMBER = 2;
        private String learnMore_ = "";
        private String titleEnterBillingAddress_ = "";
        private String titleAddress_ = "";

        static {
            Header header = new Header();
            DEFAULT_INSTANCE = header;
            AbstractC0269h.registerDefaultInstance(Header.class, header);
        }

        private Header() {
        }

        /* JADX INFO: renamed from: n */
        public static Header m2366n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"learnMore_", "titleEnterBillingAddress_", "titleAddress_"});
            }
            if (iOrdinal == 3) {
                return new Header();
            }
            if (iOrdinal == 4) {
                return new C0281b(DEFAULT_INSTANCE);
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m2367o() {
            return this.learnMore_;
        }

        /* JADX INFO: renamed from: p */
        public final String m2368p() {
            return this.titleEnterBillingAddress_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class LearnMoreExplanation extends AbstractC0269h implements sre0 {
        public static final int BODY_FIELD_NUMBER = 3;
        private static final LearnMoreExplanation DEFAULT_INSTANCE;
        public static final int GOT_IT_FIELD_NUMBER = 5;
        public static final int LEARN_MORE_FIELD_NUMBER = 4;
        private static volatile r2n0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String subtitle_ = "";
        private String body_ = "";
        private String learnMore_ = "";
        private String gotIt_ = "";

        static {
            LearnMoreExplanation learnMoreExplanation = new LearnMoreExplanation();
            DEFAULT_INSTANCE = learnMoreExplanation;
            AbstractC0269h.registerDefaultInstance(LearnMoreExplanation.class, learnMoreExplanation);
        }

        private LearnMoreExplanation() {
        }

        /* JADX INFO: renamed from: o */
        public static LearnMoreExplanation m2369o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"title_", "subtitle_", "body_", "learnMore_", "gotIt_"});
            }
            if (iOrdinal == 3) {
                return new LearnMoreExplanation();
            }
            if (iOrdinal == 4) {
                return new C0282c(DEFAULT_INSTANCE);
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
            synchronized (LearnMoreExplanation.class) {
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

        /* JADX INFO: renamed from: n */
        public final String m2370n() {
            return this.body_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final String m2371p() {
            return this.gotIt_;
        }

        /* JADX INFO: renamed from: q */
        public final String m2372q() {
            return this.learnMore_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ExtraFields extraFields = new ExtraFields();
        DEFAULT_INSTANCE = extraFields;
        AbstractC0269h.registerDefaultInstance(ExtraFields.class, extraFields);
    }

    private ExtraFields() {
    }

    /* JADX INFO: renamed from: n */
    public static ExtraFields m2361n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ț\u0003ဉ\u0001", new Object[]{"bitField0_", "header_", "legalTerms_", "learnMoreExplanation_"});
        }
        if (iOrdinal == 3) {
            return new ExtraFields();
        }
        if (iOrdinal == 4) {
            return new C0280a(DEFAULT_INSTANCE);
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
        synchronized (ExtraFields.class) {
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
    public final Header m2362o() {
        Header header = this.header_;
        return header == null ? Header.m2366n() : header;
    }

    /* JADX INFO: renamed from: p */
    public final LearnMoreExplanation m2363p() {
        LearnMoreExplanation learnMoreExplanation = this.learnMoreExplanation_;
        return learnMoreExplanation == null ? LearnMoreExplanation.m2369o() : learnMoreExplanation;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m2364q() {
        return this.legalTerms_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2365r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
