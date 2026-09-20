package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Duration;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface MuteHierarchyRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    Duration getDuration();

    String getHierarchyId();

    gva getHierarchyIdBytes();

    boolean hasDuration();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
