package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Iterator;
import p204p.AbstractC1733c9;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wnw;
import p204p.z110;
import p204p.zhi0;

/* JADX INFO: loaded from: classes.dex */
public final class EsReachable$LegacyReachable extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    private static final EsReachable$LegacyReachable DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private static final vd50 capabilities_converter_ = new zhi0(26);
    private int capabilitiesMemoizedSerializedSize;
    private ud50 capabilities_ = AbstractC0269h.emptyIntList();

    static {
        EsReachable$LegacyReachable esReachable$LegacyReachable = new EsReachable$LegacyReachable();
        DEFAULT_INSTANCE = esReachable$LegacyReachable;
        AbstractC0269h.registerDefaultInstance(EsReachable$LegacyReachable.class, esReachable$LegacyReachable);
    }

    private EsReachable$LegacyReachable() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m7595n(EsReachable$LegacyReachable esReachable$LegacyReachable, Iterable iterable) {
        ud50 ud50Var = esReachable$LegacyReachable.capabilities_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            esReachable$LegacyReachable.capabilities_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((n350) esReachable$LegacyReachable.capabilities_).m63581b(((Integer) it.next()).intValue());
        }
    }

    /* JADX INFO: renamed from: o */
    public static wnw m7596o() {
        return (wnw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"capabilities_"});
        }
        if (iOrdinal == 3) {
            return new EsReachable$LegacyReachable();
        }
        if (iOrdinal == 4) {
            return new wnw(DEFAULT_INSTANCE);
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
        synchronized (EsReachable$LegacyReachable.class) {
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
