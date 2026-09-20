package com.spotify.localfiles.localfilescore;

import android.content.Context;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import kotlin.Metadata;
import p204p.bji;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/localfiles/localfilescore/LocalFilesServiceDependencies;", "", "Landroid/content/Context;", "context", "Lp/bji;", "configurationProvider", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "openedAudioFiles", "<init>", "(Landroid/content/Context;Lp/bji;Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lp/bji;", "getConfigurationProvider", "()Lp/bji;", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "getOpenedAudioFiles", "()Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFilesServiceDependencies {
    private final bji configurationProvider;
    private final Context context;
    private final OpenedAudioFiles openedAudioFiles;

    public LocalFilesServiceDependencies(Context context, bji bjiVar, OpenedAudioFiles openedAudioFiles) {
        this.context = context;
        this.configurationProvider = bjiVar;
        this.openedAudioFiles = openedAudioFiles;
    }

    public final bji getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final Context getContext() {
        return this.context;
    }

    public final OpenedAudioFiles getOpenedAudioFiles() {
        return this.openedAudioFiles;
    }
}
