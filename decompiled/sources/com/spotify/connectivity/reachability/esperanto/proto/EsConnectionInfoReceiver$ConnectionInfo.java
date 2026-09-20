package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bjw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsConnectionInfoReceiver$ConnectionInfo extends AbstractC0269h implements sre0 {
    public static final int CONNECTION_AVAILABILITY_FIELD_NUMBER = 3;
    public static final int CONNECTION_STATUS_FIELD_NUMBER = 2;
    private static final EsConnectionInfoReceiver$ConnectionInfo DEFAULT_INSTANCE;
    public static final int FORCED_OFFLINE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EsConnectionAvailability$ConnectionAvailability connectionAvailability_;
    private EsConnectionInfoReceiver$ConnectionStatus connectionStatus_;
    private boolean forcedOffline_;

    static {
        EsConnectionInfoReceiver$ConnectionInfo esConnectionInfoReceiver$ConnectionInfo = new EsConnectionInfoReceiver$ConnectionInfo();
        DEFAULT_INSTANCE = esConnectionInfoReceiver$ConnectionInfo;
        AbstractC0269h.registerDefaultInstance(EsConnectionInfoReceiver$ConnectionInfo.class, esConnectionInfoReceiver$ConnectionInfo);
    }

    private EsConnectionInfoReceiver$ConnectionInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7560n(EsConnectionInfoReceiver$ConnectionInfo esConnectionInfoReceiver$ConnectionInfo, EsConnectionAvailability$ConnectionAvailability esConnectionAvailability$ConnectionAvailability) {
        esConnectionInfoReceiver$ConnectionInfo.getClass();
        esConnectionAvailability$ConnectionAvailability.getClass();
        esConnectionInfoReceiver$ConnectionInfo.connectionAvailability_ = esConnectionAvailability$ConnectionAvailability;
        esConnectionInfoReceiver$ConnectionInfo.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m7561o(EsConnectionInfoReceiver$ConnectionInfo esConnectionInfoReceiver$ConnectionInfo, EsConnectionInfoReceiver$ConnectionStatus esConnectionInfoReceiver$ConnectionStatus) {
        esConnectionInfoReceiver$ConnectionInfo.getClass();
        esConnectionInfoReceiver$ConnectionStatus.getClass();
        esConnectionInfoReceiver$ConnectionInfo.connectionStatus_ = esConnectionInfoReceiver$ConnectionStatus;
        esConnectionInfoReceiver$ConnectionInfo.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m7562p(EsConnectionInfoReceiver$ConnectionInfo esConnectionInfoReceiver$ConnectionInfo, boolean z) {
        esConnectionInfoReceiver$ConnectionInfo.forcedOffline_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static bjw m7563r() {
        return (bjw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "forcedOffline_", "connectionStatus_", "connectionAvailability_"});
        }
        if (iOrdinal == 3) {
            return new EsConnectionInfoReceiver$ConnectionInfo();
        }
        if (iOrdinal == 4) {
            return new bjw(DEFAULT_INSTANCE);
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
        synchronized (EsConnectionInfoReceiver$ConnectionInfo.class) {
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

    /* JADX INFO: renamed from: q */
    public final boolean m7564q() {
        return this.forcedOffline_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
