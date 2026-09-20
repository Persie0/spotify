package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Timestamp;
import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface HierarchyMetadataOrBuilder extends sre0 {
    HierarchyAgent getAgents(int i);

    int getAgentsCount();

    List<HierarchyAgent> getAgentsList();

    Timestamp getCreatedAt();

    boolean getCurrentUserChannelMuted();

    HierarchyUserParticipationStatus getCurrentUserParticipationStatus();

    int getCurrentUserParticipationStatusValue();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    HierarchyStatus getHierarchyStatus();

    int getHierarchyStatusValue();

    HierarchyType getHierarchyType();

    int getHierarchyTypeValue();

    String getInitiatorUsername();

    gva getInitiatorUsernameBytes();

    HierarchySource getSource();

    int getSourceValue();

    boolean hasCreatedAt();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
