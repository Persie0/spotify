package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface EpisodeShowMetadataOrBuilder extends sre0 {
    ImageGroup getCovers();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getLink();

    gva getLinkBytes();

    String getName();

    gva getNameBytes();

    String getPublisher();

    gva getPublisherBytes();

    boolean hasCovers();

    boolean hasLink();

    boolean hasName();

    boolean hasPublisher();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
