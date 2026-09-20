package com.spotify.kidsview.p091v1.proto;

import com.google.protobuf.Duration;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface TransitionToManagedAccountResponseOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getMigrationId();

    gva getMigrationIdBytes();

    Duration getTimeout();

    boolean hasTimeout();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
