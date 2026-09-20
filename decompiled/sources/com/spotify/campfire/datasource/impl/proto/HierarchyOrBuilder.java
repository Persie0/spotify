package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface HierarchyOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    Group getGroup();

    HierarchyIdentifier getHierarchyIdentifier();

    HierarchyMetadata getHierarchyMetadata();

    HierarchyStatistic getHierarchyStatistic();

    boolean hasGroup();

    boolean hasHierarchyIdentifier();

    boolean hasHierarchyMetadata();

    boolean hasHierarchyStatistic();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
