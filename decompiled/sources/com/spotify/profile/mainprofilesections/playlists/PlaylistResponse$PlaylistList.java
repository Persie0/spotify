package com.spotify.profile.mainprofilesections.playlists;

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
public final class PlaylistResponse$PlaylistList extends AbstractC0269h implements sre0 {
    private static final PlaylistResponse$PlaylistList DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLISTS_FIELD_NUMBER = 1;
    public static final int TOTAL_PUBLIC_PLAYLISTS_COUNT_FIELD_NUMBER = 2;
    private ae50 playlists_ = AbstractC0269h.emptyProtobufList();
    private int totalPublicPlaylistsCount_;

    static {
        PlaylistResponse$PlaylistList playlistResponse$PlaylistList = new PlaylistResponse$PlaylistList();
        DEFAULT_INSTANCE = playlistResponse$PlaylistList;
        AbstractC0269h.registerDefaultInstance(PlaylistResponse$PlaylistList.class, playlistResponse$PlaylistList);
    }

    private PlaylistResponse$PlaylistList() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"playlists_", PlaylistResponse$Playlist.class, "totalPublicPlaylistsCount_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistResponse$PlaylistList();
        }
        if (iOrdinal == 4) {
            return new zmp0(DEFAULT_INSTANCE, 18);
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
        synchronized (PlaylistResponse$PlaylistList.class) {
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

    /* JADX INFO: renamed from: n */
    public final int m19795n() {
        return this.playlists_.size();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m19796o() {
        return this.playlists_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
