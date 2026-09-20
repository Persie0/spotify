package com.spotify.campfire.datasource.impl.proto;

import java.util.Map;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface CanMessageUsersResponseOrBuilder extends sre0 {
    boolean containsResults(String str);

    boolean containsSharedHierarchies(String str);

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    @Deprecated
    Map<String, Boolean> getResults();

    int getResultsCount();

    Map<String, Boolean> getResultsMap();

    boolean getResultsOrDefault(String str, boolean z);

    boolean getResultsOrThrow(String str);

    @Deprecated
    Map<String, SharedHierarchies> getSharedHierarchies();

    int getSharedHierarchiesCount();

    Map<String, SharedHierarchies> getSharedHierarchiesMap();

    SharedHierarchies getSharedHierarchiesOrDefault(String str, SharedHierarchies sharedHierarchies);

    SharedHierarchies getSharedHierarchiesOrThrow(String str);

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
