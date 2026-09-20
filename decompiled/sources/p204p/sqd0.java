package p204p;

import android.media.session.MediaSessionManager;

/* JADX INFO: loaded from: classes3.dex */
public final class sqd0 extends tqd0 {
    public sqd0(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    /* JADX INFO: renamed from: a */
    public static String m78945a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }
}
