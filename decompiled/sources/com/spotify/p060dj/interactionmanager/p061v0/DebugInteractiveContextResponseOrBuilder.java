package com.spotify.p060dj.interactionmanager.p061v0;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface DebugInteractiveContextResponseOrBuilder extends sre0 {
    String getAckCommentary();

    gva getAckCommentaryBytes();

    boolean getContainsPromptViolation();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getIntroCommentary();

    gva getIntroCommentaryBytes();

    String getPromptViolationLabel();

    gva getPromptViolationLabelBytes();

    String getRecsplanation();

    gva getRecsplanationBytes();

    String getStatusCode();

    gva getStatusCodeBytes();

    String getStatusMessage();

    gva getStatusMessageBytes();

    String getTrackUris(int i);

    gva getTrackUrisBytes(int i);

    int getTrackUrisCount();

    List<String> getTrackUrisList();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
