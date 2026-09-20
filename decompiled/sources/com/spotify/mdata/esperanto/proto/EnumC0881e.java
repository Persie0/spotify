package com.spotify.mdata.esperanto.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.mdata.esperanto.proto.e */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0881e implements od50 {
    UNKNOWN(0),
    OK(1),
    NOT_RESOLVED(2),
    NOT_FOUND(3),
    UNAVAILABLE_FOR_LEGAL_REASONS(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f5441a;

    EnumC0881e(int i) {
        this.f5441a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f5441a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
