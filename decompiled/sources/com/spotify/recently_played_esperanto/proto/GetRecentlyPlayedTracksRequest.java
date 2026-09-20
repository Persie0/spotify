package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wa10;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetRecentlyPlayedTracksRequest extends AbstractC0269h implements sre0 {
    private static final GetRecentlyPlayedTracksRequest DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 6;
    public static final int INCLUDE_EPISODES_FIELD_NUMBER = 2;
    public static final int INCLUDE_HIDDEN_FIELD_NUMBER = 1;
    public static final int INCLUDE_LOCAL_TRACKS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_POLICY_FIELD_NUMBER = 5;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 4;
    private int bitField0_;
    private RecentlyPlayedEpisodeDecorationPolicy episodePolicy_;
    private boolean includeEpisodes_;
    private boolean includeHidden_;
    private boolean includeLocalTracks_;
    private RecentlyPlayedTrackDecorationPolicy trackPolicy_;
    private int updateThrottling_;

    static {
        GetRecentlyPlayedTracksRequest getRecentlyPlayedTracksRequest = new GetRecentlyPlayedTracksRequest();
        DEFAULT_INSTANCE = getRecentlyPlayedTracksRequest;
        AbstractC0269h.registerDefaultInstance(GetRecentlyPlayedTracksRequest.class, getRecentlyPlayedTracksRequest);
    }

    private GetRecentlyPlayedTracksRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20233n(GetRecentlyPlayedTracksRequest getRecentlyPlayedTracksRequest, RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy) {
        getRecentlyPlayedTracksRequest.getClass();
        recentlyPlayedTrackDecorationPolicy.getClass();
        getRecentlyPlayedTracksRequest.trackPolicy_ = recentlyPlayedTrackDecorationPolicy;
        getRecentlyPlayedTracksRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static wa10 m20234o() {
        return (wa10) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u000b\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "includeHidden_", "includeEpisodes_", "includeLocalTracks_", "updateThrottling_", "trackPolicy_", "episodePolicy_"});
        }
        if (iOrdinal == 3) {
            return new GetRecentlyPlayedTracksRequest();
        }
        if (iOrdinal == 4) {
            return new wa10(DEFAULT_INSTANCE);
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
        synchronized (GetRecentlyPlayedTracksRequest.class) {
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
