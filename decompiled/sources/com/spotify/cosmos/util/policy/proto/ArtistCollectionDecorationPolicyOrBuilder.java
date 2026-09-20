package com.spotify.cosmos.util.policy.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface ArtistCollectionDecorationPolicyOrBuilder extends sre0 {
    boolean getCanBan();

    boolean getCollectionLink();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getIsBanned();

    boolean getIsFollowed();

    boolean getNumAlbumsInCollection();

    boolean getNumExplicitlyLikedTracks();

    boolean getNumTracksInCollection();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
