package com.spotify.podcast.access.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.podcast.access.proto.e */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC1231e implements od50 {
    NONE(0),
    HEART(1),
    PADLOCK(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f6480a;

    EnumC1231e(int i) {
        this.f6480a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6480a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
