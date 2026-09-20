package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface TrackSyncStateOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getOffline();

    gva getOfflineBytes();

    int getSyncProgress();

    boolean hasOffline();

    boolean hasSyncProgress();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
