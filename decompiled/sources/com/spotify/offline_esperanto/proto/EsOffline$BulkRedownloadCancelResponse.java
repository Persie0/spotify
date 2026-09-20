package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsOffline$BulkRedownloadCancelResponse extends AbstractC0269h implements sre0 {
    public static final int CANCELLED_FIELD_NUMBER = 1;
    private static final EsOffline$BulkRedownloadCancelResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private boolean cancelled_;

    static {
        EsOffline$BulkRedownloadCancelResponse esOffline$BulkRedownloadCancelResponse = new EsOffline$BulkRedownloadCancelResponse();
        DEFAULT_INSTANCE = esOffline$BulkRedownloadCancelResponse;
        AbstractC0269h.registerDefaultInstance(EsOffline$BulkRedownloadCancelResponse.class, esOffline$BulkRedownloadCancelResponse);
    }

    private EsOffline$BulkRedownloadCancelResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static EsOffline$BulkRedownloadCancelResponse m16078n(byte[] bArr) {
        return (EsOffline$BulkRedownloadCancelResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"cancelled_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$BulkRedownloadCancelResponse();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 27);
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
        synchronized (EsOffline$BulkRedownloadCancelResponse.class) {
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
