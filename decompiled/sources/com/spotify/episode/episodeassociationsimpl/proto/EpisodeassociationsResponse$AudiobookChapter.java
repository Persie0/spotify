package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EpisodeassociationsResponse$AudiobookChapter extends AbstractC0269h implements sre0 {
    public static final int AUDIOBOOK_NAME_FIELD_NUMBER = 1;
    public static final int AUDIOBOOK_URI_FIELD_NUMBER = 4;
    public static final int AUTHOR_NAMES_FIELD_NUMBER = 5;
    private static final EpisodeassociationsResponse$AudiobookChapter DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String audiobookName_ = "";
    private String audiobookUri_ = "";
    private String authorNames_ = "";

    static {
        EpisodeassociationsResponse$AudiobookChapter episodeassociationsResponse$AudiobookChapter = new EpisodeassociationsResponse$AudiobookChapter();
        DEFAULT_INSTANCE = episodeassociationsResponse$AudiobookChapter;
        AbstractC0269h.registerDefaultInstance(EpisodeassociationsResponse$AudiobookChapter.class, episodeassociationsResponse$AudiobookChapter);
    }

    private EpisodeassociationsResponse$AudiobookChapter() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EpisodeassociationsResponse$AudiobookChapter m9702q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"audiobookName_", "audiobookUri_", "authorNames_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$AudiobookChapter();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 29);
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
        synchronized (EpisodeassociationsResponse$AudiobookChapter.class) {
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
    public final String m9703n() {
        return this.audiobookName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9704o() {
        return this.audiobookUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m9705p() {
        return this.authorNames_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
