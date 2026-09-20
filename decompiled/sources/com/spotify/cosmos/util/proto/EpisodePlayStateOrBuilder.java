package com.spotify.cosmos.util.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface EpisodePlayStateOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getIsPlayable();

    boolean getIsPlayed();

    int getLastPlayedAt();

    PlayabilityRestriction getPlayabilityRestriction();

    int getTimeLeft();

    boolean hasIsPlayable();

    boolean hasIsPlayed();

    boolean hasLastPlayedAt();

    boolean hasPlayabilityRestriction();

    boolean hasTimeLeft();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
