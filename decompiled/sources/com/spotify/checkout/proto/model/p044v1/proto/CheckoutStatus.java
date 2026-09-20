package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutStatus extends AbstractC0269h implements sre0 {
    public static final int CLOSE_CTA_FIELD_NUMBER = 10;
    private static final CheckoutStatus DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Object cta_;
    private int ctaCase_ = 0;
    private String title_ = "";
    private String subtitle_ = "";

    public static final class CloseCta extends AbstractC0269h implements sre0 {
        private static final CloseCta DEFAULT_INSTANCE;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String label_ = "";

        static {
            CloseCta closeCta = new CloseCta();
            DEFAULT_INSTANCE = closeCta;
            AbstractC0269h.registerDefaultInstance(CloseCta.class, closeCta);
        }

        private CloseCta() {
        }

        /* JADX INFO: renamed from: n */
        public static void m5999n(CloseCta closeCta, String str) {
            closeCta.getClass();
            closeCta.label_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static CloseCta m6000o() {
            return DEFAULT_INSTANCE;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static C0493i m6001q() {
            return (C0493i) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"label_"});
            }
            if (iOrdinal == 3) {
                return new CloseCta();
            }
            if (iOrdinal == 4) {
                return new C0493i(DEFAULT_INSTANCE);
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
            synchronized (CloseCta.class) {
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
        public final String m6002p() {
            return this.label_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        CheckoutStatus checkoutStatus = new CheckoutStatus();
        DEFAULT_INSTANCE = checkoutStatus;
        AbstractC0269h.registerDefaultInstance(CheckoutStatus.class, checkoutStatus);
    }

    private CheckoutStatus() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5991n(CheckoutStatus checkoutStatus, CloseCta closeCta) {
        checkoutStatus.getClass();
        closeCta.getClass();
        checkoutStatus.cta_ = closeCta;
        checkoutStatus.ctaCase_ = 10;
    }

    /* JADX INFO: renamed from: o */
    public static void m5992o(CheckoutStatus checkoutStatus, String str) {
        checkoutStatus.getClass();
        checkoutStatus.subtitle_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m5993p(CheckoutStatus checkoutStatus, String str) {
        checkoutStatus.getClass();
        checkoutStatus.title_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static CheckoutStatus m5994s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static C0490h m5995t() {
        return (C0490h) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: u */
    public static CheckoutStatus m5996u(byte[] bArr) {
        return (CheckoutStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\n\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\n<\u0000", new Object[]{"cta_", "ctaCase_", "title_", "subtitle_", CloseCta.class});
        }
        if (iOrdinal == 3) {
            return new CheckoutStatus();
        }
        if (iOrdinal == 4) {
            return new C0490h(DEFAULT_INSTANCE);
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
        synchronized (CheckoutStatus.class) {
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
    public final CloseCta m5997q() {
        return this.ctaCase_ == 10 ? (CloseCta) this.cta_ : CloseCta.m6000o();
    }

    /* JADX INFO: renamed from: r */
    public final int m5998r() {
        int i = this.ctaCase_;
        if (i != 0) {
            return i != 10 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
