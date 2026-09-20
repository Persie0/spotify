package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zkt0;

/* JADX INFO: loaded from: classes7.dex */
public final class QuestionScore extends AbstractC0269h implements sre0 {
    private static final QuestionScore DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 3;
    public static final int SELECTED_CHOICE_URI_FIELD_NUMBER = 2;
    public static final int TIME_TO_ANSWER_MS_FIELD_NUMBER = 4;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int score_;
    private long timeToAnswerMs_;
    private String trackUri_ = "";
    private String selectedChoiceUri_ = "";

    static {
        QuestionScore questionScore = new QuestionScore();
        DEFAULT_INSTANCE = questionScore;
        AbstractC0269h.registerDefaultInstance(QuestionScore.class, questionScore);
    }

    private QuestionScore() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11057n(QuestionScore questionScore, int i) {
        questionScore.score_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m11058o(QuestionScore questionScore, String str) {
        questionScore.getClass();
        str.getClass();
        questionScore.selectedChoiceUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m11059p(QuestionScore questionScore, long j) {
        questionScore.timeToAnswerMs_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11060q(QuestionScore questionScore, String str) {
        questionScore.getClass();
        questionScore.trackUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static zkt0 m11061r() {
        return (zkt0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0002", new Object[]{"trackUri_", "selectedChoiceUri_", "score_", "timeToAnswerMs_"});
        }
        if (iOrdinal == 3) {
            return new QuestionScore();
        }
        if (iOrdinal == 4) {
            return new zkt0(DEFAULT_INSTANCE);
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
        synchronized (QuestionScore.class) {
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
