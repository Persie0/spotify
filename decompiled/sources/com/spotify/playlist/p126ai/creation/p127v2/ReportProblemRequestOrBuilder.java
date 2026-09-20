package com.spotify.playlist.p126ai.creation.p127v2;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface ReportProblemRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getMessageId();

    gva getMessageIdBytes();

    Problem getProblem();

    String getProblemDetail();

    gva getProblemDetailBytes();

    int getProblemValue();

    String getSessionId();

    gva getSessionIdBytes();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
