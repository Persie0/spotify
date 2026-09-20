package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface CreateInviteRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    InviteOptions getOptions();

    String getUri();

    gva getUriBytes();

    boolean hasOptions();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
