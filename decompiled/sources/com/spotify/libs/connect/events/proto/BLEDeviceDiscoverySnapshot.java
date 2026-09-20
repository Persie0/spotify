package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.eg8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class BLEDeviceDiscoverySnapshot extends AbstractC0269h implements sre0 {
    public static final int BLE_DEVICE_ID_FIELD_NUMBER = 2;
    public static final int CAPABILITIES_FIELD_NUMBER = 6;
    public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 7;
    private static final BLEDeviceDiscoverySnapshot DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
    public static final int LOCAL_TIME_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 5;
    public static final int REASON_FIELD_NUMBER = 8;
    public static final int RSSI_FIELD_NUMBER = 4;
    public static final int SNAPSHOT_ID_FIELD_NUMBER = 1;
    public static final int TIMEZONE_FIELD_NUMBER = 10;
    private int bitField0_;
    private int capabilities_;
    private int rssi_;
    private String snapshotId_ = "";
    private String bleDeviceId_ = "";
    private String deviceType_ = "";
    private String range_ = "";
    private String connectStateIdentifier_ = "";
    private String reason_ = "";
    private String localTime_ = "";
    private String timezone_ = "";

    static {
        BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot = new BLEDeviceDiscoverySnapshot();
        DEFAULT_INSTANCE = bLEDeviceDiscoverySnapshot;
        AbstractC0269h.registerDefaultInstance(BLEDeviceDiscoverySnapshot.class, bLEDeviceDiscoverySnapshot);
    }

    private BLEDeviceDiscoverySnapshot() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12661n(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, String str) {
        bLEDeviceDiscoverySnapshot.getClass();
        str.getClass();
        bLEDeviceDiscoverySnapshot.bitField0_ |= 2;
        bLEDeviceDiscoverySnapshot.bleDeviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12662o(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, int i) {
        bLEDeviceDiscoverySnapshot.bitField0_ |= 32;
        bLEDeviceDiscoverySnapshot.capabilities_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m12663p(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, String str) {
        bLEDeviceDiscoverySnapshot.getClass();
        str.getClass();
        bLEDeviceDiscoverySnapshot.bitField0_ |= 64;
        bLEDeviceDiscoverySnapshot.connectStateIdentifier_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12664q(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, String str) {
        bLEDeviceDiscoverySnapshot.getClass();
        str.getClass();
        bLEDeviceDiscoverySnapshot.bitField0_ |= 4;
        bLEDeviceDiscoverySnapshot.deviceType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12665r(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, String str) {
        bLEDeviceDiscoverySnapshot.getClass();
        str.getClass();
        bLEDeviceDiscoverySnapshot.bitField0_ |= 256;
        bLEDeviceDiscoverySnapshot.localTime_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12666s(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, String str) {
        bLEDeviceDiscoverySnapshot.getClass();
        str.getClass();
        bLEDeviceDiscoverySnapshot.bitField0_ |= 16;
        bLEDeviceDiscoverySnapshot.range_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m12667t(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, String str) {
        bLEDeviceDiscoverySnapshot.getClass();
        bLEDeviceDiscoverySnapshot.bitField0_ |= 128;
        bLEDeviceDiscoverySnapshot.reason_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m12668u(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, int i) {
        bLEDeviceDiscoverySnapshot.bitField0_ |= 8;
        bLEDeviceDiscoverySnapshot.rssi_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m12669v(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, String str) {
        bLEDeviceDiscoverySnapshot.getClass();
        str.getClass();
        bLEDeviceDiscoverySnapshot.bitField0_ |= 1;
        bLEDeviceDiscoverySnapshot.snapshotId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m12670w(BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshot, String str) {
        bLEDeviceDiscoverySnapshot.getClass();
        str.getClass();
        bLEDeviceDiscoverySnapshot.bitField0_ |= 512;
        bLEDeviceDiscoverySnapshot.timezone_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static eg8 m12671x() {
        return (eg8) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "snapshotId_", "bleDeviceId_", "deviceType_", "rssi_", "range_", "capabilities_", "connectStateIdentifier_", "reason_", "localTime_", "timezone_"});
        }
        if (iOrdinal == 3) {
            return new BLEDeviceDiscoverySnapshot();
        }
        if (iOrdinal == 4) {
            return new eg8(DEFAULT_INSTANCE);
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
        synchronized (BLEDeviceDiscoverySnapshot.class) {
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
