package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedContext extends AbstractC0269h implements sre0 {
    public static final int ALBUM_FIELD_NUMBER = 2;
    public static final int ARTIST_FIELD_NUMBER = 1;
    public static final int COLLECTION_TRACKS_FIELD_NUMBER = 7;
    private static final RecentlyPlayedContext DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 6;
    public static final int PROFILE_FIELD_NUMBER = 5;
    public static final int SHOW_FIELD_NUMBER = 4;
    public static final int TRACK_FIELD_NUMBER = 3;
    private int contextCase_ = 0;
    private Object context_;

    static {
        RecentlyPlayedContext recentlyPlayedContext = new RecentlyPlayedContext();
        DEFAULT_INSTANCE = recentlyPlayedContext;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedContext.class, recentlyPlayedContext);
    }

    private RecentlyPlayedContext() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"context_", "contextCase_", RecentlyPlayedArtist.class, RecentlyPlayedAlbum.class, RecentlyPlayedTrack.class, RecentlyPlayedShow.class, RecentlyPlayedProfile.class, RecentlyPlayedPlaylist.class, RecentlyPlayedCollectionTracks.class, RecentlyPlayedEpisode.class});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedContext();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 16);
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
        synchronized (RecentlyPlayedContext.class) {
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

    public final boolean hasAlbum() {
        return this.contextCase_ == 2;
    }

    public final boolean hasArtist() {
        return this.contextCase_ == 1;
    }

    public final boolean hasPlaylist() {
        return this.contextCase_ == 6;
    }

    public final boolean hasProfile() {
        return this.contextCase_ == 5;
    }

    public final boolean hasShow() {
        return this.contextCase_ == 4;
    }

    /* JADX INFO: renamed from: n */
    public final RecentlyPlayedAlbum m20261n() {
        return this.contextCase_ == 2 ? (RecentlyPlayedAlbum) this.context_ : RecentlyPlayedAlbum.m20238p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final RecentlyPlayedArtist m20262o() {
        return this.contextCase_ == 1 ? (RecentlyPlayedArtist) this.context_ : RecentlyPlayedArtist.m20248o();
    }

    /* JADX INFO: renamed from: p */
    public final RecentlyPlayedCollectionTracks m20263p() {
        return this.contextCase_ == 7 ? (RecentlyPlayedCollectionTracks) this.context_ : RecentlyPlayedCollectionTracks.m20255n();
    }

    /* JADX INFO: renamed from: q */
    public final RecentlyPlayedEpisode m20264q() {
        return this.contextCase_ == 8 ? (RecentlyPlayedEpisode) this.context_ : RecentlyPlayedEpisode.m20272n();
    }

    /* JADX INFO: renamed from: r */
    public final RecentlyPlayedPlaylist m20265r() {
        return this.contextCase_ == 6 ? (RecentlyPlayedPlaylist) this.context_ : RecentlyPlayedPlaylist.m20278n();
    }

    /* JADX INFO: renamed from: s */
    public final RecentlyPlayedProfile m20266s() {
        return this.contextCase_ == 5 ? (RecentlyPlayedProfile) this.context_ : RecentlyPlayedProfile.m20286n();
    }

    /* JADX INFO: renamed from: t */
    public final RecentlyPlayedShow m20267t() {
        return this.contextCase_ == 4 ? (RecentlyPlayedShow) this.context_ : RecentlyPlayedShow.m20297n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final RecentlyPlayedTrack m20268u() {
        return this.contextCase_ == 3 ? (RecentlyPlayedTrack) this.context_ : RecentlyPlayedTrack.m20304n();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m20269v() {
        return this.contextCase_ == 7;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m20270w() {
        return this.contextCase_ == 8;
    }
}
