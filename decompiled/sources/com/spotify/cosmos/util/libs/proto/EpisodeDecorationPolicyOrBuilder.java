package com.spotify.cosmos.util.libs.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface EpisodeDecorationPolicyOrBuilder extends sre0 {
    boolean getAvailable();

    boolean getBackgroundable();

    boolean getCovers();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getDescription();

    boolean getFreezeFrames();

    boolean getIs19PlusOnly();

    boolean getIsBookChapter();

    boolean getIsCurated();

    boolean getIsExplicit();

    boolean getIsMusicAndTalk();

    boolean getIsPodcastShort();

    boolean getLanguage();

    boolean getLength();

    boolean getLink();

    boolean getManifestId();

    boolean getMediaTypeEnum();

    boolean getName();

    boolean getNumber();

    PodcastSegmentsPolicy getPodcastSegments();

    boolean getPodcastSubscription();

    boolean getPreviewId();

    boolean getPreviewManifestId();

    boolean getPublishDate();

    boolean getType();

    boolean hasPodcastSegments();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
