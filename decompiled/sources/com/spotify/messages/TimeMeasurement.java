package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.gm71;
import p204p.hm71;
import p204p.ihc0;
import p204p.im71;
import p204p.jm71;
import p204p.km71;
import p204p.lm71;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeMeasurement extends AbstractC0269h implements sre0 {
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final TimeMeasurement DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 2;
    public static final int FEATURE_ID_FIELD_NUMBER = 6;
    public static final int MEASUREMENT_ID_FIELD_NUMBER = 7;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int PARENT_EPOCH_OFFSET_FIELD_NUMBER = 9;
    public static final int PARENT_MEASUREMENT_ID_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int POINT_DURATIONS_FIELD_NUMBER = 4;
    public static final int POINT_FEATURE_IDS_FIELD_NUMBER = 5;
    public static final int POINT_TIMESTAMPS_FIELD_NUMBER = 3;
    private int bitField0_;
    private String category_;
    private ihc0 dimensions_;
    private String featureId_;
    private String measurementId_;
    private ihc0 metadata_;
    private long parentEpochOffset_;
    private String parentMeasurementId_;
    private ihc0 pointDurations_;
    private ihc0 pointFeatureIds_;
    private ihc0 pointTimestamps_;

    static {
        TimeMeasurement timeMeasurement = new TimeMeasurement();
        DEFAULT_INSTANCE = timeMeasurement;
        AbstractC0269h.registerDefaultInstance(TimeMeasurement.class, timeMeasurement);
    }

    private TimeMeasurement() {
        ihc0 ihc0Var = ihc0.f102235b;
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

    /* JADX INFO: renamed from: n */
    public static ihc0 m14441n(TimeMeasurement timeMeasurement) {
        ihc0 ihc0Var = timeMeasurement.dimensions_;
        if (!ihc0Var.f102236a) {
            timeMeasurement.dimensions_ = ihc0Var.m50613h();
        }
        return timeMeasurement.dimensions_;
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m14442o(TimeMeasurement timeMeasurement) {
        ihc0 ihc0Var = timeMeasurement.metadata_;
        if (!ihc0Var.f102236a) {
            timeMeasurement.metadata_ = ihc0Var.m50613h();
        }
        return timeMeasurement.metadata_;
    }

    /* JADX INFO: renamed from: p */
    public static ihc0 m14443p(TimeMeasurement timeMeasurement) {
        ihc0 ihc0Var = timeMeasurement.pointDurations_;
        if (!ihc0Var.f102236a) {
            timeMeasurement.pointDurations_ = ihc0Var.m50613h();
        }
        return timeMeasurement.pointDurations_;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ihc0 m14444q(TimeMeasurement timeMeasurement) {
        ihc0 ihc0Var = timeMeasurement.pointFeatureIds_;
        if (!ihc0Var.f102236a) {
            timeMeasurement.pointFeatureIds_ = ihc0Var.m50613h();
        }
        return timeMeasurement.pointFeatureIds_;
    }

    /* JADX INFO: renamed from: r */
    public static ihc0 m14445r(TimeMeasurement timeMeasurement) {
        ihc0 ihc0Var = timeMeasurement.pointTimestamps_;
        if (!ihc0Var.f102236a) {
            timeMeasurement.pointTimestamps_ = ihc0Var.m50613h();
        }
        return timeMeasurement.pointTimestamps_;
    }

    /* JADX INFO: renamed from: s */
    public static void m14446s(TimeMeasurement timeMeasurement, String str) {
        timeMeasurement.getClass();
        str.getClass();
        timeMeasurement.bitField0_ |= 1;
        timeMeasurement.category_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14447t(TimeMeasurement timeMeasurement, String str) {
        timeMeasurement.getClass();
        str.getClass();
        timeMeasurement.bitField0_ |= 2;
        timeMeasurement.featureId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m14448u(TimeMeasurement timeMeasurement, String str) {
        timeMeasurement.getClass();
        str.getClass();
        timeMeasurement.bitField0_ |= 4;
        timeMeasurement.measurementId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static gm71 m14449v() {
        return (gm71) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0005\u0000\u0000\u0001ဈ\u0000\u00022\u00032\u00042\u00052\u0006ဈ\u0001\u0007ဈ\u0002\bဈ\u0003\tဂ\u0004\n2", new Object[]{"bitField0_", "category_", "dimensions_", hm71.f92855a, "pointTimestamps_", lm71.f134808a, "pointDurations_", jm71.f113787a, "pointFeatureIds_", km71.f124077a, "featureId_", "measurementId_", "parentMeasurementId_", "parentEpochOffset_", "metadata_", im71.f103638a});
        }
        if (iOrdinal == 3) {
            return new TimeMeasurement();
        }
        if (iOrdinal == 4) {
            return new gm71(DEFAULT_INSTANCE);
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
        synchronized (TimeMeasurement.class) {
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
