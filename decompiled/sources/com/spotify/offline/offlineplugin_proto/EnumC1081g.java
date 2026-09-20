package com.spotify.offline.offlineplugin_proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.offline.offlineplugin_proto.g */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC1081g implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    MISSING(1),
    COMPLETE(2),
    NOT_APPLICABLE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f6395a;

    EnumC1081g(int i) {
        this.f6395a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6395a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
