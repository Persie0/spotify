package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface NodeStatisticOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    int getTotalUnseenEventCount();

    int getTotalUserUnseenActivityEvents();

    int getTotalUserUnseenContributionEvents();

    boolean getUserSeen();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
