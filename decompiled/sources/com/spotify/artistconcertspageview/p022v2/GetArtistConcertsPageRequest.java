package com.spotify.artistconcertspageview.p022v2;

import com.google.protobuf.AbstractC0269h;
import p204p.o610;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetArtistConcertsPageRequest extends AbstractC0269h implements sre0 {
    public static final int ARTIST_URI_FIELD_NUMBER = 1;
    private static final GetArtistConcertsPageRequest DEFAULT_INSTANCE;
    public static final int GEONAME_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String artistUri_ = "";
    private String geonameId_ = "";

    static {
        GetArtistConcertsPageRequest getArtistConcertsPageRequest = new GetArtistConcertsPageRequest();
        DEFAULT_INSTANCE = getArtistConcertsPageRequest;
        AbstractC0269h.registerDefaultInstance(GetArtistConcertsPageRequest.class, getArtistConcertsPageRequest);
    }

    private GetArtistConcertsPageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3299n(GetArtistConcertsPageRequest getArtistConcertsPageRequest, String str) {
        getArtistConcertsPageRequest.getClass();
        getArtistConcertsPageRequest.artistUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static o610 m3300o() {
        return (o610) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "artistUri_", "geonameId_"});
        }
        if (iOrdinal == 3) {
            return new GetArtistConcertsPageRequest();
        }
        if (iOrdinal == 4) {
            return new o610(DEFAULT_INSTANCE);
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
        synchronized (GetArtistConcertsPageRequest.class) {
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
