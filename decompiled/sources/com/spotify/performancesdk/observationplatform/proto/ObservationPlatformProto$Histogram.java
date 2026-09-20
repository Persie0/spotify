package com.spotify.performancesdk.observationplatform.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.iok0;
import p204p.md50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xd50;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservationPlatformProto$Histogram extends AbstractC0269h implements sre0 {
    public static final int BOUNDARIES_FIELD_NUMBER = 1;
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final ObservationPlatformProto$Histogram DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUM_FIELD_NUMBER = 4;
    private long count_;
    private double sum_;
    private int boundariesMemoizedSerializedSize = -1;
    private int bucketCountsMemoizedSerializedSize = -1;
    private md50 boundaries_ = AbstractC0269h.emptyDoubleList();
    private xd50 bucketCounts_ = AbstractC0269h.emptyLongList();

    static {
        ObservationPlatformProto$Histogram observationPlatformProto$Histogram = new ObservationPlatformProto$Histogram();
        DEFAULT_INSTANCE = observationPlatformProto$Histogram;
        AbstractC0269h.registerDefaultInstance(ObservationPlatformProto$Histogram.class, observationPlatformProto$Histogram);
    }

    private ObservationPlatformProto$Histogram() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m17327n(ObservationPlatformProto$Histogram observationPlatformProto$Histogram, Iterable iterable) {
        md50 md50Var = observationPlatformProto$Histogram.boundaries_;
        if (!((AbstractC1733c9) md50Var).f35342a) {
            observationPlatformProto$Histogram.boundaries_ = AbstractC0269h.mutableCopy(md50Var);
        }
        AbstractC2118m8.addAll(iterable, observationPlatformProto$Histogram.boundaries_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m17328o(ObservationPlatformProto$Histogram observationPlatformProto$Histogram, ArrayList arrayList) {
        xd50 xd50Var = observationPlatformProto$Histogram.bucketCounts_;
        if (!((AbstractC1733c9) xd50Var).f35342a) {
            observationPlatformProto$Histogram.bucketCounts_ = AbstractC0269h.mutableCopy(xd50Var);
        }
        AbstractC2118m8.addAll(arrayList, observationPlatformProto$Histogram.bucketCounts_);
    }

    /* JADX INFO: renamed from: p */
    public static void m17329p(ObservationPlatformProto$Histogram observationPlatformProto$Histogram, long j) {
        observationPlatformProto$Histogram.count_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17330q(ObservationPlatformProto$Histogram observationPlatformProto$Histogram, double d) {
        observationPlatformProto$Histogram.sum_ = d;
    }

    /* JADX INFO: renamed from: r */
    public static iok0 m17331r() {
        return (iok0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001#\u0002%\u0003\u0002\u0004\u0000", new Object[]{"boundaries_", "bucketCounts_", "count_", "sum_"});
        }
        if (iOrdinal == 3) {
            return new ObservationPlatformProto$Histogram();
        }
        if (iOrdinal == 4) {
            return new iok0(DEFAULT_INSTANCE);
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
        synchronized (ObservationPlatformProto$Histogram.class) {
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
