package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.spw;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficResponseInfo$ResponseInfo extends AbstractC0269h implements sre0 {
    public static final int BYTES_RECEIVED_FIELD_NUMBER = 2;
    private static final EsTrafficResponseInfo$ResponseInfo DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private long bytesReceived_;
    private int statusCode_;

    static {
        EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo = new EsTrafficResponseInfo$ResponseInfo();
        DEFAULT_INSTANCE = esTrafficResponseInfo$ResponseInfo;
        AbstractC0269h.registerDefaultInstance(EsTrafficResponseInfo$ResponseInfo.class, esTrafficResponseInfo$ResponseInfo);
    }

    private EsTrafficResponseInfo$ResponseInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7684n(EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo, long j) {
        esTrafficResponseInfo$ResponseInfo.bytesReceived_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m7685o(EsTrafficResponseInfo$ResponseInfo esTrafficResponseInfo$ResponseInfo, int i) {
        esTrafficResponseInfo$ResponseInfo.statusCode_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsTrafficResponseInfo$ResponseInfo m7686q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static spw m7687r() {
        return (spw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0002", new Object[]{"statusCode_", "bytesReceived_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficResponseInfo$ResponseInfo();
        }
        if (iOrdinal == 4) {
            return new spw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficResponseInfo$ResponseInfo.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final long m7688p() {
        return this.bytesReceived_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
