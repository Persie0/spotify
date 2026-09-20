package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nti;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectMessages$StateRequest extends AbstractC0269h implements sre0 {
    private static final ConnectMessages$StateRequest DEFAULT_INSTANCE;
    public static final int EXCLUDE_NON_LOCAL_DEVICES_FIELD_NUMBER = 4;
    public static final int INCLUDE_LOCAL_DEVICE_FIELD_NUMBER = 3;
    public static final int INCLUDE_USER_MATCH_UNAUTHENTICATED_DEVICES_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_OFFLINE_AMAZON_DEVICES_AS_ONLINE_FIELD_NUMBER = 2;
    public static final int SHOW_OFFLINE_DEVICES_IN_CORE_FIELD_NUMBER = 1;
    private boolean excludeNonLocalDevices_;
    private boolean includeLocalDevice_;
    private boolean includeUserMatchUnauthenticatedDevices_;
    private boolean showOfflineAmazonDevicesAsOnline_;
    private boolean showOfflineDevicesInCore_;

    static {
        ConnectMessages$StateRequest connectMessages$StateRequest = new ConnectMessages$StateRequest();
        DEFAULT_INSTANCE = connectMessages$StateRequest;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$StateRequest.class, connectMessages$StateRequest);
    }

    private ConnectMessages$StateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7372n(ConnectMessages$StateRequest connectMessages$StateRequest, boolean z) {
        connectMessages$StateRequest.excludeNonLocalDevices_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m7373o(ConnectMessages$StateRequest connectMessages$StateRequest) {
        connectMessages$StateRequest.includeLocalDevice_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m7374p(ConnectMessages$StateRequest connectMessages$StateRequest, boolean z) {
        connectMessages$StateRequest.includeUserMatchUnauthenticatedDevices_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m7375q(ConnectMessages$StateRequest connectMessages$StateRequest, boolean z) {
        connectMessages$StateRequest.showOfflineAmazonDevicesAsOnline_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m7376r(ConnectMessages$StateRequest connectMessages$StateRequest, boolean z) {
        connectMessages$StateRequest.showOfflineDevicesInCore_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static nti m7377s() {
        return (nti) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"showOfflineDevicesInCore_", "showOfflineAmazonDevicesAsOnline_", "includeLocalDevice_", "excludeNonLocalDevices_", "includeUserMatchUnauthenticatedDevices_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$StateRequest();
        }
        if (iOrdinal == 4) {
            return new nti(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$StateRequest.class) {
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
