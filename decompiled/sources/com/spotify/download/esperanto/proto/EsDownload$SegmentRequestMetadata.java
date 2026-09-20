package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ckw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.skw;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$SegmentRequestMetadata extends AbstractC0269h implements sre0 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 3;
    private static final EsDownload$SegmentRequestMetadata DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_INDEX_FIELD_NUMBER = 1;
    public static final int TIME_OFFSET_FIELD_NUMBER = 2;
    private int contentType_;
    private int profileIndex_;
    private int timeOffset_;

    static {
        EsDownload$SegmentRequestMetadata esDownload$SegmentRequestMetadata = new EsDownload$SegmentRequestMetadata();
        DEFAULT_INSTANCE = esDownload$SegmentRequestMetadata;
        AbstractC0269h.registerDefaultInstance(EsDownload$SegmentRequestMetadata.class, esDownload$SegmentRequestMetadata);
    }

    private EsDownload$SegmentRequestMetadata() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9565n(EsDownload$SegmentRequestMetadata esDownload$SegmentRequestMetadata) {
        esDownload$SegmentRequestMetadata.getClass();
        esDownload$SegmentRequestMetadata.contentType_ = ckw.VIDEO.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m9566o(EsDownload$SegmentRequestMetadata esDownload$SegmentRequestMetadata) {
        esDownload$SegmentRequestMetadata.profileIndex_ = 0;
    }

    /* JADX INFO: renamed from: p */
    public static void m9567p(EsDownload$SegmentRequestMetadata esDownload$SegmentRequestMetadata) {
        esDownload$SegmentRequestMetadata.timeOffset_ = -1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static skw m9568q() {
        return (skw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\f", new Object[]{"profileIndex_", "timeOffset_", "contentType_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$SegmentRequestMetadata();
        }
        if (iOrdinal == 4) {
            return new skw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$SegmentRequestMetadata.class) {
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
