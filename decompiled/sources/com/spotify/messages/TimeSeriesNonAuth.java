package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tn71;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class TimeSeriesNonAuth extends AbstractC0269h implements sre0 {
    private static final TimeSeriesNonAuth DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 4;
    public static final int SEGMENT_FIELD_NUMBER = 2;
    public static final int TIMESERIES_ID_FIELD_NUMBER = 1;
    public static final int TIMESERIES_KEY_FIELD_NUMBER = 3;
    private int bitField0_;
    private int segment_;
    private String timeseriesId_ = "";
    private String timeseriesKey_ = "";
    private gva points_ = gva.f84678b;

    static {
        TimeSeriesNonAuth timeSeriesNonAuth = new TimeSeriesNonAuth();
        DEFAULT_INSTANCE = timeSeriesNonAuth;
        AbstractC0269h.registerDefaultInstance(TimeSeriesNonAuth.class, timeSeriesNonAuth);
    }

    private TimeSeriesNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14474n(TimeSeriesNonAuth timeSeriesNonAuth, gva gvaVar) {
        timeSeriesNonAuth.getClass();
        gvaVar.getClass();
        timeSeriesNonAuth.bitField0_ |= 8;
        timeSeriesNonAuth.points_ = gvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m14475o(TimeSeriesNonAuth timeSeriesNonAuth, int i) {
        timeSeriesNonAuth.bitField0_ |= 2;
        timeSeriesNonAuth.segment_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m14476p(TimeSeriesNonAuth timeSeriesNonAuth, String str) {
        timeSeriesNonAuth.getClass();
        str.getClass();
        timeSeriesNonAuth.bitField0_ |= 1;
        timeSeriesNonAuth.timeseriesId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14477q(TimeSeriesNonAuth timeSeriesNonAuth, String str) {
        timeSeriesNonAuth.getClass();
        str.getClass();
        timeSeriesNonAuth.bitField0_ |= 4;
        timeSeriesNonAuth.timeseriesKey_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static tn71 m14478r() {
        return (tn71) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"bitField0_", "timeseriesId_", "segment_", "timeseriesKey_", "points_"});
        }
        if (iOrdinal == 3) {
            return new TimeSeriesNonAuth();
        }
        if (iOrdinal == 4) {
            return new tn71(DEFAULT_INSTANCE);
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
        synchronized (TimeSeriesNonAuth.class) {
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
