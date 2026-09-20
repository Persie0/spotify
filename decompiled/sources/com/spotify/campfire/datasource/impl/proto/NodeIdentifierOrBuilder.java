package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface NodeIdentifierOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    NodeClass getNodeClass();

    String getNodePathId();

    gva getNodePathIdBytes();

    String getUri();

    gva getUriBytes();

    boolean hasNodeClass();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
