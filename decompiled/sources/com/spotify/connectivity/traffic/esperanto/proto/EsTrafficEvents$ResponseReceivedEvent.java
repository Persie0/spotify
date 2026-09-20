package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kpw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficEvents$ResponseReceivedEvent extends AbstractC0269h implements sre0 {
    private static final EsTrafficEvents$ResponseReceivedEvent DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 1;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsTrafficConnectionMetrics$ConnectionMetrics metrics_;
    private EsTrafficRequestInfo$RequestInfo request_;
    private EsTrafficResponseInfo$ResponseInfo response_;

    static {
        EsTrafficEvents$ResponseReceivedEvent esTrafficEvents$ResponseReceivedEvent = new EsTrafficEvents$ResponseReceivedEvent();
        DEFAULT_INSTANCE = esTrafficEvents$ResponseReceivedEvent;
        AbstractC0269h.registerDefaultInstance(EsTrafficEvents$ResponseReceivedEvent.class, esTrafficEvents$ResponseReceivedEvent);
    }

    private EsTrafficEvents$ResponseReceivedEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7647n(EsTrafficEvents$ResponseReceivedEvent esTrafficEvents$ResponseReceivedEvent, EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo) {
        esTrafficEvents$ResponseReceivedEvent.getClass();
        esTrafficEvents$ResponseReceivedEvent.response_ = esTrafficResponseInfo$ResponseInfo;
        esTrafficEvents$ResponseReceivedEvent.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static EsTrafficEvents$ResponseReceivedEvent m7648o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static kpw m7649q() {
        return (kpw) DEFAULT_INSTANCE.createBuilder();
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
            return new EsTrafficEvents$ResponseReceivedEvent();
        }
        if (iOrdinal == 4) {
            return new kpw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$ResponseReceivedEvent.class) {
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
    public final EsTrafficResponseInfo$ResponseInfo m7650p() {
        EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo = this.response_;
        return esTrafficResponseInfo$ResponseInfo == null ? EsTrafficResponseInfo$ResponseInfo.m7686q() : esTrafficResponseInfo$ResponseInfo;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
