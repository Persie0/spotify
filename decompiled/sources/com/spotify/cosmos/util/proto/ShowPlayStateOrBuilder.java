package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface ShowPlayStateOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getIsPlayable();

    ShowPlayState.Label getLabel();

    String getLatestPlayedEpisodeLink();

    gva getLatestPlayedEpisodeLinkBytes();

    PlayabilityRestriction getPlayabilityRestriction();

    int getPlayedPercentage();

    long getPlayedTime();

    String getResumeEpisodeLink();

    gva getResumeEpisodeLinkBytes();

    boolean hasIsPlayable();

    boolean hasLabel();

    boolean hasLatestPlayedEpisodeLink();

    boolean hasPlayabilityRestriction();

    boolean hasPlayedPercentage();

    boolean hasPlayedTime();

    boolean hasResumeEpisodeLink();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
