package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p710;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class GetConcertsAtVenueNextPageRequest extends AbstractC0269h implements sre0 {
    private static final GetConcertsAtVenueNextPageRequest DEFAULT_INSTANCE;
    public static final int PAGINATION_TOKEN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int VENUE_URI_FIELD_NUMBER = 1;
    private String venueUri_ = "";
    private String paginationToken_ = "";

    static {
        GetConcertsAtVenueNextPageRequest getConcertsAtVenueNextPageRequest = new GetConcertsAtVenueNextPageRequest();
        DEFAULT_INSTANCE = getConcertsAtVenueNextPageRequest;
        AbstractC0269h.registerDefaultInstance(GetConcertsAtVenueNextPageRequest.class, getConcertsAtVenueNextPageRequest);
    }

    private GetConcertsAtVenueNextPageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22295n(GetConcertsAtVenueNextPageRequest getConcertsAtVenueNextPageRequest, String str) {
        getConcertsAtVenueNextPageRequest.getClass();
        str.getClass();
        getConcertsAtVenueNextPageRequest.paginationToken_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22296o(GetConcertsAtVenueNextPageRequest getConcertsAtVenueNextPageRequest, String str) {
        getConcertsAtVenueNextPageRequest.getClass();
        str.getClass();
        getConcertsAtVenueNextPageRequest.venueUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static p710 m22297p() {
        return (p710) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"venueUri_", "paginationToken_"});
        }
        if (iOrdinal == 3) {
            return new GetConcertsAtVenueNextPageRequest();
        }
        if (iOrdinal == 4) {
            return new p710(DEFAULT_INSTANCE);
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
        synchronized (GetConcertsAtVenueNextPageRequest.class) {
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
