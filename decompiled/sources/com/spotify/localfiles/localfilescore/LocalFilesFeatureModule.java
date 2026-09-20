package com.spotify.localfiles.localfilescore;

import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import kotlin.Metadata;
import p204p.aca0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/localfiles/localfilescore/LocalFilesFeatureModule;", "", "<init>", "()V", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "openedAudioFiles", "Lp/aca0;", "localFilesClient", "Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "provideLocalFilesFeature", "(Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;Lp/aca0;)Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFilesFeatureModule {
    public static final LocalFilesFeatureModule INSTANCE = new LocalFilesFeatureModule();

    private LocalFilesFeatureModule() {
    }

    public final LocalFilesFeature provideLocalFilesFeature(OpenedAudioFiles openedAudioFiles, aca0 localFilesClient) {
        return new LocalFilesFeatureImpl(openedAudioFiles, localFilesClient);
    }
}
