package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.it81;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackingData extends AbstractC0269h implements sre0 {
    private static final TrackingData DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
    public static final int INTERCEPTED_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TRAFFIC_SOURCE_FIELD_NUMBER = 1;
    private String trafficSource_ = "";
    private String interceptedUrl_ = "";
    private String deviceType_ = "";

    static {
        TrackingData trackingData = new TrackingData();
        DEFAULT_INSTANCE = trackingData;
        AbstractC0269h.registerDefaultInstance(TrackingData.class, trackingData);
    }

    private TrackingData() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6509n(TrackingData trackingData, String str) {
        trackingData.getClass();
        trackingData.deviceType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6510o(TrackingData trackingData, String str) {
        trackingData.getClass();
        str.getClass();
        trackingData.interceptedUrl_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6511p(TrackingData trackingData, String str) {
        trackingData.getClass();
        str.getClass();
        trackingData.trafficSource_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static it81 m6512q() {
        return (it81) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"trafficSource_", "interceptedUrl_", "deviceType_"});
        }
        if (iOrdinal == 3) {
            return new TrackingData();
        }
        if (iOrdinal == 4) {
            return new it81(DEFAULT_INSTANCE);
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
        synchronized (TrackingData.class) {
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
