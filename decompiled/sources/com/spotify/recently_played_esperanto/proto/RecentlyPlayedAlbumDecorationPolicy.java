package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.AlbumCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import p204p.j2v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedAlbumDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 3;
    public static final int ARTISTS_POLICY_FIELD_NUMBER = 9;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 1;
    private static final RecentlyPlayedAlbumDecorationPolicy DEFAULT_INSTANCE;
    public static final int IN_COLLECTION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_POLICY_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 7;
    private AlbumDecorationPolicy albumPolicy_;
    private ArtistDecorationPolicy artistsPolicy_;
    private int bitField0_;
    private AlbumCollectionDecorationPolicy collectionPolicy_;
    private boolean inCollection_;
    private AlbumSyncDecorationPolicy syncPolicy_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy = new RecentlyPlayedAlbumDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedAlbumDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedAlbumDecorationPolicy.class, recentlyPlayedAlbumDecorationPolicy);
    }

    private RecentlyPlayedAlbumDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20242n(RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy, AlbumDecorationPolicy albumDecorationPolicy) {
        recentlyPlayedAlbumDecorationPolicy.getClass();
        albumDecorationPolicy.getClass();
        recentlyPlayedAlbumDecorationPolicy.albumPolicy_ = albumDecorationPolicy;
        recentlyPlayedAlbumDecorationPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m20243o(RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy, ArtistDecorationPolicy artistDecorationPolicy) {
        recentlyPlayedAlbumDecorationPolicy.getClass();
        artistDecorationPolicy.getClass();
        recentlyPlayedAlbumDecorationPolicy.artistsPolicy_ = artistDecorationPolicy;
        recentlyPlayedAlbumDecorationPolicy.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: p */
    public static void m20244p(RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy, AlbumSyncDecorationPolicy albumSyncDecorationPolicy) {
        recentlyPlayedAlbumDecorationPolicy.getClass();
        albumSyncDecorationPolicy.getClass();
        recentlyPlayedAlbumDecorationPolicy.syncPolicy_ = albumSyncDecorationPolicy;
        recentlyPlayedAlbumDecorationPolicy.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20245q(RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy) {
        recentlyPlayedAlbumDecorationPolicy.timestamp_ = true;
    }

    /* JADX INFO: renamed from: r */
    public static void m20246r(RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy) {
        recentlyPlayedAlbumDecorationPolicy.type_ = true;
    }

    /* JADX INFO: renamed from: s */
    public static j2v0 m20247s() {
        return (j2v0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007\u0007\u0007\b\u0007\tဉ\u0003", new Object[]{"bitField0_", "collectionPolicy_", "syncPolicy_", "albumPolicy_", "inCollection_", "type_", "timestamp_", "artistsPolicy_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedAlbumDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new j2v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedAlbumDecorationPolicy.class) {
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
