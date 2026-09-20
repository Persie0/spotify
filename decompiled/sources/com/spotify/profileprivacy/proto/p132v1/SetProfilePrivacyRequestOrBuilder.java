package com.spotify.profileprivacy.proto.p132v1;

import com.google.protobuf.FieldMask;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes10.dex */
public interface SetProfilePrivacyRequestOrBuilder extends sre0 {
    boolean getAllowFollows();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    FieldMask getMask();

    boolean getShowFollows();

    boolean getShowPublishedPlaylists();

    SetProfilePrivacyRequest.UserCase getUserCase();

    String getUserId();

    gva getUserIdBytes();

    String getUsername();

    gva getUsernameBytes();

    boolean hasAllowFollows();

    boolean hasMask();

    boolean hasShowFollows();

    boolean hasShowPublishedPlaylists();

    boolean hasUserId();

    boolean hasUsername();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
