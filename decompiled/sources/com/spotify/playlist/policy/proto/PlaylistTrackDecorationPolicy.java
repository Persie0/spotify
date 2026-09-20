package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import p204p.ktp0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistTrackDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int ADDED_BY_FIELD_NUMBER = 12;
    public static final int ADD_TIME_FIELD_NUMBER = 3;
    public static final int ALBUM_FIELD_NUMBER = 13;
    public static final int ARTIST_FIELD_NUMBER = 14;
    public static final int CAN_ADD_TO_COLLECTION_FIELD_NUMBER = 5;
    public static final int CAN_BAN_FIELD_NUMBER = 7;
    private static final PlaylistTrackDecorationPolicy DEFAULT_INSTANCE;
    public static final int DISPLAY_COVERS_FIELD_NUMBER = 11;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 10;
    public static final int IN_COLLECTION_FIELD_NUMBER = 4;
    public static final int IS_BANNED_FIELD_NUMBER = 6;
    public static final int IS_RECOMMENDATION_FIELD_NUMBER = 16;
    public static final int LOCAL_FILE_FIELD_NUMBER = 8;
    public static final int OFFLINE_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 2;
    public static final int SIGNALS_FIELD_NUMBER = 15;
    public static final int TRACK_FIELD_NUMBER = 1;
    private boolean addTime_;
    private UserDecorationPolicy addedBy_;
    private PlaylistAlbumDecorationPolicy album_;
    private ArtistDecorationPolicy artist_;
    private int bitField0_;
    private boolean canAddToCollection_;
    private boolean canBan_;
    private boolean displayCovers_;
    private boolean formatListAttributes_;
    private boolean inCollection_;
    private boolean isBanned_;
    private boolean isRecommendation_;
    private boolean localFile_;
    private boolean offline_;
    private boolean rowId_;
    private boolean signals_;
    private TrackDecorationPolicy track_;

    static {
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = new PlaylistTrackDecorationPolicy();
        DEFAULT_INSTANCE = playlistTrackDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(PlaylistTrackDecorationPolicy.class, playlistTrackDecorationPolicy);
    }

    private PlaylistTrackDecorationPolicy() {
    }

    /* JADX INFO: renamed from: C */
    public static PlaylistTrackDecorationPolicy m18426C() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static ktp0 m18427E() {
        return (ktp0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m18428n(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.addTime_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m18429o(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy, UserDecorationPolicy userDecorationPolicy) {
        playlistTrackDecorationPolicy.getClass();
        userDecorationPolicy.getClass();
        playlistTrackDecorationPolicy.addedBy_ = userDecorationPolicy;
        playlistTrackDecorationPolicy.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m18430p(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy, PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy) {
        playlistTrackDecorationPolicy.getClass();
        playlistAlbumDecorationPolicy.getClass();
        playlistTrackDecorationPolicy.album_ = playlistAlbumDecorationPolicy;
        playlistTrackDecorationPolicy.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18431q(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy, ArtistDecorationPolicy artistDecorationPolicy) {
        playlistTrackDecorationPolicy.getClass();
        artistDecorationPolicy.getClass();
        playlistTrackDecorationPolicy.artist_ = artistDecorationPolicy;
        playlistTrackDecorationPolicy.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: r */
    public static void m18432r(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy, boolean z) {
        playlistTrackDecorationPolicy.formatListAttributes_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m18433s(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.inCollection_ = true;
    }

    /* JADX INFO: renamed from: t */
    public static void m18434t(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.isBanned_ = true;
    }

    /* JADX INFO: renamed from: u */
    public static void m18435u(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.isRecommendation_ = true;
    }

    /* JADX INFO: renamed from: v */
    public static void m18436v(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.localFile_ = true;
    }

    /* JADX INFO: renamed from: w */
    public static void m18437w(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.offline_ = true;
    }

    /* JADX INFO: renamed from: x */
    public static void m18438x(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.rowId_ = true;
    }

    /* JADX INFO: renamed from: y */
    public static void m18439y(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        playlistTrackDecorationPolicy.signals_ = true;
    }

    /* JADX INFO: renamed from: z */
    public static void m18440z(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy, TrackDecorationPolicy trackDecorationPolicy) {
        playlistTrackDecorationPolicy.getClass();
        trackDecorationPolicy.getClass();
        playlistTrackDecorationPolicy.track_ = trackDecorationPolicy;
        playlistTrackDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: A */
    public final PlaylistAlbumDecorationPolicy m18441A() {
        PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = this.album_;
        return playlistAlbumDecorationPolicy == null ? PlaylistAlbumDecorationPolicy.m18328p() : playlistAlbumDecorationPolicy;
    }

    /* JADX INFO: renamed from: B */
    public final ArtistDecorationPolicy m18442B() {
        ArtistDecorationPolicy artistDecorationPolicy = this.artist_;
        return artistDecorationPolicy == null ? ArtistDecorationPolicy.getDefaultInstance() : artistDecorationPolicy;
    }

    /* JADX INFO: renamed from: D */
    public final TrackDecorationPolicy m18443D() {
        TrackDecorationPolicy trackDecorationPolicy = this.track_;
        return trackDecorationPolicy == null ? TrackDecorationPolicy.getDefaultInstance() : trackDecorationPolicy;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\fဉ\u0001\rဉ\u0002\u000eဉ\u0003\u000f\u0007\u0010\u0007", new Object[]{"bitField0_", "track_", "rowId_", "addTime_", "inCollection_", "canAddToCollection_", "isBanned_", "canBan_", "localFile_", "offline_", "formatListAttributes_", "displayCovers_", "addedBy_", "album_", "artist_", "signals_", "isRecommendation_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistTrackDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new ktp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistTrackDecorationPolicy.class) {
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

    public final boolean getInCollection() {
        return this.inCollection_;
    }

    public final boolean getIsBanned() {
        return this.isBanned_;
    }

    public final boolean getOffline() {
        return this.offline_;
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
