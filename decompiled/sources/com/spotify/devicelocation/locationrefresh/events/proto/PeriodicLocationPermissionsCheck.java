package com.spotify.devicelocation.locationrefresh.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hmn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PeriodicLocationPermissionsCheck extends AbstractC0269h implements sre0 {
    private static final PeriodicLocationPermissionsCheck DEFAULT_INSTANCE;
    public static final int LOCATION_SERVICES_ENABLED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_STATUS_FIELD_NUMBER = 1;
    public static final int PRECISE_LOCATION_ENABLED_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean locationServicesEnabled_;
    private String permissionStatus_ = "";
    private boolean preciseLocationEnabled_;

    static {
        PeriodicLocationPermissionsCheck periodicLocationPermissionsCheck = new PeriodicLocationPermissionsCheck();
        DEFAULT_INSTANCE = periodicLocationPermissionsCheck;
        AbstractC0269h.registerDefaultInstance(PeriodicLocationPermissionsCheck.class, periodicLocationPermissionsCheck);
    }

    private PeriodicLocationPermissionsCheck() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9256n(PeriodicLocationPermissionsCheck periodicLocationPermissionsCheck, boolean z) {
        periodicLocationPermissionsCheck.bitField0_ |= 2;
        periodicLocationPermissionsCheck.locationServicesEnabled_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m9257o(PeriodicLocationPermissionsCheck periodicLocationPermissionsCheck, String str) {
        periodicLocationPermissionsCheck.getClass();
        periodicLocationPermissionsCheck.bitField0_ |= 1;
        periodicLocationPermissionsCheck.permissionStatus_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9258p(PeriodicLocationPermissionsCheck periodicLocationPermissionsCheck, boolean z) {
        periodicLocationPermissionsCheck.bitField0_ |= 4;
        periodicLocationPermissionsCheck.preciseLocationEnabled_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static hmn0 m9259q() {
        return (hmn0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "permissionStatus_", "locationServicesEnabled_", "preciseLocationEnabled_"});
        }
        if (iOrdinal == 3) {
            return new PeriodicLocationPermissionsCheck();
        }
        if (iOrdinal == 4) {
            return new hmn0(DEFAULT_INSTANCE);
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
        synchronized (PeriodicLocationPermissionsCheck.class) {
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
