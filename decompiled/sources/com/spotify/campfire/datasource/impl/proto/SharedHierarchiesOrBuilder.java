package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface SharedHierarchiesOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    SharedHierarchyEntry getHierarchies(int i);

    int getHierarchiesCount();

    List<SharedHierarchyEntry> getHierarchiesList();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
