package com.spotify.cosmos.util.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface TrackPlayStateOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getIsPlayable();

    PlayabilityRestriction getPlayabilityRestriction();

    boolean hasIsPlayable();

    boolean hasPlayabilityRestriction();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
