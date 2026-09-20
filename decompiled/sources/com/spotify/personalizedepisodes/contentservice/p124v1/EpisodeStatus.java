package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EpisodeStatus extends AbstractC0269h implements sre0 {
    private static final EpisodeStatus DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 3;
    public static final int GENERATION_PROGRESS_FIELD_NUMBER = 1;
    public static final int LAST_UPDATED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String episodeUri_ = "";
    private GenerationProgress generationProgress_;
    private Timestamp lastUpdated_;

    static {
        EpisodeStatus episodeStatus = new EpisodeStatus();
        DEFAULT_INSTANCE = episodeStatus;
        AbstractC0269h.registerDefaultInstance(EpisodeStatus.class, episodeStatus);
    }

    private EpisodeStatus() {
    }

    /* JADX INFO: renamed from: n */
    public static EpisodeStatus m17406n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "generationProgress_", "lastUpdated_", "episodeUri_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeStatus();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 23);
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
        synchronized (EpisodeStatus.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m17407o() {
        return this.episodeUri_;
    }

    /* JADX INFO: renamed from: p */
    public final GenerationProgress m17408p() {
        GenerationProgress generationProgress = this.generationProgress_;
        return generationProgress == null ? GenerationProgress.m17411n() : generationProgress;
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m17409q() {
        Timestamp timestamp = this.lastUpdated_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m17410r() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
