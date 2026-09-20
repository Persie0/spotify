package com.spotify.recommendedsearches.p142v1;

import com.google.protobuf.AbstractC0269h;
import p204p.lgv0;
import p204p.mgv0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecommendedSearchesResult extends AbstractC0269h implements mgv0 {
    private static final RecommendedSearchesResult DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUGGESTION_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private String suggestion_ = "";
    private String uri_ = "";

    static {
        RecommendedSearchesResult recommendedSearchesResult = new RecommendedSearchesResult();
        DEFAULT_INSTANCE = recommendedSearchesResult;
        AbstractC0269h.registerDefaultInstance(RecommendedSearchesResult.class, recommendedSearchesResult);
    }

    private RecommendedSearchesResult() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // p204p.mgv0
    /* JADX INFO: renamed from: d */
    public final String mo20353d() {
        return this.suggestion_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"suggestion_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new RecommendedSearchesResult();
        }
        if (iOrdinal == 4) {
            return new lgv0(DEFAULT_INSTANCE);
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
        synchronized (RecommendedSearchesResult.class) {
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

    @Override // p204p.mgv0
    public final String getUri() {
        return this.uri_;
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
