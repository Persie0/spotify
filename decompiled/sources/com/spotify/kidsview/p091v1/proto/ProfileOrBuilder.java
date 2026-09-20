package com.spotify.kidsview.p091v1.proto;

import com.google.protobuf.Int32Value;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface ProfileOrBuilder extends sre0 {
    boolean getAllowedInMusicApp();

    String getAvatar();

    gva getAvatarBytes();

    Int32Value getColor();

    String getDateOfBirth();

    gva getDateOfBirthBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getName();

    gva getNameBytes();

    Avatar getV2Avatar();

    int getV2AvatarValue();

    boolean hasColor();

    boolean hasV2Avatar();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
