package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PresetStep extends AbstractC0269h implements sre0 {
    private static final PresetStep DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int LOCATION_STEP_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int QUESTION_STEP_FIELD_NUMBER = 6;
    public static final int RECOMMENDED_TOOLS_STEP_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TOPICS_STEP_FIELD_NUMBER = 4;
    public static final int VISIBLE_IF_ANY_ANSWER_SELECTED_FIELD_NUMBER = 7;
    private Object step_;
    private int stepCase_ = 0;
    private String title_ = "";
    private String description_ = "";
    private ae50 visibleIfAnyAnswerSelected_ = AbstractC0269h.emptyProtobufList();

    static {
        PresetStep presetStep = new PresetStep();
        DEFAULT_INSTANCE = presetStep;
        AbstractC0269h.registerDefaultInstance(PresetStep.class, presetStep);
    }

    private PresetStep() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ț", new Object[]{"step_", "stepCase_", "title_", "description_", LocationStep.class, TopicsStep.class, RecommendedToolsStep.class, QuestionStep.class, "visibleIfAnyAnswerSelected_"});
        }
        if (iOrdinal == 3) {
            return new PresetStep();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 27);
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
        synchronized (PresetStep.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final QuestionStep m17458n() {
        return this.stepCase_ == 6 ? (QuestionStep) this.step_ : QuestionStep.m17472p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final RecommendedToolsStep m17459o() {
        return this.stepCase_ == 5 ? (RecommendedToolsStep) this.step_ : RecommendedToolsStep.m17483n();
    }

    /* JADX INFO: renamed from: p */
    public final int m17460p() {
        int i = this.stepCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: q */
    public final TopicsStep m17461q() {
        return this.stepCase_ == 4 ? (TopicsStep) this.step_ : TopicsStep.m17531o();
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m17462r() {
        return this.visibleIfAnyAnswerSelected_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
