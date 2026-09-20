package com.spotify.cosmos.util.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface TrackCollectionStateOrBuilder extends sre0 {
    boolean getCanAddToCollection();

    boolean getCanBan();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getIsBanned();

    boolean getIsInCollection();

    boolean hasCanAddToCollection();

    boolean hasCanBan();

    boolean hasIsBanned();

    boolean hasIsInCollection();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
