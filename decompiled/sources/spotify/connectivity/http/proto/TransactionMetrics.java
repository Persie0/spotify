package spotify.connectivity.http.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cy81;
import p204p.d69;
import p204p.fty;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class TransactionMetrics extends AbstractC0269h implements sre0 {
    public static final int BEARER_FIELD_NUMBER = 15;
    public static final int BYTERECEIVED_FIELD_NUMBER = 2;
    public static final int BYTESENT_FIELD_NUMBER = 1;
    public static final int CONNECTEND_FIELD_NUMBER = 7;
    public static final int CONNECTSTART_FIELD_NUMBER = 6;
    private static final TransactionMetrics DEFAULT_INSTANCE;
    public static final int FETCHTYPE_FIELD_NUMBER = 14;
    public static final int ISPROXYCONNECTION_FIELD_NUMBER = 12;
    public static final int ISREUSEDCONNECTION_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 5;
    public static final int REQUESTEND_FIELD_NUMBER = 9;
    public static final int REQUESTSTART_FIELD_NUMBER = 8;
    public static final int REQUESTURL_FIELD_NUMBER = 3;
    public static final int RESPONSEEND_FIELD_NUMBER = 11;
    public static final int RESPONSESTART_FIELD_NUMBER = 10;
    public static final int RESPONSESTATUS_FIELD_NUMBER = 4;
    private int bearer_;
    private int bitField0_;
    private long byteReceived_;
    private long byteSent_;
    private long connectEnd_;
    private long connectStart_;
    private int fetchType_;
    private boolean isProxyConnection_;
    private boolean isReusedConnection_;
    private long requestEnd_;
    private long requestStart_;
    private long responseEnd_;
    private long responseStart_;
    private int responseStatus_;
    private String requestURL_ = "";
    private String protocol_ = "";

    static {
        TransactionMetrics transactionMetrics = new TransactionMetrics();
        DEFAULT_INSTANCE = transactionMetrics;
        AbstractC0269h.registerDefaultInstance(TransactionMetrics.class, transactionMetrics);
    }

    private TransactionMetrics() {
    }

    /* JADX INFO: renamed from: A */
    public static void m97560A(TransactionMetrics transactionMetrics, long j) {
        transactionMetrics.bitField0_ |= 128;
        transactionMetrics.responseStart_ = j;
    }

    /* JADX INFO: renamed from: B */
    public static void m97561B(TransactionMetrics transactionMetrics, int i) {
        transactionMetrics.bitField0_ |= 2;
        transactionMetrics.responseStatus_ = i;
    }

    /* JADX INFO: renamed from: C */
    public static cy81 m97562C() {
        return (cy81) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m97563n(TransactionMetrics transactionMetrics, d69 d69Var) {
        transactionMetrics.getClass();
        transactionMetrics.bearer_ = d69Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m97564o(TransactionMetrics transactionMetrics, long j) {
        transactionMetrics.byteReceived_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m97565p(TransactionMetrics transactionMetrics, long j) {
        transactionMetrics.byteSent_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97566q(TransactionMetrics transactionMetrics, long j) {
        transactionMetrics.bitField0_ |= 16;
        transactionMetrics.connectEnd_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m97567r(TransactionMetrics transactionMetrics, long j) {
        transactionMetrics.bitField0_ |= 8;
        transactionMetrics.connectStart_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m97568s(TransactionMetrics transactionMetrics, fty ftyVar) {
        transactionMetrics.getClass();
        transactionMetrics.fetchType_ = ftyVar.getNumber();
    }

    /* JADX INFO: renamed from: t */
    public static void m97569t(TransactionMetrics transactionMetrics, boolean z) {
        transactionMetrics.isProxyConnection_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m97570u(TransactionMetrics transactionMetrics, boolean z) {
        transactionMetrics.isReusedConnection_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m97571v(TransactionMetrics transactionMetrics, String str) {
        transactionMetrics.getClass();
        str.getClass();
        transactionMetrics.bitField0_ |= 4;
        transactionMetrics.protocol_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m97572w(TransactionMetrics transactionMetrics, long j) {
        transactionMetrics.bitField0_ |= 64;
        transactionMetrics.requestEnd_ = j;
    }

    /* JADX INFO: renamed from: x */
    public static void m97573x(TransactionMetrics transactionMetrics, long j) {
        transactionMetrics.bitField0_ |= 32;
        transactionMetrics.requestStart_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m97574y(TransactionMetrics transactionMetrics, String str) {
        transactionMetrics.getClass();
        str.getClass();
        transactionMetrics.bitField0_ |= 1;
        transactionMetrics.requestURL_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m97575z(TransactionMetrics transactionMetrics, long j) {
        transactionMetrics.bitField0_ |= 256;
        transactionMetrics.responseEnd_ = j;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003ለ\u0000\u0004င\u0001\u0005ለ\u0002\u0006ဂ\u0003\u0007ဂ\u0004\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဂ\b\f\u0007\r\u0007\u000e\f\u000f\f", new Object[]{"bitField0_", "byteSent_", "byteReceived_", "requestURL_", "responseStatus_", "protocol_", "connectStart_", "connectEnd_", "requestStart_", "requestEnd_", "responseStart_", "responseEnd_", "isProxyConnection_", "isReusedConnection_", "fetchType_", "bearer_"});
        }
        if (iOrdinal == 3) {
            return new TransactionMetrics();
        }
        if (iOrdinal == 4) {
            return new cy81(DEFAULT_INSTANCE);
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
        synchronized (TransactionMetrics.class) {
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
