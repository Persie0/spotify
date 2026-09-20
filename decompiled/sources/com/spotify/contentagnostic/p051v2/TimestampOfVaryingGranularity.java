package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.lq51;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class TimestampOfVaryingGranularity extends AbstractC0269h implements sre0 {
    private static final TimestampOfVaryingGranularity DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int YEAR_AND_MONTH_FIELD_NUMBER = 2;
    public static final int YEAR_FIELD_NUMBER = 1;
    public static final int YEAR_MONTH_AND_DAY_FIELD_NUMBER = 3;
    private int timestampCase_ = 0;
    private Object timestamp_;

    static {
        TimestampOfVaryingGranularity timestampOfVaryingGranularity = new TimestampOfVaryingGranularity();
        DEFAULT_INSTANCE = timestampOfVaryingGranularity;
        AbstractC0269h.registerDefaultInstance(TimestampOfVaryingGranularity.class, timestampOfVaryingGranularity);
    }

    private TimestampOfVaryingGranularity() {
    }

    /* JADX INFO: renamed from: o */
    public static TimestampOfVaryingGranularity m7940o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"timestamp_", "timestampCase_", Year.class, YearMonth.class, YearMonthDay.class});
        }
        if (iOrdinal == 3) {
            return new TimestampOfVaryingGranularity();
        }
        if (iOrdinal == 4) {
            return new qm71(8);
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
        synchronized (TimestampOfVaryingGranularity.class) {
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

    /* JADX INFO: renamed from: p */
    public final int m7941p() {
        return lq51.m59695a(this.timestampCase_);
    }

    /* JADX INFO: renamed from: q */
    public final Year m7942q() {
        return this.timestampCase_ == 1 ? (Year) this.timestamp_ : Year.m7989o();
    }

    /* JADX INFO: renamed from: r */
    public final YearMonth m7943r() {
        return this.timestampCase_ == 2 ? (YearMonth) this.timestamp_ : YearMonth.m7991o();
    }

    /* JADX INFO: renamed from: s */
    public final YearMonthDay m7944s() {
        return this.timestampCase_ == 3 ? (YearMonthDay) this.timestamp_ : YearMonthDay.m7994p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
