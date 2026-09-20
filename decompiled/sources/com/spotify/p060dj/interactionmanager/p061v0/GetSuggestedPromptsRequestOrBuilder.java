package com.spotify.p060dj.interactionmanager.p061v0;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface GetSuggestedPromptsRequestOrBuilder extends sre0 {
    String getCurrentTrackUri();

    gva getCurrentTrackUriBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    Model getLlmModel();

    int getLlmModelValue();

    boolean getUnused();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
