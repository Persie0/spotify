package com.spotify.paidpodcastbanner.p117v1;

import com.google.protobuf.AbstractC0269h;
import p204p.fu8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PaidPodcastBanner extends AbstractC0269h implements sre0 {
    public static final int BANNER_TEXT_FIELD_NUMBER = 4;
    public static final int BODY_FIELD_NUMBER = 8;
    public static final int CTA_FIELD_NUMBER = 9;
    private static final PaidPodcastBanner DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int SHOW_IMAGE_URI_FIELD_NUMBER = 2;
    public static final int SHOW_PUBLISHER_NAME_FIELD_NUMBER = 5;
    public static final int SHOW_TITLE_FIELD_NUMBER = 3;
    public static final int SHOW_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Cta cta_;
    private int showContentType_;
    private String showUri_ = "";
    private String showImageUri_ = "";
    private String showTitle_ = "";
    private String bannerText_ = "";
    private String showPublisherName_ = "";
    private String header_ = "";
    private String body_ = "";

    public static final class Cta extends AbstractC0269h implements sre0 {
        public static final int CTA_TEXT_FIELD_NUMBER = 2;
        public static final int CTA_TYPE_FIELD_NUMBER = 1;
        private static final Cta DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private String ctaText_ = "";
        private int ctaType_;

        static {
            Cta cta = new Cta();
            DEFAULT_INSTANCE = cta;
            AbstractC0269h.registerDefaultInstance(Cta.class, cta);
        }

        private Cta() {
        }

        /* JADX INFO: renamed from: p */
        public static Cta m16266p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ለ\u0000", new Object[]{"bitField0_", "ctaType_", "ctaText_"});
            }
            if (iOrdinal == 3) {
                return new Cta();
            }
            if (iOrdinal == 4) {
                return new C1096b(DEFAULT_INSTANCE);
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
        public final String m16267n() {
            return this.ctaText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final EnumC1097c m16268o() {
            EnumC1097c enumC1097c;
            int i = this.ctaType_;
            if (i == 0) {
                enumC1097c = EnumC1097c.CTA_TYPE_UNKNOWN;
            } else if (i != 1) {
                enumC1097c = i != 2 ? null : EnumC1097c.CTA_TYPE_CHEVRON;
            } else {
                enumC1097c = EnumC1097c.CTA_TYPE_BUTTON;
            }
            return enumC1097c == null ? EnumC1097c.UNRECOGNIZED : enumC1097c;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m16269q() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaidPodcastBanner paidPodcastBanner = new PaidPodcastBanner();
        DEFAULT_INSTANCE = paidPodcastBanner;
        AbstractC0269h.registerDefaultInstance(PaidPodcastBanner.class, paidPodcastBanner);
    }

    private PaidPodcastBanner() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static PaidPodcastBanner m16256w(byte[] bArr) {
        return (PaidPodcastBanner) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007Ȉ\bȈ\tဉ\u0000", new Object[]{"bitField0_", "showUri_", "showImageUri_", "showTitle_", "bannerText_", "showPublisherName_", "showContentType_", "header_", "body_", "cta_"});
        }
        if (iOrdinal == 3) {
            return new PaidPodcastBanner();
        }
        if (iOrdinal == 4) {
            return new C1095a(DEFAULT_INSTANCE);
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
        synchronized (PaidPodcastBanner.class) {
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
    public final String m16257n() {
        return this.bannerText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16258o() {
        return this.body_;
    }

    /* JADX INFO: renamed from: p */
    public final Cta m16259p() {
        Cta cta = this.cta_;
        return cta == null ? Cta.m16266p() : cta;
    }

    /* JADX INFO: renamed from: q */
    public final String m16260q() {
        return this.header_;
    }

    /* JADX INFO: renamed from: r */
    public final fu8 m16261r() {
        fu8 fu8Var;
        int i = this.showContentType_;
        if (i == 0) {
            fu8Var = fu8.CONTENT_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            fu8Var = fu8.CONTENT_TYPE_PODCAST;
        } else if (i == 2) {
            fu8Var = fu8.CONTENT_TYPE_AUDIOBOOK;
        } else if (i == 3) {
            fu8Var = fu8.CONTENT_TYPE_CREATOR_CHANNEL;
        } else if (i != 4) {
            fu8Var = i != 5 ? null : fu8.CONTENT_TYPE_MEMBERSHIP;
        } else {
            fu8Var = fu8.CONTENT_TYPE_COURSE;
        }
        return fu8Var == null ? fu8.UNRECOGNIZED : fu8Var;
    }

    /* JADX INFO: renamed from: s */
    public final String m16262s() {
        return this.showImageUri_;
    }

    /* JADX INFO: renamed from: t */
    public final String m16263t() {
        return this.showPublisherName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m16264u() {
        return this.showTitle_;
    }

    /* JADX INFO: renamed from: v */
    public final String m16265v() {
        return this.showUri_;
    }
}
