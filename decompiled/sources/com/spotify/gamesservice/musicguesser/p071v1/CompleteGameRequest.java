package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.muf;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CompleteGameRequest extends AbstractC0269h implements sre0 {
    private static final CompleteGameRequest DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 2;
    private String gameId_ = "";
    private ae50 score_ = AbstractC0269h.emptyProtobufList();

    static {
        CompleteGameRequest completeGameRequest = new CompleteGameRequest();
        DEFAULT_INSTANCE = completeGameRequest;
        AbstractC0269h.registerDefaultInstance(CompleteGameRequest.class, completeGameRequest);
    }

    private CompleteGameRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10984n(CompleteGameRequest completeGameRequest, QuestionScore questionScore) {
        completeGameRequest.getClass();
        questionScore.getClass();
        ae50 ae50Var = completeGameRequest.score_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            completeGameRequest.score_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        completeGameRequest.score_.add(questionScore);
    }

    /* JADX INFO: renamed from: o */
    public static void m10985o(CompleteGameRequest completeGameRequest, String str) {
        completeGameRequest.getClass();
        str.getClass();
        completeGameRequest.gameId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static muf m10986q() {
        return (muf) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: r */
    public static CompleteGameRequest m10987r(byte[] bArr) {
        return (CompleteGameRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"gameId_", "score_", QuestionScore.class});
        }
        if (iOrdinal == 3) {
            return new CompleteGameRequest();
        }
        if (iOrdinal == 4) {
            return new muf(DEFAULT_INSTANCE);
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
        synchronized (CompleteGameRequest.class) {
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

    /* JADX INFO: renamed from: p */
    public final String m10988p() {
        return this.gameId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
