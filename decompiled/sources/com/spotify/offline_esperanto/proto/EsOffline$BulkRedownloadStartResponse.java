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
public final class EsOffline$BulkRedownloadStartResponse extends AbstractC0269h implements sre0 {
    private static final EsOffline$BulkRedownloadStartResponse DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STARTED_FIELD_NUMBER = 1;
    private String errorMessage_ = "";
    private boolean started_;

    static {
        EsOffline$BulkRedownloadStartResponse esOffline$BulkRedownloadStartResponse = new EsOffline$BulkRedownloadStartResponse();
        DEFAULT_INSTANCE = esOffline$BulkRedownloadStartResponse;
        AbstractC0269h.registerDefaultInstance(EsOffline$BulkRedownloadStartResponse.class, esOffline$BulkRedownloadStartResponse);
    }

    private EsOffline$BulkRedownloadStartResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static EsOffline$BulkRedownloadStartResponse m16087o(byte[] bArr) {
        return (EsOffline$BulkRedownloadStartResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"started_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$BulkRedownloadStartResponse();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 29);
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
        synchronized (EsOffline$BulkRedownloadStartResponse.class) {
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
    public final boolean m16088n() {
        return this.started_;
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
