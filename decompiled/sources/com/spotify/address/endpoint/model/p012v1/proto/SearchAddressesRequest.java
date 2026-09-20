package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uoy0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SearchAddressesRequest extends AbstractC0269h implements sre0 {
    private static final SearchAddressesRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 1;
    private String query_ = "";

    static {
        SearchAddressesRequest searchAddressesRequest = new SearchAddressesRequest();
        DEFAULT_INSTANCE = searchAddressesRequest;
        AbstractC0269h.registerDefaultInstance(SearchAddressesRequest.class, searchAddressesRequest);
    }

    private SearchAddressesRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2460n(SearchAddressesRequest searchAddressesRequest, String str) {
        searchAddressesRequest.getClass();
        str.getClass();
        searchAddressesRequest.query_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static uoy0 m2461p() {
        return (uoy0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"query_"});
        }
        if (iOrdinal == 3) {
            return new SearchAddressesRequest();
        }
        if (iOrdinal == 4) {
            return new uoy0(DEFAULT_INSTANCE);
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
        synchronized (SearchAddressesRequest.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m2462o() {
        return this.query_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
