package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface SharedHierarchyEntryOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    HierarchyIdentifier getIdentifier();

    HierarchyType getType();

    int getTypeValue();

    boolean hasIdentifier();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
