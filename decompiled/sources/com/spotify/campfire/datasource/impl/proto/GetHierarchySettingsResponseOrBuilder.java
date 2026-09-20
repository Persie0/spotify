package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface GetHierarchySettingsResponseOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    ReceiptType getDisabledReceiptTypes(int i);

    int getDisabledReceiptTypesCount();

    List<ReceiptType> getDisabledReceiptTypesList();

    int getDisabledReceiptTypesValue(int i);

    List<Integer> getDisabledReceiptTypesValueList();

    boolean getMutedForCurrentUser();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
