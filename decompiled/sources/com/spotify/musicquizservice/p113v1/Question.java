package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Question extends AbstractC0269h implements sre0 {
    public static final int ANSWER_EXPLANATION_FIELD_NUMBER = 8;
    private static final Question DEFAULT_INSTANCE;
    public static final int HINT_TEXT_FIELD_NUMBER = 7;
    public static final int IMAGE_QUESTION_FIELD_NUMBER = 4;
    public static final int MULTIPLE_CHOICE_FIELD_NUMBER = 5;
    public static final int MUSIC_IDENTIFIER_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PRETITLE_FIELD_NUMBER = 9;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    public static final int QUESTION_URI_FIELD_NUMBER = 11;
    public static final int QUOTATION_FIELD_NUMBER = 10;
    public static final int TEXT_QUESTION_FIELD_NUMBER = 3;
    public static final int TIME_LIMIT_FIELD_NUMBER = 6;
    private AnswerExplanation answerExplanation_;
    private Object answerType_;
    private int bitField0_;
    private Object questionType_;
    private Duration timeLimit_;
    private int questionTypeCase_ = 0;
    private int answerTypeCase_ = 0;
    private String questionId_ = "";
    private String questionUri_ = "";
    private String hintText_ = "";
    private String pretitle_ = "";

    static {
        Question question = new Question();
        DEFAULT_INSTANCE = question;
        AbstractC0269h.registerDefaultInstance(Question.class, question);
    }

    private Question() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m15876A() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m15877B() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0002\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0001\u0006ဉ\u0000\u0007ለ\u0001\bဉ\u0002\tለ\u0003\n<\u0000\u000bȈ", new Object[]{"questionType_", "questionTypeCase_", "answerType_", "answerTypeCase_", "bitField0_", "questionId_", MusicIdentifierQuestion.class, TextQuestion.class, ImageQuestion.class, MultipleChoiceAnswer.class, "timeLimit_", "hintText_", "answerExplanation_", "pretitle_", QuotationQuestion.class, "questionUri_"});
        }
        if (iOrdinal == 3) {
            return new Question();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 16);
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
        synchronized (Question.class) {
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
    public final AnswerExplanation m15878n() {
        AnswerExplanation answerExplanation = this.answerExplanation_;
        return answerExplanation == null ? AnswerExplanation.m15772p() : answerExplanation;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m15879o() {
        int i = this.answerTypeCase_;
        if (i != 0) {
            return i != 5 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: p */
    public final String m15880p() {
        return this.hintText_;
    }

    /* JADX INFO: renamed from: q */
    public final ImageQuestion m15881q() {
        return this.questionTypeCase_ == 4 ? (ImageQuestion) this.questionType_ : ImageQuestion.m15855n();
    }

    /* JADX INFO: renamed from: r */
    public final MultipleChoiceAnswer m15882r() {
        return this.answerTypeCase_ == 5 ? (MultipleChoiceAnswer) this.answerType_ : MultipleChoiceAnswer.m15865o();
    }

    /* JADX INFO: renamed from: s */
    public final MusicIdentifierQuestion m15883s() {
        return this.questionTypeCase_ == 2 ? (MusicIdentifierQuestion) this.questionType_ : MusicIdentifierQuestion.m15868q();
    }

    /* JADX INFO: renamed from: t */
    public final String m15884t() {
        return this.pretitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m15885u() {
        return this.questionId_;
    }

    /* JADX INFO: renamed from: v */
    public final int m15886v() {
        int i = this.questionTypeCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 10) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: w */
    public final String m15887w() {
        return this.questionUri_;
    }

    /* JADX INFO: renamed from: x */
    public final QuotationQuestion m15888x() {
        return this.questionTypeCase_ == 10 ? (QuotationQuestion) this.questionType_ : QuotationQuestion.m15904n();
    }

    /* JADX INFO: renamed from: y */
    public final TextQuestion m15889y() {
        return this.questionTypeCase_ == 3 ? (TextQuestion) this.questionType_ : TextQuestion.m15939n();
    }

    /* JADX INFO: renamed from: z */
    public final Duration m15890z() {
        Duration duration = this.timeLimit_;
        return duration == null ? Duration.m1928p() : duration;
    }
}
