package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface AddNodeActivityOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getNodePathId(int i);

    gva getNodePathIdBytes(int i);

    int getNodePathIdCount();

    List<String> getNodePathIdList();

    ActivityRequest getRequest();

    boolean hasRequest();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
