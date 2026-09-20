package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hpw;
import p204p.npw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficEvents$FailedEvent extends AbstractC0269h implements sre0 {
    private static final EsTrafficEvents$FailedEvent DEFAULT_INSTANCE;
    public static final int FAILURE_MESSAGE_FIELD_NUMBER = 2;
    public static final int FAILURE_REASON_FIELD_NUMBER = 5;
    public static final int METRICS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 1;
    private int bitField0_;
    private String failureMessage_ = "";
    private int failureReason_;
    private EsTrafficConnectionMetrics$ConnectionMetrics metrics_;
    private EsTrafficRequestInfo$RequestInfo request_;

    static {
        EsTrafficEvents$FailedEvent esTrafficEvents$FailedEvent = new EsTrafficEvents$FailedEvent();
        DEFAULT_INSTANCE = esTrafficEvents$FailedEvent;
        AbstractC0269h.registerDefaultInstance(EsTrafficEvents$FailedEvent.class, esTrafficEvents$FailedEvent);
    }

    private EsTrafficEvents$FailedEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7621n(EsTrafficEvents$FailedEvent esTrafficEvents$FailedEvent, String str) {
        esTrafficEvents$FailedEvent.getClass();
        str.getClass();
        esTrafficEvents$FailedEvent.failureMessage_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7622o(EsTrafficEvents$FailedEvent esTrafficEvents$FailedEvent, npw npwVar) {
        esTrafficEvents$FailedEvent.getClass();
        esTrafficEvents$FailedEvent.failureReason_ = npwVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m7623p(EsTrafficEvents$FailedEvent esTrafficEvents$FailedEvent, EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics) {
        esTrafficEvents$FailedEvent.getClass();
        esTrafficEvents$FailedEvent.metrics_ = esTrafficConnectionMetrics$ConnectionMetrics;
        esTrafficEvents$FailedEvent.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m7624q(EsTrafficEvents$FailedEvent esTrafficEvents$FailedEvent, EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo) {
        esTrafficEvents$FailedEvent.getClass();
        esTrafficEvents$FailedEvent.request_ = esTrafficRequestInfo$RequestInfo;
        esTrafficEvents$FailedEvent.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static EsTrafficEvents$FailedEvent m7625r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static hpw m7626x() {
        return (hpw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0004ဉ\u0001\u0005\f", new Object[]{"bitField0_", "request_", "failureMessage_", "metrics_", "failureReason_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficEvents$FailedEvent();
        }
        if (iOrdinal == 4) {
            return new hpw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$FailedEvent.class) {
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
    public final String m7627s() {
        return this.failureMessage_;
    }

    /* JADX INFO: renamed from: t */
    public final npw m7628t() {
        npw npwVar;
        int i = this.failureReason_;
        if (i == 0) {
            npwVar = npw.FAILURE_REASON_UNSPECIFIED;
        } else if (i == 1) {
            npwVar = npw.FAILURE_REASON_TRANSPORT_ERROR;
        } else if (i != 2) {
            npwVar = i != 3 ? null : npw.FAILURE_REASON_CANCELLED;
        } else {
            npwVar = npw.FAILURE_REASON_TIMEOUT;
        }
        return npwVar == null ? npw.UNRECOGNIZED : npwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final EsTrafficConnectionMetrics$ConnectionMetrics m7629u() {
        EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics = this.metrics_;
        return esTrafficConnectionMetrics$ConnectionMetrics == null ? EsTrafficConnectionMetrics$ConnectionMetrics.m7606u() : esTrafficConnectionMetrics$ConnectionMetrics;
    }

    /* JADX INFO: renamed from: v */
    public final EsTrafficRequestInfo$RequestInfo m7630v() {
        EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo = this.request_;
        return esTrafficRequestInfo$RequestInfo == null ? EsTrafficRequestInfo$RequestInfo.m7678t() : esTrafficRequestInfo$RequestInfo;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7631w() {
        return (this.bitField0_ & 2) != 0;
    }
}
