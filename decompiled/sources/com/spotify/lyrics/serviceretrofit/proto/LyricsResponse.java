package com.spotify.lyrics.serviceretrofit.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vjb0;
import p204p.wjb0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LyricsResponse extends AbstractC0269h implements sre0 {
    public static final int ALTERNATIVES_FIELD_NUMBER = 9;
    public static final int CAP_STATUS_FIELD_NUMBER = 14;
    private static final LyricsResponse DEFAULT_INSTANCE;
    public static final int IS_RTL_LANGUAGE_FIELD_NUMBER = 11;
    public static final int LANGUAGE_FIELD_NUMBER = 10;
    public static final int LINES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_DISPLAY_NAME_FIELD_NUMBER = 5;
    public static final int PROVIDER_FIELD_NUMBER = 3;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 4;
    public static final int SYNC_LYRICS_URI_FIELD_NUMBER = 7;
    public static final int SYNC_TYPE_FIELD_NUMBER = 1;
    public static final int TRANSLATION_LANGUAGES_FIELD_NUMBER = 18;
    private int capStatus_;
    private boolean isRtlLanguage_;
    private int syncType_;
    private ae50 lines_ = AbstractC0269h.emptyProtobufList();
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String providerDisplayName_ = "";
    private String syncLyricsUri_ = "";
    private ae50 alternatives_ = AbstractC0269h.emptyProtobufList();
    private String language_ = "";
    private ae50 translationLanguages_ = AbstractC0269h.emptyProtobufList();

    public static final class Alternative extends AbstractC0269h implements sre0 {
        private static final Alternative DEFAULT_INSTANCE;
        public static final int IS_RTL_LANGUAGE_FIELD_NUMBER = 3;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LINES_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER;
        private boolean isRtlLanguage_;
        private String language_ = "";
        private ae50 lines_ = AbstractC0269h.emptyProtobufList();

        static {
            Alternative alternative = new Alternative();
            DEFAULT_INSTANCE = alternative;
            AbstractC0269h.registerDefaultInstance(Alternative.class, alternative);
        }

        private Alternative() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"language_", "lines_", "isRtlLanguage_"});
            }
            if (iOrdinal == 3) {
                return new Alternative();
            }
            if (iOrdinal == 4) {
                return new C0867c(DEFAULT_INSTANCE);
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
            synchronized (Alternative.class) {
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

        public final String getLanguage() {
            return this.language_;
        }

        /* JADX INFO: renamed from: n */
        public final boolean m13347n() {
            return this.isRtlLanguage_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final ae50 m13348o() {
            return this.lines_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class LyricsLine extends AbstractC0269h implements sre0 {
        private static final LyricsLine DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int START_TIME_MS_FIELD_NUMBER = 1;
        public static final int SYLLABLES_FIELD_NUMBER = 3;
        public static final int WORDS_FIELD_NUMBER = 2;
        private long startTimeMs_;
        private String words_ = "";
        private ae50 syllables_ = AbstractC0269h.emptyProtobufList();

        public static final class Syllable extends AbstractC0269h implements sre0 {
            private static final Syllable DEFAULT_INSTANCE;
            public static final int NUM_CHARS_FIELD_NUMBER = 2;
            private static volatile r2n0 PARSER = null;
            public static final int START_TIME_MS_FIELD_NUMBER = 1;
            private long numChars_;
            private long startTimeMs_;

            static {
                Syllable syllable = new Syllable();
                DEFAULT_INSTANCE = syllable;
                AbstractC0269h.registerDefaultInstance(Syllable.class, syllable);
            }

            private Syllable() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"startTimeMs_", "numChars_"});
                }
                if (iOrdinal == 3) {
                    return new Syllable();
                }
                if (iOrdinal == 4) {
                    return new C0870f(DEFAULT_INSTANCE);
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
                synchronized (Syllable.class) {
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
            public final long m13352n() {
                return this.numChars_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
                return newBuilderForType();
            }

            /* JADX INFO: renamed from: o */
            public final long m13353o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002Ȉ\u0003\u001b", new Object[]{"startTimeMs_", "words_", "syllables_", Syllable.class});
            }
            if (iOrdinal == 3) {
                return new LyricsLine();
            }
            if (iOrdinal == 4) {
                return new C0869e(DEFAULT_INSTANCE);
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
        public final long m13349n() {
            return this.startTimeMs_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final ae50 m13350o() {
            return this.syllables_;
        }

        /* JADX INFO: renamed from: p */
        public final String m13351p() {
            return this.words_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        LyricsResponse lyricsResponse = new LyricsResponse();
        DEFAULT_INSTANCE = lyricsResponse;
        AbstractC0269h.registerDefaultInstance(LyricsResponse.class, lyricsResponse);
    }

    private LyricsResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static LyricsResponse m13337p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u0012\u000b\u0000\u0003\u0000\u0001\f\u0002\u001b\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0007Ȉ\t\u001b\nȈ\u000b\u0007\u000e\f\u0012Ț", new Object[]{"syncType_", "lines_", LyricsLine.class, "provider_", "providerLyricsId_", "providerDisplayName_", "syncLyricsUri_", "alternatives_", Alternative.class, "language_", "isRtlLanguage_", "capStatus_", "translationLanguages_"});
        }
        if (iOrdinal == 3) {
            return new LyricsResponse();
        }
        if (iOrdinal == 4) {
            return new C0868d(DEFAULT_INSTANCE);
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
        synchronized (LyricsResponse.class) {
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

    public final String getLanguage() {
        return this.language_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m13338n() {
        return this.alternatives_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final vjb0 m13339o() {
        vjb0 vjb0Var;
        int i = this.capStatus_;
        if (i == 0) {
            vjb0Var = vjb0.NONE;
        } else if (i != 1) {
            vjb0Var = i != 3 ? null : vjb0.CAPPED;
        } else {
            vjb0Var = vjb0.UNCAPPED;
        }
        return vjb0Var == null ? vjb0.UNRECOGNIZED : vjb0Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m13340q() {
        return this.isRtlLanguage_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m13341r() {
        return this.lines_;
    }

    /* JADX INFO: renamed from: s */
    public final String m13342s() {
        return this.provider_;
    }

    /* JADX INFO: renamed from: t */
    public final String m13343t() {
        return this.providerDisplayName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m13344u() {
        return this.providerLyricsId_;
    }

    /* JADX INFO: renamed from: v */
    public final wjb0 m13345v() {
        wjb0 wjb0Var;
        int i = this.syncType_;
        if (i == 0) {
            wjb0Var = wjb0.UNSYNCED;
        } else if (i != 1) {
            wjb0Var = i != 2 ? null : wjb0.SYLLABLE_SYNCED;
        } else {
            wjb0Var = wjb0.LINE_SYNCED;
        }
        return wjb0Var == null ? wjb0.UNRECOGNIZED : wjb0Var;
    }

    /* JADX INFO: renamed from: w */
    public final ae50 m13346w() {
        return this.translationLanguages_;
    }
}
