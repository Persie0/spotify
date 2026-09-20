package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface RichMediaOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    GiphyGif getGiphyGif();

    RichMedia.MediaTypeCase getMediaTypeCase();

    Sticker getSticker();

    UGC getUgc();

    boolean hasGiphyGif();

    boolean hasSticker();

    boolean hasUgc();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
