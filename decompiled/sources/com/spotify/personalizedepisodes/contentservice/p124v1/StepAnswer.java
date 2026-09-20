package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r151;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class StepAnswer extends AbstractC0269h implements sre0 {
    private static final StepAnswer DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SELECTED_IDS_FIELD_NUMBER = 2;
    public static final int STEP_ID_FIELD_NUMBER = 1;
    public static final int USER_ANSWERS_FIELD_NUMBER = 3;
    private String stepId_ = "";
    private ae50 selectedIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 userAnswers_ = AbstractC0269h.emptyProtobufList();

    static {
        StepAnswer stepAnswer = new StepAnswer();
        DEFAULT_INSTANCE = stepAnswer;
        AbstractC0269h.registerDefaultInstance(StepAnswer.class, stepAnswer);
    }

    private StepAnswer() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17518n(StepAnswer stepAnswer, Iterable iterable) {
        ae50 ae50Var = stepAnswer.selectedIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            stepAnswer.selectedIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, stepAnswer.selectedIds_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17519o(StepAnswer stepAnswer, Iterable iterable) {
        ae50 ae50Var = stepAnswer.userAnswers_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            stepAnswer.userAnswers_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, stepAnswer.userAnswers_);
    }

    /* JADX INFO: renamed from: p */
    public static void m17520p(StepAnswer stepAnswer, String str) {
        stepAnswer.getClass();
        str.getClass();
        stepAnswer.stepId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static r151 m17521q() {
        return (r151) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ț", new Object[]{"stepId_", "selectedIds_", "userAnswers_"});
        }
        if (iOrdinal == 3) {
            return new StepAnswer();
        }
        if (iOrdinal == 4) {
            return new r151(DEFAULT_INSTANCE);
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
        synchronized (StepAnswer.class) {
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
