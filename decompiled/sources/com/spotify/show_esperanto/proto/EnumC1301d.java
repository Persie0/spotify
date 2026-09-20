package com.spotify.show_esperanto.proto;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.show_esperanto.proto.d */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC1301d implements od50 {
    LATEST_PLAYED(0),
    CONTINUE_LISTENING(1),
    URI(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f6664a;

    EnumC1301d(int i) {
        this.f6664a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6664a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
