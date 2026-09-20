package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface BulkMessageRequestOrBuilder extends sre0 {
    AddHierarchyActivity getAddHierarchyActivity();

    AddNodeActivity getAddNodeActivity();

    BulkMessageRequest.BmrCase getBmrCase();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean hasAddHierarchyActivity();

    boolean hasAddNodeActivity();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
