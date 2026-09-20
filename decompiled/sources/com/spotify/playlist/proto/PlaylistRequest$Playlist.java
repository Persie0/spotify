package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistRequest$Playlist extends AbstractC0269h implements sre0 {
    private static final PlaylistRequest$Playlist DEFAULT_INSTANCE;
    public static final int LENSES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_METADATA_FIELD_NUMBER = 1;
    public static final int PLAYLIST_OFFLINE_STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private PlaylistRequest$LensState lenses_;
    private PlaylistMetadata playlistMetadata_;
    private PlaylistOfflineState playlistOfflineState_;

    static {
        PlaylistRequest$Playlist playlistRequest$Playlist = new PlaylistRequest$Playlist();
        DEFAULT_INSTANCE = playlistRequest$Playlist;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$Playlist.class, playlistRequest$Playlist);
    }

    private PlaylistRequest$Playlist() {
    }

    /* JADX INFO: renamed from: o */
    public static PlaylistRequest$Playlist m18613o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "playlistMetadata_", "playlistOfflineState_", "lenses_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$Playlist();
        }
        if (iOrdinal == 4) {
            return new zmp0(15);
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
        synchronized (PlaylistRequest$Playlist.class) {
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

    /* JADX INFO: renamed from: p */
    public final PlaylistRequest$LensState m18614p() {
        PlaylistRequest$LensState playlistRequest$LensState = this.lenses_;
        return playlistRequest$LensState == null ? PlaylistRequest$LensState.m18607o() : playlistRequest$LensState;
    }

    /* JADX INFO: renamed from: q */
    public final PlaylistMetadata m18615q() {
        PlaylistMetadata playlistMetadata = this.playlistMetadata_;
        return playlistMetadata == null ? PlaylistMetadata.m18540r() : playlistMetadata;
    }

    /* JADX INFO: renamed from: r */
    public final PlaylistOfflineState m18616r() {
        PlaylistOfflineState playlistOfflineState = this.playlistOfflineState_;
        return playlistOfflineState == null ? PlaylistOfflineState.m18563o() : playlistOfflineState;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m18617s() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18618t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m18619u() {
        return (this.bitField0_ & 2) != 0;
    }
}
