package com.spotify.checkout.proto.model.p044v1.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.checkout.proto.model.v1.proto.p0 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC0515p0 implements od50 {
    DEFAULT(0),
    HIGHLIGHTED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f3320a;

    EnumC0515p0(int i) {
        this.f3320a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f3320a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
