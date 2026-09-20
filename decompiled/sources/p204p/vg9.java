package p204p;

import android.hardware.biometrics.BiometricManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vg9 {
    /* JADX INFO: renamed from: a */
    public static int m85407a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
