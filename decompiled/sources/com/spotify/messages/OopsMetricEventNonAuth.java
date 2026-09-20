package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.eol0;
import p204p.fol0;
import p204p.gva;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class OopsMetricEventNonAuth extends AbstractC0269h implements sre0 {
    public static final int AGGREGATED_VALUE_FIELD_NUMBER = 12;
    public static final int AGGREGATION_TYPE_FIELD_NUMBER = 5;
    public static final int ATTRIBUTES_FIELD_NUMBER = 15;
    public static final int BATCH_COLLECTION_ID_FIELD_NUMBER = 17;
    private static final OopsMetricEventNonAuth DEFAULT_INSTANCE;
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
        OopsMetricEventNonAuth oopsMetricEventNonAuth = new OopsMetricEventNonAuth();
        DEFAULT_INSTANCE = oopsMetricEventNonAuth;
        AbstractC0269h.registerDefaultInstance(OopsMetricEventNonAuth.class, oopsMetricEventNonAuth);
    }

    private OopsMetricEventNonAuth() {
        cva cvaVar = gva.f84678b;
        this.timeSeries_ = cvaVar;
        this.histogram_ = cvaVar;
        this.scope_ = "";
        this.batchCollectionId_ = "";
    }

    /* JADX INFO: renamed from: A */
    public static void m14289A(OopsMetricEventNonAuth oopsMetricEventNonAuth, gva gvaVar) {
        oopsMetricEventNonAuth.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 4096;
        oopsMetricEventNonAuth.timeSeries_ = gvaVar;
    }

    /* JADX INFO: renamed from: B */
    public static void m14290B(OopsMetricEventNonAuth oopsMetricEventNonAuth, String str) {
        oopsMetricEventNonAuth.getClass();
        str.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 512;
        oopsMetricEventNonAuth.unit_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static fol0 m14291C() {
        return (fol0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14292n(OopsMetricEventNonAuth oopsMetricEventNonAuth, double d) {
        oopsMetricEventNonAuth.bitField0_ |= 2048;
        oopsMetricEventNonAuth.aggregatedValue_ = d;
    }

    /* JADX INFO: renamed from: o */
    public static void m14293o(OopsMetricEventNonAuth oopsMetricEventNonAuth, String str) {
        oopsMetricEventNonAuth.getClass();
        str.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 16;
        oopsMetricEventNonAuth.aggregationType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14294p(OopsMetricEventNonAuth oopsMetricEventNonAuth, String str) {
        oopsMetricEventNonAuth.getClass();
        str.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 32768;
        oopsMetricEventNonAuth.batchCollectionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14295q(OopsMetricEventNonAuth oopsMetricEventNonAuth, long j) {
        oopsMetricEventNonAuth.bitField0_ |= 256;
        oopsMetricEventNonAuth.duration_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m14296r(OopsMetricEventNonAuth oopsMetricEventNonAuth, String str) {
        oopsMetricEventNonAuth.getClass();
        str.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 8;
        oopsMetricEventNonAuth.flushReason_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14297s(OopsMetricEventNonAuth oopsMetricEventNonAuth, gva gvaVar) {
        oopsMetricEventNonAuth.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 8192;
        oopsMetricEventNonAuth.histogram_ = gvaVar;
    }

    /* JADX INFO: renamed from: t */
    public static void m14298t(OopsMetricEventNonAuth oopsMetricEventNonAuth, String str) {
        oopsMetricEventNonAuth.getClass();
        str.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 1024;
        oopsMetricEventNonAuth.instrumentType_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m14299u(OopsMetricEventNonAuth oopsMetricEventNonAuth, String str) {
        oopsMetricEventNonAuth.getClass();
        str.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 1;
        oopsMetricEventNonAuth.metricId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m14300v(OopsMetricEventNonAuth oopsMetricEventNonAuth, String str) {
        oopsMetricEventNonAuth.getClass();
        str.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 4;
        oopsMetricEventNonAuth.metricKey_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14301w(OopsMetricEventNonAuth oopsMetricEventNonAuth, String str) {
        oopsMetricEventNonAuth.getClass();
        str.getClass();
        oopsMetricEventNonAuth.bitField0_ |= 16384;
        oopsMetricEventNonAuth.scope_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m14302x(OopsMetricEventNonAuth oopsMetricEventNonAuth, long j) {
        oopsMetricEventNonAuth.bitField0_ |= 128;
        oopsMetricEventNonAuth.startMonotonic_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m14303y(OopsMetricEventNonAuth oopsMetricEventNonAuth, long j) {
        oopsMetricEventNonAuth.bitField0_ |= 64;
        oopsMetricEventNonAuth.startWallclock_ = j;
    }

    /* JADX INFO: renamed from: z */
    public static void m14304z(OopsMetricEventNonAuth oopsMetricEventNonAuth, long j) {
        oopsMetricEventNonAuth.bitField0_ |= 32;
        oopsMetricEventNonAuth.targetInterval_ = j;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0001\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဈ\t\u000bဈ\n\fက\u000b\rည\f\u000eည\r\u000f2\u0010ဈ\u000e\u0011ဈ\u000f", new Object[]{"bitField0_", "metricId_", "segment_", "metricKey_", "flushReason_", "aggregationType_", "targetInterval_", "startWallclock_", "startMonotonic_", "duration_", "unit_", "instrumentType_", "aggregatedValue_", "timeSeries_", "histogram_", "attributes_", eol0.f61444a, "scope_", "batchCollectionId_"});
        }
        if (iOrdinal == 3) {
            return new OopsMetricEventNonAuth();
        }
        if (iOrdinal == 4) {
            return new fol0(DEFAULT_INSTANCE);
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
        synchronized (OopsMetricEventNonAuth.class) {
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
