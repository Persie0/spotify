package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface MessagePayloadOrBuilder extends sre0 {
    ActivityPayload getActivityPayload();

    MessagePayload.CmpCase getCmpCase();

    ContributionPayload getContributionPayload();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean hasActivityPayload();

    boolean hasContributionPayload();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
