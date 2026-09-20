package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface TrackArtistMetadataOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getLink();

    gva getLinkBytes();

    String getName();

    gva getNameBytes();

    ImageGroup getPortraits();

    boolean hasLink();

    boolean hasName();

    boolean hasPortraits();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
