package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.m2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ValidateStepAnswerRequest extends AbstractC0269h implements sre0 {
    public static final int ANSWER_FIELD_NUMBER = 2;
    private static final ValidateStepAnswerRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STEP_ID_FIELD_NUMBER = 1;
    private String stepId_ = "";
    private String answer_ = "";

    static {
        ValidateStepAnswerRequest validateStepAnswerRequest = new ValidateStepAnswerRequest();
        DEFAULT_INSTANCE = validateStepAnswerRequest;
        AbstractC0269h.registerDefaultInstance(ValidateStepAnswerRequest.class, validateStepAnswerRequest);
    }

    private ValidateStepAnswerRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17542n(ValidateStepAnswerRequest validateStepAnswerRequest, String str) {
        validateStepAnswerRequest.getClass();
        str.getClass();
        validateStepAnswerRequest.answer_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m17543o(ValidateStepAnswerRequest validateStepAnswerRequest, String str) {
        validateStepAnswerRequest.getClass();
        str.getClass();
        validateStepAnswerRequest.stepId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static m2b1 m17544p() {
        return (m2b1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"stepId_", "answer_"});
        }
        if (iOrdinal == 3) {
            return new ValidateStepAnswerRequest();
        }
        if (iOrdinal == 4) {
            return new m2b1(DEFAULT_INSTANCE);
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
        synchronized (ValidateStepAnswerRequest.class) {
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
