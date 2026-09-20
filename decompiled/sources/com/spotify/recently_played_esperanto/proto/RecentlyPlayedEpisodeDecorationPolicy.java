package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import p204p.a3v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedEpisodeDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 2;
    private static final RecentlyPlayedEpisodeDecorationPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SHOW_POLICY_FIELD_NUMBER = 5;
    public static final int SYNC_POLICY_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 6;
    private int bitField0_;
    private EpisodeCollectionDecorationPolicy collectionPolicy_;
    private EpisodeDecorationPolicy episodePolicy_;
    private EpisodePlayedStateDecorationPolicy playedStatePolicy_;
    private ShowDecorationPolicy showPolicy_;
    private EpisodeSyncDecorationPolicy syncPolicy_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedEpisodeDecorationPolicy recentlyPlayedEpisodeDecorationPolicy = new RecentlyPlayedEpisodeDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedEpisodeDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedEpisodeDecorationPolicy.class, recentlyPlayedEpisodeDecorationPolicy);
    }

    private RecentlyPlayedEpisodeDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20275n(RecentlyPlayedEpisodeDecorationPolicy recentlyPlayedEpisodeDecorationPolicy, EpisodeDecorationPolicy episodeDecorationPolicy) {
        recentlyPlayedEpisodeDecorationPolicy.getClass();
        episodeDecorationPolicy.getClass();
        recentlyPlayedEpisodeDecorationPolicy.episodePolicy_ = episodeDecorationPolicy;
        recentlyPlayedEpisodeDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m20276o(RecentlyPlayedEpisodeDecorationPolicy recentlyPlayedEpisodeDecorationPolicy) {
        recentlyPlayedEpisodeDecorationPolicy.timestamp_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static a3v0 m20277p() {
        return (a3v0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\u0007\u0007\u0007", new Object[]{"bitField0_", "episodePolicy_", "collectionPolicy_", "syncPolicy_", "playedStatePolicy_", "showPolicy_", "type_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedEpisodeDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new a3v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedEpisodeDecorationPolicy.class) {
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
