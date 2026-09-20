package com.spotify.performancesdk.timekeeper.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ae50;
import p204p.ihc0;
import p204p.nm71;
import p204p.om71;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class TimeMeasurementBuilderSnapshot extends AbstractC0269h implements sre0 {
    public static final int CAPTURED_POINTS_FIELD_NUMBER = 4;
    public static final int CAPTURED_POINT_ENDS_FIELD_NUMBER = 3;
    public static final int CAPTURED_POINT_STARTS_FIELD_NUMBER = 2;
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final TimeMeasurementBuilderSnapshot DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 6;
    public static final int EPOCH_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int METADATA_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 capturedPointEnds_;
    private ae50 capturedPointStarts_;
    private ae50 capturedPoints_;
    private String category_;
    private ihc0 dimensions_;
    private long epochTimestamp_;
    private ihc0 metadata_;

    static {
        TimeMeasurementBuilderSnapshot timeMeasurementBuilderSnapshot = new TimeMeasurementBuilderSnapshot();
        DEFAULT_INSTANCE = timeMeasurementBuilderSnapshot;
        AbstractC0269h.registerDefaultInstance(TimeMeasurementBuilderSnapshot.class, timeMeasurementBuilderSnapshot);
    }

    private TimeMeasurementBuilderSnapshot() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.dimensions_ = ihc0Var;
        this.metadata_ = ihc0Var;
        this.category_ = "";
        this.capturedPointStarts_ = AbstractC0269h.emptyProtobufList();
        this.capturedPointEnds_ = AbstractC0269h.emptyProtobufList();
        this.capturedPoints_ = AbstractC0269h.emptyProtobufList();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static TimeMeasurementBuilderSnapshot m17344u(byte[] bArr) {
        return (TimeMeasurementBuilderSnapshot) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0002\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\u001b\u0005ဃ\u0000\u00062\u00072", new Object[]{"bitField0_", "category_", "capturedPointStarts_", TimeMeasurementBuilderSnapshotCapturedPointStart.class, "capturedPointEnds_", TimeMeasurementBuilderSnapshotCapturedPointEnd.class, "capturedPoints_", TimeMeasurementBuilderSnapshotCapturedPoint.class, "epochTimestamp_", "dimensions_", nm71.f155316a, "metadata_", om71.f166988a});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurementBuilderSnapshot();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 27);
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
        synchronized (TimeMeasurementBuilderSnapshot.class) {
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

    public final Map getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m17345n() {
        return this.capturedPointEnds_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m17346o() {
        return this.capturedPointStarts_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m17347p() {
        return this.capturedPoints_;
    }

    /* JADX INFO: renamed from: q */
    public final String m17348q() {
        return this.category_;
    }

    /* JADX INFO: renamed from: r */
    public final Map m17349r() {
        return Collections.unmodifiableMap(this.dimensions_);
    }

    /* JADX INFO: renamed from: s */
    public final long m17350s() {
        return this.epochTimestamp_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17351t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
