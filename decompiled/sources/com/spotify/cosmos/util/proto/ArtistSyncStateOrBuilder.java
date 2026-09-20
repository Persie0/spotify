package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface ArtistSyncStateOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getInferredOffline();

    gva getInferredOfflineBytes();

    String getOffline();

    gva getOfflineBytes();

    int getSyncProgress();

    boolean hasInferredOffline();

    boolean hasOffline();

    boolean hasSyncProgress();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
