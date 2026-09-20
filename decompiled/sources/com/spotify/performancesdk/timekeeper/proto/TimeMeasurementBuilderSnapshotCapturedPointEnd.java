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
public final class TimeMeasurementBuilderSnapshotCapturedPointEnd extends AbstractC0269h implements sre0 {
    private static final TimeMeasurementBuilderSnapshotCapturedPointEnd DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private String identifier_ = "";
    private long timestamp_;

    static {
        TimeMeasurementBuilderSnapshotCapturedPointEnd timeMeasurementBuilderSnapshotCapturedPointEnd = new TimeMeasurementBuilderSnapshotCapturedPointEnd();
        DEFAULT_INSTANCE = timeMeasurementBuilderSnapshotCapturedPointEnd;
        AbstractC0269h.registerDefaultInstance(TimeMeasurementBuilderSnapshotCapturedPointEnd.class, timeMeasurementBuilderSnapshotCapturedPointEnd);
    }

    private TimeMeasurementBuilderSnapshotCapturedPointEnd() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"identifier_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurementBuilderSnapshotCapturedPointEnd();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 29);
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
        synchronized (TimeMeasurementBuilderSnapshotCapturedPointEnd.class) {
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
    public final String m17355n() {
        return this.identifier_;
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
