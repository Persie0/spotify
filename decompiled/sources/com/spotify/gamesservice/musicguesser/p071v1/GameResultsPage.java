package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GameResultsPage extends AbstractC0269h implements sre0 {
    private static final GameResultsPage DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    public static final int PAGE_ELEMENTS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RESULTS_FIELD_NUMBER = 2;
    public static final int STATS_FIELD_NUMBER = 4;
    private int bitField0_;
    private String gameId_ = "";
    private GameResultsPageElements pageElements_;
    private GameResults results_;
    private UserStats stats_;

    static {
        GameResultsPage gameResultsPage = new GameResultsPage();
        DEFAULT_INSTANCE = gameResultsPage;
        AbstractC0269h.registerDefaultInstance(GameResultsPage.class, gameResultsPage);
    }

    private GameResultsPage() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "gameId_", "results_", "pageElements_", "stats_"});
        }
        if (iOrdinal == 3) {
            return new GameResultsPage();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 6);
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
        synchronized (GameResultsPage.class) {
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
    public final String m11026n() {
        return this.gameId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final GameResultsPageElements m11027o() {
        GameResultsPageElements gameResultsPageElements = this.pageElements_;
        return gameResultsPageElements == null ? GameResultsPageElements.m11030q() : gameResultsPageElements;
    }

    /* JADX INFO: renamed from: p */
    public final GameResults m11028p() {
        GameResults gameResults = this.results_;
        return gameResults == null ? GameResults.m11019n() : gameResults;
    }

    /* JADX INFO: renamed from: q */
    public final UserStats m11029q() {
        UserStats userStats = this.stats_;
        return userStats == null ? UserStats.m11063n() : userStats;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
