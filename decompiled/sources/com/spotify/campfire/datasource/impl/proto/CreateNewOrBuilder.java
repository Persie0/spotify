package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface CreateNewOrBuilder extends sre0 {
    CreateGroupOptions getCreateGroupOptions();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getFriendRequest();

    HierarchyType getHierarchyType();

    int getHierarchyTypeValue();

    String getMemberUsername(int i);

    gva getMemberUsernameBytes(int i);

    int getMemberUsernameCount();

    List<String> getMemberUsernameList();

    String getName();

    gva getNameBytes();

    boolean hasCreateGroupOptions();

    boolean hasFriendRequest();

    boolean hasName();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
