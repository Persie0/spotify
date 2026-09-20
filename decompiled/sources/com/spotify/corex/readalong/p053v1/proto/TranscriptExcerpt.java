package com.spotify.corex.readalong.p053v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class TranscriptExcerpt extends AbstractC0269h implements sre0 {
    public static final int COLOUR_DATA_FIELD_NUMBER = 6;
    private static final TranscriptExcerpt DEFAULT_INSTANCE;
    public static final int END_MS_FIELD_NUMBER = 7;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    public static final int LANGUAGE_FIELD_NUMBER = 4;
    public static final int OLD_COLOURS_ENABLED_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISHED_AT_FIELD_NUMBER = 3;
    public static final int SENTENCES_FIELD_NUMBER = 5;
    public static final int TRANSCRIPT_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private ColourData colourData_;
    private int endMs_;
    private boolean oldColoursEnabled_;
    private String episodeUri_ = "";
    private String transcriptUri_ = "";
    private String publishedAt_ = "";
    private String language_ = "";
    private ae50 sentences_ = AbstractC0269h.emptyProtobufList();

    public static final class Sentence extends AbstractC0269h implements sre0 {
        private static final Sentence DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int START_MS_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int startMs_;
        private String text_ = "";

        static {
            Sentence sentence = new Sentence();
            DEFAULT_INSTANCE = sentence;
            AbstractC0269h.registerDefaultInstance(Sentence.class, sentence);
        }

        private Sentence() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"text_", "startMs_"});
            }
            if (iOrdinal == 3) {
                return new Sentence();
            }
            if (iOrdinal == 4) {
                return new C0570b(DEFAULT_INSTANCE);
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
            synchronized (Sentence.class) {
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
        public final int m8055n() {
            return this.startMs_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m8056o() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        TranscriptExcerpt transcriptExcerpt = new TranscriptExcerpt();
        DEFAULT_INSTANCE = transcriptExcerpt;
        AbstractC0269h.registerDefaultInstance(TranscriptExcerpt.class, transcriptExcerpt);
    }

    private TranscriptExcerpt() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006ဉ\u0000\u0007\u0004\b\u0007", new Object[]{"bitField0_", "episodeUri_", "transcriptUri_", "publishedAt_", "language_", "sentences_", Sentence.class, "colourData_", "endMs_", "oldColoursEnabled_"});
        }
        if (iOrdinal == 3) {
            return new TranscriptExcerpt();
        }
        if (iOrdinal == 4) {
            return new C0569a(DEFAULT_INSTANCE);
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
        synchronized (TranscriptExcerpt.class) {
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
    public final ColourData m8049n() {
        ColourData colourData = this.colourData_;
        return colourData == null ? ColourData.m8045o() : colourData;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m8050o() {
        return this.endMs_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8051p() {
        return this.oldColoursEnabled_;
    }

    /* JADX INFO: renamed from: q */
    public final String m8052q() {
        return this.publishedAt_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m8053r() {
        return this.sentences_;
    }

    /* JADX INFO: renamed from: s */
    public final String m8054s() {
        return this.transcriptUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
