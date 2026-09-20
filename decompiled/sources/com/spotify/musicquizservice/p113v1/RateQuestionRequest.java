package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class RateQuestionRequest extends AbstractC0269h implements sre0 {
    public static final int CLEAR_FIELD_NUMBER = 4;
    private static final RateQuestionRequest DEFAULT_INSTANCE;
    public static final int FEEDBACK_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    public static final int QUIZ_URI_FIELD_NUMBER = 2;
    private Object action_;
    private int actionCase_ = 0;
    private String questionId_ = "";
    private String quizUri_ = "";

    static {
        RateQuestionRequest rateQuestionRequest = new RateQuestionRequest();
        DEFAULT_INSTANCE = rateQuestionRequest;
        AbstractC0269h.registerDefaultInstance(RateQuestionRequest.class, rateQuestionRequest);
    }

    private RateQuestionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15906n(RateQuestionRequest rateQuestionRequest) {
        rateQuestionRequest.actionCase_ = 4;
        rateQuestionRequest.action_ = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    public static void m15907o(RateQuestionRequest rateQuestionRequest, QuestionFeedback questionFeedback) {
        rateQuestionRequest.getClass();
        questionFeedback.getClass();
        rateQuestionRequest.action_ = questionFeedback;
        rateQuestionRequest.actionCase_ = 3;
    }

    /* JADX INFO: renamed from: p */
    public static void m15908p(RateQuestionRequest rateQuestionRequest, String str) {
        rateQuestionRequest.getClass();
        str.getClass();
        rateQuestionRequest.questionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m15909q(RateQuestionRequest rateQuestionRequest, String str) {
        rateQuestionRequest.getClass();
        str.getClass();
        rateQuestionRequest.quizUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static t6u0 m15910r() {
        return (t6u0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004:\u0000", new Object[]{"action_", "actionCase_", "questionId_", "quizUri_", QuestionFeedback.class});
        }
        if (iOrdinal == 3) {
            return new RateQuestionRequest();
        }
        if (iOrdinal == 4) {
            return new t6u0(DEFAULT_INSTANCE);
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
        synchronized (RateQuestionRequest.class) {
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
