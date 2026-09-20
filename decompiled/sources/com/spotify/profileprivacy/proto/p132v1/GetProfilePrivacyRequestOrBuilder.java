package com.spotify.profileprivacy.proto.p132v1;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes10.dex */
public interface GetProfilePrivacyRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    GetProfilePrivacyRequest.UserCase getUserCase();

    String getUserId();

    gva getUserIdBytes();

    String getUsername();

    gva getUsernameBytes();

    boolean hasUserId();

    boolean hasUsername();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
