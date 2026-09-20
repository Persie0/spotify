package com.spotify.localfiles.proto;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes8.dex */
public interface QueryResultOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    LocalFile getFiles(int i);

    int getFilesCount();

    List<LocalFile> getFilesList();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
