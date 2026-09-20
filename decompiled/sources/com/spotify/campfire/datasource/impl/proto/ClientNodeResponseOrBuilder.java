package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface ClientNodeResponseOrBuilder extends sre0 {
    ClientNode getClientNode(int i);

    int getClientNodeCount();

    List<ClientNode> getClientNodeList();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    Hierarchy getHierarchy();

    boolean hasHierarchy();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
