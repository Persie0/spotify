package com.spotify.kidsview.p091v1.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes2.dex */
public interface TransitionToManagedAccountRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getMemberId();

    gva getMemberIdBytes();

    String getParentPinHash();

    gva getParentPinHashBytes();

    String getParentalConsentSessionId();

    gva getParentalConsentSessionIdBytes();

    GenAlphaManagedSettings getSettings();

    TransitionToManagedAccountRequest.TransitioningUserIdentifierCase getTransitioningUserIdentifierCase();

    boolean hasMemberId();

    boolean hasParentPinHash();

    boolean hasParentalConsentSessionId();

    boolean hasSettings();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
