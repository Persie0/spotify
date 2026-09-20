package com.spotify.libs.bluetooth.events.proto;

import android.os.Build;
import com.google.protobuf.AbstractC0269h;
import p204p.g3a;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class BluetoothMtuNegotiationResult extends AbstractC0269h implements sre0 {
    public static final int ANDROID_SDK_VERSION_FIELD_NUMBER = 5;
    public static final int CONNECTION_ID_HASH_FIELD_NUMBER = 1;
    private static final BluetoothMtuNegotiationResult DEFAULT_INSTANCE;
    public static final int DEVICE_MANUFACTURER_FIELD_NUMBER = 6;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
    public static final int GATT_STATUS_FIELD_NUMBER = 4;
    public static final int NEGOTIATED_MTU_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTED_MTU_FIELD_NUMBER = 2;
    private int androidSdkVersion_;
    private int bitField0_;
    private String connectionIdHash_ = "";
    private String deviceManufacturer_ = "";
    private String deviceModel_ = "";
    private int gattStatus_;
    private int negotiatedMtu_;
    private int requestedMtu_;

    static {
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult = new BluetoothMtuNegotiationResult();
        DEFAULT_INSTANCE = bluetoothMtuNegotiationResult;
        AbstractC0269h.registerDefaultInstance(BluetoothMtuNegotiationResult.class, bluetoothMtuNegotiationResult);
    }

    private BluetoothMtuNegotiationResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12615n(BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult, int i) {
        bluetoothMtuNegotiationResult.bitField0_ |= 16;
        bluetoothMtuNegotiationResult.androidSdkVersion_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m12616o(BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult, String str) {
        bluetoothMtuNegotiationResult.getClass();
        str.getClass();
        bluetoothMtuNegotiationResult.bitField0_ |= 1;
        bluetoothMtuNegotiationResult.connectionIdHash_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12617p(BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult) {
        String str = Build.MANUFACTURER;
        bluetoothMtuNegotiationResult.getClass();
        str.getClass();
        bluetoothMtuNegotiationResult.bitField0_ |= 32;
        bluetoothMtuNegotiationResult.deviceManufacturer_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12618q(BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult) {
        String str = Build.MODEL;
        bluetoothMtuNegotiationResult.getClass();
        str.getClass();
        bluetoothMtuNegotiationResult.bitField0_ |= 64;
        bluetoothMtuNegotiationResult.deviceModel_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12619r(BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult, int i) {
        bluetoothMtuNegotiationResult.bitField0_ |= 8;
        bluetoothMtuNegotiationResult.gattStatus_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m12620s(BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult, int i) {
        bluetoothMtuNegotiationResult.bitField0_ |= 4;
        bluetoothMtuNegotiationResult.negotiatedMtu_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m12621t(BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult, int i) {
        bluetoothMtuNegotiationResult.bitField0_ |= 2;
        bluetoothMtuNegotiationResult.requestedMtu_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static g3a m12622u() {
        return (g3a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "connectionIdHash_", "requestedMtu_", "negotiatedMtu_", "gattStatus_", "androidSdkVersion_", "deviceManufacturer_", "deviceModel_"});
        }
        if (iOrdinal == 3) {
            return new BluetoothMtuNegotiationResult();
        }
        if (iOrdinal == 4) {
            return new g3a(DEFAULT_INSTANCE);
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
        synchronized (BluetoothMtuNegotiationResult.class) {
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
