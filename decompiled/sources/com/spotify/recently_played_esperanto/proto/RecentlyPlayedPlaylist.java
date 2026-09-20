package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.playlist.proto.PlaylistMetadata;
import com.spotify.playlist.proto.PlaylistOfflineState;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedPlaylist extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 3;
    private static final RecentlyPlayedPlaylist DEFAULT_INSTANCE;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_METADATA_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int TYPE_STR_FIELD_NUMBER = 4;
    private int addTime_;
    private int bitField0_;
    private PlaylistOfflineState offlineState_;
    private PlaylistMetadata playlistMetadata_;
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedPlaylist recentlyPlayedPlaylist = new RecentlyPlayedPlaylist();
        DEFAULT_INSTANCE = recentlyPlayedPlaylist;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedPlaylist.class, recentlyPlayedPlaylist);
    }

    private RecentlyPlayedPlaylist() {
    }

    /* JADX INFO: renamed from: n */
    public static RecentlyPlayedPlaylist m20278n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b\u0004Ȉ\u0005ဉ\u0001", new Object[]{"bitField0_", "playlistMetadata_", "type_", "addTime_", "typeStr_", "offlineState_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedPlaylist();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 18);
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
        synchronized (RecentlyPlayedPlaylist.class) {
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
    public final PlaylistOfflineState m20279o() {
        PlaylistOfflineState playlistOfflineState = this.offlineState_;
        return playlistOfflineState == null ? PlaylistOfflineState.m18563o() : playlistOfflineState;
    }

    /* JADX INFO: renamed from: p */
    public final PlaylistMetadata m20280p() {
        PlaylistMetadata playlistMetadata = this.playlistMetadata_;
        return playlistMetadata == null ? PlaylistMetadata.m18540r() : playlistMetadata;
    }

    /* JADX INFO: renamed from: q */
    public final String m20281q() {
        return this.typeStr_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
