package com.spotify.playlist.p126ai.creation.p127v2;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface GetMessageHistoryResponseOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    ChatMessage getMessages(int i);

    int getMessagesCount();

    List<ChatMessage> getMessagesList();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
