package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nkw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$ProgressiveFileStreamerParams extends AbstractC0269h implements sre0 {
    private static final EsDownload$ProgressiveFileStreamerParams DEFAULT_INSTANCE;
    public static final int DISABLE_RANGE_REQUESTS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 1;
    private boolean disableRangeRequests_;
    private String url_ = "";
    private String playbackId_ = "";
    private String sessionId_ = "";

    static {
        EsDownload$ProgressiveFileStreamerParams esDownload$ProgressiveFileStreamerParams = new EsDownload$ProgressiveFileStreamerParams();
        DEFAULT_INSTANCE = esDownload$ProgressiveFileStreamerParams;
        AbstractC0269h.registerDefaultInstance(EsDownload$ProgressiveFileStreamerParams.class, esDownload$ProgressiveFileStreamerParams);
    }

    private EsDownload$ProgressiveFileStreamerParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9532n(EsDownload$ProgressiveFileStreamerParams esDownload$ProgressiveFileStreamerParams, boolean z) {
        esDownload$ProgressiveFileStreamerParams.disableRangeRequests_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m9533o(EsDownload$ProgressiveFileStreamerParams esDownload$ProgressiveFileStreamerParams, String str) {
        esDownload$ProgressiveFileStreamerParams.getClass();
        str.getClass();
        esDownload$ProgressiveFileStreamerParams.playbackId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9534p(EsDownload$ProgressiveFileStreamerParams esDownload$ProgressiveFileStreamerParams, String str) {
        esDownload$ProgressiveFileStreamerParams.getClass();
        str.getClass();
        esDownload$ProgressiveFileStreamerParams.sessionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9535q(EsDownload$ProgressiveFileStreamerParams esDownload$ProgressiveFileStreamerParams, String str) {
        esDownload$ProgressiveFileStreamerParams.getClass();
        str.getClass();
        esDownload$ProgressiveFileStreamerParams.url_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static nkw m9536r() {
        return (nkw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"url_", "playbackId_", "sessionId_", "disableRangeRequests_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$ProgressiveFileStreamerParams();
        }
        if (iOrdinal == 4) {
            return new nkw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$ProgressiveFileStreamerParams.class) {
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
