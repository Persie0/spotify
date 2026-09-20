package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.jkw;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$MediaManifestResponse extends AbstractC0269h implements sre0 {
    public static final int BYTES_FROM_NETWORK_FIELD_NUMBER = 3;
    private static final EsDownload$MediaManifestResponse DEFAULT_INSTANCE;
    public static final int HAD_CACHE_ERROR_FIELD_NUMBER = 2;
    public static final int MANIFEST_DATA_FIELD_NUMBER = 1;
    public static final int MANIFEST_ERROR_FIELD_NUMBER = 4;
    public static final int MANIFEST_URL_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER;
    private long bytesFromNetwork_;
    private boolean hadCacheError_;
    private int manifestError_;
    private gva manifestData_ = gva.f84678b;
    private String manifestUrl_ = "";

    static {
        EsDownload$MediaManifestResponse esDownload$MediaManifestResponse = new EsDownload$MediaManifestResponse();
        DEFAULT_INSTANCE = esDownload$MediaManifestResponse;
        AbstractC0269h.registerDefaultInstance(EsDownload$MediaManifestResponse.class, esDownload$MediaManifestResponse);
    }

    private EsDownload$MediaManifestResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static EsDownload$MediaManifestResponse m9529p(byte[] bArr) {
        return (EsDownload$MediaManifestResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0007\u0003\u0003\u0004\f\u0005Ȉ", new Object[]{"manifestData_", "hadCacheError_", "bytesFromNetwork_", "manifestError_", "manifestUrl_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$MediaManifestResponse();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 6);
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
        synchronized (EsDownload$MediaManifestResponse.class) {
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
    public final gva m9530n() {
        return this.manifestData_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final jkw m9531o() {
        jkw jkwVar;
        int i = this.manifestError_;
        if (i == 0) {
            jkwVar = jkw.MEDIA_MANIFEST_SUCCESS;
        } else if (i == 1) {
            jkwVar = jkw.MEDIA_MANIFEST_INVALID_MANIFEST_ID;
        } else if (i == 2) {
            jkwVar = jkw.MEDIA_MANIFEST_CONNECTION_ERROR;
        } else if (i == 3) {
            jkwVar = jkw.MEDIA_MANIFEST_HTTP_ERROR;
        } else if (i != 4) {
            jkwVar = i != 5 ? null : jkw.MEDIA_MANIFEST_HTTP_FORBIDDEN;
        } else {
            jkwVar = jkw.MEDIA_MANIFEST_CONNECTION_TIMEOUT;
        }
        return jkwVar == null ? jkw.UNRECOGNIZED : jkwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
