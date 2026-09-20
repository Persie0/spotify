package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ShowStatus extends AbstractC0269h implements sre0 {
    public static final int ARTWORK_FIELD_NUMBER = 2;
    private static final ShowStatus DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 6;
    public static final int GENERATION_PROGRESS_FIELD_NUMBER = 4;
    public static final int LAST_UPDATED_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_URI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private EpisodeStatus episode_;
    private GenerationProgress generationProgress_;
    private Timestamp lastUpdated_;
    private String title_ = "";
    private String artwork_ = "";
    private String showUri_ = "";

    static {
        ShowStatus showStatus = new ShowStatus();
        DEFAULT_INSTANCE = showStatus;
        AbstractC0269h.registerDefaultInstance(ShowStatus.class, showStatus);
    }

    private ShowStatus() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "title_", "artwork_", "showUri_", "generationProgress_", "lastUpdated_", "episode_"});
        }
        if (iOrdinal == 3) {
            return new ShowStatus();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 8);
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
        synchronized (ShowStatus.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m17511n() {
        return this.artwork_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EpisodeStatus m17512o() {
        EpisodeStatus episodeStatus = this.episode_;
        return episodeStatus == null ? EpisodeStatus.m17406n() : episodeStatus;
    }

    /* JADX INFO: renamed from: p */
    public final GenerationProgress m17513p() {
        GenerationProgress generationProgress = this.generationProgress_;
        return generationProgress == null ? GenerationProgress.m17411n() : generationProgress;
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m17514q() {
        Timestamp timestamp = this.lastUpdated_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: r */
    public final String m17515r() {
        return this.showUri_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m17516s() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17517t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
