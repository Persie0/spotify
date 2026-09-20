package com.spotify.lyrics.serviceretrofit.proto.p105v3;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.nqb0;
import p204p.oqb0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LyricsV3Response extends AbstractC0269h implements sre0 {
    public static final int CAP_STATUS_FIELD_NUMBER = 7;
    private static final LyricsV3Response DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 6;
    public static final int LINES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_LINES_FIELD_NUMBER = 3;
    public static final int PROVIDER_FIELD_NUMBER = 4;
    public static final int SYNC_TYPE_FIELD_NUMBER = 1;
    public static final int TRANSLATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private int capStatus_;
    private Language language_;
    private ae50 lines_ = AbstractC0269h.emptyProtobufList();
    private ae50 previewLines_ = AbstractC0269h.emptyProtobufList();
    private Provider provider_;
    private int syncType_;
    private Translation translation_;

    public static final class Language extends AbstractC0269h implements sre0 {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Language DEFAULT_INSTANCE;
        public static final int IS_RTL_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private String code_ = "";
        private boolean isRtl_;

        static {
            Language language = new Language();
            DEFAULT_INSTANCE = language;
            AbstractC0269h.registerDefaultInstance(Language.class, language);
        }

        private Language() {
        }

        /* JADX INFO: renamed from: o */
        public static Language m13361o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"code_", "isRtl_"});
            }
            if (iOrdinal == 3) {
                return new Language();
            }
            if (iOrdinal == 4) {
                return new C0872b(DEFAULT_INSTANCE);
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
            synchronized (Language.class) {
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
        public final String m13362n() {
            return this.code_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final boolean m13363p() {
            return this.isRtl_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class LyricsLine extends AbstractC0269h implements sre0 {
        private static final LyricsLine DEFAULT_INSTANCE;
        public static final int END_TIME_MS_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int START_TIME_MS_FIELD_NUMBER = 1;
        public static final int SYNC_DATA_FIELD_NUMBER = 4;
        public static final int WORDS_FIELD_NUMBER = 3;
        private long endTimeMs_;
        private long startTimeMs_;
        private String words_ = "";
        private ae50 syncData_ = AbstractC0269h.emptyProtobufList();

        public static final class SyncData extends AbstractC0269h implements sre0 {
            private static final SyncData DEFAULT_INSTANCE;
            public static final int END_TIME_MS_FIELD_NUMBER = 2;
            public static final int NUM_CHARS_FIELD_NUMBER = 3;
            private static volatile r2n0 PARSER = null;
            public static final int START_TIME_MS_FIELD_NUMBER = 1;
            private long endTimeMs_;
            private long numChars_;
            private long startTimeMs_;

            static {
                SyncData syncData = new SyncData();
                DEFAULT_INSTANCE = syncData;
                AbstractC0269h.registerDefaultInstance(SyncData.class, syncData);
            }

            private SyncData() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002", new Object[]{"startTimeMs_", "endTimeMs_", "numChars_"});
                }
                if (iOrdinal == 3) {
                    return new SyncData();
                }
                if (iOrdinal == 4) {
                    return new C0874d(DEFAULT_INSTANCE);
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
                synchronized (SyncData.class) {
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
            public final long m13367n() {
                return this.numChars_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: o */
            public final long m13368o() {
                return this.startTimeMs_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            LyricsLine lyricsLine = new LyricsLine();
            DEFAULT_INSTANCE = lyricsLine;
            AbstractC0269h.registerDefaultInstance(LyricsLine.class, lyricsLine);
        }

        private LyricsLine() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004\u001b", new Object[]{"startTimeMs_", "endTimeMs_", "words_", "syncData_", SyncData.class});
            }
            if (iOrdinal == 3) {
                return new LyricsLine();
            }
            if (iOrdinal == 4) {
                return new C0873c(DEFAULT_INSTANCE);
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
            synchronized (LyricsLine.class) {
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
        public final long m13364n() {
            return this.startTimeMs_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final ae50 m13365o() {
            return this.syncData_;
        }

        /* JADX INFO: renamed from: p */
        public final String m13366p() {
            return this.words_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Provider extends AbstractC0269h implements sre0 {
        private static final Provider DEFAULT_INSTANCE;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
        public static final int LYRICS_ID_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private String name_ = "";
        private String lyricsId_ = "";
        private String displayName_ = "";

        static {
            Provider provider = new Provider();
            DEFAULT_INSTANCE = provider;
            AbstractC0269h.registerDefaultInstance(Provider.class, provider);
        }

        private Provider() {
        }

        /* JADX INFO: renamed from: n */
        public static Provider m13369n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "lyricsId_", "displayName_"});
            }
            if (iOrdinal == 3) {
                return new Provider();
            }
            if (iOrdinal == 4) {
                return new C0875e(DEFAULT_INSTANCE);
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
            synchronized (Provider.class) {
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

        public final String getDisplayName() {
            return this.displayName_;
        }

        public final String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m13370o() {
            return this.lyricsId_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Translation extends AbstractC0269h implements sre0 {
        private static final Translation DEFAULT_INSTANCE;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LINES_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private Language language_;
        private ae50 lines_ = AbstractC0269h.emptyProtobufList();

        static {
            Translation translation = new Translation();
            DEFAULT_INSTANCE = translation;
            AbstractC0269h.registerDefaultInstance(Translation.class, translation);
        }

        private Translation() {
        }

        /* JADX INFO: renamed from: n */
        public static Translation m13371n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ț", new Object[]{"bitField0_", "language_", "lines_"});
            }
            if (iOrdinal == 3) {
                return new Translation();
            }
            if (iOrdinal == 4) {
                return new C0876f(DEFAULT_INSTANCE);
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
            synchronized (Translation.class) {
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
        public final Language m13372o() {
            Language language = this.language_;
            return language == null ? Language.m13361o() : language;
        }

        /* JADX INFO: renamed from: p */
        public final ae50 m13373p() {
            return this.lines_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        LyricsV3Response lyricsV3Response = new LyricsV3Response();
        DEFAULT_INSTANCE = lyricsV3Response;
        AbstractC0269h.registerDefaultInstance(LyricsV3Response.class, lyricsV3Response);
    }

    private LyricsV3Response() {
    }

    /* JADX INFO: renamed from: o */
    public static LyricsV3Response m13354o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\f\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007\f", new Object[]{"bitField0_", "syncType_", "lines_", LyricsLine.class, "previewLines_", LyricsLine.class, "provider_", "translation_", "language_", "capStatus_"});
        }
        if (iOrdinal == 3) {
            return new LyricsV3Response();
        }
        if (iOrdinal == 4) {
            return new C0871a(DEFAULT_INSTANCE);
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
        synchronized (LyricsV3Response.class) {
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
    public final nqb0 m13355n() {
        nqb0 nqb0Var;
        int i = this.capStatus_;
        if (i == 0) {
            nqb0Var = nqb0.NONE;
        } else if (i != 1) {
            nqb0Var = i != 3 ? null : nqb0.CAPPED;
        } else {
            nqb0Var = nqb0.UNCAPPED;
        }
        return nqb0Var == null ? nqb0.UNRECOGNIZED : nqb0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Language m13356p() {
        Language language = this.language_;
        return language == null ? Language.m13361o() : language;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m13357q() {
        return this.lines_;
    }

    /* JADX INFO: renamed from: r */
    public final Provider m13358r() {
        Provider provider = this.provider_;
        return provider == null ? Provider.m13369n() : provider;
    }

    /* JADX INFO: renamed from: s */
    public final oqb0 m13359s() {
        oqb0 oqb0Var;
        int i = this.syncType_;
        if (i == 0) {
            oqb0Var = oqb0.UNSYNCED;
        } else if (i != 1) {
            oqb0Var = i != 2 ? null : oqb0.RICH_SYNCED;
        } else {
            oqb0Var = oqb0.LINE_SYNCED;
        }
        return oqb0Var == null ? oqb0.UNRECOGNIZED : oqb0Var;
    }

    /* JADX INFO: renamed from: t */
    public final Translation m13360t() {
        Translation translation = this.translation_;
        return translation == null ? Translation.m13371n() : translation;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
