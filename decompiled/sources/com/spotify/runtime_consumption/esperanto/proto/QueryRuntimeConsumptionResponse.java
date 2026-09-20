package com.spotify.runtime_consumption.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class QueryRuntimeConsumptionResponse extends AbstractC0269h implements sre0 {
    private static final QueryRuntimeConsumptionResponse DEFAULT_INSTANCE;
    public static final int MS_PLAYED_LOCAL_FIELD_NUMBER = 1;
    public static final int MS_PLAYED_NOMINAL_LOCAL_FIELD_NUMBER = 2;
    public static final int MS_PLAYED_NOMINAL_SENT_FIELD_NUMBER = 4;
    public static final int MS_PLAYED_SENT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private long msPlayedLocal_;
    private long msPlayedNominalLocal_;
    private long msPlayedNominalSent_;
    private long msPlayedSent_;

    static {
        QueryRuntimeConsumptionResponse queryRuntimeConsumptionResponse = new QueryRuntimeConsumptionResponse();
        DEFAULT_INSTANCE = queryRuntimeConsumptionResponse;
        AbstractC0269h.registerDefaultInstance(QueryRuntimeConsumptionResponse.class, queryRuntimeConsumptionResponse);
    }

    private QueryRuntimeConsumptionResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static QueryRuntimeConsumptionResponse m20427o(byte[] bArr) {
        return (QueryRuntimeConsumptionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"msPlayedLocal_", "msPlayedNominalLocal_", "msPlayedSent_", "msPlayedNominalSent_"});
        }
        if (iOrdinal == 3) {
            return new QueryRuntimeConsumptionResponse();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 15);
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
        synchronized (QueryRuntimeConsumptionResponse.class) {
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
    public final long m20428n() {
        return this.msPlayedNominalLocal_;
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
