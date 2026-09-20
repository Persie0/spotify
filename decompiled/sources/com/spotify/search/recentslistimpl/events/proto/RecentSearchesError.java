package com.spotify.search.recentslistimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.o1v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentSearchesError extends AbstractC0269h implements sre0 {
    private static final RecentSearchesError DEFAULT_INSTANCE;
    public static final int ENTITY_URI_TYPE_FIELD_NUMBER = 2;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
    public static final int OPERATION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String operation_ = "";
    private String entityUriType_ = "";
    private String errorMessage_ = "";

    static {
        RecentSearchesError recentSearchesError = new RecentSearchesError();
        DEFAULT_INSTANCE = recentSearchesError;
        AbstractC0269h.registerDefaultInstance(RecentSearchesError.class, recentSearchesError);
    }

    private RecentSearchesError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20722n(RecentSearchesError recentSearchesError, String str) {
        recentSearchesError.getClass();
        str.getClass();
        recentSearchesError.bitField0_ |= 2;
        recentSearchesError.entityUriType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m20723o(RecentSearchesError recentSearchesError, String str) {
        recentSearchesError.getClass();
        str.getClass();
        recentSearchesError.bitField0_ |= 4;
        recentSearchesError.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m20724p(RecentSearchesError recentSearchesError, String str) {
        recentSearchesError.getClass();
        str.getClass();
        recentSearchesError.bitField0_ |= 1;
        recentSearchesError.operation_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static o1v0 m20725q() {
        return (o1v0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "operation_", "entityUriType_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new RecentSearchesError();
        }
        if (iOrdinal == 4) {
            return new o1v0(DEFAULT_INSTANCE);
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
        synchronized (RecentSearchesError.class) {
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
