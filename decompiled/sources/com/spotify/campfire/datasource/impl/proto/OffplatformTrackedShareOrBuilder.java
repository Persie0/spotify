package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface OffplatformTrackedShareOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getDestination();

    gva getDestinationBytes();

    OffplatformShareSource getOffplatformShareSource();

    int getOffplatformShareSourceValue();

    String getOpShareId();

    gva getOpShareIdBytes();

    String getOpeningUserId();

    gva getOpeningUserIdBytes();

    String getSharingUserId();

    gva getSharingUserIdBytes();

    String getUri();

    gva getUriBytes();

    boolean hasOffplatformShareSource();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
