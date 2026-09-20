package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cpw;
import p204p.opw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tpw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficTransactionMetrics$TransactionMetrics extends AbstractC0269h implements sre0 {
    public static final int BEARER_FIELD_NUMBER = 13;
    public static final int BODY_BYTES_SENT_FIELD_NUMBER = 2;
    public static final int BYTES_RECEIVED_FIELD_NUMBER = 3;
    public static final int BYTES_SENT_FIELD_NUMBER = 1;
    public static final int CONNECT_END_TIMESTAMP_FIELD_NUMBER = 8;
    public static final int CONNECT_START_TIMESTAMP_FIELD_NUMBER = 7;
    private static final EsTrafficTransactionMetrics$TransactionMetrics DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER = 16;
    public static final int IS_PROXY_CONNECTION_FIELD_NUMBER = 14;
    public static final int IS_REUSED_CONNECTION_FIELD_NUMBER = 15;
    private static volatile r2n0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 6;
    public static final int REQUEST_END_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int REQUEST_START_TIMESTAMP_FIELD_NUMBER = 9;
    public static final int REQUEST_URL_FIELD_NUMBER = 4;
    public static final int RESPONSE_END_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int RESPONSE_START_TIMESTAMP_FIELD_NUMBER = 11;
    public static final int RESPONSE_STATUS_FIELD_NUMBER = 5;
    private int bearer_;
    private int bitField0_;
    private long bodyBytesSent_;
    private long bytesReceived_;
    private long bytesSent_;
    private long connectEndTimestamp_;
    private long connectStartTimestamp_;
    private int fetchType_;
    private boolean isProxyConnection_;
    private boolean isReusedConnection_;
    private long requestEndTimestamp_;
    private long requestStartTimestamp_;
    private long responseEndTimestamp_;
    private long responseStartTimestamp_;
    private int responseStatus_;
    private String requestUrl_ = "";
    private String protocol_ = "";

    static {
        EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics = new EsTrafficTransactionMetrics$TransactionMetrics();
        DEFAULT_INSTANCE = esTrafficTransactionMetrics$TransactionMetrics;
        AbstractC0269h.registerDefaultInstance(EsTrafficTransactionMetrics$TransactionMetrics.class, esTrafficTransactionMetrics$TransactionMetrics);
    }

    private EsTrafficTransactionMetrics$TransactionMetrics() {
    }

    /* JADX INFO: renamed from: A */
    public static void m7689A(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, long j) {
        esTrafficTransactionMetrics$TransactionMetrics.bitField0_ |= 256;
        esTrafficTransactionMetrics$TransactionMetrics.responseEndTimestamp_ = j;
    }

    /* JADX INFO: renamed from: B */
    public static void m7690B(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, long j) {
        esTrafficTransactionMetrics$TransactionMetrics.bitField0_ |= 128;
        esTrafficTransactionMetrics$TransactionMetrics.responseStartTimestamp_ = j;
    }

    /* JADX INFO: renamed from: C */
    public static void m7691C(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, int i) {
        esTrafficTransactionMetrics$TransactionMetrics.bitField0_ |= 2;
        esTrafficTransactionMetrics$TransactionMetrics.responseStatus_ = i;
    }

    /* JADX INFO: renamed from: c0 */
    public static tpw m7692c0() {
        return (tpw) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m7693n(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, cpw cpwVar) {
        esTrafficTransactionMetrics$TransactionMetrics.getClass();
        esTrafficTransactionMetrics$TransactionMetrics.bearer_ = cpwVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m7694o(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, long j) {
        esTrafficTransactionMetrics$TransactionMetrics.bodyBytesSent_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m7695p(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, long j) {
        esTrafficTransactionMetrics$TransactionMetrics.bytesReceived_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m7696q(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, long j) {
        esTrafficTransactionMetrics$TransactionMetrics.bytesSent_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m7697r(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, long j) {
        esTrafficTransactionMetrics$TransactionMetrics.bitField0_ |= 16;
        esTrafficTransactionMetrics$TransactionMetrics.connectEndTimestamp_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m7698s(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, long j) {
        esTrafficTransactionMetrics$TransactionMetrics.bitField0_ |= 8;
        esTrafficTransactionMetrics$TransactionMetrics.connectStartTimestamp_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m7699t(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, opw opwVar) {
        esTrafficTransactionMetrics$TransactionMetrics.getClass();
        esTrafficTransactionMetrics$TransactionMetrics.fetchType_ = opwVar.getNumber();
    }

    /* JADX INFO: renamed from: u */
    public static void m7700u(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, boolean z) {
        esTrafficTransactionMetrics$TransactionMetrics.isProxyConnection_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m7701v(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, boolean z) {
        esTrafficTransactionMetrics$TransactionMetrics.isReusedConnection_ = z;
    }

    /* JADX INFO: renamed from: w */
    public static void m7702w(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, String str) {
        esTrafficTransactionMetrics$TransactionMetrics.getClass();
        str.getClass();
        esTrafficTransactionMetrics$TransactionMetrics.bitField0_ |= 4;
        esTrafficTransactionMetrics$TransactionMetrics.protocol_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m7703x(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, long j) {
        esTrafficTransactionMetrics$TransactionMetrics.bitField0_ |= 64;
        esTrafficTransactionMetrics$TransactionMetrics.requestEndTimestamp_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m7704y(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, long j) {
        esTrafficTransactionMetrics$TransactionMetrics.bitField0_ |= 32;
        esTrafficTransactionMetrics$TransactionMetrics.requestStartTimestamp_ = j;
    }

    /* JADX INFO: renamed from: z */
    public static void m7705z(EsTrafficTransactionMetrics$TransactionMetrics esTrafficTransactionMetrics$TransactionMetrics, String str) {
        esTrafficTransactionMetrics$TransactionMetrics.getClass();
        str.getClass();
        esTrafficTransactionMetrics$TransactionMetrics.bitField0_ |= 1;
        esTrafficTransactionMetrics$TransactionMetrics.requestUrl_ = str;
    }

    /* JADX INFO: renamed from: D */
    public final cpw m7706D() {
        cpw cpwVarM33568a = cpw.m33568a(this.bearer_);
        return cpwVarM33568a == null ? cpw.UNRECOGNIZED : cpwVarM33568a;
    }

    /* JADX INFO: renamed from: E */
    public final long m7707E() {
        return this.bodyBytesSent_;
    }

    /* JADX INFO: renamed from: F */
    public final long m7708F() {
        return this.bytesReceived_;
    }

    /* JADX INFO: renamed from: G */
    public final long m7709G() {
        return this.bytesSent_;
    }

    /* JADX INFO: renamed from: H */
    public final long m7710H() {
        return this.connectEndTimestamp_;
    }

    /* JADX INFO: renamed from: I */
    public final long m7711I() {
        return this.connectStartTimestamp_;
    }

    /* JADX INFO: renamed from: J */
    public final opw m7712J() {
        opw opwVar;
        int i = this.fetchType_;
        if (i == 0) {
            opwVar = opw.FETCH_TYPE_UNKNOWN;
        } else if (i != 1) {
            opwVar = i != 2 ? null : opw.FETCH_TYPE_LOCAL_CACHE;
        } else {
            opwVar = opw.FETCH_TYPE_NETWORK;
        }
        return opwVar == null ? opw.UNRECOGNIZED : opwVar;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m7713K() {
        return this.isProxyConnection_;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m7714L() {
        return this.isReusedConnection_;
    }

    /* JADX INFO: renamed from: M */
    public final String m7715M() {
        return this.protocol_;
    }

    /* JADX INFO: renamed from: N */
    public final long m7716N() {
        return this.requestEndTimestamp_;
    }

    /* JADX INFO: renamed from: O */
    public final long m7717O() {
        return this.requestStartTimestamp_;
    }

    /* JADX INFO: renamed from: P */
    public final String m7718P() {
        return this.requestUrl_;
    }

    /* JADX INFO: renamed from: Q */
    public final long m7719Q() {
        return this.responseEndTimestamp_;
    }

    /* JADX INFO: renamed from: R */
    public final long m7720R() {
        return this.responseStartTimestamp_;
    }

    /* JADX INFO: renamed from: S */
    public final int m7721S() {
        return this.responseStatus_;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m7722T() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m7723U() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m7724V() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m7725W() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m7726X() {
        return (this.bitField0_ & 32) != 0;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m7727Y() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m7728Z() {
        return (this.bitField0_ & 256) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m7729a0() {
        return (this.bitField0_ & 128) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m7730b0() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004ለ\u0000\u0005င\u0001\u0006ለ\u0002\u0007ဂ\u0003\bဂ\u0004\tဂ\u0005\nဂ\u0006\u000bဂ\u0007\fဂ\b\r\f\u000e\u0007\u000f\u0007\u0010\f", new Object[]{"bitField0_", "bytesSent_", "bodyBytesSent_", "bytesReceived_", "requestUrl_", "responseStatus_", "protocol_", "connectStartTimestamp_", "connectEndTimestamp_", "requestStartTimestamp_", "requestEndTimestamp_", "responseStartTimestamp_", "responseEndTimestamp_", "bearer_", "isProxyConnection_", "isReusedConnection_", "fetchType_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficTransactionMetrics$TransactionMetrics();
        }
        if (iOrdinal == 4) {
            return new tpw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficTransactionMetrics$TransactionMetrics.class) {
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
