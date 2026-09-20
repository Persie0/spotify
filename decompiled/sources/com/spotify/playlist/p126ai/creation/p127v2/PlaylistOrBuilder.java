package com.spotify.playlist.p126ai.creation.p127v2;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes9.dex */
public interface PlaylistOrBuilder extends sre0 {
    String getCoverArtLink();

    gva getCoverArtLinkBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getSubtitle();

    gva getSubtitleBytes();

    String getTitle();

    gva getTitleBytes();

    Item getTracks(int i);

    int getTracksCount();

    List<Item> getTracksList();

    String getUri();

    gva getUriBytes();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
