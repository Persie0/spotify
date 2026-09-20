package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface ModifyContributionOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getNodePathId();

    gva getNodePathIdBytes();

    ContributionPayload getPayload();

    boolean hasPayload();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
