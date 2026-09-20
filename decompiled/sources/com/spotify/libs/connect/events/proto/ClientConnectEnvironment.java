package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pje;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientConnectEnvironment extends AbstractC0269h implements sre0 {
    private static final ClientConnectEnvironment DEFAULT_INSTANCE;
    public static final int LOCAL_DEVICE_ID_FIELD_NUMBER = 1;
    public static final int LOCAL_TIME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TIMEZONE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String localDeviceId_ = "";
    private String localTime_ = "";
    private String timezone_ = "";

    static {
        ClientConnectEnvironment clientConnectEnvironment = new ClientConnectEnvironment();
        DEFAULT_INSTANCE = clientConnectEnvironment;
        AbstractC0269h.registerDefaultInstance(ClientConnectEnvironment.class, clientConnectEnvironment);
    }

    private ClientConnectEnvironment() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12682n(ClientConnectEnvironment clientConnectEnvironment, String str) {
        clientConnectEnvironment.getClass();
        str.getClass();
        clientConnectEnvironment.bitField0_ |= 1;
        clientConnectEnvironment.localDeviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12683o(ClientConnectEnvironment clientConnectEnvironment, String str) {
        clientConnectEnvironment.getClass();
        str.getClass();
        clientConnectEnvironment.bitField0_ |= 2;
        clientConnectEnvironment.localTime_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12684p(ClientConnectEnvironment clientConnectEnvironment, String str) {
        clientConnectEnvironment.getClass();
        str.getClass();
        clientConnectEnvironment.bitField0_ |= 4;
        clientConnectEnvironment.timezone_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static pje m12685q() {
        return (pje) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "localDeviceId_", "localTime_", "timezone_"});
        }
        if (iOrdinal == 3) {
            return new ClientConnectEnvironment();
        }
        if (iOrdinal == 4) {
            return new pje(DEFAULT_INSTANCE);
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
        synchronized (ClientConnectEnvironment.class) {
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
