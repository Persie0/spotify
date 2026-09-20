package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.epw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficConnectionMetrics$ConnectionMetrics extends AbstractC0269h implements sre0 {
    public static final int CONNECTION_TASK_END_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int CONNECTION_TASK_START_TIMESTAMP_FIELD_NUMBER = 3;
    private static final EsTrafficConnectionMetrics$ConnectionMetrics DEFAULT_INSTANCE;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECT_COUNT_FIELD_NUMBER = 2;
    public static final int TRANSACTIONS_FIELD_NUMBER = 5;
    private long connectionTaskEndTimestamp_;
    private long connectionTaskStartTimestamp_;
    private double durationSeconds_;
    private int redirectCount_;
    private ae50 transactions_ = AbstractC0269h.emptyProtobufList();

    static {
        EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics = new EsTrafficConnectionMetrics$ConnectionMetrics();
        DEFAULT_INSTANCE = esTrafficConnectionMetrics$ConnectionMetrics;
        AbstractC0269h.registerDefaultInstance(EsTrafficConnectionMetrics$ConnectionMetrics.class, esTrafficConnectionMetrics$ConnectionMetrics);
    }

    private EsTrafficConnectionMetrics$ConnectionMetrics() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7601n(EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics, ArrayList arrayList) {
        ae50 ae50Var = esTrafficConnectionMetrics$ConnectionMetrics.transactions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esTrafficConnectionMetrics$ConnectionMetrics.transactions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, esTrafficConnectionMetrics$ConnectionMetrics.transactions_);
    }

    /* JADX INFO: renamed from: o */
    public static void m7602o(EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics, long j) {
        esTrafficConnectionMetrics$ConnectionMetrics.connectionTaskEndTimestamp_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m7603p(EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics, long j) {
        esTrafficConnectionMetrics$ConnectionMetrics.connectionTaskStartTimestamp_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m7604q(EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics, double d) {
        esTrafficConnectionMetrics$ConnectionMetrics.durationSeconds_ = d;
    }

    /* JADX INFO: renamed from: r */
    public static void m7605r(EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics, int i) {
        esTrafficConnectionMetrics$ConnectionMetrics.redirectCount_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static EsTrafficConnectionMetrics$ConnectionMetrics m7606u() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static epw m7607y() {
        return (epw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0000\u0002\u000b\u0003\u0002\u0004\u0002\u0005\u001b", new Object[]{"durationSeconds_", "redirectCount_", "connectionTaskStartTimestamp_", "connectionTaskEndTimestamp_", "transactions_", EsTrafficTransactionMetrics$TransactionMetrics.class});
        }
        if (iOrdinal == 3) {
            return new EsTrafficConnectionMetrics$ConnectionMetrics();
        }
        if (iOrdinal == 4) {
            return new epw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficConnectionMetrics$ConnectionMetrics.class) {
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

    /* JADX INFO: renamed from: s */
    public final long m7608s() {
        return this.connectionTaskEndTimestamp_;
    }

    /* JADX INFO: renamed from: t */
    public final long m7609t() {
        return this.connectionTaskStartTimestamp_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: v */
    public final double m7610v() {
        return this.durationSeconds_;
    }

    /* JADX INFO: renamed from: w */
    public final int m7611w() {
        return this.redirectCount_;
    }

    /* JADX INFO: renamed from: x */
    public final ae50 m7612x() {
        return this.transactions_;
    }
}
