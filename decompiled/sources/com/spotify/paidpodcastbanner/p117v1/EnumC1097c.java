package com.spotify.paidpodcastbanner.p117v1;

import p204p.od50;

/* JADX INFO: renamed from: com.spotify.paidpodcastbanner.v1.c */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC1097c implements od50 {
    CTA_TYPE_UNKNOWN(0),
    CTA_TYPE_BUTTON(1),
    CTA_TYPE_CHEVRON(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f6414a;

    EnumC1097c(int i) {
        this.f6414a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6414a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
