package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface SetReceiptPreferenceRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getDisabled();

    String getHierarchyId();

    gva getHierarchyIdBytes();

    ReceiptType getReceiptType();

    int getReceiptTypeValue();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
