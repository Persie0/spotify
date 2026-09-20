package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface ImageGroupOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getLargeLink();

    gva getLargeLinkBytes();

    String getSmallLink();

    gva getSmallLinkBytes();

    String getStandardLink();

    gva getStandardLinkBytes();

    String getXlargeLink();

    gva getXlargeLinkBytes();

    boolean hasLargeLink();

    boolean hasSmallLink();

    boolean hasStandardLink();

    boolean hasXlargeLink();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
