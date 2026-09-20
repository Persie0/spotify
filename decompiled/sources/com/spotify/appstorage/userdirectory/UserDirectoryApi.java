package com.spotify.appstorage.userdirectory;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/appstorage/userdirectory/UserDirectoryApi;", "", "nativeUserDirectoryManager", "Lcom/spotify/appstorage/userdirectory/NativeUserDirectoryManager;", "getNativeUserDirectoryManager", "()Lcom/spotify/appstorage/userdirectory/NativeUserDirectoryManager;", "cachePath", "", "getCachePath", "()Ljava/lang/String;", "settingsPath", "getSettingsPath", "makeCachePath", "directoryName", "makeSettingsPath", "src_main_java_com_spotify_appstorage_userdirectory-userdirectory"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface UserDirectoryApi {
    String getCachePath();

    NativeUserDirectoryManager getNativeUserDirectoryManager();

    String getSettingsPath();

    String makeCachePath(String directoryName);

    String makeSettingsPath(String directoryName);
}
