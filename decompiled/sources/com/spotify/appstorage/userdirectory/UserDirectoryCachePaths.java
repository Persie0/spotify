package com.spotify.appstorage.userdirectory;

import kotlin.Metadata;
import p204p.dq60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/appstorage/userdirectory/UserDirectoryCachePaths;", "", "cachePath", "", "settingsPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCachePath", "()Ljava/lang/String;", "getSettingsPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_appstorage_userdirectory-userdirectory"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class UserDirectoryCachePaths {
    private final String cachePath;
    private final String settingsPath;

    public UserDirectoryCachePaths(String str, String str2) {
        this.cachePath = str;
        this.settingsPath = str2;
    }

    public static /* synthetic */ UserDirectoryCachePaths copy$default(UserDirectoryCachePaths userDirectoryCachePaths, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userDirectoryCachePaths.cachePath;
        }
        if ((i & 2) != 0) {
            str2 = userDirectoryCachePaths.settingsPath;
        }
        return userDirectoryCachePaths.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCachePath() {
        return this.cachePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSettingsPath() {
        return this.settingsPath;
    }

    public final UserDirectoryCachePaths copy(String cachePath, String settingsPath) {
        return new UserDirectoryCachePaths(cachePath, settingsPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDirectoryCachePaths)) {
            return false;
        }
        UserDirectoryCachePaths userDirectoryCachePaths = (UserDirectoryCachePaths) other;
        return wj50.m88271j(this.cachePath, userDirectoryCachePaths.cachePath) && wj50.m88271j(this.settingsPath, userDirectoryCachePaths.settingsPath);
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public final String getSettingsPath() {
        return this.settingsPath;
    }

    public int hashCode() {
        return this.settingsPath.hashCode() + (this.cachePath.hashCode() * 31);
    }

    public String toString() {
        return dq60.m36615o("UserDirectoryCachePaths(cachePath=", this.cachePath, ", settingsPath=", this.settingsPath, ")");
    }
}
