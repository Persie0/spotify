package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kti;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectMessages$RemoveDeviceFromGroupRequest extends AbstractC0269h implements sre0 {
    public static final int CONNECT_DEVICE_IDENTIFIER_FIELD_NUMBER = 1;
    private static final ConnectMessages$RemoveDeviceFromGroupRequest DEFAULT_INSTANCE;
    public static final int GROUP_DEVICE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String connectDeviceIdentifier_ = "";
    private String groupDeviceIdentifier_ = "";
    private CommonMessages$LoggingParams loggingParams_;

    static {
        ConnectMessages$RemoveDeviceFromGroupRequest connectMessages$RemoveDeviceFromGroupRequest = new ConnectMessages$RemoveDeviceFromGroupRequest();
        DEFAULT_INSTANCE = connectMessages$RemoveDeviceFromGroupRequest;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$RemoveDeviceFromGroupRequest.class, connectMessages$RemoveDeviceFromGroupRequest);
    }

    private ConnectMessages$RemoveDeviceFromGroupRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7363n(ConnectMessages$RemoveDeviceFromGroupRequest connectMessages$RemoveDeviceFromGroupRequest, String str) {
        connectMessages$RemoveDeviceFromGroupRequest.getClass();
        str.getClass();
        connectMessages$RemoveDeviceFromGroupRequest.connectDeviceIdentifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7364o(ConnectMessages$RemoveDeviceFromGroupRequest connectMessages$RemoveDeviceFromGroupRequest, String str) {
        connectMessages$RemoveDeviceFromGroupRequest.getClass();
        str.getClass();
        connectMessages$RemoveDeviceFromGroupRequest.groupDeviceIdentifier_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static kti m7365p() {
        return (kti) DEFAULT_INSTANCE.createBuilder();
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
            return new ConnectMessages$RemoveDeviceFromGroupRequest();
        }
        if (iOrdinal == 4) {
            return new kti(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$RemoveDeviceFromGroupRequest.class) {
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
