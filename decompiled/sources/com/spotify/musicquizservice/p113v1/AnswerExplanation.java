package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class AnswerExplanation extends AbstractC0269h implements sre0 {
    public static final int ASSETS_FIELD_NUMBER = 3;
    public static final int CAPTION_FIELD_NUMBER = 2;
    private static final AnswerExplanation DEFAULT_INSTANCE;
    public static final int ENTITY_URIS_FIELD_NUMBER = 6;
    public static final int EXPLANATION_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    public static final int SOURCES_FIELD_NUMBER = 4;
    private Object visualExplanation_;
    private int visualExplanationCase_ = 0;
    private String questionId_ = "";
    private ae50 sources_ = AbstractC0269h.emptyProtobufList();
    private String explanation_ = "";
    private ae50 entityUris_ = AbstractC0269h.emptyProtobufList();

    public static final class Caption extends AbstractC0269h implements sre0 {
        private static final Caption DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";

        static {
            Caption caption = new Caption();
            DEFAULT_INSTANCE = caption;
            AbstractC0269h.registerDefaultInstance(Caption.class, caption);
        }

        private Caption() {
        }

        /* JADX INFO: renamed from: n */
        public static Caption m15780n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"text_"});
            }
            if (iOrdinal == 3) {
                return new Caption();
            }
            if (iOrdinal == 4) {
                return new C1063b(DEFAULT_INSTANCE);
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
            synchronized (Caption.class) {
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
        public final String m15781o() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ImageAsset extends AbstractC0269h implements sre0 {
        private static final ImageAsset DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SPOTIFY_URI_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 1;
        private int sourceCase_ = 0;
        private Object source_;

        static {
            ImageAsset imageAsset = new ImageAsset();
            DEFAULT_INSTANCE = imageAsset;
            AbstractC0269h.registerDefaultInstance(ImageAsset.class, imageAsset);
        }

        private ImageAsset() {
        }

        /* JADX INFO: renamed from: n */
        public static ImageAsset m15782n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"source_", "sourceCase_"});
            }
            if (iOrdinal == 3) {
                return new ImageAsset();
            }
            if (iOrdinal == 4) {
                return new C1064c(DEFAULT_INSTANCE);
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
            synchronized (ImageAsset.class) {
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
            return this.sourceCase_ == 1 ? (String) this.source_ : "";
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final int m15783o() {
            int i = this.sourceCase_;
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

        /* JADX INFO: renamed from: p */
        public final String m15784p() {
            return this.sourceCase_ == 2 ? (String) this.source_ : "";
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class VideoAsset extends AbstractC0269h implements sre0 {
        private static final VideoAsset DEFAULT_INSTANCE;
        public static final int MANIFEST_ID_FIELD_NUMBER = 2;
        public static final int MEDIA_URL_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int TRACK_URI_FIELD_NUMBER = 3;
        private int sourceCase_ = 0;
        private Object source_;

        static {
            VideoAsset videoAsset = new VideoAsset();
            DEFAULT_INSTANCE = videoAsset;
            AbstractC0269h.registerDefaultInstance(VideoAsset.class, videoAsset);
        }

        private VideoAsset() {
        }

        /* JADX INFO: renamed from: n */
        public static VideoAsset m15785n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȼ\u0000", new Object[]{"source_", "sourceCase_"});
            }
            if (iOrdinal == 3) {
                return new VideoAsset();
            }
            if (iOrdinal == 4) {
                return new C1065d(DEFAULT_INSTANCE);
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
            synchronized (VideoAsset.class) {
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

        public final String getManifestId() {
            return this.sourceCase_ == 2 ? (String) this.source_ : "";
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m15786o() {
            return this.sourceCase_ == 1 ? (String) this.source_ : "";
        }

        /* JADX INFO: renamed from: p */
        public final int m15787p() {
            int i = this.sourceCase_;
            if (i == 0) {
                return 4;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        return 0;
                    }
                }
            }
            return i2;
        }

        /* JADX INFO: renamed from: q */
        public final String m15788q() {
            return this.sourceCase_ == 3 ? (String) this.source_ : "";
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class VisualAsset extends AbstractC0269h implements sre0 {
        private static final VisualAsset DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int IMAGE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int VIDEO_FIELD_NUMBER = 2;
        private Object assetSource_;
        private int assetSourceCase_ = 0;
        private String description_ = "";

        static {
            VisualAsset visualAsset = new VisualAsset();
            DEFAULT_INSTANCE = visualAsset;
            AbstractC0269h.registerDefaultInstance(VisualAsset.class, visualAsset);
        }

        private VisualAsset() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȉ", new Object[]{"assetSource_", "assetSourceCase_", ImageAsset.class, VideoAsset.class, "description_"});
            }
            if (iOrdinal == 3) {
                return new VisualAsset();
            }
            if (iOrdinal == 4) {
                return new C1066e(DEFAULT_INSTANCE);
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
            synchronized (VisualAsset.class) {
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

        /* JADX INFO: renamed from: n */
        public final int m15789n() {
            int i = this.assetSourceCase_;
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final ImageAsset m15790o() {
            return this.assetSourceCase_ == 1 ? (ImageAsset) this.assetSource_ : ImageAsset.m15782n();
        }

        /* JADX INFO: renamed from: p */
        public final VideoAsset m15791p() {
            return this.assetSourceCase_ == 2 ? (VideoAsset) this.assetSource_ : VideoAsset.m15785n();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class VisualAssets extends AbstractC0269h implements sre0 {
        public static final int ASSETS_FIELD_NUMBER = 1;
        private static final VisualAssets DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private ae50 assets_ = AbstractC0269h.emptyProtobufList();

        static {
            VisualAssets visualAssets = new VisualAssets();
            DEFAULT_INSTANCE = visualAssets;
            AbstractC0269h.registerDefaultInstance(VisualAssets.class, visualAssets);
        }

        private VisualAssets() {
        }

        /* JADX INFO: renamed from: o */
        public static VisualAssets m15792o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"assets_", VisualAsset.class});
            }
            if (iOrdinal == 3) {
                return new VisualAssets();
            }
            if (iOrdinal == 4) {
                return new C1067f(DEFAULT_INSTANCE);
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
            synchronized (VisualAssets.class) {
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
        public final ae50 m15793n() {
            return this.assets_;
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
        AnswerExplanation answerExplanation = new AnswerExplanation();
        DEFAULT_INSTANCE = answerExplanation;
        AbstractC0269h.registerDefaultInstance(AnswerExplanation.class, answerExplanation);
    }

    private AnswerExplanation() {
    }

    /* JADX INFO: renamed from: p */
    public static AnswerExplanation m15772p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004\u001b\u0005Ȉ\u0006Ț", new Object[]{"visualExplanation_", "visualExplanationCase_", "questionId_", Caption.class, VisualAssets.class, "sources_", Source.class, "explanation_", "entityUris_"});
        }
        if (iOrdinal == 3) {
            return new AnswerExplanation();
        }
        if (iOrdinal == 4) {
            return new C1062a(DEFAULT_INSTANCE);
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
        synchronized (AnswerExplanation.class) {
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
    public final VisualAssets m15773n() {
        return this.visualExplanationCase_ == 3 ? (VisualAssets) this.visualExplanation_ : VisualAssets.m15792o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Caption m15774o() {
        return this.visualExplanationCase_ == 2 ? (Caption) this.visualExplanation_ : Caption.m15780n();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m15775q() {
        return this.entityUris_;
    }

    /* JADX INFO: renamed from: r */
    public final String m15776r() {
        return this.explanation_;
    }

    /* JADX INFO: renamed from: s */
    public final String m15777s() {
        return this.questionId_;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m15778t() {
        return this.sources_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final int m15779u() {
        int i = this.visualExplanationCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }
}
