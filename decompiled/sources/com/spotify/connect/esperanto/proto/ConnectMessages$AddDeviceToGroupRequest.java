package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zsi;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectMessages$AddDeviceToGroupRequest extends AbstractC0269h implements sre0 {
    public static final int CONNECT_DEVICE_IDENTIFIER_FIELD_NUMBER = 1;
    private static final ConnectMessages$AddDeviceToGroupRequest DEFAULT_INSTANCE;
    public static final int GROUP_DEVICE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String connectDeviceIdentifier_ = "";
    private String groupDeviceIdentifier_ = "";
    private CommonMessages$LoggingParams loggingParams_;

    static {
        ConnectMessages$AddDeviceToGroupRequest connectMessages$AddDeviceToGroupRequest = new ConnectMessages$AddDeviceToGroupRequest();
        DEFAULT_INSTANCE = connectMessages$AddDeviceToGroupRequest;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$AddDeviceToGroupRequest.class, connectMessages$AddDeviceToGroupRequest);
    }

    private ConnectMessages$AddDeviceToGroupRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7303n(ConnectMessages$AddDeviceToGroupRequest connectMessages$AddDeviceToGroupRequest, String str) {
        connectMessages$AddDeviceToGroupRequest.getClass();
        str.getClass();
        connectMessages$AddDeviceToGroupRequest.connectDeviceIdentifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7304o(ConnectMessages$AddDeviceToGroupRequest connectMessages$AddDeviceToGroupRequest, String str) {
        connectMessages$AddDeviceToGroupRequest.getClass();
        str.getClass();
        connectMessages$AddDeviceToGroupRequest.groupDeviceIdentifier_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static zsi m7305p() {
        return (zsi) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "connectDeviceIdentifier_", "groupDeviceIdentifier_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$AddDeviceToGroupRequest();
        }
        if (iOrdinal == 4) {
            return new zsi(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$AddDeviceToGroupRequest.class) {
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
