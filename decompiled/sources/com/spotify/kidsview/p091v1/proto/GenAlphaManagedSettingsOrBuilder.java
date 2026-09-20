package com.spotify.kidsview.p091v1.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface GenAlphaManagedSettingsOrBuilder extends sre0 {
    boolean getAllowConnect();

    boolean getAllowExplicitContent();

    boolean getAllowVideoContent();

    String getDateOfBirth();

    gva getDateOfBirthBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getDisplayName();

    gva getDisplayNameBytes();

    boolean hasAllowConnect();

    boolean hasAllowExplicitContent();

    boolean hasAllowVideoContent();

    boolean hasDateOfBirth();

    boolean hasDisplayName();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
