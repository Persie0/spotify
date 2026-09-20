package com.spotify.playlist.p126ai.creation.p127v2;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface ListSessionsResponseOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    GetSessionResponse getSessions(int i);

    int getSessionsCount();

    List<GetSessionResponse> getSessionsList();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
