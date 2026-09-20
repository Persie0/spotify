package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vlw;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOffline$Device extends AbstractC0269h implements sre0 {
    public static final int CACHE_ID_FIELD_NUMBER = 2;
    public static final int CAPABILITIES_FIELD_NUMBER = 9;
    public static final int CLIENT_ID_FIELD_NUMBER = 8;
    private static final EsOffline$Device DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int IS_LOCAL_FIELD_NUMBER = 7;
    public static final int LAST_SEEN_AT_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int OFFLINE_ENABLED_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private EsOffline$Capabilities capabilities_;
    private boolean isLocal_;
    private Timestamp lastSeenAt_;
    private boolean offlineEnabled_;
    private int platform_;
    private int type_;
    private String deviceId_ = "";
    private String cacheId_ = "";
    private String name_ = "";
    private String clientId_ = "";

    static {
        EsOffline$Device esOffline$Device = new EsOffline$Device();
        DEFAULT_INSTANCE = esOffline$Device;
        AbstractC0269h.registerDefaultInstance(EsOffline$Device.class, esOffline$Device);
    }

    private EsOffline$Device() {
    }

    /* JADX INFO: renamed from: p */
    public static EsOffline$Device m16103p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0004\u0006ဉ\u0000\u0007\u0007\bȈ\tဉ\u0001\n\u0007", new Object[]{"bitField0_", "deviceId_", "cacheId_", "name_", "type_", "platform_", "lastSeenAt_", "isLocal_", "clientId_", "capabilities_", "offlineEnabled_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$Device();
        }
        if (iOrdinal == 4) {
            return new vlw(DEFAULT_INSTANCE, 5);
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
        synchronized (EsOffline$Device.class) {
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

    public final String getClientId() {
        return this.clientId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDeviceId() {
        return this.deviceId_;
    }

    public final boolean getIsLocal() {
        return this.isLocal_;
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16104n() {
        return this.cacheId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EsOffline$Capabilities m16105o() {
        EsOffline$Capabilities esOffline$Capabilities = this.capabilities_;
        return esOffline$Capabilities == null ? EsOffline$Capabilities.m16089n() : esOffline$Capabilities;
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m16106q() {
        Timestamp timestamp = this.lastSeenAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m16107r() {
        return this.offlineEnabled_;
    }

    /* JADX INFO: renamed from: s */
    public final int m16108s() {
        return this.platform_;
    }

    /* JADX INFO: renamed from: t */
    public final int m16109t() {
        return this.type_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
