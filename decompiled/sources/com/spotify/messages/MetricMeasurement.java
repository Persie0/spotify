package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ecf0;
import p204p.fcf0;
import p204p.gcf0;
import p204p.hcf0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MetricMeasurement extends AbstractC0269h implements sre0 {
    public static final int ASPECT_FIELD_NUMBER = 3;
    private static final MetricMeasurement DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 5;
    public static final int EXPERIENCE_FIELD_NUMBER = 2;
    public static final int MEASUREMENT_ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 6;
    public static final int METRICS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private String aspect_;
    private int bitField0_;
    private ihc0 dimensions_;
    private String experience_;
    private String measurementId_;
    private ihc0 metadata_;
    private ihc0 metrics_;

    static {
        MetricMeasurement metricMeasurement = new MetricMeasurement();
        DEFAULT_INSTANCE = metricMeasurement;
        AbstractC0269h.registerDefaultInstance(MetricMeasurement.class, metricMeasurement);
    }

    private MetricMeasurement() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.metrics_ = ihc0Var;
        this.dimensions_ = ihc0Var;
        this.metadata_ = ihc0Var;
        this.measurementId_ = "";
        this.experience_ = "";
        this.aspect_ = "";
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m14237n(MetricMeasurement metricMeasurement) {
        ihc0 ihc0Var = metricMeasurement.dimensions_;
        if (!ihc0Var.f102236a) {
            metricMeasurement.dimensions_ = ihc0Var.m50613h();
        }
        return metricMeasurement.dimensions_;
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m14238o(MetricMeasurement metricMeasurement) {
        ihc0 ihc0Var = metricMeasurement.metadata_;
        if (!ihc0Var.f102236a) {
            metricMeasurement.metadata_ = ihc0Var.m50613h();
        }
        return metricMeasurement.metadata_;
    }

    /* JADX INFO: renamed from: p */
    public static ihc0 m14239p(MetricMeasurement metricMeasurement) {
        ihc0 ihc0Var = metricMeasurement.metrics_;
        if (!ihc0Var.f102236a) {
            metricMeasurement.metrics_ = ihc0Var.m50613h();
        }
        return metricMeasurement.metrics_;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14240q(MetricMeasurement metricMeasurement) {
        metricMeasurement.getClass();
        metricMeasurement.bitField0_ |= 4;
        metricMeasurement.aspect_ = "scroll_performance";
    }

    /* JADX INFO: renamed from: r */
    public static void m14241r(MetricMeasurement metricMeasurement) {
        metricMeasurement.getClass();
        metricMeasurement.bitField0_ |= 2;
        metricMeasurement.experience_ = "page_session";
    }

    /* JADX INFO: renamed from: s */
    public static void m14242s(MetricMeasurement metricMeasurement, String str) {
        metricMeasurement.getClass();
        str.getClass();
        metricMeasurement.bitField0_ |= 1;
        metricMeasurement.measurementId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static ecf0 m14243t() {
        return (ecf0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0003\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042\u00052\u00062", new Object[]{"bitField0_", "measurementId_", "experience_", "aspect_", "metrics_", hcf0.f89784a, "dimensions_", fcf0.f68107a, "metadata_", gcf0.f78578a});
        }
        if (iOrdinal == 3) {
            return new MetricMeasurement();
        }
        if (iOrdinal == 4) {
            return new ecf0(DEFAULT_INSTANCE);
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
        synchronized (MetricMeasurement.class) {
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
