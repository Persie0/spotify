package com.spotify.localfiles.localfilescore;

import android.content.Context;
import com.spotify.imageloader.localfileimage.LocalFileImageLoader;
import com.spotify.localfiles.localfilesapi.LocalFilesApi;
import com.spotify.localfiles.localfilesimpl.NativeLocalFilesDelegate;
import com.spotify.localfiles.mediastore.MediaStoreReader;
import com.spotify.localfiles.mediastore.MediaStoreReaderOptions;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import kotlin.Metadata;
import p204p.fwz0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/localfiles/localfilescore/LocalFilesService;", "Lcom/spotify/localfiles/localfilesapi/LocalFilesApi;", "Lp/fwz0;", "Landroid/content/Context;", "context", "Lcom/spotify/localfiles/mediastore/MediaStoreReaderOptions;", "mediaStoreReaderOptions", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "openedAudioFiles", "<init>", "(Landroid/content/Context;Lcom/spotify/localfiles/mediastore/MediaStoreReaderOptions;Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;)V", "Lp/w2a1;", "shutdown", "()V", "Lcom/spotify/localfiles/localfilesimpl/NativeLocalFilesDelegate;", "nativeLocalFilesDelegate", "Lcom/spotify/localfiles/localfilesimpl/NativeLocalFilesDelegate;", "getNativeLocalFilesDelegate", "()Lcom/spotify/localfiles/localfilesimpl/NativeLocalFilesDelegate;", "getApi", "()Lcom/spotify/localfiles/localfilesapi/LocalFilesApi;", "api", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFilesService implements LocalFilesApi, fwz0 {
    private final NativeLocalFilesDelegate nativeLocalFilesDelegate;

    public LocalFilesService(Context context, MediaStoreReaderOptions mediaStoreReaderOptions, OpenedAudioFiles openedAudioFiles) {
        this.nativeLocalFilesDelegate = NativeLocalFilesDelegate.INSTANCE.create(context, new MediaStoreReader(context, mediaStoreReaderOptions, openedAudioFiles), new LocalFileImageLoader(context));
    }

    @Override // p204p.fwz0
    public LocalFilesApi getApi() {
        return this;
    }

    @Override // com.spotify.localfiles.localfilesapi.LocalFilesApi
    public NativeLocalFilesDelegate getNativeLocalFilesDelegate() {
        return this.nativeLocalFilesDelegate;
    }

    @Override // p204p.hgm
    public void shutdown() {
        getNativeLocalFilesDelegate().destroy();
    }
}
