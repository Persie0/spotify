package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetGameResponse extends AbstractC0269h implements sre0 {
    private static final GetGameResponse DEFAULT_INSTANCE;
    public static final int GAME_FIELD_NUMBER = 2;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 3;
    public static final int PAGE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String gameId_ = "";
    private Game game_;
    private GameMetadata metadata_;
    private GamePageElements page_;

    static {
        GetGameResponse getGameResponse = new GetGameResponse();
        DEFAULT_INSTANCE = getGameResponse;
        AbstractC0269h.registerDefaultInstance(GetGameResponse.class, getGameResponse);
    }

    private GetGameResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "gameId_", "game_", "metadata_", "page_"});
        }
        if (iOrdinal == 3) {
            return new GetGameResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 10);
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
        synchronized (GetGameResponse.class) {
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
    public final Game m11051n() {
        Game game = this.game_;
        return game == null ? Game.m10997o() : game;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final GameMetadata m11052o() {
        GameMetadata gameMetadata = this.metadata_;
        return gameMetadata == null ? GameMetadata.m11005o() : gameMetadata;
    }

    /* JADX INFO: renamed from: p */
    public final GamePageElements m11053p() {
        GamePageElements gamePageElements = this.page_;
        return gamePageElements == null ? GamePageElements.m11011r() : gamePageElements;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
