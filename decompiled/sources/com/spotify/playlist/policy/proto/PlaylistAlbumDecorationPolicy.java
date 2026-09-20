package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import p204p.oep0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistAlbumDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int ALBUM_FIELD_NUMBER = 1;
    public static final int ARTIST_FIELD_NUMBER = 2;
    private static final PlaylistAlbumDecorationPolicy DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private AlbumDecorationPolicy album_;
    private ArtistDecorationPolicy artist_;
    private int bitField0_;

    static {
        PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = new PlaylistAlbumDecorationPolicy();
        DEFAULT_INSTANCE = playlistAlbumDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(PlaylistAlbumDecorationPolicy.class, playlistAlbumDecorationPolicy);
    }

    private PlaylistAlbumDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18327n(PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy, AlbumDecorationPolicy albumDecorationPolicy) {
        playlistAlbumDecorationPolicy.getClass();
        albumDecorationPolicy.getClass();
        playlistAlbumDecorationPolicy.album_ = albumDecorationPolicy;
        playlistAlbumDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static PlaylistAlbumDecorationPolicy m18328p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static oep0 m18329q() {
        return (oep0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "album_", "artist_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistAlbumDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new oep0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistAlbumDecorationPolicy.class) {
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
    public final AlbumDecorationPolicy m18330o() {
        AlbumDecorationPolicy albumDecorationPolicy = this.album_;
        return albumDecorationPolicy == null ? AlbumDecorationPolicy.getDefaultInstance() : albumDecorationPolicy;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
