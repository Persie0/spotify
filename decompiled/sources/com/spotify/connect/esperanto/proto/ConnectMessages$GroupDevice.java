package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bti;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectMessages$GroupDevice extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 5;
    private static final ConnectMessages$GroupDevice DEFAULT_INSTANCE;
    public static final int GROUPING_STATUS_FIELD_NUMBER = 6;
    public static final int IDENTIFIERS_FIELD_NUMBER = 1;
    public static final int MODEL_DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int VOLUME_FIELD_NUMBER = 7;
    private int bitField0_;
    private ConnectMessages$GroupDeviceCapabilities capabilities_;
    private int groupingStatus_;
    private ConnectMessages$GroupDeviceIdentifiers identifiers_;
    private ConnectMessages$GroupDeviceVolume volume_;
    private String name_ = "";
    private String type_ = "";
    private String modelDisplayName_ = "";

    static {
        ConnectMessages$GroupDevice connectMessages$GroupDevice = new ConnectMessages$GroupDevice();
        DEFAULT_INSTANCE = connectMessages$GroupDevice;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$GroupDevice.class, connectMessages$GroupDevice);
    }

    private ConnectMessages$GroupDevice() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001\u0006\f\u0007ဉ\u0002", new Object[]{"bitField0_", "identifiers_", "name_", "type_", "modelDisplayName_", "capabilities_", "groupingStatus_", "volume_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$GroupDevice();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 15);
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
        synchronized (ConnectMessages$GroupDevice.class) {
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

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final ConnectMessages$GroupDeviceCapabilities m7318n() {
        ConnectMessages$GroupDeviceCapabilities connectMessages$GroupDeviceCapabilities = this.capabilities_;
        return connectMessages$GroupDeviceCapabilities == null ? ConnectMessages$GroupDeviceCapabilities.m7325n() : connectMessages$GroupDeviceCapabilities;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final bti m7319o() {
        bti btiVar;
        int i = this.groupingStatus_;
        if (i == 0) {
            btiVar = bti.UNKNOWN_GROUPING_STATUS;
        } else if (i == 1) {
            btiVar = bti.GROUPED;
        } else if (i != 2) {
            btiVar = i != 3 ? null : bti.GROUPING;
        } else {
            btiVar = bti.GROUPABLE;
        }
        return btiVar == null ? bti.UNRECOGNIZED : btiVar;
    }

    /* JADX INFO: renamed from: p */
    public final ConnectMessages$GroupDeviceIdentifiers m7320p() {
        ConnectMessages$GroupDeviceIdentifiers connectMessages$GroupDeviceIdentifiers = this.identifiers_;
        return connectMessages$GroupDeviceIdentifiers == null ? ConnectMessages$GroupDeviceIdentifiers.m7328p() : connectMessages$GroupDeviceIdentifiers;
    }

    /* JADX INFO: renamed from: q */
    public final String m7321q() {
        return this.modelDisplayName_;
    }

    /* JADX INFO: renamed from: r */
    public final String m7322r() {
        return this.type_;
    }

    /* JADX INFO: renamed from: s */
    public final ConnectMessages$GroupDeviceVolume m7323s() {
        ConnectMessages$GroupDeviceVolume connectMessages$GroupDeviceVolume = this.volume_;
        return connectMessages$GroupDeviceVolume == null ? ConnectMessages$GroupDeviceVolume.m7336n() : connectMessages$GroupDeviceVolume;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7324t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
