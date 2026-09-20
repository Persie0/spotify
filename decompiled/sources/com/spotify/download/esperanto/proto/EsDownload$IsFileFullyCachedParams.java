package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bkw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$IsFileFullyCachedParams extends AbstractC0269h implements sre0 {
    private static final EsDownload$IsFileFullyCachedParams DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESSIVE_FILE_FIELD_NUMBER = 1;
    public static final int SEGMENT_FILE_FIELD_NUMBER = 2;
    private int fileCase_ = 0;
    private Object file_;

    public static final class ProgressiveFileParams extends AbstractC0269h implements sre0 {
        private static final ProgressiveFileParams DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            ProgressiveFileParams progressiveFileParams = new ProgressiveFileParams();
            DEFAULT_INSTANCE = progressiveFileParams;
            AbstractC0269h.registerDefaultInstance(ProgressiveFileParams.class, progressiveFileParams);
        }

        private ProgressiveFileParams() {
        }

        /* JADX INFO: renamed from: n */
        public static void m9518n(ProgressiveFileParams progressiveFileParams, String str) {
            progressiveFileParams.getClass();
            str.getClass();
            progressiveFileParams.url_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static C0707b m9519o() {
            return (C0707b) DEFAULT_INSTANCE.createBuilder();
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
                return new ProgressiveFileParams();
            }
            if (iOrdinal == 4) {
                return new C0707b(DEFAULT_INSTANCE);
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
            synchronized (ProgressiveFileParams.class) {
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

    public static final class SegmentFileParams extends AbstractC0269h implements sre0 {
        public static final int CONTENT_FORM_FIELD_NUMBER = 2;
        private static final SegmentFileParams DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int URL_PATH_FIELD_NUMBER = 1;
        private int contentForm_;
        private String urlPath_ = "";

        static {
            SegmentFileParams segmentFileParams = new SegmentFileParams();
            DEFAULT_INSTANCE = segmentFileParams;
            AbstractC0269h.registerDefaultInstance(SegmentFileParams.class, segmentFileParams);
        }

        private SegmentFileParams() {
        }

        /* JADX INFO: renamed from: n */
        public static void m9520n(SegmentFileParams segmentFileParams, bkw bkwVar) {
            segmentFileParams.getClass();
            segmentFileParams.contentForm_ = bkwVar.getNumber();
        }

        /* JADX INFO: renamed from: o */
        public static void m9521o(SegmentFileParams segmentFileParams, String str) {
            segmentFileParams.getClass();
            str.getClass();
            segmentFileParams.urlPath_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static C0708c m9522p() {
            return (C0708c) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"urlPath_", "contentForm_"});
            }
            if (iOrdinal == 3) {
                return new SegmentFileParams();
            }
            if (iOrdinal == 4) {
                return new C0708c(DEFAULT_INSTANCE);
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
            synchronized (SegmentFileParams.class) {
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
        EsDownload$IsFileFullyCachedParams esDownload$IsFileFullyCachedParams = new EsDownload$IsFileFullyCachedParams();
        DEFAULT_INSTANCE = esDownload$IsFileFullyCachedParams;
        AbstractC0269h.registerDefaultInstance(EsDownload$IsFileFullyCachedParams.class, esDownload$IsFileFullyCachedParams);
    }

    private EsDownload$IsFileFullyCachedParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9515n(EsDownload$IsFileFullyCachedParams esDownload$IsFileFullyCachedParams, ProgressiveFileParams progressiveFileParams) {
        esDownload$IsFileFullyCachedParams.getClass();
        progressiveFileParams.getClass();
        esDownload$IsFileFullyCachedParams.file_ = progressiveFileParams;
        esDownload$IsFileFullyCachedParams.fileCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m9516o(EsDownload$IsFileFullyCachedParams esDownload$IsFileFullyCachedParams, SegmentFileParams segmentFileParams) {
        esDownload$IsFileFullyCachedParams.getClass();
        segmentFileParams.getClass();
        esDownload$IsFileFullyCachedParams.file_ = segmentFileParams;
        esDownload$IsFileFullyCachedParams.fileCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static C0706a m9517p() {
        return (C0706a) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"file_", "fileCase_", ProgressiveFileParams.class, SegmentFileParams.class});
        }
        if (iOrdinal == 3) {
            return new EsDownload$IsFileFullyCachedParams();
        }
        if (iOrdinal == 4) {
            return new C0706a(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$IsFileFullyCachedParams.class) {
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
