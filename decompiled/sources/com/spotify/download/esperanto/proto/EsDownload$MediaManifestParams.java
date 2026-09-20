package com.spotify.download.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kkw;
import p204p.lkw;
import p204p.mkw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsDownload$MediaManifestParams extends AbstractC0269h implements sre0 {
    private static final EsDownload$MediaManifestParams DEFAULT_INSTANCE;
    public static final int MANIFEST_ID_FIELD_NUMBER = 1;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    private int mediaType_;
    private int requestType_;
    private String manifestId_ = "";
    private String playbackId_ = "";
    private String sessionId_ = "";

    static {
        EsDownload$MediaManifestParams esDownload$MediaManifestParams = new EsDownload$MediaManifestParams();
        DEFAULT_INSTANCE = esDownload$MediaManifestParams;
        AbstractC0269h.registerDefaultInstance(EsDownload$MediaManifestParams.class, esDownload$MediaManifestParams);
    }

    private EsDownload$MediaManifestParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9523n(EsDownload$MediaManifestParams esDownload$MediaManifestParams, String str) {
        esDownload$MediaManifestParams.getClass();
        str.getClass();
        esDownload$MediaManifestParams.manifestId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9524o(EsDownload$MediaManifestParams esDownload$MediaManifestParams, lkw lkwVar) {
        esDownload$MediaManifestParams.getClass();
        esDownload$MediaManifestParams.mediaType_ = lkwVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m9525p(EsDownload$MediaManifestParams esDownload$MediaManifestParams, String str) {
        esDownload$MediaManifestParams.getClass();
        str.getClass();
        esDownload$MediaManifestParams.playbackId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9526q(EsDownload$MediaManifestParams esDownload$MediaManifestParams, mkw mkwVar) {
        esDownload$MediaManifestParams.getClass();
        esDownload$MediaManifestParams.requestType_ = mkwVar.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static void m9527r(EsDownload$MediaManifestParams esDownload$MediaManifestParams, String str) {
        esDownload$MediaManifestParams.getClass();
        str.getClass();
        esDownload$MediaManifestParams.sessionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static kkw m9528s() {
        return (kkw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\f", new Object[]{"manifestId_", "playbackId_", "sessionId_", "requestType_", "mediaType_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$MediaManifestParams();
        }
        if (iOrdinal == 4) {
            return new kkw(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$MediaManifestParams.class) {
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
