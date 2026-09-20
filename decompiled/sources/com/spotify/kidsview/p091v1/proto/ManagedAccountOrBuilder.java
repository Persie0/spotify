package com.spotify.kidsview.p091v1.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface ManagedAccountOrBuilder extends sre0 {
    AccountType getAccountType();

    int getAccountTypeValue();

    int getColor();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getImageUrl();

    gva getImageUrlBytes();

    String getManagedAccountId();

    gva getManagedAccountIdBytes();

    String getName();

    gva getNameBytes();

    boolean hasColor();

    boolean hasImageUrl();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
