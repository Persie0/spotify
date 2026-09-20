package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pkw;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$RequestSegmentDataParams extends AbstractC0269h implements sre0 {
    public static final int CDN_BASE_URL_FIELD_NUMBER = 3;
    private static final EsDownload$RequestSegmentDataParams DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 5;
    public static final int METADATA_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SEGMENT_FILE_STREAMER_FIELD_NUMBER = 1;
    public static final int START_FIELD_NUMBER = 4;
    public static final int URL_PATH_FIELD_NUMBER = 2;
    private int bitField0_;
    private long end_;
    private EsDownload$SegmentRequestMetadata metadata_;
    private EsDownload$SegmentFileStreamerId segmentFileStreamer_;
    private long start_;
    private String urlPath_ = "";
    private ae50 cdnBaseUrl_ = AbstractC0269h.emptyProtobufList();

    static {
        EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams = new EsDownload$RequestSegmentDataParams();
        DEFAULT_INSTANCE = esDownload$RequestSegmentDataParams;
        AbstractC0269h.registerDefaultInstance(EsDownload$RequestSegmentDataParams.class, esDownload$RequestSegmentDataParams);
    }

    private EsDownload$RequestSegmentDataParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9548n(EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams, ArrayList arrayList) {
        ae50 ae50Var = esDownload$RequestSegmentDataParams.cdnBaseUrl_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esDownload$RequestSegmentDataParams.cdnBaseUrl_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, esDownload$RequestSegmentDataParams.cdnBaseUrl_);
    }

    /* JADX INFO: renamed from: o */
    public static void m9549o(EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams, long j) {
        esDownload$RequestSegmentDataParams.end_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m9550p(EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams, EsDownload$SegmentRequestMetadata esDownload$SegmentRequestMetadata) {
        esDownload$RequestSegmentDataParams.getClass();
        esDownload$SegmentRequestMetadata.getClass();
        esDownload$RequestSegmentDataParams.metadata_ = esDownload$SegmentRequestMetadata;
        esDownload$RequestSegmentDataParams.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9551q(EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams, EsDownload$SegmentFileStreamerId esDownload$SegmentFileStreamerId) {
        esDownload$RequestSegmentDataParams.getClass();
        esDownload$SegmentFileStreamerId.getClass();
        esDownload$RequestSegmentDataParams.segmentFileStreamer_ = esDownload$SegmentFileStreamerId;
        esDownload$RequestSegmentDataParams.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m9552r(EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams, long j) {
        esDownload$RequestSegmentDataParams.start_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m9553s(EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams, String str) {
        esDownload$RequestSegmentDataParams.getClass();
        str.getClass();
        esDownload$RequestSegmentDataParams.urlPath_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static pkw m9554t() {
        return (pkw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ț\u0004\u0003\u0005\u0003\u0006ဉ\u0001", new Object[]{"bitField0_", "segmentFileStreamer_", "urlPath_", "cdnBaseUrl_", "start_", "end_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$RequestSegmentDataParams();
        }
        if (iOrdinal == 4) {
            return new pkw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$RequestSegmentDataParams.class) {
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
