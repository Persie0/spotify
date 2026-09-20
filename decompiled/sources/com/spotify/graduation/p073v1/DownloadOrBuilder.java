package com.spotify.graduation.p073v1;

import com.google.protobuf.Timestamp;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface DownloadOrBuilder extends sre0 {
    Timestamp getDate();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getDownloadUrl();

    gva getDownloadUrlBytes();

    DownloadLevel getLevel();

    int getLevelValue();

    String getSecurityCode();

    gva getSecurityCodeBytes();

    DownloadStatus getStatus();

    int getStatusValue();

    int getTtl();

    boolean hasDate();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
