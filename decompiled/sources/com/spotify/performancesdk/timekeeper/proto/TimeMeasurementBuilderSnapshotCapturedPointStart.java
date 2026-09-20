package com.spotify.performancesdk.timekeeper.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class TimeMeasurementBuilderSnapshotCapturedPointStart extends AbstractC0269h implements sre0 {
    private static final TimeMeasurementBuilderSnapshotCapturedPointStart DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 2;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int IS_REQUIRED_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isRequired_;
    private long timestamp_;
    private String identifier_ = "";
    private String featureId_ = "";

    static {
        TimeMeasurementBuilderSnapshotCapturedPointStart timeMeasurementBuilderSnapshotCapturedPointStart = new TimeMeasurementBuilderSnapshotCapturedPointStart();
        DEFAULT_INSTANCE = timeMeasurementBuilderSnapshotCapturedPointStart;
        AbstractC0269h.registerDefaultInstance(TimeMeasurementBuilderSnapshotCapturedPointStart.class, timeMeasurementBuilderSnapshotCapturedPointStart);
    }

    private TimeMeasurementBuilderSnapshotCapturedPointStart() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u0002\u0004\u0007", new Object[]{"bitField0_", "identifier_", "featureId_", "timestamp_", "isRequired_"});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurementBuilderSnapshotCapturedPointStart();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 0);
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
        synchronized (TimeMeasurementBuilderSnapshotCapturedPointStart.class) {
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
    public final String m17356n() {
        return this.featureId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m17357o() {
        return this.identifier_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m17358p() {
        return this.isRequired_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
