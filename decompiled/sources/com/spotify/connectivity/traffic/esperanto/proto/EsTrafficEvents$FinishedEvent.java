package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ipw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficEvents$FinishedEvent extends AbstractC0269h implements sre0 {
    private static final EsTrafficEvents$FinishedEvent DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 1;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsTrafficConnectionMetrics$ConnectionMetrics metrics_;
    private EsTrafficRequestInfo$RequestInfo request_;
    private EsTrafficResponseInfo$ResponseInfo response_;

    static {
        EsTrafficEvents$FinishedEvent esTrafficEvents$FinishedEvent = new EsTrafficEvents$FinishedEvent();
        DEFAULT_INSTANCE = esTrafficEvents$FinishedEvent;
        AbstractC0269h.registerDefaultInstance(EsTrafficEvents$FinishedEvent.class, esTrafficEvents$FinishedEvent);
    }

    private EsTrafficEvents$FinishedEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7632n(EsTrafficEvents$FinishedEvent esTrafficEvents$FinishedEvent, EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics) {
        esTrafficEvents$FinishedEvent.getClass();
        esTrafficEvents$FinishedEvent.metrics_ = esTrafficConnectionMetrics$ConnectionMetrics;
        esTrafficEvents$FinishedEvent.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m7633o(EsTrafficEvents$FinishedEvent esTrafficEvents$FinishedEvent, EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo) {
        esTrafficEvents$FinishedEvent.getClass();
        esTrafficEvents$FinishedEvent.request_ = esTrafficRequestInfo$RequestInfo;
        esTrafficEvents$FinishedEvent.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m7634p(EsTrafficEvents$FinishedEvent esTrafficEvents$FinishedEvent, EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo) {
        esTrafficEvents$FinishedEvent.getClass();
        esTrafficEvents$FinishedEvent.response_ = esTrafficResponseInfo$ResponseInfo;
        esTrafficEvents$FinishedEvent.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsTrafficEvents$FinishedEvent m7635q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static ipw m7636v() {
        return (ipw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "request_", "response_", "metrics_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficEvents$FinishedEvent();
        }
        if (iOrdinal == 4) {
            return new ipw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$FinishedEvent.class) {
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

    /* JADX INFO: renamed from: r */
    public final EsTrafficConnectionMetrics$ConnectionMetrics m7637r() {
        EsTrafficConnectionMetrics$ConnectionMetrics esTrafficConnectionMetrics$ConnectionMetrics = this.metrics_;
        return esTrafficConnectionMetrics$ConnectionMetrics == null ? EsTrafficConnectionMetrics$ConnectionMetrics.m7606u() : esTrafficConnectionMetrics$ConnectionMetrics;
    }

    /* JADX INFO: renamed from: s */
    public final EsTrafficRequestInfo$RequestInfo m7638s() {
        EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo = this.request_;
        return esTrafficRequestInfo$RequestInfo == null ? EsTrafficRequestInfo$RequestInfo.m7678t() : esTrafficRequestInfo$RequestInfo;
    }

    /* JADX INFO: renamed from: t */
    public final EsTrafficResponseInfo$ResponseInfo m7639t() {
        EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo = this.response_;
        return esTrafficResponseInfo$ResponseInfo == null ? EsTrafficResponseInfo$ResponseInfo.m7686q() : esTrafficResponseInfo$ResponseInfo;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7640u() {
        return (this.bitField0_ & 4) != 0;
    }
}
