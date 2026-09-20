package spotify.connectivity.http.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wyi;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class ConnectionMetrics extends AbstractC0269h implements sre0 {
    public static final int ADDITIONALCONTEXT_FIELD_NUMBER = 6;
    public static final int CONNECTIONTASKEND_FIELD_NUMBER = 4;
    public static final int CONNECTIONTASKSTART_FIELD_NUMBER = 3;
    private static final ConnectionMetrics DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECTCOUNT_FIELD_NUMBER = 2;
    public static final int TRANSACTIONMETRICS_FIELD_NUMBER = 5;
    private int bitField0_;
    private long connectionTaskEnd_;
    private long connectionTaskStart_;
    private double duration_;
    private int redirectCount_;
    private ae50 transactionMetrics_ = AbstractC0269h.emptyProtobufList();
    private String additionalContext_ = "";

    static {
        ConnectionMetrics connectionMetrics = new ConnectionMetrics();
        DEFAULT_INSTANCE = connectionMetrics;
        AbstractC0269h.registerDefaultInstance(ConnectionMetrics.class, connectionMetrics);
    }

    private ConnectionMetrics() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97552n(ConnectionMetrics connectionMetrics, ArrayList arrayList) {
        ae50 ae50Var = connectionMetrics.transactionMetrics_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            connectionMetrics.transactionMetrics_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, connectionMetrics.transactionMetrics_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97553o(ConnectionMetrics connectionMetrics, TransactionMetrics transactionMetrics) {
        connectionMetrics.getClass();
        transactionMetrics.getClass();
        ae50 ae50Var = connectionMetrics.transactionMetrics_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            connectionMetrics.transactionMetrics_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        connectionMetrics.transactionMetrics_.add(transactionMetrics);
    }

    /* JADX INFO: renamed from: p */
    public static void m97554p(ConnectionMetrics connectionMetrics, String str) {
        connectionMetrics.getClass();
        str.getClass();
        connectionMetrics.bitField0_ |= 2;
        connectionMetrics.additionalContext_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97555q(ConnectionMetrics connectionMetrics, long j) {
        connectionMetrics.connectionTaskEnd_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m97556r(ConnectionMetrics connectionMetrics, long j) {
        connectionMetrics.connectionTaskStart_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m97557s(ConnectionMetrics connectionMetrics, double d) {
        connectionMetrics.duration_ = d;
    }

    /* JADX INFO: renamed from: t */
    public static void m97558t(int i, ConnectionMetrics connectionMetrics) {
        connectionMetrics.bitField0_ |= 1;
        connectionMetrics.redirectCount_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static wyi m97559u() {
        return (wyi) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0000\u0002င\u0000\u0003\u0002\u0004\u0002\u0005\u001b\u0006ለ\u0001", new Object[]{"bitField0_", "duration_", "redirectCount_", "connectionTaskStart_", "connectionTaskEnd_", "transactionMetrics_", TransactionMetrics.class, "additionalContext_"});
        }
        if (iOrdinal == 3) {
            return new ConnectionMetrics();
        }
        if (iOrdinal == 4) {
            return new wyi(DEFAULT_INSTANCE);
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
        synchronized (ConnectionMetrics.class) {
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
