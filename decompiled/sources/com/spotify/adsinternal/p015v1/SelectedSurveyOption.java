package com.spotify.adsinternal.p015v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vkz0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SelectedSurveyOption extends AbstractC0269h implements sre0 {
    private static final SelectedSurveyOption DEFAULT_INSTANCE;
    public static final int OPTION_POSITION_INDEX_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SELECTED_SURVEY_QUESTION_OPTION_ID_FIELD_NUMBER = 1;
    private long optionPositionIndex_;
    private String selectedSurveyQuestionOptionId_ = "";

    static {
        SelectedSurveyOption selectedSurveyOption = new SelectedSurveyOption();
        DEFAULT_INSTANCE = selectedSurveyOption;
        AbstractC0269h.registerDefaultInstance(SelectedSurveyOption.class, selectedSurveyOption);
    }

    private SelectedSurveyOption() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2850n(SelectedSurveyOption selectedSurveyOption, long j) {
        selectedSurveyOption.optionPositionIndex_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m2851o(SelectedSurveyOption selectedSurveyOption, String str) {
        selectedSurveyOption.getClass();
        str.getClass();
        selectedSurveyOption.selectedSurveyQuestionOptionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static vkz0 m2852p() {
        return (vkz0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"selectedSurveyQuestionOptionId_", "optionPositionIndex_"});
        }
        if (iOrdinal == 3) {
            return new SelectedSurveyOption();
        }
        if (iOrdinal == 4) {
            return new vkz0(DEFAULT_INSTANCE);
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
        synchronized (SelectedSurveyOption.class) {
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
