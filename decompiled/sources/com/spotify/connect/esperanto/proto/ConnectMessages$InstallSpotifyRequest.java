package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cti;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectMessages$InstallSpotifyRequest extends AbstractC0269h implements sre0 {
    public static final int CONNECT_DEVICE_IDENTIFIER_FIELD_NUMBER = 1;
    private static final ConnectMessages$InstallSpotifyRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PORT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String connectDeviceIdentifier_ = "";
    private CommonMessages$LoggingParams loggingParams_;
    private int port_;

    static {
        ConnectMessages$InstallSpotifyRequest connectMessages$InstallSpotifyRequest = new ConnectMessages$InstallSpotifyRequest();
        DEFAULT_INSTANCE = connectMessages$InstallSpotifyRequest;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$InstallSpotifyRequest.class, connectMessages$InstallSpotifyRequest);
    }

    private ConnectMessages$InstallSpotifyRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7339n(ConnectMessages$InstallSpotifyRequest connectMessages$InstallSpotifyRequest, String str) {
        connectMessages$InstallSpotifyRequest.getClass();
        str.getClass();
        connectMessages$InstallSpotifyRequest.connectDeviceIdentifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7340o(ConnectMessages$InstallSpotifyRequest connectMessages$InstallSpotifyRequest, CommonMessages$LoggingParams commonMessages$LoggingParams) {
        connectMessages$InstallSpotifyRequest.getClass();
        connectMessages$InstallSpotifyRequest.loggingParams_ = commonMessages$LoggingParams;
        connectMessages$InstallSpotifyRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static cti m7341p() {
        return (cti) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဋ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "connectDeviceIdentifier_", "port_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$InstallSpotifyRequest();
        }
        if (iOrdinal == 4) {
            return new cti(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$InstallSpotifyRequest.class) {
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
