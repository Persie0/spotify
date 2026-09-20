package com.spotify.kidsview.p091v1.proto;

import com.google.protobuf.StringValue;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface ChildOrBuilder extends sre0 {
    String getChildId();

    gva getChildIdBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    StringValue getImageUri();

    boolean getIsFree();

    Profile getProfile();

    boolean hasImageUri();

    boolean hasProfile();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
