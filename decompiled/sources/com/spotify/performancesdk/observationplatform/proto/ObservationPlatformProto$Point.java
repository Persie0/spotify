package com.spotify.performancesdk.observationplatform.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jok0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservationPlatformProto$Point extends AbstractC0269h implements sre0 {
    public static final int BATCH_COLLECTION_ID_FIELD_NUMBER = 3;
    private static final ObservationPlatformProto$Point DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_US_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String batchCollectionId_ = "";
    private int bitField0_;
    private long timestampUs_;
    private double value_;

    static {
        ObservationPlatformProto$Point observationPlatformProto$Point = new ObservationPlatformProto$Point();
        DEFAULT_INSTANCE = observationPlatformProto$Point;
        AbstractC0269h.registerDefaultInstance(ObservationPlatformProto$Point.class, observationPlatformProto$Point);
    }

    private ObservationPlatformProto$Point() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17332n(ObservationPlatformProto$Point observationPlatformProto$Point, String str) {
        observationPlatformProto$Point.getClass();
        str.getClass();
        observationPlatformProto$Point.bitField0_ |= 1;
        observationPlatformProto$Point.batchCollectionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m17333o(ObservationPlatformProto$Point observationPlatformProto$Point, long j) {
        observationPlatformProto$Point.timestampUs_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m17334p(ObservationPlatformProto$Point observationPlatformProto$Point, double d) {
        observationPlatformProto$Point.value_ = d;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static jok0 m17335q() {
        return (jok0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0000\u0003ለ\u0000", new Object[]{"bitField0_", "timestampUs_", "value_", "batchCollectionId_"});
        }
        if (iOrdinal == 3) {
            return new ObservationPlatformProto$Point();
        }
        if (iOrdinal == 4) {
            return new jok0(DEFAULT_INSTANCE);
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
        synchronized (ObservationPlatformProto$Point.class) {
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
