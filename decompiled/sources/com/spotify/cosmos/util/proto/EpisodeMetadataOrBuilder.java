package com.spotify.cosmos.util.proto;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface EpisodeMetadataOrBuilder extends sre0 {
    boolean getAvailable();

    boolean getBackgroundable();

    ImageGroup getCovers();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getDescription();

    gva getDescriptionBytes();

    EpisodeMetadata.EpisodeType getEpisodeType();

    Extension getExtension(int i);

    int getExtensionCount();

    List<Extension> getExtensionList();

    ImageGroup getFreezeFrames();

    boolean getIs19PlusOnly();

    boolean getIsBookChapter();

    boolean getIsCurated();

    boolean getIsExplicit();

    boolean getIsMusicAndTalk();

    boolean getIsPodcastShort();

    String getLanguage();

    gva getLanguageBytes();

    int getLength();

    String getLink();

    gva getLinkBytes();

    String getManifestId();

    gva getManifestIdBytes();

    EpisodeMetadata.MediaType getMediaTypeEnum();

    String getName();

    gva getNameBytes();

    int getNumber();

    String getPreviewId();

    gva getPreviewIdBytes();

    String getPreviewManifestId();

    gva getPreviewManifestIdBytes();

    long getPublishDate();

    EpisodeShowMetadata getShow();

    boolean hasAvailable();

    boolean hasBackgroundable();

    boolean hasCovers();

    boolean hasDescription();

    boolean hasEpisodeType();

    boolean hasFreezeFrames();

    boolean hasIs19PlusOnly();

    boolean hasIsBookChapter();

    boolean hasIsCurated();

    boolean hasIsExplicit();

    boolean hasIsMusicAndTalk();

    boolean hasIsPodcastShort();

    boolean hasLanguage();

    boolean hasLength();

    boolean hasLink();

    boolean hasManifestId();

    boolean hasMediaTypeEnum();

    boolean hasName();

    boolean hasNumber();

    boolean hasPreviewId();

    boolean hasPreviewManifestId();

    boolean hasPublishDate();

    boolean hasShow();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
