package com.spotify.playlist.p126ai.creation.p127v2;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface GetMessageHistoryRequestOrBuilder extends sre0 {
    long getAfterTimestampMs();

    long getBeforeTimestampMs();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getSessionId();

    gva getSessionIdBytes();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
