package com.spotify.profile.socialgraphimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: renamed from: com.spotify.profile.socialgraphimpl.proto.ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse */
/* JADX INFO: loaded from: classes10.dex */
public final class C1243x1e185427 extends AbstractC0269h implements sre0 {
    public static final int CONTAINSRESULT_FIELD_NUMBER = 1;
    private static final C1243x1e185427 DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private boolean containsResult_;

    static {
        C1243x1e185427 c1243x1e185427 = new C1243x1e185427();
        DEFAULT_INSTANCE = c1243x1e185427;
        AbstractC0269h.registerDefaultInstance(C1243x1e185427.class, c1243x1e185427);
    }

    private C1243x1e185427() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"containsResult_"});
        }
        if (iOrdinal == 3) {
            return new C1243x1e185427();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 3);
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
        synchronized (C1243x1e185427.class) {
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
    public final boolean m19840n() {
        return this.containsResult_;
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
