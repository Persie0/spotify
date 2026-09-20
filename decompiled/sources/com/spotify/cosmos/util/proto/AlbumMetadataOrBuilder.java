package com.spotify.cosmos.util.proto;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface AlbumMetadataOrBuilder extends sre0 {
    AlbumArtistMetadata getArtists(int i);

    int getArtistsCount();

    List<AlbumArtistMetadata> getArtistsList();

    String getCopyright(int i);

    gva getCopyrightBytes(int i);

    int getCopyrightCount();

    List<String> getCopyrightList();

    ImageGroup getCovers();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getIsPremiumOnly();

    String getLink();

    gva getLinkBytes();

    String getName();

    gva getNameBytes();

    int getNumDiscs();

    int getNumTracks();

    boolean getPlayability();

    int getYear();

    boolean hasCovers();

    boolean hasIsPremiumOnly();

    boolean hasLink();

    boolean hasName();

    boolean hasNumDiscs();

    boolean hasNumTracks();

    boolean hasPlayability();

    boolean hasYear();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
