package com.spotify.extendedmetadata.extensions.playlinkcardtrait.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PlayLinkCardTrait extends AbstractC0269h implements sre0 {
    public static final int ANIMATION_FIELD_NUMBER = 13;
    private static final PlayLinkCardTrait DEFAULT_INSTANCE;
    public static final int DISMISS_URI_FIELD_NUMBER = 15;
    public static final int GRADIENT_FIELD_NUMBER = 16;
    public static final int IMAGE_FIELD_NUMBER = 12;
    public static final int LINK_FIELD_NUMBER = 10;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 7;
    public static final int NAVIGATION_URL_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_FIELD_NUMBER = 9;
    public static final int PRETITLE_COLOR_FIELD_NUMBER = 4;
    public static final int PRETITLE_FIELD_NUMBER = 3;
    public static final int SUBTITLE_COLOR_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int TITLE_COLOR_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Object background_;
    private int bitField0_;
    private Object ctaType_;
    private Gradient gradient_;
    private int ctaTypeCase_ = 0;
    private int backgroundCase_ = 0;
    private String title_ = "";
    private String titleColor_ = "";
    private String pretitle_ = "";
    private String pretitleColor_ = "";
    private String subtitle_ = "";
    private String subtitleColor_ = "";
    private String logoImageUrl_ = "";
    private String navigationUrl_ = "";
    private String dismissUri_ = "";

    public static final class AnimationBackground extends AbstractC0269h implements sre0 {
        private static final AnimationBackground DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            AnimationBackground animationBackground = new AnimationBackground();
            DEFAULT_INSTANCE = animationBackground;
            AbstractC0269h.registerDefaultInstance(AnimationBackground.class, animationBackground);
        }

        private AnimationBackground() {
        }

        /* JADX INFO: renamed from: n */
        public static AnimationBackground m10257n() {
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
                return new AnimationBackground();
            }
            if (iOrdinal == 4) {
                return new C0751a(DEFAULT_INSTANCE);
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
            synchronized (AnimationBackground.class) {
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

    public static final class Gradient extends AbstractC0269h implements sre0 {
        private static final Gradient DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int STOPS_FIELD_NUMBER = 1;
        private ae50 stops_ = AbstractC0269h.emptyProtobufList();

        public static final class Stop extends AbstractC0269h implements sre0 {
            public static final int COLOR_FIELD_NUMBER = 1;
            private static final Stop DEFAULT_INSTANCE;
            public static final int LOCATION_FIELD_NUMBER = 2;
            private static volatile r2n0 PARSER;
            private String color_ = "";
            private float location_;

            static {
                Stop stop = new Stop();
                DEFAULT_INSTANCE = stop;
                AbstractC0269h.registerDefaultInstance(Stop.class, stop);
            }

            private Stop() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0001", new Object[]{"color_", "location_"});
                }
                if (iOrdinal == 3) {
                    return new Stop();
                }
                if (iOrdinal == 4) {
                    return new C0754d(DEFAULT_INSTANCE);
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
                synchronized (Stop.class) {
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
            public final String m10260n() {
                return this.color_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: o */
            public final float m10261o() {
                return this.location_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Gradient gradient = new Gradient();
            DEFAULT_INSTANCE = gradient;
            AbstractC0269h.registerDefaultInstance(Gradient.class, gradient);
        }

        private Gradient() {
        }

        /* JADX INFO: renamed from: n */
        public static Gradient m10258n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stops_", Stop.class});
            }
            if (iOrdinal == 3) {
                return new Gradient();
            }
            if (iOrdinal == 4) {
                return new C0753c(DEFAULT_INSTANCE);
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
            synchronized (Gradient.class) {
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
        public final ae50 m10259o() {
            return this.stops_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ImageBackground extends AbstractC0269h implements sre0 {
        private static final ImageBackground DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            ImageBackground imageBackground = new ImageBackground();
            DEFAULT_INSTANCE = imageBackground;
            AbstractC0269h.registerDefaultInstance(ImageBackground.class, imageBackground);
        }

        private ImageBackground() {
        }

        /* JADX INFO: renamed from: n */
        public static ImageBackground m10262n() {
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
                return new ImageBackground();
            }
            if (iOrdinal == 4) {
                return new C0755e(DEFAULT_INSTANCE);
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
            synchronized (ImageBackground.class) {
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

    public static final class LinkCta extends AbstractC0269h implements sre0 {
        public static final int CTA_BACKGROUND_COLOR_FIELD_NUMBER = 3;
        public static final int CTA_TEXT_COLOR_FIELD_NUMBER = 2;
        private static final LinkCta DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String ctaTextColor_ = "";
        private String ctaBackgroundColor_ = "";

        static {
            LinkCta linkCta = new LinkCta();
            DEFAULT_INSTANCE = linkCta;
            AbstractC0269h.registerDefaultInstance(LinkCta.class, linkCta);
        }

        private LinkCta() {
        }

        /* JADX INFO: renamed from: p */
        public static LinkCta m10263p() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"text_", "ctaTextColor_", "ctaBackgroundColor_"});
            }
            if (iOrdinal == 3) {
                return new LinkCta();
            }
            if (iOrdinal == 4) {
                return new C0756f(DEFAULT_INSTANCE);
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
            synchronized (LinkCta.class) {
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
        public final String m10264n() {
            return this.ctaBackgroundColor_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m10265o() {
            return this.ctaTextColor_;
        }

        /* JADX INFO: renamed from: q */
        public final String m10266q() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PlayCta extends AbstractC0269h implements sre0 {
        private static final PlayCta DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int URI_FIELD_NUMBER = 1;
        private String uri_ = "";

        static {
            PlayCta playCta = new PlayCta();
            DEFAULT_INSTANCE = playCta;
            AbstractC0269h.registerDefaultInstance(PlayCta.class, playCta);
        }

        private PlayCta() {
        }

        /* JADX INFO: renamed from: n */
        public static PlayCta m10267n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"uri_"});
            }
            if (iOrdinal == 3) {
                return new PlayCta();
            }
            if (iOrdinal == 4) {
                return new C0757g(DEFAULT_INSTANCE);
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
            synchronized (PlayCta.class) {
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

        public final String getUri() {
            return this.uri_;
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
        PlayLinkCardTrait playLinkCardTrait = new PlayLinkCardTrait();
        DEFAULT_INSTANCE = playLinkCardTrait;
        AbstractC0269h.registerDefaultInstance(PlayLinkCardTrait.class, playLinkCardTrait);
    }

    private PlayLinkCardTrait() {
    }

    /* JADX INFO: renamed from: C */
    public static PlayLinkCardTrait m10241C(byte[] bArr) {
        return (PlayLinkCardTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final String m10242A() {
        return this.titleColor_;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m10243B() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0002\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t<\u0000\n<\u0000\f<\u0001\r<\u0001\u000fȈ\u0010ဉ\u0000", new Object[]{"ctaType_", "ctaTypeCase_", "background_", "backgroundCase_", "bitField0_", "title_", "titleColor_", "pretitle_", "pretitleColor_", "subtitle_", "subtitleColor_", "logoImageUrl_", "navigationUrl_", PlayCta.class, LinkCta.class, ImageBackground.class, AnimationBackground.class, "dismissUri_", "gradient_"});
        }
        if (iOrdinal == 3) {
            return new PlayLinkCardTrait();
        }
        if (iOrdinal == 4) {
            return new C0752b(DEFAULT_INSTANCE);
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
        synchronized (PlayLinkCardTrait.class) {
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
    public final AnimationBackground m10244n() {
        return this.backgroundCase_ == 13 ? (AnimationBackground) this.background_ : AnimationBackground.m10257n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m10245o() {
        int i = this.backgroundCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 12) {
            return i != 13 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public final int m10246p() {
        int i = this.ctaTypeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 9) {
            return i != 10 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: q */
    public final String m10247q() {
        return this.dismissUri_;
    }

    /* JADX INFO: renamed from: r */
    public final Gradient m10248r() {
        Gradient gradient = this.gradient_;
        return gradient == null ? Gradient.m10258n() : gradient;
    }

    /* JADX INFO: renamed from: s */
    public final ImageBackground m10249s() {
        return this.backgroundCase_ == 12 ? (ImageBackground) this.background_ : ImageBackground.m10262n();
    }

    /* JADX INFO: renamed from: t */
    public final LinkCta m10250t() {
        return this.ctaTypeCase_ == 10 ? (LinkCta) this.ctaType_ : LinkCta.m10263p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m10251u() {
        return this.logoImageUrl_;
    }

    /* JADX INFO: renamed from: v */
    public final String m10252v() {
        return this.navigationUrl_;
    }

    /* JADX INFO: renamed from: w */
    public final PlayCta m10253w() {
        return this.ctaTypeCase_ == 9 ? (PlayCta) this.ctaType_ : PlayCta.m10267n();
    }

    /* JADX INFO: renamed from: x */
    public final String m10254x() {
        return this.pretitle_;
    }

    /* JADX INFO: renamed from: y */
    public final String m10255y() {
        return this.pretitleColor_;
    }

    /* JADX INFO: renamed from: z */
    public final String m10256z() {
        return this.subtitleColor_;
    }
}
