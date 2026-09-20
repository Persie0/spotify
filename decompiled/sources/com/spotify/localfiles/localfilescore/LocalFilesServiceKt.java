package com.spotify.localfiles.localfilescore;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m24212d2 = {"createLocalFilesService", "Lcom/spotify/localfiles/localfilescore/LocalFilesService;", "dependencies", "Lcom/spotify/localfiles/localfilescore/LocalFilesServiceDependencies;", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFilesServiceKt {
    public static final LocalFilesService createLocalFilesService(LocalFilesServiceDependencies localFilesServiceDependencies) {
        return DaggerLocalFilesServiceFactoryComponent.factory().create(localFilesServiceDependencies).localFilesService();
    }
}
