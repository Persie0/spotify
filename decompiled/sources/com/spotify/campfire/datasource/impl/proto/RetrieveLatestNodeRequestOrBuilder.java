package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface RetrieveLatestNodeRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    int getLimit();

    Precondition getPrecondition();

    SortOrder getSortOrder();

    int getSortOrderValue();

    boolean hasLimit();

    boolean hasPrecondition();

    boolean hasSortOrder();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
