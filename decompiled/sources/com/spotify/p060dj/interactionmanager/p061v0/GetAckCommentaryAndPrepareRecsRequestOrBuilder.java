package com.spotify.p060dj.interactionmanager.p061v0;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface GetAckCommentaryAndPrepareRecsRequestOrBuilder extends sre0 {
    String getCurrentSegmentId();

    gva getCurrentSegmentIdBytes();

    String getCurrentTrackUri();

    gva getCurrentTrackUriBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getDeviceId();

    gva getDeviceIdBytes();

    String getPrompt();

    gva getPromptBytes();

    String getSessionId();

    gva getSessionIdBytes();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
