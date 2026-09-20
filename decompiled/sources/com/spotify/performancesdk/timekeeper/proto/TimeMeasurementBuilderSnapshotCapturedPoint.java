package com.spotify.performancesdk.timekeeper.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class TimeMeasurementBuilderSnapshotCapturedPoint extends AbstractC0269h implements sre0 {
    private static final TimeMeasurementBuilderSnapshotCapturedPoint DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int FEATURE_ID_FIELD_NUMBER = 2;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int bitField0_;
    private long duration_;
    private long timestamp_;
    private String identifier_ = "";
    private String featureId_ = "";

    static {
        TimeMeasurementBuilderSnapshotCapturedPoint timeMeasurementBuilderSnapshotCapturedPoint = new TimeMeasurementBuilderSnapshotCapturedPoint();
        DEFAULT_INSTANCE = timeMeasurementBuilderSnapshotCapturedPoint;
        AbstractC0269h.registerDefaultInstance(TimeMeasurementBuilderSnapshotCapturedPoint.class, timeMeasurementBuilderSnapshotCapturedPoint);
    }

    private TimeMeasurementBuilderSnapshotCapturedPoint() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u0002\u0004\u0003", new Object[]{"bitField0_", "identifier_", "featureId_", "timestamp_", "duration_"});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurementBuilderSnapshotCapturedPoint();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 28);
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
        synchronized (TimeMeasurementBuilderSnapshotCapturedPoint.class) {
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

    public final long getTimestamp() {
        return this.timestamp_;
    }

    /* JADX INFO: renamed from: n */
    public final long m17352n() {
        return this.duration_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m17353o() {
        return this.featureId_;
    }

    /* JADX INFO: renamed from: p */
    public final String m17354p() {
        return this.identifier_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
