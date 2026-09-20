package com.spotify.extendedmetadata.extensions.audioattributesv2impl.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.extendedmetadata.extensions.audioattributesv2impl.proto.d */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC0730d implements od50 {
    MODE_UNKNOWN(0),
    MODE_MINOR(1),
    MODE_MAJOR(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f3929a;

    EnumC0730d(int i) {
        this.f3929a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f3929a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
