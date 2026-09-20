package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.extendedmetadata.extensions.companioncontentimpl.proto.a */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC0735a implements od50 {
    UNSPECIFIED(0),
    ALBUM(1),
    SINGLE(2),
    EP(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f3936a;

    EnumC0735a(int i) {
        this.f3936a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f3936a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
