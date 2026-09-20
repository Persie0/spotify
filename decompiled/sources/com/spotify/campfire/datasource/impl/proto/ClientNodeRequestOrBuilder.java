package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface ClientNodeRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    NodeRequest getNodeRequest(int i);

    int getNodeRequestCount();

    List<NodeRequest> getNodeRequestList();

    boolean getOmitLatestNodeUpdates();

    boolean getOmitPubsubEvents();

    boolean getOmitPusherEvents();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
