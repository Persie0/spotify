package com.spotify.mostplayed.p112v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Chart extends AbstractC0269h implements sre0 {
    private static final Chart DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 4;
    public static final int ENTRIES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_COUNT_FIELD_NUMBER = 2;
    public static final int START_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp end_;
    private ae50 entries_ = AbstractC0269h.emptyProtobufList();
    private int playCount_;
    private Timestamp start_;

    static {
        Chart chart = new Chart();
        DEFAULT_INSTANCE = chart;
        AbstractC0269h.registerDefaultInstance(Chart.class, chart);
    }

    private Chart() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "entries_", ChartEntry.class, "playCount_", "start_", "end_"});
        }
        if (iOrdinal == 3) {
            return new Chart();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 5);
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
        synchronized (Chart.class) {
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

    /* JADX INFO: renamed from: n */
    public final ae50 m15673n() {
        return this.entries_;
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
