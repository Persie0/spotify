package com.spotify.rcs.model;

import p204p.od50;
import p204p.rd50;

/* JADX INFO: renamed from: com.spotify.rcs.model.a */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC1266a implements od50 {
    UNKNOWN(0),
    ANDROID(1),
    BACKEND(2),
    IOS(3),
    WEB(4),
    UNRECOGNIZED(-1);

    private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.rcs.model.Platform$1
        @Override // p204p.rd50
        public EnumC1266a findValueByNumber(int i) {
            return EnumC1266a.m20119a(i);
        }
    };
    private final int value;

    EnumC1266a(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC1266a m20119a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ANDROID;
        }
        if (i == 2) {
            return BACKEND;
        }
        if (i == 3) {
            return IOS;
        }
        if (i != 4) {
            return null;
        }
        return WEB;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
