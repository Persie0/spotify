package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.top0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistRequestDecorationPolicy extends AbstractC0269h implements sre0 {
    private static final PlaylistRequestDecorationPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 3;
    public static final int ITEM_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 1;
    public static final int TRACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private PlaylistEpisodeDecorationPolicy episode_;
    private PlaylistItemDecorationPolicy item_;
    private PlaylistDecorationPolicy playlist_;
    private PlaylistTrackDecorationPolicy track_;

    static {
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = new PlaylistRequestDecorationPolicy();
        DEFAULT_INSTANCE = playlistRequestDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(PlaylistRequestDecorationPolicy.class, playlistRequestDecorationPolicy);
    }

    private PlaylistRequestDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18416n(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy) {
        playlistRequestDecorationPolicy.getClass();
        playlistEpisodeDecorationPolicy.getClass();
        playlistRequestDecorationPolicy.episode_ = playlistEpisodeDecorationPolicy;
        playlistRequestDecorationPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m18417o(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        playlistRequestDecorationPolicy.getClass();
        playlistItemDecorationPolicy.getClass();
        playlistRequestDecorationPolicy.item_ = playlistItemDecorationPolicy;
        playlistRequestDecorationPolicy.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: p */
    public static void m18418p(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistRequestDecorationPolicy.getClass();
        playlistDecorationPolicy.getClass();
        playlistRequestDecorationPolicy.playlist_ = playlistDecorationPolicy;
        playlistRequestDecorationPolicy.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18419q(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistRequestDecorationPolicy.getClass();
        playlistTrackDecorationPolicy.getClass();
        playlistRequestDecorationPolicy.track_ = playlistTrackDecorationPolicy;
        playlistRequestDecorationPolicy.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static PlaylistRequestDecorationPolicy m18420r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static top0 m18421v() {
        return (top0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: w */
    public static PlaylistRequestDecorationPolicy m18422w(byte[] bArr) {
        return (PlaylistRequestDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "playlist_", "track_", "episode_", "item_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequestDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new top0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistRequestDecorationPolicy.class) {
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

    /* JADX INFO: renamed from: s */
    public final PlaylistEpisodeDecorationPolicy m18423s() {
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = this.episode_;
        return playlistEpisodeDecorationPolicy == null ? PlaylistEpisodeDecorationPolicy.m18391z() : playlistEpisodeDecorationPolicy;
    }

    /* JADX INFO: renamed from: t */
    public final PlaylistItemDecorationPolicy m18424t() {
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = this.item_;
        return playlistItemDecorationPolicy == null ? PlaylistItemDecorationPolicy.m18395C() : playlistItemDecorationPolicy;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final PlaylistTrackDecorationPolicy m18425u() {
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = this.track_;
        return playlistTrackDecorationPolicy == null ? PlaylistTrackDecorationPolicy.m18426C() : playlistTrackDecorationPolicy;
    }
}
