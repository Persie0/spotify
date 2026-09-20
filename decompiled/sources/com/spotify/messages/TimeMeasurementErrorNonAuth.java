package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.an71;
import p204p.bn71;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tm71;
import p204p.um71;
import p204p.vm71;
import p204p.wm71;
import p204p.xm71;
import p204p.ym71;
import p204p.z110;
import p204p.zm71;

/* JADX INFO: loaded from: classes8.dex */
public final class TimeMeasurementErrorNonAuth extends AbstractC0269h implements sre0 {
    public static final int CATEGORY_FIELD_NUMBER = 5;
    private static final TimeMeasurementErrorNonAuth DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 6;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int ERROR_DATA_FIELD_NUMBER = 2;
    public static final int FEATURE_ID_FIELD_NUMBER = 10;
    public static final int MEASUREMENT_ID_FIELD_NUMBER = 11;
    public static final int METADATA_FIELD_NUMBER = 14;
    public static final int ONGOING_POINT_FEATURE_IDS_FIELD_NUMBER = 4;
    public static final int ONGOING_POINT_TIMESTAMPS_FIELD_NUMBER = 3;
    public static final int PARENT_EPOCH_OFFSET_FIELD_NUMBER = 13;
    public static final int PARENT_MEASUREMENT_ID_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int POINT_DURATIONS_FIELD_NUMBER = 8;
    public static final int POINT_FEATURE_IDS_FIELD_NUMBER = 9;
    public static final int POINT_TIMESTAMPS_FIELD_NUMBER = 7;
    private int bitField0_;
    private String category_;
    private ihc0 dimensions_;
    private int errorCode_;
    private ihc0 errorData_;
    private String featureId_;
    private String measurementId_;
    private ihc0 metadata_;
    private ihc0 ongoingPointFeatureIds_;
    private ihc0 ongoingPointTimestamps_;
    private long parentEpochOffset_;
    private String parentMeasurementId_;
    private ihc0 pointDurations_;
    private ihc0 pointFeatureIds_;
    private ihc0 pointTimestamps_;

    static {
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = new TimeMeasurementErrorNonAuth();
        DEFAULT_INSTANCE = timeMeasurementErrorNonAuth;
        AbstractC0269h.registerDefaultInstance(TimeMeasurementErrorNonAuth.class, timeMeasurementErrorNonAuth);
    }

