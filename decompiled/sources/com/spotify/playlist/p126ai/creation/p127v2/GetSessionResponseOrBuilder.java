package com.spotify.playlist.p126ai.creation.p127v2;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface GetSessionResponseOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    ChatMessage getMessages(int i);

    int getMessagesCount();

    List<ChatMessage> getMessagesList();

    String getPlaylistUri();

    gva getPlaylistUriBytes();

    String getPopularPrompts(int i);

    gva getPopularPromptsBytes(int i);

    int getPopularPromptsCount();

    List<String> getPopularPromptsList();

    String getSessionId();

    gva getSessionIdBytes();

    String getSuggestedPrompts(int i);

    gva getSuggestedPromptsBytes(int i);

    int getSuggestedPromptsCount();

    List<String> getSuggestedPromptsList();

    String getWelcomeMessage();

    gva getWelcomeMessageBytes();

    boolean hasWelcomeMessage();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
