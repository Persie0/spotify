package com.spotify.devicelocation.configurationimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.m7r;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DeviceLocationFixOutcome extends AbstractC0269h implements sre0 {
    public static final int ACCURACY_METERS_FIELD_NUMBER = 4;
    private static final DeviceLocationFixOutcome DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 2;
    public static final int ERROR_REASON_FIELD_NUMBER = 3;
    public static final int LOCATION_UNKNOWN_COUNT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int SOURCE_FIELD_NUMBER = 6;
    private double accuracyMeters_;
    private int bitField0_;
    private long durationMs_;
    private int locationUnknownCount_;
    private String result_ = "";
    private String errorReason_ = "";
    private String source_ = "";

    static {
        DeviceLocationFixOutcome deviceLocationFixOutcome = new DeviceLocationFixOutcome();
        DEFAULT_INSTANCE = deviceLocationFixOutcome;
        AbstractC0269h.registerDefaultInstance(DeviceLocationFixOutcome.class, deviceLocationFixOutcome);
    }

    private DeviceLocationFixOutcome() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9238n(DeviceLocationFixOutcome deviceLocationFixOutcome, double d) {
        deviceLocationFixOutcome.bitField0_ |= 8;
        deviceLocationFixOutcome.accuracyMeters_ = d;
    }

    /* JADX INFO: renamed from: o */
    public static void m9239o(DeviceLocationFixOutcome deviceLocationFixOutcome, long j) {
        deviceLocationFixOutcome.bitField0_ |= 2;
        deviceLocationFixOutcome.durationMs_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m9240p(DeviceLocationFixOutcome deviceLocationFixOutcome, String str) {
        deviceLocationFixOutcome.getClass();
        deviceLocationFixOutcome.bitField0_ |= 4;
        deviceLocationFixOutcome.errorReason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9241q(DeviceLocationFixOutcome deviceLocationFixOutcome) {
        deviceLocationFixOutcome.bitField0_ |= 16;
        deviceLocationFixOutcome.locationUnknownCount_ = -1;
    }

    /* JADX INFO: renamed from: r */
    public static void m9242r(DeviceLocationFixOutcome deviceLocationFixOutcome, String str) {
        deviceLocationFixOutcome.getClass();
        deviceLocationFixOutcome.bitField0_ |= 1;
        deviceLocationFixOutcome.result_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m9243s(DeviceLocationFixOutcome deviceLocationFixOutcome, String str) {
        deviceLocationFixOutcome.getClass();
        deviceLocationFixOutcome.bitField0_ |= 32;
        deviceLocationFixOutcome.source_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static m7r m9244t() {
        return (m7r) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004က\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "result_", "durationMs_", "errorReason_", "accuracyMeters_", "locationUnknownCount_", "source_"});
        }
        if (iOrdinal == 3) {
            return new DeviceLocationFixOutcome();
        }
        if (iOrdinal == 4) {
            return new m7r(DEFAULT_INSTANCE);
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
        synchronized (DeviceLocationFixOutcome.class) {
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
