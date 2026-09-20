package com.spotify.kidsview.p091v1.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface ParentalControlsOrBuilder extends sre0 {
    boolean getAllowExplicitContent();

    boolean getAllowVideo();

    String getDateOfBirth();

    gva getDateOfBirthBytes();

    String getDateOfBirthMaxDate();

    gva getDateOfBirthMaxDateBytes();

    String getDateOfBirthMinDate();

    gva getDateOfBirthMinDateBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
