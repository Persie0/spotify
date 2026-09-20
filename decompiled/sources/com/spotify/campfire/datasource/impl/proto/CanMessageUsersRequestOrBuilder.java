package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface CanMessageUsersRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    HierarchyType getSharedHierarchyTypeFilter();

    int getSharedHierarchyTypeFilterValue();

    String getTargetUsernames(int i);

    gva getTargetUsernamesBytes(int i);

    int getTargetUsernamesCount();

    List<String> getTargetUsernamesList();

    boolean hasSharedHierarchyTypeFilter();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
