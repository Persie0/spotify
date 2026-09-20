package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.er3;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.vlw;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsReachabilityProvider$NotReachable extends AbstractC0269h implements sre0 {
    private static final EsReachabilityProvider$NotReachable DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 1;
    private static final vd50 reasons_converter_ = new er3(11);
    private int reasonsMemoizedSerializedSize;
    private ud50 reasons_ = AbstractC0269h.emptyIntList();

    static {
        EsReachabilityProvider$NotReachable esReachabilityProvider$NotReachable = new EsReachabilityProvider$NotReachable();
        DEFAULT_INSTANCE = esReachabilityProvider$NotReachable;
        AbstractC0269h.registerDefaultInstance(EsReachabilityProvider$NotReachable.class, esReachabilityProvider$NotReachable);
    }

    private EsReachabilityProvider$NotReachable() {
    }

    /* JADX INFO: renamed from: o */
    public static EsReachabilityProvider$NotReachable m7584o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"reasons_"});
        }
        if (iOrdinal == 3) {
            return new EsReachabilityProvider$NotReachable();
        }
        if (iOrdinal == 4) {
            return new vlw(29);
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
        synchronized (EsReachabilityProvider$NotReachable.class) {
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

    /* JADX INFO: renamed from: p */
    public final List m7585p() {
        return new wd50(this.reasons_, reasons_converter_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
