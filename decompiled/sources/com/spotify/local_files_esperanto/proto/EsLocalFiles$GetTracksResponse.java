package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EsLocalFiles$GetTracksResponse extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final EsLocalFiles$GetTracksResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLocalFiles$Response data_;
    private EsLocalFiles$ResponseStatus status_;

    static {
        EsLocalFiles$GetTracksResponse esLocalFiles$GetTracksResponse = new EsLocalFiles$GetTracksResponse();
        DEFAULT_INSTANCE = esLocalFiles$GetTracksResponse;
        AbstractC0269h.registerDefaultInstance(EsLocalFiles$GetTracksResponse.class, esLocalFiles$GetTracksResponse);
    }

    private EsLocalFiles$GetTracksResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static EsLocalFiles$GetTracksResponse m13155o(byte[] bArr) {
        return (EsLocalFiles$GetTracksResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "status_", "data_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$GetTracksResponse();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 21);
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
        synchronized (EsLocalFiles$GetTracksResponse.class) {
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
    public final EsLocalFiles$Response m13156n() {
        EsLocalFiles$Response esLocalFiles$Response = this.data_;
        return esLocalFiles$Response == null ? EsLocalFiles$Response.m13161n() : esLocalFiles$Response;
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
