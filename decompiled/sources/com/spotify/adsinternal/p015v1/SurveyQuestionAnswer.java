package com.spotify.adsinternal.p015v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ab61;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SurveyQuestionAnswer extends AbstractC0269h implements sre0 {
    private static final SurveyQuestionAnswer DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SELECTED_SURVEY_OPTIONS_FIELD_NUMBER = 2;
    public static final int SURVEY_QUESTION_ID_FIELD_NUMBER = 1;
    private String surveyQuestionId_ = "";
    private ae50 selectedSurveyOptions_ = AbstractC0269h.emptyProtobufList();

    static {
        SurveyQuestionAnswer surveyQuestionAnswer = new SurveyQuestionAnswer();
        DEFAULT_INSTANCE = surveyQuestionAnswer;
        AbstractC0269h.registerDefaultInstance(SurveyQuestionAnswer.class, surveyQuestionAnswer);
    }

    private SurveyQuestionAnswer() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2855n(SurveyQuestionAnswer surveyQuestionAnswer, ArrayList arrayList) {
        ae50 ae50Var = surveyQuestionAnswer.selectedSurveyOptions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            surveyQuestionAnswer.selectedSurveyOptions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, surveyQuestionAnswer.selectedSurveyOptions_);
    }

    /* JADX INFO: renamed from: o */
    public static void m2856o(SurveyQuestionAnswer surveyQuestionAnswer, String str) {
        surveyQuestionAnswer.getClass();
        str.getClass();
        surveyQuestionAnswer.surveyQuestionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static ab61 m2857p() {
        return (ab61) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"surveyQuestionId_", "selectedSurveyOptions_", SelectedSurveyOption.class});
        }
        if (iOrdinal == 3) {
            return new SurveyQuestionAnswer();
        }
        if (iOrdinal == 4) {
            return new ab61(DEFAULT_INSTANCE);
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
        synchronized (SurveyQuestionAnswer.class) {
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
