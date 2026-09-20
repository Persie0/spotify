package com.spotify.devicepredictability.proximitydetector.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.iar;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DevicePredictabilityProximityDetection extends AbstractC0269h implements sre0 {
    public static final int CONTENT_HAS_VIDEO_FIELD_NUMBER = 5;
    public static final int CONTENT_IS_PLAYING_FIELD_NUMBER = 6;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    private static final DevicePredictabilityProximityDetection DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROXIMITY_INDICATORS_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean contentHasVideo_;
    private boolean contentIsPlaying_;
    private String deviceId_ = "";
    private String deviceType_ = "";
    private ae50 proximityIndicators_ = AbstractC0269h.emptyProtobufList();
    private String contentType_ = "";

    static {
        DevicePredictabilityProximityDetection devicePredictabilityProximityDetection = new DevicePredictabilityProximityDetection();
        DEFAULT_INSTANCE = devicePredictabilityProximityDetection;
        AbstractC0269h.registerDefaultInstance(DevicePredictabilityProximityDetection.class, devicePredictabilityProximityDetection);
    }

    private DevicePredictabilityProximityDetection() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9283n(DevicePredictabilityProximityDetection devicePredictabilityProximityDetection, ArrayList arrayList) {
        ae50 ae50Var = devicePredictabilityProximityDetection.proximityIndicators_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            devicePredictabilityProximityDetection.proximityIndicators_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, devicePredictabilityProximityDetection.proximityIndicators_);
    }

    /* JADX INFO: renamed from: o */
    public static void m9284o(DevicePredictabilityProximityDetection devicePredictabilityProximityDetection, boolean z) {
        devicePredictabilityProximityDetection.bitField0_ |= 8;
        devicePredictabilityProximityDetection.contentHasVideo_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m9285p(DevicePredictabilityProximityDetection devicePredictabilityProximityDetection, boolean z) {
        devicePredictabilityProximityDetection.bitField0_ |= 16;
        devicePredictabilityProximityDetection.contentIsPlaying_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9286q(DevicePredictabilityProximityDetection devicePredictabilityProximityDetection, String str) {
        devicePredictabilityProximityDetection.getClass();
        devicePredictabilityProximityDetection.bitField0_ |= 4;
        devicePredictabilityProximityDetection.contentType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m9287r(DevicePredictabilityProximityDetection devicePredictabilityProximityDetection, String str) {
        devicePredictabilityProximityDetection.getClass();
        str.getClass();
        devicePredictabilityProximityDetection.bitField0_ |= 1;
        devicePredictabilityProximityDetection.deviceId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m9288s(DevicePredictabilityProximityDetection devicePredictabilityProximityDetection, String str) {
        devicePredictabilityProximityDetection.getClass();
        devicePredictabilityProximityDetection.bitField0_ |= 2;
        devicePredictabilityProximityDetection.deviceType_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static iar m9289t() {
        return (iar) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "deviceId_", "deviceType_", "proximityIndicators_", "contentType_", "contentHasVideo_", "contentIsPlaying_"});
        }
        if (iOrdinal == 3) {
            return new DevicePredictabilityProximityDetection();
        }
        if (iOrdinal == 4) {
            return new iar(DEFAULT_INSTANCE);
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
        synchronized (DevicePredictabilityProximityDetection.class) {
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
