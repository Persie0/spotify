package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tkw;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$GetMediaHandleIdResponse extends AbstractC0269h implements sre0 {
    private static final EsDownload$GetMediaHandleIdResponse DEFAULT_INSTANCE;
    public static final int HANDLE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int handleId_;
    private int status_;

    static {
        EsDownload$GetMediaHandleIdResponse esDownload$GetMediaHandleIdResponse = new EsDownload$GetMediaHandleIdResponse();
        DEFAULT_INSTANCE = esDownload$GetMediaHandleIdResponse;
        AbstractC0269h.registerDefaultInstance(EsDownload$GetMediaHandleIdResponse.class, esDownload$GetMediaHandleIdResponse);
    }

    private EsDownload$GetMediaHandleIdResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static EsDownload$GetMediaHandleIdResponse m9509p(byte[] bArr) {
        return (EsDownload$GetMediaHandleIdResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဌ\u0000", new Object[]{"bitField0_", "handleId_", "status_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$GetMediaHandleIdResponse();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 5);
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
        synchronized (EsDownload$GetMediaHandleIdResponse.class) {
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

    public final boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final int m9510n() {
        return this.handleId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final tkw m9511o() {
        tkw tkwVar;
        int i = this.status_;
        if (i == 0) {
            tkwVar = tkw.OK;
        } else if (i != 1) {
            tkwVar = i != 2 ? null : tkw.SUNSET;
        } else {
            tkwVar = tkw.FAILED;
        }
        return tkwVar == null ? tkw.UNRECOGNIZED : tkwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
