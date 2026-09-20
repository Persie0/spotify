package com.spotify.quizaccessservice.p138v1;

import com.google.protobuf.AbstractC0269h;
import p204p.lyd;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class CheckUserQuizStateRequest extends AbstractC0269h implements sre0 {
    public static final int CHALLENGE_ID_FIELD_NUMBER = 2;
    private static final CheckUserQuizStateRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUIZ_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String quizUri_ = "";
    private String challengeId_ = "";

    static {
        CheckUserQuizStateRequest checkUserQuizStateRequest = new CheckUserQuizStateRequest();
        DEFAULT_INSTANCE = checkUserQuizStateRequest;
        AbstractC0269h.registerDefaultInstance(CheckUserQuizStateRequest.class, checkUserQuizStateRequest);
    }

    private CheckUserQuizStateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20024n(CheckUserQuizStateRequest checkUserQuizStateRequest, String str) {
        checkUserQuizStateRequest.getClass();
        str.getClass();
        checkUserQuizStateRequest.bitField0_ |= 1;
        checkUserQuizStateRequest.challengeId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m20025o(CheckUserQuizStateRequest checkUserQuizStateRequest, String str) {
        checkUserQuizStateRequest.getClass();
        str.getClass();
        checkUserQuizStateRequest.quizUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static lyd m20026p() {
        return (lyd) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "quizUri_", "challengeId_"});
        }
        if (iOrdinal == 3) {
            return new CheckUserQuizStateRequest();
        }
        if (iOrdinal == 4) {
            return new lyd(DEFAULT_INSTANCE);
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
        synchronized (CheckUserQuizStateRequest.class) {
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
