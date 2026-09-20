package com.spotify.localfiles.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes8.dex */
public interface LocalFileOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    LocalFile.Metadata getMetadata();

    String getPath();

    gva getPathBytes();

    boolean hasMetadata();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
