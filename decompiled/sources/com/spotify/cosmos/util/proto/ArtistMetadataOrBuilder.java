package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface ArtistMetadataOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getIsVariousArtists();

    String getLink();

    gva getLinkBytes();

    String getName();

    gva getNameBytes();

    ImageGroup getPortraits();

    boolean hasIsVariousArtists();

    boolean hasLink();

    boolean hasName();

    boolean hasPortraits();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
