package com.spotify.extendedmetadata.extensions.episodetranscriptsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EpisodeTranscriptMetadata extends AbstractC0269h implements sre0 {
    public static final int CDN_URL_FIELD_NUMBER = 4;
    public static final int CURATED_FIELD_NUMBER = 3;
    private static final EpisodeTranscriptMetadata DEFAULT_INSTANCE;
    public static final int IS_STATIC_FIELD_NUMBER = 5;
    public static final int LANGUAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int READ_ALONG_URL_V2_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean curated_;
    private boolean isStatic_;
    private String uri_ = "";
    private String language_ = "";
    private String cdnUrl_ = "";
    private String readAlongUrlV2_ = "";

    static {
        EpisodeTranscriptMetadata episodeTranscriptMetadata = new EpisodeTranscriptMetadata();
        DEFAULT_INSTANCE = episodeTranscriptMetadata;
        AbstractC0269h.registerDefaultInstance(EpisodeTranscriptMetadata.class, episodeTranscriptMetadata);
    }

    private EpisodeTranscriptMetadata() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006Ȉ", new Object[]{"uri_", "language_", "curated_", "cdnUrl_", "isStatic_", "readAlongUrlV2_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeTranscriptMetadata();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 24);
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
        synchronized (EpisodeTranscriptMetadata.class) {
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

    public final String getLanguage() {
        return this.language_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m10119n() {
        return this.cdnUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10120o() {
        return this.curated_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10121p() {
        return this.isStatic_;
    }

    /* JADX INFO: renamed from: q */
    public final String m10122q() {
        return this.readAlongUrlV2_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
