package com.spotify.artistfacts.p023v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetArtistFactsResponse extends AbstractC0269h implements sre0 {
    public static final int ARTIST_ID_FIELD_NUMBER = 1;
    private static final GetArtistFactsResponse DEFAULT_INSTANCE;
    public static final int FACTS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String artistId_ = "";
    private ae50 facts_ = AbstractC0269h.emptyProtobufList();

    static {
        GetArtistFactsResponse getArtistFactsResponse = new GetArtistFactsResponse();
        DEFAULT_INSTANCE = getArtistFactsResponse;
        AbstractC0269h.registerDefaultInstance(GetArtistFactsResponse.class, getArtistFactsResponse);
    }

    private GetArtistFactsResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static GetArtistFactsResponse m3319o(byte[] bArr) {
        return (GetArtistFactsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"artistId_", "facts_", ArtistFact.class});
        }
        if (iOrdinal == 3) {
            return new GetArtistFactsResponse();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 28);
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
        synchronized (GetArtistFactsResponse.class) {
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
    public final ae50 m3320n() {
        return this.facts_;
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
