package com.spotify.contexts;

import android.os.Build;
import android.util.DisplayMetrics;
import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.k5r;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceAndroid extends AbstractC0269h implements sre0 {
    public static final int ANDROID_ID_FIELD_NUMBER = 5;
    private static final DeviceAndroid DEFAULT_INSTANCE;
    public static final int HAS_FEATURE_AUTOMOTIVE_FIELD_NUMBER = 12;
    public static final int HAS_FEATURE_WATCH_FIELD_NUMBER = 13;
    public static final int HINGE_SENSOR_ANGLE_FIELD_NUMBER = 11;
    public static final int MANUFACTURER_FIELD_NUMBER = 1;
    public static final int MODEL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int RELEASE_FIELD_NUMBER = 3;
    public static final int SCREEN_DENSITY_CURRENT_FIELD_NUMBER = 9;
    public static final int SCREEN_DENSITY_STABLE_FIELD_NUMBER = 8;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 7;
    public static final int SCREEN_SMALLEST_WIDTH_DP_FIELD_NUMBER = 10;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 6;
    public static final int SDK_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean hasFeatureAutomotive_;
    private boolean hasFeatureWatch_;
    private float hingeSensorAngle_;
    private int screenDensityCurrent_;
    private int screenDensityStable_;
    private int screenHeight_;
    private int screenSmallestWidthDp_;
    private int screenWidth_;
    private int sdk_;
    private String manufacturer_ = "";
    private String model_ = "";
    private String release_ = "";
    private String androidId_ = "";

    static {
        DeviceAndroid deviceAndroid = new DeviceAndroid();
        DEFAULT_INSTANCE = deviceAndroid;
        AbstractC0269h.registerDefaultInstance(DeviceAndroid.class, deviceAndroid);
    }

    private DeviceAndroid() {
    }

    /* JADX INFO: renamed from: B */
    public static k5r m8002B() {
        return (k5r) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: C */
    public static DeviceAndroid m8003C(gva gvaVar) {
        return (DeviceAndroid) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m8004n(DeviceAndroid deviceAndroid, String str) {
        deviceAndroid.getClass();
        deviceAndroid.bitField0_ |= 16;
        deviceAndroid.androidId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m8005o(DeviceAndroid deviceAndroid, boolean z) {
        deviceAndroid.bitField0_ |= 2048;
        deviceAndroid.hasFeatureAutomotive_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m8006p(DeviceAndroid deviceAndroid, boolean z) {
        deviceAndroid.bitField0_ |= 4096;
        deviceAndroid.hasFeatureWatch_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m8007q(DeviceAndroid deviceAndroid, float f) {
        deviceAndroid.bitField0_ |= 1024;
        deviceAndroid.hingeSensorAngle_ = f;
    }

    /* JADX INFO: renamed from: r */
    public static void m8008r(DeviceAndroid deviceAndroid) {
        String str = Build.MANUFACTURER;
        deviceAndroid.getClass();
        str.getClass();
        deviceAndroid.bitField0_ |= 1;
        deviceAndroid.manufacturer_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m8009s(DeviceAndroid deviceAndroid) {
        String str = Build.MODEL;
        deviceAndroid.getClass();
        str.getClass();
        deviceAndroid.bitField0_ |= 2;
        deviceAndroid.model_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m8010t(DeviceAndroid deviceAndroid) {
        String str = Build.VERSION.RELEASE;
        deviceAndroid.getClass();
        str.getClass();
        deviceAndroid.bitField0_ |= 4;
        deviceAndroid.release_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m8011u(DeviceAndroid deviceAndroid, int i) {
        deviceAndroid.bitField0_ |= 256;
        deviceAndroid.screenDensityCurrent_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m8012v(DeviceAndroid deviceAndroid) {
        int i = DisplayMetrics.DENSITY_DEVICE_STABLE;
        deviceAndroid.bitField0_ |= 128;
        deviceAndroid.screenDensityStable_ = i;
    }

    /* JADX INFO: renamed from: w */
    public static void m8013w(DeviceAndroid deviceAndroid, int i) {
        deviceAndroid.bitField0_ |= 64;
        deviceAndroid.screenHeight_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m8014x(DeviceAndroid deviceAndroid, int i) {
        deviceAndroid.bitField0_ |= 512;
        deviceAndroid.screenSmallestWidthDp_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static void m8015y(DeviceAndroid deviceAndroid, int i) {
        deviceAndroid.bitField0_ |= 32;
        deviceAndroid.screenWidth_ = i;
    }

    /* JADX INFO: renamed from: z */
    public static void m8016z(DeviceAndroid deviceAndroid, int i) {
        deviceAndroid.bitField0_ |= 8;
        deviceAndroid.sdk_ = i;
    }

    /* JADX INFO: renamed from: A */
    public final String m8017A() {
        return this.androidId_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bခ\n\fဇ\u000b\rဇ\f", new Object[]{"bitField0_", "manufacturer_", "model_", "release_", "sdk_", "androidId_", "screenWidth_", "screenHeight_", "screenDensityStable_", "screenDensityCurrent_", "screenSmallestWidthDp_", "hingeSensorAngle_", "hasFeatureAutomotive_", "hasFeatureWatch_"});
        }
        if (iOrdinal == 3) {
            return new DeviceAndroid();
        }
        if (iOrdinal == 4) {
            return new k5r(DEFAULT_INSTANCE);
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
        synchronized (DeviceAndroid.class) {
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
