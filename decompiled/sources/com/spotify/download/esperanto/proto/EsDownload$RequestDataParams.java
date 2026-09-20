package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.okw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$RequestDataParams extends AbstractC0269h implements sre0 {
    private static final EsDownload$RequestDataParams DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 3;
    public static final int FILE_STREAMER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int START_FIELD_NUMBER = 2;
    private int bitField0_;
    private long end_;
    private EsDownload$FileStreamerId fileStreamer_;
    private long start_;

    static {
        EsDownload$RequestDataParams esDownload$RequestDataParams = new EsDownload$RequestDataParams();
        DEFAULT_INSTANCE = esDownload$RequestDataParams;
        AbstractC0269h.registerDefaultInstance(EsDownload$RequestDataParams.class, esDownload$RequestDataParams);
    }

    private EsDownload$RequestDataParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9537n(EsDownload$RequestDataParams esDownload$RequestDataParams, long j) {
        esDownload$RequestDataParams.end_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m9538o(EsDownload$RequestDataParams esDownload$RequestDataParams, EsDownload$FileStreamerId esDownload$FileStreamerId) {
        esDownload$RequestDataParams.getClass();
        esDownload$FileStreamerId.getClass();
        esDownload$RequestDataParams.fileStreamer_ = esDownload$FileStreamerId;
        esDownload$RequestDataParams.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m9539p(EsDownload$RequestDataParams esDownload$RequestDataParams, long j) {
        esDownload$RequestDataParams.start_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static okw m9540q() {
        return (okw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003\u0003\u0003", new Object[]{"bitField0_", "fileStreamer_", "start_", "end_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$RequestDataParams();
        }
        if (iOrdinal == 4) {
            return new okw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$RequestDataParams.class) {
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
