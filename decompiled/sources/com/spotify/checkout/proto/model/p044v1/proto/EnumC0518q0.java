package com.spotify.checkout.proto.model.p044v1.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.checkout.proto.model.v1.proto.q0 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC0518q0 implements od50 {
    DEFAULT(0),
    ADDED(1),
    REMOVED(2),
    STRIKETHROUGH(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f3327a;

    EnumC0518q0(int i) {
        this.f3327a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f3327a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
