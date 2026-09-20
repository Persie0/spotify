package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface ClientNodeOrBuilder extends sre0 {
    ClientNode getChildNode(int i);

    int getChildNodeCount();

    List<ClientNode> getChildNodeList();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    ClientEventCapture getEventCapture();

    HierarchyIdentifier getHierarchyIdentifier();

    MessagePayload getMessagePayload();

    ModerationStatus getModerationStatus();

    NodeIdentifier getNodeIdentifier();

    NodeStatistic getNodeStatistic();

    boolean hasEventCapture();

    boolean hasHierarchyIdentifier();

    boolean hasMessagePayload();

    boolean hasModerationStatus();

    boolean hasNodeIdentifier();

    boolean hasNodeStatistic();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
