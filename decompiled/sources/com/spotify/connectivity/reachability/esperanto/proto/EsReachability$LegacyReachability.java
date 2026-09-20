package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tnw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsReachability$LegacyReachability extends AbstractC0269h implements sre0 {
    private static final EsReachability$LegacyReachability DEFAULT_INSTANCE;
    public static final int NOT_REACHABLE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REACHABLE_FIELD_NUMBER = 1;
    private int typeCase_ = 0;
    private Object type_;

    static {
        EsReachability$LegacyReachability esReachability$LegacyReachability = new EsReachability$LegacyReachability();
        DEFAULT_INSTANCE = esReachability$LegacyReachability;
        AbstractC0269h.registerDefaultInstance(EsReachability$LegacyReachability.class, esReachability$LegacyReachability);
    }

    private EsReachability$LegacyReachability() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7580n(EsReachability$LegacyReachability esReachability$LegacyReachability, EsNotReachable$LegacyNotReachable esNotReachable$LegacyNotReachable) {
        esReachability$LegacyReachability.getClass();
        esNotReachable$LegacyNotReachable.getClass();
        esReachability$LegacyReachability.type_ = esNotReachable$LegacyNotReachable;
        esReachability$LegacyReachability.typeCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m7581o(EsReachability$LegacyReachability esReachability$LegacyReachability, EsReachable$LegacyReachable esReachable$LegacyReachable) {
        esReachability$LegacyReachability.getClass();
        esReachable$LegacyReachable.getClass();
        esReachability$LegacyReachability.type_ = esReachable$LegacyReachable;
        esReachability$LegacyReachability.typeCase_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static tnw m7582p() {
        return (tnw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", EsReachable$LegacyReachable.class, EsNotReachable$LegacyNotReachable.class});
        }
        if (iOrdinal == 3) {
            return new EsReachability$LegacyReachability();
        }
        if (iOrdinal == 4) {
            return new tnw(DEFAULT_INSTANCE);
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
        synchronized (EsReachability$LegacyReachability.class) {
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
