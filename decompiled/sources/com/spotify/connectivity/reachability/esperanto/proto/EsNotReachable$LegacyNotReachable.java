package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ulw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsNotReachable$LegacyNotReachable extends AbstractC0269h implements sre0 {
    private static final EsNotReachable$LegacyNotReachable DEFAULT_INSTANCE;
    public static final int FORCED_OFFLINE_FIELD_NUMBER = 1;
    public static final int NO_INTERNET_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int typeCase_ = 0;
    private Object type_;

    static {
        EsNotReachable$LegacyNotReachable esNotReachable$LegacyNotReachable = new EsNotReachable$LegacyNotReachable();
        DEFAULT_INSTANCE = esNotReachable$LegacyNotReachable;
        AbstractC0269h.registerDefaultInstance(EsNotReachable$LegacyNotReachable.class, esNotReachable$LegacyNotReachable);
    }

    private EsNotReachable$LegacyNotReachable() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7577n(EsNotReachable$LegacyNotReachable esNotReachable$LegacyNotReachable, EsNotReachable$LegacyForcedOffline esNotReachable$LegacyForcedOffline) {
        esNotReachable$LegacyNotReachable.getClass();
        esNotReachable$LegacyForcedOffline.getClass();
        esNotReachable$LegacyNotReachable.type_ = esNotReachable$LegacyForcedOffline;
        esNotReachable$LegacyNotReachable.typeCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m7578o(EsNotReachable$LegacyNotReachable esNotReachable$LegacyNotReachable, EsNotReachable$LegacyNoInternet esNotReachable$LegacyNoInternet) {
        esNotReachable$LegacyNotReachable.getClass();
        esNotReachable$LegacyNoInternet.getClass();
        esNotReachable$LegacyNotReachable.type_ = esNotReachable$LegacyNoInternet;
        esNotReachable$LegacyNotReachable.typeCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static ulw m7579p() {
        return (ulw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", EsNotReachable$LegacyForcedOffline.class, EsNotReachable$LegacyNoInternet.class});
        }
        if (iOrdinal == 3) {
            return new EsNotReachable$LegacyNotReachable();
        }
        if (iOrdinal == 4) {
            return new ulw(DEFAULT_INSTANCE);
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
        synchronized (EsNotReachable$LegacyNotReachable.class) {
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
