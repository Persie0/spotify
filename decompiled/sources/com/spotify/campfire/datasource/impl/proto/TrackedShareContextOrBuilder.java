package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface TrackedShareContextOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    ListeningActivity getListeningActivity();

    PlaylistInvitation getPlaylistInvitation();

    PlaylistMessage getPlaylistMessage();

    PlaylistReaction getPlaylistReaction();

    PlaylistReply getPlaylistReply();

    TrackedShareContext.TypeCase getTypeCase();

    boolean hasListeningActivity();

    boolean hasPlaylistInvitation();

    boolean hasPlaylistMessage();

    boolean hasPlaylistReaction();

    boolean hasPlaylistReply();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
