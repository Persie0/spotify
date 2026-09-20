package com.spotify.stickers.p160v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchSurfaceStickersResponse extends AbstractC0269h implements sre0 {
    private static final SearchSurfaceStickersResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int PACKS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 packs_ = AbstractC0269h.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        SearchSurfaceStickersResponse searchSurfaceStickersResponse = new SearchSurfaceStickersResponse();
        DEFAULT_INSTANCE = searchSurfaceStickersResponse;
        AbstractC0269h.registerDefaultInstance(SearchSurfaceStickersResponse.class, searchSurfaceStickersResponse);
    }

    private SearchSurfaceStickersResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"packs_", StickerPack.class, "nextPageToken_"});
        }
        if (iOrdinal == 3) {
            return new SearchSurfaceStickersResponse();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 0);
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
        synchronized (SearchSurfaceStickersResponse.class) {
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

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m21592n() {
        return this.packs_;
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
