package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface NodeClassOrBuilder extends sre0 {
    ActivityClass getActivityClass();

    int getActivityClassValue();

    ContributionClass getContributionClass();

    int getContributionClassValue();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    HierarchyClass getHierarchyClass();

    int getHierarchyClassValue();

    NodeClass.TypeCase getTypeCase();

    boolean hasActivityClass();

    boolean hasContributionClass();

    boolean hasHierarchyClass();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
