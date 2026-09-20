package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import p204p.c3v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedPlaylistDecorationPolicy extends AbstractC0269h implements sre0 {
    private static final RecentlyPlayedPlaylistDecorationPolicy DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_POLICY_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private PlaylistDecorationPolicy playlistPolicy_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedPlaylistDecorationPolicy recentlyPlayedPlaylistDecorationPolicy = new RecentlyPlayedPlaylistDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedPlaylistDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedPlaylistDecorationPolicy.class, recentlyPlayedPlaylistDecorationPolicy);
    }

    private RecentlyPlayedPlaylistDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20282n(RecentlyPlayedPlaylistDecorationPolicy recentlyPlayedPlaylistDecorationPolicy, PlaylistDecorationPolicy playlistDecorationPolicy) {
        recentlyPlayedPlaylistDecorationPolicy.getClass();
        playlistDecorationPolicy.getClass();
        recentlyPlayedPlaylistDecorationPolicy.playlistPolicy_ = playlistDecorationPolicy;
        recentlyPlayedPlaylistDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m20283o(RecentlyPlayedPlaylistDecorationPolicy recentlyPlayedPlaylistDecorationPolicy) {
        recentlyPlayedPlaylistDecorationPolicy.timestamp_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m20284p(RecentlyPlayedPlaylistDecorationPolicy recentlyPlayedPlaylistDecorationPolicy) {
        recentlyPlayedPlaylistDecorationPolicy.type_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static c3v0 m20285q() {
        return (c3v0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\u0007", new Object[]{"bitField0_", "playlistPolicy_", "type_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedPlaylistDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new c3v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedPlaylistDecorationPolicy.class) {
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
