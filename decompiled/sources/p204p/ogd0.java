package p204p;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ogd0 {

    /* JADX INFO: renamed from: a */
    public final tnd0 f165091a;

    /* JADX INFO: renamed from: b */
    public final MediaSessionManager.RemoteUserInfo f165092b;

    /* JADX INFO: renamed from: c */
    public final String f165093c;

    /* JADX INFO: renamed from: d */
    public final Bundle f165094d;

    /* JADX INFO: renamed from: e */
    public final MediaBrowserServiceCompat.Result f165095e;

    public ogd0(tnd0 tnd0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle, MediaBrowserServiceCompat.Result result) {
        this.f165091a = tnd0Var;
        this.f165092b = remoteUserInfo;
        this.f165093c = str;
        this.f165094d = bundle;
        this.f165095e = result;
    }
}
