package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface HierarchyStatisticOrBuilder extends sre0 {
    boolean getAllEventsSeen();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getRevision();

    gva getRevisionBytes();

    int getTotalUserUnseenActivityEvents();

    int getTotalUserUnseenContributionEvents();

    int getTotalUserUnseenEvents();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
