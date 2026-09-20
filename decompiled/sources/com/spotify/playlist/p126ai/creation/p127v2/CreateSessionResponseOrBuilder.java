package com.spotify.playlist.p126ai.creation.p127v2;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface CreateSessionResponseOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

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

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
