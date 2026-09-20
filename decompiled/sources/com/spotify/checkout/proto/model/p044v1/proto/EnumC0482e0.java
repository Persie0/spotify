package com.spotify.checkout.proto.model.p044v1.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.checkout.proto.model.v1.proto.e0 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC0482e0 implements od50 {
    EXPANSION_STATE_UNKNOWN(0),
    EXPANSION_STATE_SPOTIFY_EXPANDED(1),
    EXPANSION_STATE_GOOGLE_EXPANDED(2),
    EXPANSION_STATE_NONE_EXPANDED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f3315a;

    EnumC0482e0(int i) {
        this.f3315a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f3315a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
