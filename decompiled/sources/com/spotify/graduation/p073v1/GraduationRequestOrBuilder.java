package com.spotify.graduation.p073v1;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface GraduationRequestOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    DownloadLevel getLevels(int i);

    int getLevelsCount();

    List<DownloadLevel> getLevelsList();

    int getLevelsValue(int i);

    List<Integer> getLevelsValueList();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
