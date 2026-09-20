package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p1v;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsReachabilityProvider$ReachabilityState extends AbstractC0269h implements sre0 {
    public static final int CONNECTION_AVAILABILITY_FIELD_NUMBER = 3;
    private static final EsReachabilityProvider$ReachabilityState DEFAULT_INSTANCE;
    public static final int NOT_REACHABLE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REACHABLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsConnectionAvailability$ConnectionAvailability connectionAvailability_;
    private int typeCase_ = 0;
    private Object type_;

    static {
        EsReachabilityProvider$ReachabilityState esReachabilityProvider$ReachabilityState = new EsReachabilityProvider$ReachabilityState();
        DEFAULT_INSTANCE = esReachabilityProvider$ReachabilityState;
        AbstractC0269h.registerDefaultInstance(EsReachabilityProvider$ReachabilityState.class, esReachabilityProvider$ReachabilityState);
    }

    private EsReachabilityProvider$ReachabilityState() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static EsReachabilityProvider$ReachabilityState m7587s(byte[] bArr) {
        return (EsReachabilityProvider$ReachabilityState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000", new Object[]{"type_", "typeCase_", "bitField0_", EsReachabilityProvider$Reachable.class, EsReachabilityProvider$NotReachable.class, "connectionAvailability_"});
        }
        if (iOrdinal == 3) {
            return new EsReachabilityProvider$ReachabilityState();
        }
        if (iOrdinal == 4) {
            return new vnw(0);
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
        synchronized (EsReachabilityProvider$ReachabilityState.class) {
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
    public final EsConnectionAvailability$ConnectionAvailability m7588o() {
        EsConnectionAvailability$ConnectionAvailability esConnectionAvailability$ConnectionAvailability = this.connectionAvailability_;
        return esConnectionAvailability$ConnectionAvailability == null ? EsConnectionAvailability$ConnectionAvailability.m7552q() : esConnectionAvailability$ConnectionAvailability;
    }

    /* JADX INFO: renamed from: p */
    public final EsReachabilityProvider$NotReachable m7589p() {
        return this.typeCase_ == 2 ? (EsReachabilityProvider$NotReachable) this.type_ : EsReachabilityProvider$NotReachable.m7584o();
    }

    /* JADX INFO: renamed from: q */
    public final EsReachabilityProvider$Reachable m7590q() {
        return this.typeCase_ == 1 ? (EsReachabilityProvider$Reachable) this.type_ : EsReachabilityProvider$Reachable.m7593p();
    }

    /* JADX INFO: renamed from: r */
    public final int m7591r() {
        return p1v.m68846c(this.typeCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
