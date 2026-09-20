package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface TrackAlbumMetadataOrBuilder extends sre0 {
    TrackAlbumArtistMetadata getArtist();

    ImageGroup getCovers();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getLink();

    gva getLinkBytes();

    String getName();

    gva getNameBytes();

    boolean hasArtist();

    boolean hasCovers();

    boolean hasLink();

    boolean hasName();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
