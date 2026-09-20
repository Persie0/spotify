package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class Survey extends AbstractC0269h implements sre0 {
    private static final Survey DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SURVEY_QUESTIONS_FIELD_NUMBER = 1;
    public static final int SURVEY_TRANSPARENCY_CONTENT_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 surveyQuestions_ = AbstractC0269h.emptyProtobufList();
    private SurveyTransparencyContent surveyTransparencyContent_;

    static {
        Survey survey = new Survey();
        DEFAULT_INSTANCE = survey;
        AbstractC0269h.registerDefaultInstance(Survey.class, survey);
    }

    private Survey() {
    }

    /* JADX INFO: renamed from: n */
    public static Survey m2716n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "surveyQuestions_", SurveyQuestion.class, "surveyTransparencyContent_"});
        }
        if (iOrdinal == 3) {
            return new Survey();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 21);
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
        synchronized (Survey.class) {
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
    public final ae50 m2717o() {
        return this.surveyQuestions_;
    }

    /* JADX INFO: renamed from: p */
    public final SurveyTransparencyContent m2718p() {
        SurveyTransparencyContent surveyTransparencyContent = this.surveyTransparencyContent_;
        return surveyTransparencyContent == null ? SurveyTransparencyContent.m2725n() : surveyTransparencyContent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
