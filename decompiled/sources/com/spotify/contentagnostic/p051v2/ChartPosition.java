package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ChartPosition extends AbstractC0269h implements sre0 {
    public static final int CHART_FIELD_NUMBER = 1;
    private static final ChartPosition DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 2;
    private int bitField0_;
    private Chart chart_;
    private int position_;

    static {
        ChartPosition chartPosition = new ChartPosition();
        DEFAULT_INSTANCE = chartPosition;
        AbstractC0269h.registerDefaultInstance(ChartPosition.class, chartPosition);
    }

    private ChartPosition() {
    }

    /* JADX INFO: renamed from: p */
    public static ChartPosition m7788p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "chart_", "position_"});
        }
        if (iOrdinal == 3) {
            return new ChartPosition();
        }
        if (iOrdinal == 4) {
            return new ioc(8);
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
        synchronized (ChartPosition.class) {
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

    /* JADX INFO: renamed from: o */
    public final Chart m7789o() {
        Chart chart = this.chart_;
        return chart == null ? Chart.m7786o() : chart;
    }

    /* JADX INFO: renamed from: q */
    public final int m7790q() {
        return this.position_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
