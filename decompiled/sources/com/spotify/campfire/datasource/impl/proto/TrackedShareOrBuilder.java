package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface TrackedShareOrBuilder extends sre0 {
    TrackedShareContext getContext();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getPreviewId();

    gva getPreviewIdBytes();

    String getShareCardConfigId();

    gva getShareCardConfigIdBytes();

    String getUri();

    gva getUriBytes();

    boolean hasContext();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
