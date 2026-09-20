package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface ArtistCollectionStateOrBuilder extends sre0 {
    boolean getCanBan();

    String getCollectionLink();

    gva getCollectionLinkBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getFollowed();

    boolean getIsBanned();

    int getNumAlbumsInCollection();

    int getNumExplicitlyLikedTracks();

    int getNumTracksInCollection();

    boolean hasCanBan();

    boolean hasCollectionLink();

    boolean hasFollowed();

    boolean hasIsBanned();

    boolean hasNumAlbumsInCollection();

    boolean hasNumExplicitlyLikedTracks();

    boolean hasNumTracksInCollection();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
