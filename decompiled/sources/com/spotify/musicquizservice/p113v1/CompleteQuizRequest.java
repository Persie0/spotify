package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.ouf;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class CompleteQuizRequest extends AbstractC0269h implements sre0 {
    public static final int ANSWERS_FIELD_NUMBER = 3;
    public static final int CHALLENGE_ID_FIELD_NUMBER = 2;
    private static final CompleteQuizRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUIZ_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String quizUri_ = "";
    private String challengeId_ = "";
    private ae50 answers_ = AbstractC0269h.emptyProtobufList();

    static {
        CompleteQuizRequest completeQuizRequest = new CompleteQuizRequest();
        DEFAULT_INSTANCE = completeQuizRequest;
        AbstractC0269h.registerDefaultInstance(CompleteQuizRequest.class, completeQuizRequest);
    }

    private CompleteQuizRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15803n(CompleteQuizRequest completeQuizRequest, ArrayList arrayList) {
        ae50 ae50Var = completeQuizRequest.answers_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            completeQuizRequest.answers_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, completeQuizRequest.answers_);
    }

    /* JADX INFO: renamed from: o */
    public static void m15804o(CompleteQuizRequest completeQuizRequest, String str) {
        completeQuizRequest.getClass();
        str.getClass();
        completeQuizRequest.bitField0_ |= 1;
        completeQuizRequest.challengeId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m15805p(CompleteQuizRequest completeQuizRequest, String str) {
        completeQuizRequest.getClass();
        str.getClass();
        completeQuizRequest.quizUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ouf m15806q() {
        return (ouf) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u001b", new Object[]{"bitField0_", "quizUri_", "challengeId_", "answers_", ReportAnswer.class});
        }
        if (iOrdinal == 3) {
            return new CompleteQuizRequest();
        }
        if (iOrdinal == 4) {
            return new ouf(DEFAULT_INSTANCE);
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
        synchronized (CompleteQuizRequest.class) {
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
