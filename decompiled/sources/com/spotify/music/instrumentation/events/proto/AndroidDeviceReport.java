package com.spotify.music.instrumentation.events.proto;

import android.os.Build;
import com.google.protobuf.AbstractC0269h;
import p204p.c24;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidDeviceReport extends AbstractC0269h implements sre0 {
    public static final int BRAND_FIELD_NUMBER = 13;
    public static final int CPU_FAMILY_FIELD_NUMBER = 11;
    public static final int CPU_FEATURES_FIELD_NUMBER = 10;
    private static final AndroidDeviceReport DEFAULT_INSTANCE;
    public static final int FB_YEARCLASS_FIELD_NUMBER = 9;
    public static final int FIRMWARE_FIELD_NUMBER = 2;
    public static final int GPU_MODEL_FIELD_NUMBER = 16;
    public static final int GPU_VENDOR_FIELD_NUMBER = 15;
    public static final int MANUFACTURER_FIELD_NUMBER = 1;
    public static final int MAX_FREQ_FIELD_NUMBER = 4;
    public static final int MEMORY_FIELD_NUMBER = 5;
    public static final int MODEL_FIELD_NUMBER = 12;
    public static final int NUM_PROCESSORS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERFORMANCE_CLASS_FIELD_NUMBER = 14;
    public static final int SCREEN_DENSITY_DPI_FIELD_NUMBER = 19;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 8;
    public static final int SCREEN_SIZE_FIELD_NUMBER = 6;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 7;
    public static final int SOC_MANUFACTURER_FIELD_NUMBER = 17;
    public static final int SOC_MODEL_FIELD_NUMBER = 18;
    private int bitField0_;
    private long cpuFamily_;
    private long cpuFeatures_;
    private long fbYearclass_;
    private long maxFreq_;
    private long memory_;
    private long numProcessors_;
    private long performanceClass_;
    private long screenDensityDpi_;
    private long screenHeight_;
    private float screenSize_;
    private long screenWidth_;
    private String manufacturer_ = "";
    private String firmware_ = "";
    private String model_ = "";
    private String brand_ = "";
    private String gpuVendor_ = "";
    private String gpuModel_ = "";
    private String socManufacturer_ = "";
    private String socModel_ = "";

    static {
        AndroidDeviceReport androidDeviceReport = new AndroidDeviceReport();
        DEFAULT_INSTANCE = androidDeviceReport;
        AbstractC0269h.registerDefaultInstance(AndroidDeviceReport.class, androidDeviceReport);
    }

    private AndroidDeviceReport() {
    }

    /* JADX INFO: renamed from: A */
    public static void m15695A(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 262144;
        androidDeviceReport.screenDensityDpi_ = j;
    }

    /* JADX INFO: renamed from: B */
    public static void m15696B(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 128;
        androidDeviceReport.screenHeight_ = j;
    }

    /* JADX INFO: renamed from: C */
    public static void m15697C(AndroidDeviceReport androidDeviceReport, float f) {
        androidDeviceReport.bitField0_ |= 32;
        androidDeviceReport.screenSize_ = f;
    }

    /* JADX INFO: renamed from: D */
    public static void m15698D(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 64;
        androidDeviceReport.screenWidth_ = j;
    }

    /* JADX INFO: renamed from: E */
    public static void m15699E(AndroidDeviceReport androidDeviceReport, String str) {
        androidDeviceReport.getClass();
        androidDeviceReport.bitField0_ |= 65536;
        androidDeviceReport.socManufacturer_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m15700F(AndroidDeviceReport androidDeviceReport, String str) {
        androidDeviceReport.getClass();
        androidDeviceReport.bitField0_ |= 131072;
        androidDeviceReport.socModel_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static c24 m15701G() {
        return (c24) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m15702n(AndroidDeviceReport androidDeviceReport) {
        String str = Build.BRAND;
        androidDeviceReport.getClass();
        str.getClass();
        androidDeviceReport.bitField0_ |= 4096;
        androidDeviceReport.brand_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15703o(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 1024;
        androidDeviceReport.cpuFamily_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m15704p(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 512;
        androidDeviceReport.cpuFeatures_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m15705q(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 256;
        androidDeviceReport.fbYearclass_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m15706r(AndroidDeviceReport androidDeviceReport) {
        String str = Build.DISPLAY;
        androidDeviceReport.getClass();
        str.getClass();
        androidDeviceReport.bitField0_ |= 2;
        androidDeviceReport.firmware_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m15707s(AndroidDeviceReport androidDeviceReport, String str) {
        androidDeviceReport.getClass();
        androidDeviceReport.bitField0_ |= 32768;
        androidDeviceReport.gpuModel_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m15708t(AndroidDeviceReport androidDeviceReport, String str) {
        androidDeviceReport.getClass();
        androidDeviceReport.bitField0_ |= 16384;
        androidDeviceReport.gpuVendor_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m15709u(AndroidDeviceReport androidDeviceReport) {
        String str = Build.MANUFACTURER;
        androidDeviceReport.getClass();
        str.getClass();
        androidDeviceReport.bitField0_ |= 1;
        androidDeviceReport.manufacturer_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m15710v(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 8;
        androidDeviceReport.maxFreq_ = j;
    }

    /* JADX INFO: renamed from: w */
    public static void m15711w(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 16;
        androidDeviceReport.memory_ = j;
    }

    /* JADX INFO: renamed from: x */
    public static void m15712x(AndroidDeviceReport androidDeviceReport) {
        String str = Build.MODEL;
        androidDeviceReport.getClass();
        str.getClass();
        androidDeviceReport.bitField0_ |= 2048;
        androidDeviceReport.model_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m15713y(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 4;
        androidDeviceReport.numProcessors_ = j;
    }

    /* JADX INFO: renamed from: z */
    public static void m15714z(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.bitField0_ |= 8192;
        androidDeviceReport.performanceClass_ = j;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ခ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဈ\u000b\rဈ\f\u000eဂ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဈ\u0011\u0013ဂ\u0012", new Object[]{"bitField0_", "manufacturer_", "firmware_", "numProcessors_", "maxFreq_", "memory_", "screenSize_", "screenWidth_", "screenHeight_", "fbYearclass_", "cpuFeatures_", "cpuFamily_", "model_", "brand_", "performanceClass_", "gpuVendor_", "gpuModel_", "socManufacturer_", "socModel_", "screenDensityDpi_"});
        }
        if (iOrdinal == 3) {
            return new AndroidDeviceReport();
        }
        if (iOrdinal == 4) {
            return new c24(DEFAULT_INSTANCE);
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
        synchronized (AndroidDeviceReport.class) {
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
