package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bkw;
import p204p.ckw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rkw;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$SegmentFileStreamerParams extends AbstractC0269h implements sre0 {
    public static final int CONTENT_FORM_FIELD_NUMBER = 5;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    private static final EsDownload$SegmentFileStreamerParams DEFAULT_INSTANCE;
    public static final int MEDIA_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    private int contentForm_;
    private int contentType_;
    private String mediaUrl_ = "";
    private String playbackId_ = "";
    private String sessionId_ = "";

    static {
        EsDownload$SegmentFileStreamerParams esDownload$SegmentFileStreamerParams = new EsDownload$SegmentFileStreamerParams();
        DEFAULT_INSTANCE = esDownload$SegmentFileStreamerParams;
        AbstractC0269h.registerDefaultInstance(EsDownload$SegmentFileStreamerParams.class, esDownload$SegmentFileStreamerParams);
    }

    private EsDownload$SegmentFileStreamerParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9559n(EsDownload$SegmentFileStreamerParams esDownload$SegmentFileStreamerParams, bkw bkwVar) {
        esDownload$SegmentFileStreamerParams.getClass();
        esDownload$SegmentFileStreamerParams.contentForm_ = bkwVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m9560o(EsDownload$SegmentFileStreamerParams esDownload$SegmentFileStreamerParams, ckw ckwVar) {
        esDownload$SegmentFileStreamerParams.getClass();
        esDownload$SegmentFileStreamerParams.contentType_ = ckwVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m9561p(EsDownload$SegmentFileStreamerParams esDownload$SegmentFileStreamerParams, String str) {
        esDownload$SegmentFileStreamerParams.getClass();
        str.getClass();
        esDownload$SegmentFileStreamerParams.mediaUrl_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9562q(EsDownload$SegmentFileStreamerParams esDownload$SegmentFileStreamerParams, String str) {
        esDownload$SegmentFileStreamerParams.getClass();
        str.getClass();
        esDownload$SegmentFileStreamerParams.playbackId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m9563r(EsDownload$SegmentFileStreamerParams esDownload$SegmentFileStreamerParams, String str) {
        esDownload$SegmentFileStreamerParams.getClass();
        str.getClass();
        esDownload$SegmentFileStreamerParams.sessionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static rkw m9564s() {
        return (rkw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\f", new Object[]{"mediaUrl_", "playbackId_", "sessionId_", "contentType_", "contentForm_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$SegmentFileStreamerParams();
        }
        if (iOrdinal == 4) {
            return new rkw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$SegmentFileStreamerParams.class) {
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
