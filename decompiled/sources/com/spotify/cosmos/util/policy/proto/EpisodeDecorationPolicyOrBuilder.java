package com.spotify.cosmos.util.policy.proto;

import java.util.List;
import p204p.ntx;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface EpisodeDecorationPolicyOrBuilder extends sre0 {
    boolean getAvailable();

    boolean getBackgroundable();

    boolean getCovers();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getDescription();

    ntx getExtension(int i);

    int getExtensionCount();

    List<ntx> getExtensionList();

    int getExtensionValue(int i);

    List<Integer> getExtensionValueList();

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

    boolean getPreviewId();

    boolean getPreviewManifestId();

    boolean getPublishDate();

    boolean getType();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
