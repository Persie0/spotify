package com.spotify.playlist.p126ai.creation.p127v2;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface GetMessageResponseOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    ChatMessagePreferences getMessagePreferences();

    Playlist getPlaylist();

    int getRetryAfterMs();

    Status getStatus();

    long getSubmitTimestampMs();

    boolean hasMessagePreferences();

    boolean hasPlaylist();

    boolean hasStatus();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
