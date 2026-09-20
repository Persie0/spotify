package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.iw3;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.vnw;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsReachabilityProvider$Reachable extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 2;
    private static final EsReachabilityProvider$Reachable DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private static final vd50 capabilities_converter_ = new iw3(11);
    private int bitField0_;
    private int capabilitiesMemoizedSerializedSize;
    private ud50 capabilities_ = AbstractC0269h.emptyIntList();
    private EsConnectionType$ConnectionType connectionType_;

    static {
        EsReachabilityProvider$Reachable esReachabilityProvider$Reachable = new EsReachabilityProvider$Reachable();
        DEFAULT_INSTANCE = esReachabilityProvider$Reachable;
        AbstractC0269h.registerDefaultInstance(EsReachabilityProvider$Reachable.class, esReachabilityProvider$Reachable);
    }

    private EsReachabilityProvider$Reachable() {
    }

    /* JADX INFO: renamed from: p */
    public static EsReachabilityProvider$Reachable m7593p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002ဉ\u0000", new Object[]{"bitField0_", "capabilities_", "connectionType_"});
        }
        if (iOrdinal == 3) {
            return new EsReachabilityProvider$Reachable();
        }
        if (iOrdinal == 4) {
            return new vnw(1);
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
        synchronized (EsReachabilityProvider$Reachable.class) {
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

    /* JADX INFO: renamed from: o */
    public final wd50 m7594o() {
        return new wd50(this.capabilities_, capabilities_converter_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
