package p204p;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ug9 {
    /* JADX INFO: renamed from: a */
    public static int m83028a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    /* JADX INFO: renamed from: b */
    public static BiometricManager m83029b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    /* JADX INFO: renamed from: c */
    public static Method m83030c() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
