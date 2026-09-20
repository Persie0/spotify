package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xlw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$ContextInfoPolicy extends AbstractC0269h implements sre0 {
    private static final EsOffline$ContextInfoPolicy DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean items_;

    static {
        EsOffline$ContextInfoPolicy esOffline$ContextInfoPolicy = new EsOffline$ContextInfoPolicy();
        DEFAULT_INSTANCE = esOffline$ContextInfoPolicy;
        AbstractC0269h.registerDefaultInstance(EsOffline$ContextInfoPolicy.class, esOffline$ContextInfoPolicy);
    }

    private EsOffline$ContextInfoPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16097n(EsOffline$ContextInfoPolicy esOffline$ContextInfoPolicy, boolean z) {
        esOffline$ContextInfoPolicy.items_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static xlw m16098o() {
        return (xlw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"items_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$ContextInfoPolicy();
        }
        if (iOrdinal == 4) {
            return new xlw(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$ContextInfoPolicy.class) {
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
