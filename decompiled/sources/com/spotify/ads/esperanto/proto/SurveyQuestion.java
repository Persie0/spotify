package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.cb61;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SurveyQuestion extends AbstractC0269h implements sre0 {
    private static final SurveyQuestion DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_TEXT_FIELD_NUMBER = 3;
    public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
    public static final int SURVEY_QUESTION_OPTIONS_FIELD_NUMBER = 5;
    public static final int SURVEY_QUESTION_TYPE_FIELD_NUMBER = 2;
    private String id_ = "";
    private String primaryText_ = "";
    private String secondaryText_ = "";
    private ae50 surveyQuestionOptions_ = AbstractC0269h.emptyProtobufList();
    private int surveyQuestionType_;

    static {
        SurveyQuestion surveyQuestion = new SurveyQuestion();
        DEFAULT_INSTANCE = surveyQuestion;
        AbstractC0269h.registerDefaultInstance(SurveyQuestion.class, surveyQuestion);
    }

    private SurveyQuestion() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004Ȉ\u0005\u001b", new Object[]{"id_", "surveyQuestionType_", "primaryText_", "secondaryText_", "surveyQuestionOptions_", SurveyQuestionOption.class});
        }
        if (iOrdinal == 3) {
            return new SurveyQuestion();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 22);
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
        synchronized (SurveyQuestion.class) {
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
    public final String m2719n() {
        return this.primaryText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m2720o() {
        return this.secondaryText_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m2721p() {
        return this.surveyQuestionOptions_;
    }

    /* JADX INFO: renamed from: q */
    public final cb61 m2722q() {
        cb61 cb61Var;
        int i = this.surveyQuestionType_;
        if (i == 0) {
            cb61Var = cb61.SURVEY_QUESTION_TYPE_UNKNOWN;
        } else if (i != 1) {
            cb61Var = i != 2 ? null : cb61.MULTI_SELECT;
        } else {
            cb61Var = cb61.SINGLE_SELECT;
        }
        return cb61Var == null ? cb61.UNRECOGNIZED : cb61Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
