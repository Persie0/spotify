package com.spotify.search.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g2l0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineSearchRequest extends AbstractC0269h implements sre0 {
    private static final OfflineSearchRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_CHAPTERS_FIELD_NUMBER = 3;
    public static final int LIMIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 1;
    private boolean includeChapters_;
    private int limit_;
    private String query_ = "";

    static {
        OfflineSearchRequest offlineSearchRequest = new OfflineSearchRequest();
        DEFAULT_INSTANCE = offlineSearchRequest;
        AbstractC0269h.registerDefaultInstance(OfflineSearchRequest.class, offlineSearchRequest);
    }

    private OfflineSearchRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20703n(OfflineSearchRequest offlineSearchRequest) {
        offlineSearchRequest.limit_ = 20;
    }

    /* JADX INFO: renamed from: o */
    public static void m20704o(OfflineSearchRequest offlineSearchRequest, String str) {
        offlineSearchRequest.getClass();
        str.getClass();
        offlineSearchRequest.query_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static g2l0 m20705p() {
        return (g2l0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0007", new Object[]{"query_", "limit_", "includeChapters_"});
        }
        if (iOrdinal == 3) {
            return new OfflineSearchRequest();
        }
        if (iOrdinal == 4) {
            return new g2l0(DEFAULT_INSTANCE);
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
        synchronized (OfflineSearchRequest.class) {
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
