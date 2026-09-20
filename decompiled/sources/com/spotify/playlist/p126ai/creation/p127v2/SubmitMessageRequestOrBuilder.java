package com.spotify.playlist.p126ai.creation.p127v2;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface SubmitMessageRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    ChatMessagePreferences getMessagePreferences();

    String getMessagePrompt();

    gva getMessagePromptBytes();

    String getSessionId();

    gva getSessionIdBytes();

    boolean hasMessagePreferences();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
