package com.spotify.cosmos.util.proto;

import p204p.gva;
import p204p.ntx;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface ExtensionOrBuilder extends sre0 {
    gva getData();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    ntx getExtensionKind();

    boolean hasData();

    boolean hasExtensionKind();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
