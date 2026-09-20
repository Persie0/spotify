package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Timestamp;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface NodeRequestOrBuilder extends sre0 {
    BulkMessageRequest getBulkMessageRequest();

    NodeRequest.CnrCase getCnrCase();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getDigest();

    gva getDigestBytes();

    HierarchyRequest getHierarchyRequest();

    MessageRequest getMessageRequest();

    Timestamp getOccurredAt();

    boolean getReplay();

    boolean hasBulkMessageRequest();

    boolean hasDigest();

    boolean hasHierarchyRequest();

    boolean hasMessageRequest();

    boolean hasOccurredAt();

    boolean hasReplay();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
