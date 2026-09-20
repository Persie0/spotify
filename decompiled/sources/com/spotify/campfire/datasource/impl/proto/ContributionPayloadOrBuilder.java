package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface ContributionPayloadOrBuilder extends sre0 {
    ContributionPayload.CcpCase getCcpCase();

    ChatEvent getChatEvent();

    ChatInvite getChatInvite();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    FreeText getFreeText();

    ContributionMetadata getMetadata();

    OffplatformTrackedShare getOpTrackedShare();

    RichMedia getRichMedia();

    TrackedShare getTrackedShare();

    boolean hasChatEvent();

    boolean hasChatInvite();

    boolean hasFreeText();

    boolean hasMetadata();

    boolean hasOpTrackedShare();

    boolean hasRichMedia();

    boolean hasTrackedShare();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
