package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class GetConcertsAtVenueNextPageResponse extends AbstractC0269h implements sre0 {
    private static final GetConcertsAtVenueNextPageResponse DEFAULT_INSTANCE;
    public static final int PAGINATION_TOKEN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ae50 rows_ = AbstractC0269h.emptyProtobufList();
    private String paginationToken_ = "";

    static {
        GetConcertsAtVenueNextPageResponse getConcertsAtVenueNextPageResponse = new GetConcertsAtVenueNextPageResponse();
        DEFAULT_INSTANCE = getConcertsAtVenueNextPageResponse;
        AbstractC0269h.registerDefaultInstance(GetConcertsAtVenueNextPageResponse.class, getConcertsAtVenueNextPageResponse);
    }

    private GetConcertsAtVenueNextPageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ለ\u0000", new Object[]{"bitField0_", "rows_", ContentRow.class, "paginationToken_"});
        }
        if (iOrdinal == 3) {
            return new GetConcertsAtVenueNextPageResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 16);
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
        synchronized (GetConcertsAtVenueNextPageResponse.class) {
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
    public final String m22298n() {
        return this.paginationToken_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m22299o() {
        return this.rows_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22300p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
