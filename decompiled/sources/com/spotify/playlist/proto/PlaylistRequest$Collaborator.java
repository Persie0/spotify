package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaylistRequest$Collaborator extends AbstractC0269h implements sre0 {
    private static final PlaylistRequest$Collaborator DEFAULT_INSTANCE;
    public static final int IS_OWNER_FIELD_NUMBER = 5;
    public static final int NUMBER_OF_EPISODES_FIELD_NUMBER = 4;
    public static final int NUMBER_OF_ITEMS_FIELD_NUMBER = 2;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int USER_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isOwner_;
    private int numberOfEpisodes_;
    private int numberOfItems_;
    private int numberOfTracks_;
    private User user_;

    static {
        PlaylistRequest$Collaborator playlistRequest$Collaborator = new PlaylistRequest$Collaborator();
        DEFAULT_INSTANCE = playlistRequest$Collaborator;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$Collaborator.class, playlistRequest$Collaborator);
    }

    private PlaylistRequest$Collaborator() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "user_", "numberOfItems_", "numberOfTracks_", "numberOfEpisodes_", "isOwner_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$Collaborator();
        }
        if (iOrdinal == 4) {
            return new zmp0(DEFAULT_INSTANCE, 7);
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
        synchronized (PlaylistRequest$Collaborator.class) {
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
    public final boolean m18570n() {
        return this.isOwner_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m18571o() {
        return this.numberOfEpisodes_;
    }

    /* JADX INFO: renamed from: p */
    public final int m18572p() {
        return this.numberOfItems_;
    }

    /* JADX INFO: renamed from: q */
    public final int m18573q() {
        return this.numberOfTracks_;
    }

    /* JADX INFO: renamed from: r */
    public final User m18574r() {
        User user = this.user_;
        return user == null ? User.m18670o() : user;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
