package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface ClientEventCaptureOrBuilder extends sre0 {
    AgentContext getAgentContext();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    EventCapture getEventCapture();

    String getInitUsername();

    gva getInitUsernameBytes();

    boolean hasAgentContext();

    boolean hasEventCapture();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
