package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dkw;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$RequestDataResponse extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 5;
    private static final EsDownload$RequestDataResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int FINAL_FIELD_NUMBER = 3;
    public static final int FROM_NETWORK_FIELD_NUMBER = 7;
    public static final int HAD_CACHE_ERROR_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int PREVIOUSLY_CACHED_FIELD_NUMBER = 6;
    public static final int TOTAL_SIZE_FIELD_NUMBER = 2;
    private gva data_ = gva.f84678b;
    private int error_;
    private boolean final_;
    private long fromNetwork_;
    private boolean hadCacheError_;
    private long position_;
    private long previouslyCached_;
    private long totalSize_;

    static {
        EsDownload$RequestDataResponse esDownload$RequestDataResponse = new EsDownload$RequestDataResponse();
        DEFAULT_INSTANCE = esDownload$RequestDataResponse;
        AbstractC0269h.registerDefaultInstance(EsDownload$RequestDataResponse.class, esDownload$RequestDataResponse);
    }

    private EsDownload$RequestDataResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static EsDownload$RequestDataResponse m9541t(byte[] bArr) {
        return (EsDownload$RequestDataResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0007\u0004\f\u0005\n\u0006\u0003\u0007\u0003\b\u0007", new Object[]{"position_", "totalSize_", "final_", "error_", "data_", "previouslyCached_", "fromNetwork_", "hadCacheError_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$RequestDataResponse();
        }
        if (iOrdinal == 4) {
            return new qjw(DEFAULT_INSTANCE, 7);
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
        synchronized (EsDownload$RequestDataResponse.class) {
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

    public final gva getData() {
        return this.data_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final dkw m9542n() {
        dkw dkwVar;
        int i = this.error_;
        if (i != 0) {
            dkwVar = i != 1 ? null : dkw.GENERIC;
        } else {
            dkwVar = dkw.SUCCESS;
        }
        return dkwVar == null ? dkw.UNRECOGNIZED : dkwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9543o() {
        return this.final_;
    }

    /* JADX INFO: renamed from: p */
    public final long m9544p() {
        return this.fromNetwork_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9545q() {
        return this.hadCacheError_;
    }

    /* JADX INFO: renamed from: r */
    public final long m9546r() {
        return this.position_;
    }

    /* JADX INFO: renamed from: s */
    public final long m9547s() {
        return this.totalSize_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
