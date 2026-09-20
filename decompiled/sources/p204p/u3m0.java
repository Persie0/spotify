package p204p;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u3m0 {
    /* JADX INFO: renamed from: a */
    public static boolean m82303a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
