package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicy;
import p204p.l2v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedArtistDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int ARTIST_POLICY_FIELD_NUMBER = 3;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 1;
    private static final RecentlyPlayedArtistDecorationPolicy DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_POLICY_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 4;
    private ArtistDecorationPolicy artistPolicy_;
    private int bitField0_;
    private ArtistCollectionDecorationPolicy collectionPolicy_;
    private ArtistSyncDecorationPolicy syncPolicy_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedArtistDecorationPolicy recentlyPlayedArtistDecorationPolicy = new RecentlyPlayedArtistDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedArtistDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedArtistDecorationPolicy.class, recentlyPlayedArtistDecorationPolicy);
    }

    private RecentlyPlayedArtistDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20251n(RecentlyPlayedArtistDecorationPolicy recentlyPlayedArtistDecorationPolicy, ArtistDecorationPolicy artistDecorationPolicy) {
        recentlyPlayedArtistDecorationPolicy.getClass();
        artistDecorationPolicy.getClass();
        recentlyPlayedArtistDecorationPolicy.artistPolicy_ = artistDecorationPolicy;
        recentlyPlayedArtistDecorationPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m20252o(RecentlyPlayedArtistDecorationPolicy recentlyPlayedArtistDecorationPolicy) {
        recentlyPlayedArtistDecorationPolicy.timestamp_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m20253p(RecentlyPlayedArtistDecorationPolicy recentlyPlayedArtistDecorationPolicy) {
        recentlyPlayedArtistDecorationPolicy.type_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static l2v0 m20254q() {
        return (l2v0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007\u0005\u0007", new Object[]{"bitField0_", "collectionPolicy_", "syncPolicy_", "artistPolicy_", "type_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedArtistDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new l2v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedArtistDecorationPolicy.class) {
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
