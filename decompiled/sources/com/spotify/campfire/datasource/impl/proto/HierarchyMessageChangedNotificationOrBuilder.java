package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface HierarchyMessageChangedNotificationOrBuilder extends sre0 {
    String getChatUri();

    gva getChatUriBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getHierarchyId();

    gva getHierarchyIdBytes();

    String getMessageUri();

    gva getMessageUriBytes();

    String getNodePathId();

    gva getNodePathIdBytes();

    String getRevision();

    gva getRevisionBytes();

    String getRevisionVersion();

    gva getRevisionVersionBytes();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
