package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fkw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$FinishSegmentDataRequestParams extends AbstractC0269h implements sre0 {
    private static final EsDownload$FinishSegmentDataRequestParams DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SEGMENT_FILE_STREAMER_FIELD_NUMBER = 1;
    public static final int URL_PATH_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsDownload$SegmentFileStreamerId segmentFileStreamer_;
    private String urlPath_ = "";

    static {
        EsDownload$FinishSegmentDataRequestParams esDownload$FinishSegmentDataRequestParams = new EsDownload$FinishSegmentDataRequestParams();
        DEFAULT_INSTANCE = esDownload$FinishSegmentDataRequestParams;
        AbstractC0269h.registerDefaultInstance(EsDownload$FinishSegmentDataRequestParams.class, esDownload$FinishSegmentDataRequestParams);
    }

    private EsDownload$FinishSegmentDataRequestParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9501n(EsDownload$FinishSegmentDataRequestParams esDownload$FinishSegmentDataRequestParams, EsDownload$SegmentFileStreamerId esDownload$SegmentFileStreamerId) {
        esDownload$FinishSegmentDataRequestParams.getClass();
        esDownload$SegmentFileStreamerId.getClass();
        esDownload$FinishSegmentDataRequestParams.segmentFileStreamer_ = esDownload$SegmentFileStreamerId;
        esDownload$FinishSegmentDataRequestParams.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m9502o(EsDownload$FinishSegmentDataRequestParams esDownload$FinishSegmentDataRequestParams, String str) {
        esDownload$FinishSegmentDataRequestParams.getClass();
        str.getClass();
        esDownload$FinishSegmentDataRequestParams.urlPath_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static fkw m9503p() {
        return (fkw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "segmentFileStreamer_", "urlPath_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$FinishSegmentDataRequestParams();
        }
        if (iOrdinal == 4) {
            return new fkw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$FinishSegmentDataRequestParams.class) {
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
