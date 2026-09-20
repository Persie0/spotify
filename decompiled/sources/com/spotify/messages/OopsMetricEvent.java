package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.col0;
import p204p.cva;
import p204p.dol0;
import p204p.gva;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class OopsMetricEvent extends AbstractC0269h implements sre0 {
    public static final int AGGREGATED_VALUE_FIELD_NUMBER = 12;
    public static final int AGGREGATION_TYPE_FIELD_NUMBER = 5;
    public static final int ATTRIBUTES_FIELD_NUMBER = 15;
    public static final int BATCH_COLLECTION_ID_FIELD_NUMBER = 17;
    private static final OopsMetricEvent DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 9;
    public static final int FLUSH_REASON_FIELD_NUMBER = 4;
    public static final int HISTOGRAM_FIELD_NUMBER = 14;
    public static final int INSTRUMENT_TYPE_FIELD_NUMBER = 11;
    public static final int METRIC_ID_FIELD_NUMBER = 1;
    public static final int METRIC_KEY_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SCOPE_FIELD_NUMBER = 16;
    public static final int SEGMENT_FIELD_NUMBER = 2;
    public static final int START_MONOTONIC_FIELD_NUMBER = 8;
    public static final int START_WALLCLOCK_FIELD_NUMBER = 7;
    public static final int TARGET_INTERVAL_FIELD_NUMBER = 6;
    public static final int TIME_SERIES_FIELD_NUMBER = 13;
    public static final int UNIT_FIELD_NUMBER = 10;
    private double aggregatedValue_;
    private String batchCollectionId_;
    private int bitField0_;
    private long duration_;
    private gva histogram_;
    private String scope_;
    private int segment_;
    private long startMonotonic_;
    private long startWallclock_;
    private long targetInterval_;
    private gva timeSeries_;
    private ihc0 attributes_ = ihc0.f102235b;
    private String metricId_ = "";
    private String metricKey_ = "";
    private String flushReason_ = "";
    private String aggregationType_ = "";
    private String unit_ = "";
    private String instrumentType_ = "";

    static {
        OopsMetricEvent oopsMetricEvent = new OopsMetricEvent();
        DEFAULT_INSTANCE = oopsMetricEvent;
        AbstractC0269h.registerDefaultInstance(OopsMetricEvent.class, oopsMetricEvent);
    }

    private OopsMetricEvent() {
        cva cvaVar = gva.f84678b;
        this.timeSeries_ = cvaVar;
        this.histogram_ = cvaVar;
        this.scope_ = "";
        this.batchCollectionId_ = "";
    }

    /* JADX INFO: renamed from: A */
    public static void m14273A(OopsMetricEvent oopsMetricEvent, gva gvaVar) {
        oopsMetricEvent.getClass();
        gvaVar.getClass();
        oopsMetricEvent.bitField0_ |= 4096;
        oopsMetricEvent.timeSeries_ = gvaVar;
    }

    /* JADX INFO: renamed from: B */
    public static void m14274B(OopsMetricEvent oopsMetricEvent, String str) {
        oopsMetricEvent.getClass();
        str.getClass();
        oopsMetricEvent.bitField0_ |= 512;
        oopsMetricEvent.unit_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static dol0 m14275C() {
        return (dol0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14276n(OopsMetricEvent oopsMetricEvent, double d) {
        oopsMetricEvent.bitField0_ |= 2048;
        oopsMetricEvent.aggregatedValue_ = d;
    }

    /* JADX INFO: renamed from: o */
    public static void m14277o(OopsMetricEvent oopsMetricEvent, String str) {
        oopsMetricEvent.getClass();
        str.getClass();
        oopsMetricEvent.bitField0_ |= 16;
        oopsMetricEvent.aggregationType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14278p(OopsMetricEvent oopsMetricEvent, String str) {
        oopsMetricEvent.getClass();
        str.getClass();
        oopsMetricEvent.bitField0_ |= 32768;
        oopsMetricEvent.batchCollectionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14279q(OopsMetricEvent oopsMetricEvent, long j) {
        oopsMetricEvent.bitField0_ |= 256;
        oopsMetricEvent.duration_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m14280r(OopsMetricEvent oopsMetricEvent, String str) {
        oopsMetricEvent.getClass();
        str.getClass();
        oopsMetricEvent.bitField0_ |= 8;
        oopsMetricEvent.flushReason_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14281s(OopsMetricEvent oopsMetricEvent, gva gvaVar) {
        oopsMetricEvent.getClass();
        oopsMetricEvent.bitField0_ |= 8192;
        oopsMetricEvent.histogram_ = gvaVar;
    }

    /* JADX INFO: renamed from: t */
    public static void m14282t(OopsMetricEvent oopsMetricEvent, String str) {
        oopsMetricEvent.getClass();
        str.getClass();
        oopsMetricEvent.bitField0_ |= 1024;
        oopsMetricEvent.instrumentType_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m14283u(OopsMetricEvent oopsMetricEvent, String str) {
        oopsMetricEvent.getClass();
        str.getClass();
        oopsMetricEvent.bitField0_ |= 1;
        oopsMetricEvent.metricId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m14284v(OopsMetricEvent oopsMetricEvent, String str) {
        oopsMetricEvent.getClass();
        str.getClass();
        oopsMetricEvent.bitField0_ |= 4;
        oopsMetricEvent.metricKey_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14285w(OopsMetricEvent oopsMetricEvent, String str) {
        oopsMetricEvent.getClass();
        str.getClass();
        oopsMetricEvent.bitField0_ |= 16384;
        oopsMetricEvent.scope_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m14286x(OopsMetricEvent oopsMetricEvent, long j) {
        oopsMetricEvent.bitField0_ |= 128;
        oopsMetricEvent.startMonotonic_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m14287y(OopsMetricEvent oopsMetricEvent, long j) {
        oopsMetricEvent.bitField0_ |= 64;
        oopsMetricEvent.startWallclock_ = j;
    }

    /* JADX INFO: renamed from: z */
    public static void m14288z(OopsMetricEvent oopsMetricEvent, long j) {
        oopsMetricEvent.bitField0_ |= 32;
        oopsMetricEvent.targetInterval_ = j;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0001\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဈ\t\u000bဈ\n\fက\u000b\rည\f\u000eည\r\u000f2\u0010ဈ\u000e\u0011ဈ\u000f", new Object[]{"bitField0_", "metricId_", "segment_", "metricKey_", "flushReason_", "aggregationType_", "targetInterval_", "startWallclock_", "startMonotonic_", "duration_", "unit_", "instrumentType_", "aggregatedValue_", "timeSeries_", "histogram_", "attributes_", col0.f40292a, "scope_", "batchCollectionId_"});
        }
        if (iOrdinal == 3) {
            return new OopsMetricEvent();
        }
        if (iOrdinal == 4) {
            return new dol0(DEFAULT_INSTANCE);
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
        synchronized (OopsMetricEvent.class) {
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
