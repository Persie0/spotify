package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zhy0;

/* JADX INFO: loaded from: classes7.dex */
public final class GameResults extends AbstractC0269h implements sre0 {
    private static final GameResults DEFAULT_INSTANCE;
    public static final int MAX_SCORE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 1;
    public static final int SCORE_THRESHOLD_FIELD_NUMBER = 7;
    public static final int TIME_TO_ANSWER_MS_FIELD_NUMBER = 3;
    public static final int TOTAL_CORRECT_ANSWERS_FIELD_NUMBER = 4;
    public static final int TOTAL_QUESTIONS_FIELD_NUMBER = 5;
    private int maxScore_;
    private int scoreThreshold_;
    private int score_;
    private long timeToAnswerMs_;
    private int totalCorrectAnswers_;
    private int totalQuestions_;

    static {
        GameResults gameResults = new GameResults();
        DEFAULT_INSTANCE = gameResults;
        AbstractC0269h.registerDefaultInstance(GameResults.class, gameResults);
    }

    private GameResults() {
    }

    /* JADX INFO: renamed from: n */
    public static GameResults m11019n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002\u0004\u0004\u0005\u0004\u0007\f", new Object[]{"score_", "maxScore_", "timeToAnswerMs_", "totalCorrectAnswers_", "totalQuestions_", "scoreThreshold_"});
        }
        if (iOrdinal == 3) {
            return new GameResults();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 5);
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
        synchronized (GameResults.class) {
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
    public final int m11020o() {
        return this.maxScore_;
    }

    /* JADX INFO: renamed from: p */
    public final int m11021p() {
        return this.score_;
    }

    /* JADX INFO: renamed from: q */
    public final zhy0 m11022q() {
        zhy0 zhy0VarM96182a = zhy0.m96182a(this.scoreThreshold_);
        return zhy0VarM96182a == null ? zhy0.UNRECOGNIZED : zhy0VarM96182a;
    }

    /* JADX INFO: renamed from: r */
    public final long m11023r() {
        return this.timeToAnswerMs_;
    }

    /* JADX INFO: renamed from: s */
    public final int m11024s() {
        return this.totalCorrectAnswers_;
    }

    /* JADX INFO: renamed from: t */
    public final int m11025t() {
        return this.totalQuestions_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
