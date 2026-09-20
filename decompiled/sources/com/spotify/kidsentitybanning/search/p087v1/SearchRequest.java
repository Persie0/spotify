package com.spotify.kidsentitybanning.search.p087v1;

import com.google.protobuf.AbstractC0269h;
import p204p.kzy0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchRequest extends AbstractC0269h implements sre0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final SearchRequest DEFAULT_INSTANCE;
    public static final int PAGE_SIZE_FIELD_NUMBER = 3;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    private int bitField0_;
    private int pageSize_;
    private String childId_ = "";
    private String query_ = "";
    private String pageToken_ = "";

    static {
        SearchRequest searchRequest = new SearchRequest();
        DEFAULT_INSTANCE = searchRequest;
        AbstractC0269h.registerDefaultInstance(SearchRequest.class, searchRequest);
    }

    private SearchRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12196n(SearchRequest searchRequest, String str) {
        searchRequest.getClass();
        str.getClass();
        searchRequest.childId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12197o(SearchRequest searchRequest, int i) {
        searchRequest.bitField0_ |= 1;
        searchRequest.pageSize_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m12198p(SearchRequest searchRequest, String str) {
        searchRequest.getClass();
        searchRequest.bitField0_ |= 2;
        searchRequest.pageToken_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12199q(SearchRequest searchRequest, String str) {
        searchRequest.getClass();
        str.getClass();
        searchRequest.query_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static kzy0 m12200r() {
        return (kzy0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003င\u0000\u0004ለ\u0001", new Object[]{"bitField0_", "childId_", "query_", "pageSize_", "pageToken_"});
        }
        if (iOrdinal == 3) {
            return new SearchRequest();
        }
        if (iOrdinal == 4) {
            return new kzy0(DEFAULT_INSTANCE);
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
        synchronized (SearchRequest.class) {
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
