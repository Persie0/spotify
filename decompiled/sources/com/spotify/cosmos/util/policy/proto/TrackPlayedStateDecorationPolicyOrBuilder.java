package com.spotify.cosmos.util.policy.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface TrackPlayedStateDecorationPolicyOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getIsCurrentlyPlayable();

    boolean getPlayabilityRestriction();

    boolean getPlayable();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
