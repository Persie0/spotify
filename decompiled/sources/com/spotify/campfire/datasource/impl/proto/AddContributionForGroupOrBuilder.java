package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface AddContributionForGroupOrBuilder extends sre0 {
    CreateGroupOptions getCreateGroupOptions();

    @Deprecated
    boolean getCreateNewHierarchy();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    GroupDetail getGroupDetail();

    ContributionPayload getPayload();

    boolean hasCreateGroupOptions();

    boolean hasGroupDetail();

    boolean hasPayload();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
