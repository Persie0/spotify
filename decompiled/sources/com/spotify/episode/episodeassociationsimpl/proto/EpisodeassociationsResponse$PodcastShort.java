package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EpisodeassociationsResponse$PodcastShort extends AbstractC0269h implements sre0 {
    public static final int AUTHOR_NAME_FIELD_NUMBER = 1;
    private static final EpisodeassociationsResponse$PodcastShort DEFAULT_INSTANCE;
    public static final int IS_19_PLUS_FIELD_NUMBER = 3;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String authorName_ = "";
    private boolean is19Plus_;
    private boolean isExplicit_;

    static {
        EpisodeassociationsResponse$PodcastShort episodeassociationsResponse$PodcastShort = new EpisodeassociationsResponse$PodcastShort();
        DEFAULT_INSTANCE = episodeassociationsResponse$PodcastShort;
        AbstractC0269h.registerDefaultInstance(EpisodeassociationsResponse$PodcastShort.class, episodeassociationsResponse$PodcastShort);
    }

    private EpisodeassociationsResponse$PodcastShort() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"authorName_", "isExplicit_", "is19Plus_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$PodcastShort();
        }
        if (iOrdinal == 4) {
            return new dbw(DEFAULT_INSTANCE, 7);
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
        synchronized (EpisodeassociationsResponse$PodcastShort.class) {
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
