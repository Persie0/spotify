package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jpw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficEvents$RequestReadyEvent extends AbstractC0269h implements sre0 {
    public static final int CONNECTION_INFO_FIELD_NUMBER = 2;
    private static final EsTrafficEvents$RequestReadyEvent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsTrafficConnectionInfo$ConnectionInfo connectionInfo_;
    private EsTrafficRequestInfo$RequestInfo request_;

    static {
        EsTrafficEvents$RequestReadyEvent esTrafficEvents$RequestReadyEvent = new EsTrafficEvents$RequestReadyEvent();
        DEFAULT_INSTANCE = esTrafficEvents$RequestReadyEvent;
        AbstractC0269h.registerDefaultInstance(EsTrafficEvents$RequestReadyEvent.class, esTrafficEvents$RequestReadyEvent);
    }

    private EsTrafficEvents$RequestReadyEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7641n(EsTrafficEvents$RequestReadyEvent esTrafficEvents$RequestReadyEvent, EsTrafficConnectionInfo$ConnectionInfo esTrafficConnectionInfo$ConnectionInfo) {
        esTrafficEvents$RequestReadyEvent.getClass();
        esTrafficConnectionInfo$ConnectionInfo.getClass();
        esTrafficEvents$RequestReadyEvent.connectionInfo_ = esTrafficConnectionInfo$ConnectionInfo;
        esTrafficEvents$RequestReadyEvent.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m7642o(EsTrafficEvents$RequestReadyEvent esTrafficEvents$RequestReadyEvent, EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo) {
        esTrafficEvents$RequestReadyEvent.getClass();
        esTrafficEvents$RequestReadyEvent.request_ = esTrafficRequestInfo$RequestInfo;
        esTrafficEvents$RequestReadyEvent.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsTrafficEvents$RequestReadyEvent m7643q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static jpw m7644s() {
        return (jpw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "connectionInfo_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficEvents$RequestReadyEvent();
        }
        if (iOrdinal == 4) {
            return new jpw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$RequestReadyEvent.class) {
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
    public final EsTrafficConnectionInfo$ConnectionInfo m7645p() {
        EsTrafficConnectionInfo$ConnectionInfo esTrafficConnectionInfo$ConnectionInfo = this.connectionInfo_;
        return esTrafficConnectionInfo$ConnectionInfo == null ? EsTrafficConnectionInfo$ConnectionInfo.m7598p() : esTrafficConnectionInfo$ConnectionInfo;
    }

    /* JADX INFO: renamed from: r */
    public final EsTrafficRequestInfo$RequestInfo m7646r() {
        EsTrafficRequestInfo$RequestInfo esTrafficRequestInfo$RequestInfo = this.request_;
        return esTrafficRequestInfo$RequestInfo == null ? EsTrafficRequestInfo$RequestInfo.m7678t() : esTrafficRequestInfo$RequestInfo;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
