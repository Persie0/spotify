package com.spotify.localfiles.localfilescore;

import android.content.Context;
import com.spotify.localfiles.mediastore.MediaStoreReaderOptions;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import p204p.h4t0;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalFilesService_Factory implements h4t0 {
    private final h4t0 contextProvider;
    private final h4t0 mediaStoreReaderOptionsProvider;
    private final h4t0 openedAudioFilesProvider;

    private LocalFilesService_Factory(h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3) {
        this.contextProvider = h4t0Var;
        this.mediaStoreReaderOptionsProvider = h4t0Var2;
        this.openedAudioFilesProvider = h4t0Var3;
    }

    public static LocalFilesService_Factory create(h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3) {
        return new LocalFilesService_Factory(h4t0Var, h4t0Var2, h4t0Var3);
    }

    public static LocalFilesService newInstance(Context context, MediaStoreReaderOptions mediaStoreReaderOptions, OpenedAudioFiles openedAudioFiles) {
        return new LocalFilesService(context, mediaStoreReaderOptions, openedAudioFiles);
    }

    @Override // p204p.i4t0
    public LocalFilesService get() {
        return newInstance((Context) this.contextProvider.get(), (MediaStoreReaderOptions) this.mediaStoreReaderOptionsProvider.get(), (OpenedAudioFiles) this.openedAudioFilesProvider.get());
    }
}
