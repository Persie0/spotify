package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface AckOrBuilder extends sre0 {
    AckType getAckType();

    int getAckTypeValue();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getInitiatorUsername();

    gva getInitiatorUsernameBytes();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
