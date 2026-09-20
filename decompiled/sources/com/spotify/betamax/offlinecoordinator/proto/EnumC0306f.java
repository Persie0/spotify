package com.spotify.betamax.offlinecoordinator.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.betamax.offlinecoordinator.proto.f */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC0306f implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    MISSING(1),
    COMPLETE(2),
    NOT_APPLICABLE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f3038a;

    EnumC0306f(int i) {
        this.f3038a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f3038a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
