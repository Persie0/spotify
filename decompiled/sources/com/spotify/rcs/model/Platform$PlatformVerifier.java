package com.spotify.rcs.model;

import p204p.sd50;

/* JADX INFO: loaded from: classes10.dex */
final class Platform$PlatformVerifier implements sd50 {
    static final sd50 INSTANCE = new Platform$PlatformVerifier();

    private Platform$PlatformVerifier() {
    }

    @Override // p204p.sd50
    public boolean isInRange(int i) {
        return EnumC1266a.m20119a(i) != null;
    }
}
