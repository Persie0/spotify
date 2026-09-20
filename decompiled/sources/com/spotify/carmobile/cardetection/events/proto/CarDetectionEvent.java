package com.spotify.carmobile.cardetection.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qyb;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CarDetectionEvent extends AbstractC0269h implements sre0 {
    private static final CarDetectionEvent DEFAULT_INSTANCE;
    public static final int IS_CAR_CONNECTED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isCarConnected_;
    private String reason_ = "";

    static {
        CarDetectionEvent carDetectionEvent = new CarDetectionEvent();
        DEFAULT_INSTANCE = carDetectionEvent;
        AbstractC0269h.registerDefaultInstance(CarDetectionEvent.class, carDetectionEvent);
    }

    private CarDetectionEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5548n(CarDetectionEvent carDetectionEvent, boolean z) {
        carDetectionEvent.bitField0_ |= 1;
        carDetectionEvent.isCarConnected_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m5549o(CarDetectionEvent carDetectionEvent, String str) {
        carDetectionEvent.getClass();
        str.getClass();
        carDetectionEvent.bitField0_ |= 2;
        carDetectionEvent.reason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static qyb m5550p() {
        return (qyb) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "isCarConnected_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new CarDetectionEvent();
        }
        if (iOrdinal == 4) {
            return new qyb(DEFAULT_INSTANCE);
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
        synchronized (CarDetectionEvent.class) {
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
