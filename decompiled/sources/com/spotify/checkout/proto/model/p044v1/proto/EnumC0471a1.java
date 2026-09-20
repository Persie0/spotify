package com.spotify.checkout.proto.model.p044v1.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.checkout.proto.model.v1.proto.a1 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC0471a1 implements od50 {
    CHECKBOX(0),
    TEXT(1),
    CONSPICUOUS_TEXT(2),
    CONSPICUOUS_CHECKBOX(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f3307a;

    EnumC0471a1(int i) {
        this.f3307a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f3307a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
