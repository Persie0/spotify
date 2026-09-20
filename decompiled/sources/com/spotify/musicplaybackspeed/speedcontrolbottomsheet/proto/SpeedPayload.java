package com.spotify.musicplaybackspeed.speedcontrolbottomsheet.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.o541;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class SpeedPayload extends AbstractC0269h implements sre0 {
    public static final int BPM_FIELD_NUMBER = 2;
    private static final SpeedPayload DEFAULT_INSTANCE;
    public static final int MULTIPLIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PITCH_FACTOR_FIELD_NUMBER = 4;
    public static final int PITCH_PRESERVED_FIELD_NUMBER = 3;
    private double pitchFactor_;
    private boolean pitchPreserved_;
    private int speedCase_ = 0;
    private Object speed_;

    static {
        SpeedPayload speedPayload = new SpeedPayload();
        DEFAULT_INSTANCE = speedPayload;
        AbstractC0269h.registerDefaultInstance(SpeedPayload.class, speedPayload);
    }

    private SpeedPayload() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15769n(SpeedPayload speedPayload, double d) {
        speedPayload.speedCase_ = 1;
        speedPayload.speed_ = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: o */
    public static void m15770o(SpeedPayload speedPayload) {
        speedPayload.pitchFactor_ = 1.0d;
    }

    /* JADX INFO: renamed from: p */
    public static o541 m15771p() {
        return (o541) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00013\u0000\u00023\u0000\u0003\u0007\u0004\u0000", new Object[]{"speed_", "speedCase_", "pitchPreserved_", "pitchFactor_"});
        }
        if (iOrdinal == 3) {
            return new SpeedPayload();
        }
        if (iOrdinal == 4) {
            return new o541(DEFAULT_INSTANCE);
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
        synchronized (SpeedPayload.class) {
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
