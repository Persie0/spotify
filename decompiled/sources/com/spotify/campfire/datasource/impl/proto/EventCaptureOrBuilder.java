package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Timestamp;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface EventCaptureOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getEventId();

    gva getEventIdBytes();

    EventType getEventType();

    int getEventTypeValue();

    Timestamp getOccurredAt();

    boolean hasOccurredAt();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
