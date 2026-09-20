package com.spotify.playlist.p126ai.creation.p127v2;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface ChatMessagePreferencesOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getExcludedUris(int i);

    gva getExcludedUrisBytes(int i);

    int getExcludedUrisCount();

    List<String> getExcludedUrisList();

    String getIncludedUris(int i);

    gva getIncludedUrisBytes(int i);

    int getIncludedUrisCount();

    List<String> getIncludedUrisList();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
