package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface ChatInviteOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getDestination();

    gva getDestinationBytes();

    String getInvitingUserId();

    gva getInvitingUserIdBytes();

    String getShareId();

    gva getShareIdBytes();

    String getUri();

    gva getUriBytes();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
