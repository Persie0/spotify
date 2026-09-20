package com.spotify.device_location_service.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.f9r;
import p204p.g9r;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DeviceLocationServiceOuterClass$DeviceLocationResponse extends AbstractC0269h implements sre0 {
    private static final DeviceLocationServiceOuterClass$DeviceLocationResponse DEFAULT_INSTANCE;
    public static final int HORIZONTAL_ACCURACY_FIELD_NUMBER = 4;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 5;
    private double horizontalAccuracy_;
    private double latitude_;
    private double longitude_;
    private int status_;
    private long timestampMs_;

    static {
        DeviceLocationServiceOuterClass$DeviceLocationResponse deviceLocationServiceOuterClass$DeviceLocationResponse = new DeviceLocationServiceOuterClass$DeviceLocationResponse();
        DEFAULT_INSTANCE = deviceLocationServiceOuterClass$DeviceLocationResponse;
        AbstractC0269h.registerDefaultInstance(DeviceLocationServiceOuterClass$DeviceLocationResponse.class, deviceLocationServiceOuterClass$DeviceLocationResponse);
    }

    private DeviceLocationServiceOuterClass$DeviceLocationResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9223n(DeviceLocationServiceOuterClass$DeviceLocationResponse deviceLocationServiceOuterClass$DeviceLocationResponse, double d) {
        deviceLocationServiceOuterClass$DeviceLocationResponse.horizontalAccuracy_ = d;
    }

    /* JADX INFO: renamed from: o */
    public static void m9224o(DeviceLocationServiceOuterClass$DeviceLocationResponse deviceLocationServiceOuterClass$DeviceLocationResponse, double d) {
        deviceLocationServiceOuterClass$DeviceLocationResponse.latitude_ = d;
    }

    /* JADX INFO: renamed from: p */
    public static void m9225p(DeviceLocationServiceOuterClass$DeviceLocationResponse deviceLocationServiceOuterClass$DeviceLocationResponse, double d) {
        deviceLocationServiceOuterClass$DeviceLocationResponse.longitude_ = d;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9226q(DeviceLocationServiceOuterClass$DeviceLocationResponse deviceLocationServiceOuterClass$DeviceLocationResponse, g9r g9rVar) {
        deviceLocationServiceOuterClass$DeviceLocationResponse.getClass();
        deviceLocationServiceOuterClass$DeviceLocationResponse.status_ = g9rVar.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static void m9227r(DeviceLocationServiceOuterClass$DeviceLocationResponse deviceLocationServiceOuterClass$DeviceLocationResponse, long j) {
        deviceLocationServiceOuterClass$DeviceLocationResponse.timestampMs_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static f9r m9228s() {
        return (f9r) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0000\u0004\u0000\u0005\u0002", new Object[]{"status_", "latitude_", "longitude_", "horizontalAccuracy_", "timestampMs_"});
        }
        if (iOrdinal == 3) {
            return new DeviceLocationServiceOuterClass$DeviceLocationResponse();
        }
        if (iOrdinal == 4) {
            return new f9r(DEFAULT_INSTANCE);
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
        synchronized (DeviceLocationServiceOuterClass$DeviceLocationResponse.class) {
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
