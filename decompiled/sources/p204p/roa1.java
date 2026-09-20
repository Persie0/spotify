package p204p;

import com.spotify.appstorage.userdirectory.NativeUserDirectoryManager;
import com.spotify.appstorage.userdirectory.UserDirectoryApi;
import com.spotify.appstorage.userdirectory.UserDirectoryCachePaths;
import com.spotify.appstorage.userdirectoryimpl.NativeUserDirectoryManagerImpl;

/* JADX INFO: loaded from: classes.dex */
public final class roa1 implements UserDirectoryApi, fwz0 {

    /* JADX INFO: renamed from: a */
    public final NativeUserDirectoryManagerImpl f201215a;

    public roa1(b301 b301Var, UserDirectoryCachePaths userDirectoryCachePaths) {
        this.f201215a = NativeUserDirectoryManagerImpl.INSTANCE.create(b301Var.m27981a().getCanonicalUsername(), userDirectoryCachePaths.getCachePath(), userDirectoryCachePaths.getSettingsPath());
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final String getCachePath() {
        return this.f201215a.getCachePath();
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final NativeUserDirectoryManager getNativeUserDirectoryManager() {
        return this.f201215a;
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final String getSettingsPath() {
        return this.f201215a.getSettingsPath();
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final String makeCachePath(String str) {
        return this.f201215a.makeCachePath(str);
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryApi
    public final String makeSettingsPath(String str) {
        return this.f201215a.makeSettingsPath(str);
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f201215a.destroy();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
