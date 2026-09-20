package com.spotify.cosmos.util.proto;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface TrackMetadataOrBuilder extends sre0 {
    TrackAlbumMetadata getAlbum();

    TrackArtistMetadata getArtist(int i);

    int getArtistCount();

    List<TrackArtistMetadata> getArtistList();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    int getDiscNumber();

    Extension getExtension(int i);

    int getExtensionCount();

    List<Extension> getExtensionList();

    boolean getHasLyrics();

    boolean getIs19PlusOnly();

    boolean getIsCurated();

    boolean getIsExplicit();

    boolean getIsLocal();

    boolean getIsPremiumOnly();

    int getLength();

    String getLink();

    gva getLinkBytes();

    boolean getLocallyPlayable();

    String getName();

    gva getNameBytes();

    boolean getPlayable();

    boolean getPlayableLocalTrack();

    String getPlayableTrackLink();

    gva getPlayableTrackLinkBytes();

    int getPopularity();

    String getPreviewId();

    gva getPreviewIdBytes();

    boolean getToBeObfuscated();

    TrackDescriptor getTrackDescriptors(int i);

    int getTrackDescriptorsCount();

    List<TrackDescriptor> getTrackDescriptorsList();

    int getTrackNumber();

    boolean hasAlbum();

    boolean hasDiscNumber();

    boolean hasHasLyrics();

    boolean hasIs19PlusOnly();

    boolean hasIsCurated();

    boolean hasIsExplicit();

    boolean hasIsLocal();

    boolean hasIsPremiumOnly();

    boolean hasLength();

    boolean hasLink();

    boolean hasLocallyPlayable();

    boolean hasName();

    boolean hasPlayable();

    boolean hasPlayableLocalTrack();

    boolean hasPlayableTrackLink();

    boolean hasPopularity();

    boolean hasPreviewId();

    boolean hasToBeObfuscated();

    boolean hasTrackNumber();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
