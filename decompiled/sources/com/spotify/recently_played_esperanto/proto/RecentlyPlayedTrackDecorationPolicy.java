package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicy;
import p204p.ore0;
import p204p.p3v0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedTrackDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int ALBUM_ARTIST_POLICY_FIELD_NUMBER = 11;
    public static final int ALBUM_POLICY_FIELD_NUMBER = 10;
    public static final int ARTISTS_POLICY_FIELD_NUMBER = 9;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 1;
    private static final RecentlyPlayedTrackDecorationPolicy DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SYNC_POLICY_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 8;
    public static final int TRACK_POLICY_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 7;
    private ArtistDecorationPolicy albumArtistPolicy_;
    private AlbumDecorationPolicy albumPolicy_;
    private ArtistDecorationPolicy artistsPolicy_;
    private int bitField0_;
    private TrackCollectionDecorationPolicy collectionPolicy_;
    private TrackPlayedStateDecorationPolicy playedStatePolicy_;
    private TrackSyncDecorationPolicy syncPolicy_;
    private boolean timestamp_;
    private TrackDecorationPolicy trackPolicy_;
    private boolean type_;

    static {
        RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy = new RecentlyPlayedTrackDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedTrackDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedTrackDecorationPolicy.class, recentlyPlayedTrackDecorationPolicy);
    }

    private RecentlyPlayedTrackDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20307n(RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy, AlbumDecorationPolicy albumDecorationPolicy) {
        recentlyPlayedTrackDecorationPolicy.getClass();
        albumDecorationPolicy.getClass();
        recentlyPlayedTrackDecorationPolicy.albumPolicy_ = albumDecorationPolicy;
        recentlyPlayedTrackDecorationPolicy.bitField0_ |= 32;
    }

    /* JADX INFO: renamed from: o */
    public static void m20308o(RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy, ArtistDecorationPolicy artistDecorationPolicy) {
        recentlyPlayedTrackDecorationPolicy.getClass();
        artistDecorationPolicy.getClass();
        recentlyPlayedTrackDecorationPolicy.artistsPolicy_ = artistDecorationPolicy;
        recentlyPlayedTrackDecorationPolicy.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: p */
    public static void m20309p(RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy) {
        recentlyPlayedTrackDecorationPolicy.timestamp_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20310q(RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy, TrackDecorationPolicy trackDecorationPolicy) {
        recentlyPlayedTrackDecorationPolicy.getClass();
        trackDecorationPolicy.getClass();
        recentlyPlayedTrackDecorationPolicy.trackPolicy_ = trackDecorationPolicy;
        recentlyPlayedTrackDecorationPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m20311r(RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy) {
        recentlyPlayedTrackDecorationPolicy.type_ = true;
    }

    /* JADX INFO: renamed from: s */
    public static p3v0 m20312s() {
        return (p3v0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0007\u0007\b\u0007\tဉ\u0004\nဉ\u0005\u000bဉ\u0006", new Object[]{"bitField0_", "collectionPolicy_", "syncPolicy_", "trackPolicy_", "playedStatePolicy_", "type_", "timestamp_", "artistsPolicy_", "albumPolicy_", "albumArtistPolicy_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedTrackDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new p3v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedTrackDecorationPolicy.class) {
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
