package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.c6l;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CreateGenerationRequest extends AbstractC0269h implements sre0 {
    public static final int ATTACHMENT_IDS_FIELD_NUMBER = 3;
    private static final CreateGenerationRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int SCHEDULE_FIELD_NUMBER = 4;
    public static final int STEP_ANSWERS_FIELD_NUMBER = 5;
    public static final int VOICE_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private Schedule schedule_;
    private String prompt_ = "";
    private String voiceId_ = "";
    private ae50 attachmentIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 stepAnswers_ = AbstractC0269h.emptyProtobufList();

    static {
        CreateGenerationRequest createGenerationRequest = new CreateGenerationRequest();
        DEFAULT_INSTANCE = createGenerationRequest;
        AbstractC0269h.registerDefaultInstance(CreateGenerationRequest.class, createGenerationRequest);
    }

    private CreateGenerationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17376n(CreateGenerationRequest createGenerationRequest, Iterable iterable) {
        ae50 ae50Var = createGenerationRequest.attachmentIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            createGenerationRequest.attachmentIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, createGenerationRequest.attachmentIds_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17377o(CreateGenerationRequest createGenerationRequest, ArrayList arrayList) {
        ae50 ae50Var = createGenerationRequest.stepAnswers_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            createGenerationRequest.stepAnswers_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, createGenerationRequest.stepAnswers_);
    }

    /* JADX INFO: renamed from: p */
    public static void m17378p(CreateGenerationRequest createGenerationRequest, String str) {
        createGenerationRequest.getClass();
        str.getClass();
        createGenerationRequest.prompt_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17379q(CreateGenerationRequest createGenerationRequest, Schedule schedule) {
        createGenerationRequest.getClass();
        createGenerationRequest.schedule_ = schedule;
        createGenerationRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m17380r(CreateGenerationRequest createGenerationRequest, String str) {
        createGenerationRequest.getClass();
        str.getClass();
        createGenerationRequest.voiceId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static c6l m17381s() {
        return (c6l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004ဉ\u0000\u0005\u001b", new Object[]{"bitField0_", "prompt_", "voiceId_", "attachmentIds_", "schedule_", "stepAnswers_", StepAnswer.class});
        }
        if (iOrdinal == 3) {
            return new CreateGenerationRequest();
        }
        if (iOrdinal == 4) {
            return new c6l(DEFAULT_INSTANCE);
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
        synchronized (CreateGenerationRequest.class) {
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
