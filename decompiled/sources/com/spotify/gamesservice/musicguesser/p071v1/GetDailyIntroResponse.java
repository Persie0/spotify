package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gqa1;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetDailyIntroResponse extends AbstractC0269h implements sre0 {
    private static final GetDailyIntroResponse DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    public static final int PAGE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int USER_GAME_STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String gameId_ = "";
    private DailyIntro page_;
    private int userGameState_;

    static {
        GetDailyIntroResponse getDailyIntroResponse = new GetDailyIntroResponse();
        DEFAULT_INSTANCE = getDailyIntroResponse;
        AbstractC0269h.registerDefaultInstance(GetDailyIntroResponse.class, getDailyIntroResponse);
    }

    private GetDailyIntroResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "gameId_", "userGameState_", "page_"});
        }
        if (iOrdinal == 3) {
            return new GetDailyIntroResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 29);
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
        synchronized (GetDailyIntroResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m11048n() {
        return this.gameId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DailyIntro m11049o() {
        DailyIntro dailyIntro = this.page_;
        return dailyIntro == null ? DailyIntro.m10989q() : dailyIntro;
    }

    /* JADX INFO: renamed from: p */
    public final gqa1 m11050p() {
        gqa1 gqa1Var;
        int i = this.userGameState_;
        if (i == 0) {
            gqa1Var = gqa1.USER_GAME_STATE_UNSPECIFIED;
        } else if (i == 1) {
            gqa1Var = gqa1.USER_GAME_STATE_AVAILABLE_FIRST_GAME;
        } else if (i == 2) {
            gqa1Var = gqa1.USER_GAME_STATE_AVAILABLE;
        } else if (i != 3) {
            gqa1Var = i != 4 ? null : gqa1.USER_GAME_STATE_INELIGIBLE;
        } else {
            gqa1Var = gqa1.USER_GAME_STATE_COMPLETED;
        }
        return gqa1Var == null ? gqa1.UNRECOGNIZED : gqa1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