    private TimeMeasurementErrorNonAuth() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.errorData_ = ihc0Var;
        this.ongoingPointTimestamps_ = ihc0Var;
        this.ongoingPointFeatureIds_ = ihc0Var;
        this.dimensions_ = ihc0Var;
        this.pointTimestamps_ = ihc0Var;
        this.pointDurations_ = ihc0Var;
        this.pointFeatureIds_ = ihc0Var;
        this.metadata_ = ihc0Var;
        this.category_ = "";
        this.featureId_ = "";
        this.measurementId_ = "";
        this.parentMeasurementId_ = "";
    }

    /* JADX INFO: renamed from: A */
    public static tm71 m14450A() {
        return (tm71) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: B */
    public static tm71 m14451B(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        return (tm71) DEFAULT_INSTANCE.createBuilder(timeMeasurementErrorNonAuth);
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m14452n(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        ihc0 ihc0Var = timeMeasurementErrorNonAuth.dimensions_;
        if (!ihc0Var.f102236a) {
            timeMeasurementErrorNonAuth.dimensions_ = ihc0Var.m50613h();
        }
        return timeMeasurementErrorNonAuth.dimensions_;
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m14453o(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        ihc0 ihc0Var = timeMeasurementErrorNonAuth.errorData_;
        if (!ihc0Var.f102236a) {
            timeMeasurementErrorNonAuth.errorData_ = ihc0Var.m50613h();
        }
        return timeMeasurementErrorNonAuth.errorData_;
    }

    /* JADX INFO: renamed from: p */
    public static ihc0 m14454p(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        ihc0 ihc0Var = timeMeasurementErrorNonAuth.metadata_;
        if (!ihc0Var.f102236a) {
            timeMeasurementErrorNonAuth.metadata_ = ihc0Var.m50613h();
        }
        return timeMeasurementErrorNonAuth.metadata_;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ihc0 m14455q(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        ihc0 ihc0Var = timeMeasurementErrorNonAuth.ongoingPointFeatureIds_;
        if (!ihc0Var.f102236a) {
            timeMeasurementErrorNonAuth.ongoingPointFeatureIds_ = ihc0Var.m50613h();
        }
        return timeMeasurementErrorNonAuth.ongoingPointFeatureIds_;
    }

    /* JADX INFO: renamed from: r */
    public static ihc0 m14456r(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        ihc0 ihc0Var = timeMeasurementErrorNonAuth.ongoingPointTimestamps_;
        if (!ihc0Var.f102236a) {
            timeMeasurementErrorNonAuth.ongoingPointTimestamps_ = ihc0Var.m50613h();
        }
        return timeMeasurementErrorNonAuth.ongoingPointTimestamps_;
    }

    /* JADX INFO: renamed from: s */
    public static ihc0 m14457s(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        ihc0 ihc0Var = timeMeasurementErrorNonAuth.pointDurations_;
        if (!ihc0Var.f102236a) {
            timeMeasurementErrorNonAuth.pointDurations_ = ihc0Var.m50613h();
        }
        return timeMeasurementErrorNonAuth.pointDurations_;
    }

    /* JADX INFO: renamed from: t */
    public static ihc0 m14458t(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        ihc0 ihc0Var = timeMeasurementErrorNonAuth.pointFeatureIds_;
        if (!ihc0Var.f102236a) {
            timeMeasurementErrorNonAuth.pointFeatureIds_ = ihc0Var.m50613h();
        }
        return timeMeasurementErrorNonAuth.pointFeatureIds_;
    }

    /* JADX INFO: renamed from: u */
    public static ihc0 m14459u(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth) {
        ihc0 ihc0Var = timeMeasurementErrorNonAuth.pointTimestamps_;
        if (!ihc0Var.f102236a) {
            timeMeasurementErrorNonAuth.pointTimestamps_ = ihc0Var.m50613h();
        }
        return timeMeasurementErrorNonAuth.pointTimestamps_;
    }

    /* JADX INFO: renamed from: v */
    public static void m14460v(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth, String str) {
        timeMeasurementErrorNonAuth.getClass();
        str.getClass();
        timeMeasurementErrorNonAuth.bitField0_ |= 2;
        timeMeasurementErrorNonAuth.category_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14461w(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth, int i) {
        timeMeasurementErrorNonAuth.bitField0_ |= 1;
        timeMeasurementErrorNonAuth.errorCode_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m14462x(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth, String str) {
        timeMeasurementErrorNonAuth.getClass();
        str.getClass();
        timeMeasurementErrorNonAuth.bitField0_ |= 4;
        timeMeasurementErrorNonAuth.featureId_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m14463y(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth, String str) {
        timeMeasurementErrorNonAuth.getClass();
        str.getClass();
        timeMeasurementErrorNonAuth.bitField0_ |= 8;
        timeMeasurementErrorNonAuth.measurementId_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m14464z(TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth, String str) {
        timeMeasurementErrorNonAuth.getClass();
        str.getClass();
        timeMeasurementErrorNonAuth.bitField0_ |= 16;
        timeMeasurementErrorNonAuth.parentMeasurementId_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\b\u0000\u0000\u0001င\u0000\u00022\u00032\u00042\u0005ဈ\u0001\u00062\u00072\b2\t2\nဈ\u0002\u000bဈ\u0003\fဈ\u0004\rဂ\u0005\u000e2", new Object[]{"bitField0_", "errorCode_", "errorData_", vm71.f242716a, "ongoingPointTimestamps_", ym71.f274173a, "ongoingPointFeatureIds_", xm71.f263310a, "category_", "dimensions_", um71.f231772a, "pointTimestamps_", bn71.f28722a, "pointDurations_", zm71.f284177a, "pointFeatureIds_", an71.f17321a, "featureId_", "measurementId_", "parentMeasurementId_", "parentEpochOffset_", "metadata_", wm71.f252750a});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurementErrorNonAuth();
        }
        if (iOrdinal == 4) {
            return new tm71(DEFAULT_INSTANCE);
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
        synchronized (TimeMeasurementErrorNonAuth.class) {
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
