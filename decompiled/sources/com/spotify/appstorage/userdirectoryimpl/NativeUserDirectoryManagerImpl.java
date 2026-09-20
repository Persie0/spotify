package com.spotify.appstorage.userdirectoryimpl;

import com.spotify.appstorage.userdirectory.NativeUserDirectoryManager;
import com.spotify.appstorage.userdirectory.UserDirectoryManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u000b\u0010\nR$\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00078Ö\u0001X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00078Ö\u0001X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/appstorage/userdirectoryimpl/NativeUserDirectoryManagerImpl;", "Lcom/spotify/appstorage/userdirectory/NativeUserDirectoryManager;", "Lcom/spotify/appstorage/userdirectory/UserDirectoryManager;", "<init>", "()V", "Lp/w2a1;", "destroy", "", "directoryName", "makeCachePath", "(Ljava/lang/String;)Ljava/lang/String;", "makeSettingsPath", "", "value", "nThis", "J", "getNThis", "()J", "cachePath", "Ljava/lang/String;", "getCachePath", "()Ljava/lang/String;", "settingsPath", "getSettingsPath", "Companion", "src_main_java_com_spotify_appstorage_userdirectoryimpl-userdirectoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeUserDirectoryManagerImpl implements NativeUserDirectoryManager, UserDirectoryManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cachePath;
    private long nThis;
    private final String settingsPath;

    @Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0087 ¨\u0006\n"}, m24212d2 = {"Lcom/spotify/appstorage/userdirectoryimpl/NativeUserDirectoryManagerImpl$Companion;", "", "<init>", "()V", "create", "Lcom/spotify/appstorage/userdirectoryimpl/NativeUserDirectoryManagerImpl;", "canonicalUsername", "", "cachePath", "settingsPath", "src_main_java_com_spotify_appstorage_userdirectoryimpl-userdirectoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeUserDirectoryManagerImpl create(String canonicalUsername, String cachePath, String settingsPath) {
            return NativeUserDirectoryManagerImpl.create(canonicalUsername, cachePath, settingsPath);
        }

        private Companion() {
        }
    }

    private NativeUserDirectoryManagerImpl() {
    }

    public static final native NativeUserDirectoryManagerImpl create(String str, String str2, String str3);

    @Override // com.spotify.appstorage.userdirectory.NativeUserDirectoryManager
    public native void destroy();

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryManager
    public native String getCachePath();

    @Override // com.spotify.appstorage.userdirectory.NativeUserDirectoryManager
    public long getNThis() {
        return this.nThis;
    }

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryManager
    public native String getSettingsPath();

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryManager
    public native String makeCachePath(String directoryName);

    @Override // com.spotify.appstorage.userdirectory.UserDirectoryManager
    public native String makeSettingsPath(String directoryName);
}
