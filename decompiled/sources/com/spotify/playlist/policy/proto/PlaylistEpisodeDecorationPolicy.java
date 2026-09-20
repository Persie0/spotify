package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import p204p.ore0;
import p204p.pre0;
import p204p.qjp0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistEpisodeDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int ADDED_BY_FIELD_NUMBER = 8;
    public static final int ADD_TIME_FIELD_NUMBER = 3;
    public static final int COLLECTION_FIELD_NUMBER = 5;
    private static final PlaylistEpisodeDecorationPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 1;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 4;
    public static final int IS_RECOMMENDATION_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYED_STATE_FIELD_NUMBER = 7;
    public static final int ROW_ID_FIELD_NUMBER = 2;
    public static final int SHOW_FIELD_NUMBER = 9;
    public static final int SIGNALS_FIELD_NUMBER = 10;
    public static final int SYNC_FIELD_NUMBER = 6;
    private boolean addTime_;
    private UserDecorationPolicy addedBy_;
    private int bitField0_;
    private EpisodeCollectionDecorationPolicy collection_;
    private EpisodeDecorationPolicy episode_;
    private boolean formatListAttributes_;
    private boolean isRecommendation_;
    private EpisodePlayedStateDecorationPolicy playedState_;
    private boolean rowId_;
    private ShowDecorationPolicy show_;
    private boolean signals_;
    private EpisodeSyncDecorationPolicy sync_;

    static {
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = new PlaylistEpisodeDecorationPolicy();
        DEFAULT_INSTANCE = playlistEpisodeDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(PlaylistEpisodeDecorationPolicy.class, playlistEpisodeDecorationPolicy);
    }

    private PlaylistEpisodeDecorationPolicy() {
    }

    /* JADX INFO: renamed from: C */
    public static qjp0 m18379C() {
        return (qjp0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m18380n(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy) {
        playlistEpisodeDecorationPolicy.addTime_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m18381o(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy, UserDecorationPolicy userDecorationPolicy) {
        playlistEpisodeDecorationPolicy.getClass();
        userDecorationPolicy.getClass();
        playlistEpisodeDecorationPolicy.addedBy_ = userDecorationPolicy;
        playlistEpisodeDecorationPolicy.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: p */
    public static void m18382p(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy, EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        playlistEpisodeDecorationPolicy.getClass();
        episodeCollectionDecorationPolicy.getClass();
        playlistEpisodeDecorationPolicy.collection_ = episodeCollectionDecorationPolicy;
        playlistEpisodeDecorationPolicy.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18383q(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy, EpisodeDecorationPolicy episodeDecorationPolicy) {
        playlistEpisodeDecorationPolicy.getClass();
        episodeDecorationPolicy.getClass();
        playlistEpisodeDecorationPolicy.episode_ = episodeDecorationPolicy;
        playlistEpisodeDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m18384r(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy) {
        playlistEpisodeDecorationPolicy.formatListAttributes_ = true;
    }

    /* JADX INFO: renamed from: s */
    public static void m18385s(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy) {
        playlistEpisodeDecorationPolicy.isRecommendation_ = true;
    }

    /* JADX INFO: renamed from: t */
    public static void m18386t(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy, EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        playlistEpisodeDecorationPolicy.getClass();
        episodePlayedStateDecorationPolicy.getClass();
        playlistEpisodeDecorationPolicy.playedState_ = episodePlayedStateDecorationPolicy;
        playlistEpisodeDecorationPolicy.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: u */
    public static void m18387u(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy) {
        playlistEpisodeDecorationPolicy.rowId_ = true;
    }

    /* JADX INFO: renamed from: v */
    public static void m18388v(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy, ShowDecorationPolicy showDecorationPolicy) {
        playlistEpisodeDecorationPolicy.getClass();
        showDecorationPolicy.getClass();
        playlistEpisodeDecorationPolicy.show_ = showDecorationPolicy;
        playlistEpisodeDecorationPolicy.bitField0_ |= 32;
    }

    /* JADX INFO: renamed from: w */
    public static void m18389w(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy) {
        playlistEpisodeDecorationPolicy.signals_ = true;
    }

    /* JADX INFO: renamed from: x */
    public static void m18390x(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy, EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy) {
        playlistEpisodeDecorationPolicy.getClass();
        episodeSyncDecorationPolicy.getClass();
        playlistEpisodeDecorationPolicy.sync_ = episodeSyncDecorationPolicy;
        playlistEpisodeDecorationPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: z */
    public static PlaylistEpisodeDecorationPolicy m18391z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final EpisodeDecorationPolicy m18392A() {
        EpisodeDecorationPolicy episodeDecorationPolicy = this.episode_;
        return episodeDecorationPolicy == null ? EpisodeDecorationPolicy.getDefaultInstance() : episodeDecorationPolicy;
    }

    /* JADX INFO: renamed from: B */
    public final EpisodeSyncDecorationPolicy m18393B() {
        EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy = this.sync_;
        return episodeSyncDecorationPolicy == null ? EpisodeSyncDecorationPolicy.getDefaultInstance() : episodeSyncDecorationPolicy;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\u0007\u0004\u0007\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005\n\u0007\u000b\u0007", new Object[]{"bitField0_", "episode_", "rowId_", "addTime_", "formatListAttributes_", "collection_", "sync_", "playedState_", "addedBy_", "show_", "signals_", "isRecommendation_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistEpisodeDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new qjp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistEpisodeDecorationPolicy.class) {
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

    /* JADX INFO: renamed from: y */
    public final EpisodeCollectionDecorationPolicy m18394y() {
        EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = this.collection_;
        return episodeCollectionDecorationPolicy == null ? EpisodeCollectionDecorationPolicy.getDefaultInstance() : episodeCollectionDecorationPolicy;
    }
}
