package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class QuestionStep extends AbstractC0269h implements sre0 {
    public static final int ALLOW_USER_ANSWERS_FIELD_NUMBER = 3;
    public static final int ANSWERS_FIELD_NUMBER = 4;
    private static final QuestionStep DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MAX_SELECTED_ANSWER_LIMIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLACEHOLDER_USER_ANSWER_TEXT_FIELD_NUMBER = 5;
    private boolean allowUserAnswers_;
    private int bitField0_;
    private int maxSelectedAnswerLimit_;
    private String id_ = "";
    private ae50 answers_ = AbstractC0269h.emptyProtobufList();
    private String placeholderUserAnswerText_ = "";

    static {
        QuestionStep questionStep = new QuestionStep();
        DEFAULT_INSTANCE = questionStep;
        AbstractC0269h.registerDefaultInstance(QuestionStep.class, questionStep);
    }

    private QuestionStep() {
    }

    /* JADX INFO: renamed from: p */
    public static QuestionStep m17472p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002င\u0000\u0003\u0007\u0004\u001b\u0005ለ\u0001", new Object[]{"bitField0_", "id_", "maxSelectedAnswerLimit_", "allowUserAnswers_", "answers_", Answer.class, "placeholderUserAnswerText_"});
        }
        if (iOrdinal == 3) {
            return new QuestionStep();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 18);
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
        synchronized (QuestionStep.class) {
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

    public final String getId() {
        return this.id_;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m17473n() {
        return this.allowUserAnswers_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m17474o() {
        return this.answers_;
    }

    /* JADX INFO: renamed from: q */
    public final int m17475q() {
        return this.maxSelectedAnswerLimit_;
    }

    /* JADX INFO: renamed from: r */
    public final String m17476r() {
        return this.placeholderUserAnswerText_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m17477s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17478t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
