package com.spotify.profile.profile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes10.dex */
public final class PlaylistlistResponse$PlaylistList extends AbstractC0269h implements sre0 {
    private static final PlaylistlistResponse$PlaylistList DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLISTS_FIELD_NUMBER = 1;
    public static final int TOTAL_PUBLIC_PLAYLISTS_COUNT_FIELD_NUMBER = 2;
    private ae50 playlists_ = AbstractC0269h.emptyProtobufList();
    private int totalPublicPlaylistsCount_;

    static {
        PlaylistlistResponse$PlaylistList playlistlistResponse$PlaylistList = new PlaylistlistResponse$PlaylistList();
        DEFAULT_INSTANCE = playlistlistResponse$PlaylistList;
        AbstractC0269h.registerDefaultInstance(PlaylistlistResponse$PlaylistList.class, playlistlistResponse$PlaylistList);
    }

    private PlaylistlistResponse$PlaylistList() {
    }

    /* JADX INFO: renamed from: n */
    public static PlaylistlistResponse$PlaylistList m19801n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"playlists_", PlaylistlistResponse$Playlist.class, "totalPublicPlaylistsCount_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistlistResponse$PlaylistList();
        }
        if (iOrdinal == 4) {
            return new zmp0(DEFAULT_INSTANCE, 27);
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
        synchronized (PlaylistlistResponse$PlaylistList.class) {
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
    public final ae50 m19802o() {
        return this.playlists_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
