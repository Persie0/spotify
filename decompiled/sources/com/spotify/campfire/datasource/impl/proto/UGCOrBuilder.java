package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface UGCOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    Asset getImage(int i);

    int getImageCount();

    List<Asset> getImageList();

    Asset getVideo(int i);

    int getVideoCount();

    List<Asset> getVideoList();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
