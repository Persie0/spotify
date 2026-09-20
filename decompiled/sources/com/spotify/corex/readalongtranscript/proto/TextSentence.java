package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class TextSentence extends AbstractC0269h implements sre0 {
    private static final TextSentence DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SENTENCE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Sentence sentence_;

    public static final class Sentence extends AbstractC0269h implements sre0 {
        private static final Sentence DEFAULT_INSTANCE;
        public static final int HIGHLIGHT_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER = null;
        public static final int START_MS_FIELD_NUMBER = 1;
        public static final int TEXT_FIELD_NUMBER = 2;
        private int startMs_;
        private String text_ = "";
        private ae50 highlight_ = AbstractC0269h.emptyProtobufList();

        static {
            Sentence sentence = new Sentence();
            DEFAULT_INSTANCE = sentence;
            AbstractC0269h.registerDefaultInstance(Sentence.class, sentence);
        }

        private Sentence() {
        }

        /* JADX INFO: renamed from: n */
        public static Sentence m8121n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"startMs_", "text_", "highlight_", TextRange.class});
            }
            if (iOrdinal == 3) {
                return new Sentence();
            }
            if (iOrdinal == 4) {
                return new C0574d(DEFAULT_INSTANCE);
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final ae50 m8122o() {
            return this.highlight_;
        }

        /* JADX INFO: renamed from: p */
        public final int m8123p() {
            return this.startMs_;
        }

        /* JADX INFO: renamed from: q */
        public final String m8124q() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        TextSentence textSentence = new TextSentence();
        DEFAULT_INSTANCE = textSentence;
        AbstractC0269h.registerDefaultInstance(TextSentence.class, textSentence);
    }

    private TextSentence() {
    }

    /* JADX INFO: renamed from: n */
    public static TextSentence m8119n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "sentence_"});
        }
        if (iOrdinal == 3) {
            return new TextSentence();
        }
        if (iOrdinal == 4) {
            return new C0573c(DEFAULT_INSTANCE);
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
        synchronized (TextSentence.class) {
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
    public final Sentence m8120o() {
        Sentence sentence = this.sentence_;
        return sentence == null ? Sentence.m8121n() : sentence;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
