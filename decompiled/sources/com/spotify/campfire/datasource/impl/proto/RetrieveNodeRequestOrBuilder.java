package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface RetrieveNodeRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    RetrieveNodeRequest.Filter getFilter();

    String getHierarchyId();

    gva getHierarchyIdBytes();

    int getNextLimit();

    String getNodePathId();

    gva getNodePathIdBytes();

    int getPageSize();

    String getPageToken();

    gva getPageTokenBytes();

    Precondition getPrecondition();

    int getPrevLimit();

    String getShareMessageUri();

    gva getShareMessageUriBytes();

    SortOrder getSortOrder();

    int getSortOrderValue();

    boolean hasFilter();

    boolean hasPrecondition();

    boolean hasShareMessageUri();

    boolean hasSortOrder();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
