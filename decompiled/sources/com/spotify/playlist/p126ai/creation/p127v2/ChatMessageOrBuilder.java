package com.spotify.playlist.p126ai.creation.p127v2;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface ChatMessageOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getMessageId();

    gva getMessageIdBytes();

    ChatMessagePreferences getMessagePreferences();

    Playlist getPlaylist();

    Sender getSender();

    int getSenderValue();

    Status getStatus();

    long getSubmitTimestamp();

    long getUpdatedTimestamp();

    boolean hasMessagePreferences();

    boolean hasPlaylist();

    boolean hasStatus();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
