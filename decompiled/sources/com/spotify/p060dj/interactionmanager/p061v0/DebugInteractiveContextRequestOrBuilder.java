package com.spotify.p060dj.interactionmanager.p061v0;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface DebugInteractiveContextRequestOrBuilder extends sre0 {
    String getAckSystemPromptOverride();

    gva getAckSystemPromptOverrideBytes();

    String getAssistantName();

    gva getAssistantNameBytes();

    String getAssistantTags(int i);

    gva getAssistantTagsBytes(int i);

    int getAssistantTagsCount();

    List<String> getAssistantTagsList();

    String getAssistantVersion();

    gva getAssistantVersionBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getIgnorePromptSafetyViolation();

    String getIntroSystemPromptOverride();

    gva getIntroSystemPromptOverrideBytes();

    String getPrompt();

    gva getPromptBytes();

    boolean hasAckSystemPromptOverride();

    boolean hasIntroSystemPromptOverride();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
