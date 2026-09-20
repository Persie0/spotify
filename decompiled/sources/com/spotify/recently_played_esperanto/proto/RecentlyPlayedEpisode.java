package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.EpisodeCollectionState;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.EpisodeSyncState;
import com.spotify.cosmos.util.proto.ShowMetadata;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z2v0;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedEpisode extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 6;
    private static final RecentlyPlayedEpisode DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 1;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 3;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_METADATA_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_STR_FIELD_NUMBER = 8;
    private int addTime_;
    private int bitField0_;
    private EpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata episodeMetadata_;
    private EpisodeSyncState episodeOfflineState_;
    private EpisodePlayState episodePlayState_;
    private ShowMetadata showMetadata_;
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedEpisode recentlyPlayedEpisode = new RecentlyPlayedEpisode();
        DEFAULT_INSTANCE = recentlyPlayedEpisode;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedEpisode.class, recentlyPlayedEpisode);
    }

    private RecentlyPlayedEpisode() {
    }

    /* JADX INFO: renamed from: n */
    public static RecentlyPlayedEpisode m20272n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u000b\u0006\u000b\u0007ဉ\u0004\bȈ", new Object[]{"bitField0_", "episodeMetadata_", "episodeCollectionState_", "episodeOfflineState_", "episodePlayState_", "type_", "addTime_", "showMetadata_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedEpisode();
        }
        if (iOrdinal == 4) {
            return new z2v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedEpisode.class) {
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
    public final EpisodeMetadata m20273o() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.getDefaultInstance() : episodeMetadata;
    }

    /* JADX INFO: renamed from: p */
    public final String m20274p() {
        return this.typeStr_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
