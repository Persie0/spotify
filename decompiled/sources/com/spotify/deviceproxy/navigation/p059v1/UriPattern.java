package com.spotify.deviceproxy.navigation.p059v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yja1;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class UriPattern extends AbstractC0269h implements sre0 {
    private static final UriPattern DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 1;
    public static final int URI_TYPE_HASH_FIELD_NUMBER = 3;
    private long uriTypeHash_;
    private String pattern_ = "";
    private String description_ = "";

    static {
        UriPattern uriPattern = new UriPattern();
        DEFAULT_INSTANCE = uriPattern;
        AbstractC0269h.registerDefaultInstance(UriPattern.class, uriPattern);
    }

    private UriPattern() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9304n(UriPattern uriPattern, long j) {
        uriPattern.uriTypeHash_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static yja1 m9305o() {
        return (yja1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002", new Object[]{"pattern_", "description_", "uriTypeHash_"});
        }
        if (iOrdinal == 3) {
            return new UriPattern();
        }
        if (iOrdinal == 4) {
            return new yja1(DEFAULT_INSTANCE);
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
        synchronized (UriPattern.class) {
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
