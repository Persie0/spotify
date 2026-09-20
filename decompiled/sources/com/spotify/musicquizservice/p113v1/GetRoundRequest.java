package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetRoundRequest extends AbstractC0269h implements sre0 {
    private static final GetRoundRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUIZ_ROUND_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int ROUND_ID_FIELD_NUMBER = 1;
    private int roundIdentifierCase_ = 0;
    private Object roundIdentifier_;

    public static final class QuizRoundIdentifier extends AbstractC0269h implements sre0 {
        private static final QuizRoundIdentifier DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int QUIZ_URI_FIELD_NUMBER = 1;
        public static final int ROUND_INDEX_FIELD_NUMBER = 2;
        private String quizUri_ = "";
        private int roundIndex_;

        static {
            QuizRoundIdentifier quizRoundIdentifier = new QuizRoundIdentifier();
            DEFAULT_INSTANCE = quizRoundIdentifier;
            AbstractC0269h.registerDefaultInstance(QuizRoundIdentifier.class, quizRoundIdentifier);
        }

        private QuizRoundIdentifier() {
        }

        /* JADX INFO: renamed from: n */
        public static void m15843n(QuizRoundIdentifier quizRoundIdentifier, String str) {
            quizRoundIdentifier.getClass();
            str.getClass();
            quizRoundIdentifier.quizUri_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m15844o(QuizRoundIdentifier quizRoundIdentifier, int i) {
            quizRoundIdentifier.roundIndex_ = i;
        }

        /* JADX INFO: renamed from: p */
        public static C1073l m15845p() {
            return (C1073l) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"quizUri_", "roundIndex_"});
            }
            if (iOrdinal == 3) {
                return new QuizRoundIdentifier();
            }
            if (iOrdinal == 4) {
                return new C1073l(DEFAULT_INSTANCE);
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
            synchronized (QuizRoundIdentifier.class) {
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
        GetRoundRequest getRoundRequest = new GetRoundRequest();
        DEFAULT_INSTANCE = getRoundRequest;
        AbstractC0269h.registerDefaultInstance(GetRoundRequest.class, getRoundRequest);
    }

    private GetRoundRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15841n(GetRoundRequest getRoundRequest, QuizRoundIdentifier quizRoundIdentifier) {
        getRoundRequest.getClass();
        quizRoundIdentifier.getClass();
        getRoundRequest.roundIdentifier_ = quizRoundIdentifier;
        getRoundRequest.roundIdentifierCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static C1072k m15842o() {
        return (C1072k) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000", new Object[]{"roundIdentifier_", "roundIdentifierCase_", QuizRoundIdentifier.class});
        }
        if (iOrdinal == 3) {
            return new GetRoundRequest();
        }
        if (iOrdinal == 4) {
            return new C1072k(DEFAULT_INSTANCE);
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
        synchronized (GetRoundRequest.class) {
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
