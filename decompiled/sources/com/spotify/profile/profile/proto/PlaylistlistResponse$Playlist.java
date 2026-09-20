package com.spotify.profile.profile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes10.dex */
public final class PlaylistlistResponse$Playlist extends AbstractC0269h implements sre0 {
    private static final PlaylistlistResponse$Playlist DEFAULT_INSTANCE;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_FOLLOWING_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OWNER_NAME_FIELD_NUMBER = 5;
    public static final int OWNER_URI_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int followersCount_;
    private boolean isFollowing_;
    private String uri_ = "";
    private String name_ = "";
    private String imageUrl_ = "";
    private String ownerName_ = "";
    private String ownerUri_ = "";

    static {
        PlaylistlistResponse$Playlist playlistlistResponse$Playlist = new PlaylistlistResponse$Playlist();
        DEFAULT_INSTANCE = playlistlistResponse$Playlist;
        AbstractC0269h.registerDefaultInstance(PlaylistlistResponse$Playlist.class, playlistlistResponse$Playlist);
    }

    private PlaylistlistResponse$Playlist() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0007", new Object[]{"uri_", "name_", "imageUrl_", "followersCount_", "ownerName_", "ownerUri_", "isFollowing_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistlistResponse$Playlist();
        }
        if (iOrdinal == 4) {
            return new zmp0(DEFAULT_INSTANCE, 26);
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
        synchronized (PlaylistlistResponse$Playlist.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final int m19799n() {
        return this.followersCount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m19800o() {
        return this.ownerName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
