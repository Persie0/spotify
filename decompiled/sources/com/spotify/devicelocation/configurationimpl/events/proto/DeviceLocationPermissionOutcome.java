package com.spotify.devicelocation.configurationimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u7r;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DeviceLocationPermissionOutcome extends AbstractC0269h implements sre0 {
    private static final DeviceLocationPermissionOutcome DEFAULT_INSTANCE;
    public static final int LOCATION_SERVICES_ENABLED_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_STATUS_FIELD_NUMBER = 1;
    public static final int PREVIOUS_STATUS_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean locationServicesEnabled_;
    private String permissionStatus_ = "";
    private String previousStatus_ = "";
    private String source_ = "";

    static {
        DeviceLocationPermissionOutcome deviceLocationPermissionOutcome = new DeviceLocationPermissionOutcome();
        DEFAULT_INSTANCE = deviceLocationPermissionOutcome;
        AbstractC0269h.registerDefaultInstance(DeviceLocationPermissionOutcome.class, deviceLocationPermissionOutcome);
    }

    private DeviceLocationPermissionOutcome() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9245n(DeviceLocationPermissionOutcome deviceLocationPermissionOutcome, boolean z) {
        deviceLocationPermissionOutcome.bitField0_ |= 4;
        deviceLocationPermissionOutcome.locationServicesEnabled_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m9246o(DeviceLocationPermissionOutcome deviceLocationPermissionOutcome, String str) {
        deviceLocationPermissionOutcome.getClass();
        str.getClass();
        deviceLocationPermissionOutcome.bitField0_ |= 1;
        deviceLocationPermissionOutcome.permissionStatus_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9247p(DeviceLocationPermissionOutcome deviceLocationPermissionOutcome, String str) {
        deviceLocationPermissionOutcome.getClass();
        str.getClass();
        deviceLocationPermissionOutcome.bitField0_ |= 2;
        deviceLocationPermissionOutcome.previousStatus_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9248q(DeviceLocationPermissionOutcome deviceLocationPermissionOutcome, String str) {
        deviceLocationPermissionOutcome.getClass();
        deviceLocationPermissionOutcome.bitField0_ |= 8;
        deviceLocationPermissionOutcome.source_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static u7r m9249r() {
        return (u7r) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "permissionStatus_", "previousStatus_", "locationServicesEnabled_", "source_"});
        }
        if (iOrdinal == 3) {
            return new DeviceLocationPermissionOutcome();
        }
        if (iOrdinal == 4) {
            return new u7r(DEFAULT_INSTANCE);
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
        synchronized (DeviceLocationPermissionOutcome.class) {
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
