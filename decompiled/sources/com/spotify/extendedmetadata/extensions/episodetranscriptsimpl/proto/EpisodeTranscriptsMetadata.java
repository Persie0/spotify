package com.spotify.extendedmetadata.extensions.episodetranscriptsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EpisodeTranscriptsMetadata extends AbstractC0269h implements sre0 {
    private static final EpisodeTranscriptsMetadata DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSCRIPTS_FIELD_NUMBER = 2;
    private String episodeUri_ = "";
    private ae50 transcripts_ = AbstractC0269h.emptyProtobufList();

    static {
        EpisodeTranscriptsMetadata episodeTranscriptsMetadata = new EpisodeTranscriptsMetadata();
        DEFAULT_INSTANCE = episodeTranscriptsMetadata;
        AbstractC0269h.registerDefaultInstance(EpisodeTranscriptsMetadata.class, episodeTranscriptsMetadata);
    }

    private EpisodeTranscriptsMetadata() {
    }

    /* JADX INFO: renamed from: p */
    public static EpisodeTranscriptsMetadata m10123p(byte[] bArr) {
        return (EpisodeTranscriptsMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"episodeUri_", "transcripts_", EpisodeTranscriptMetadata.class});
        }
        if (iOrdinal == 3) {
            return new EpisodeTranscriptsMetadata();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 25);
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
        synchronized (EpisodeTranscriptsMetadata.class) {
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
    public final String m10124n() {
        return this.episodeUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m10125o() {
        return this.transcripts_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
