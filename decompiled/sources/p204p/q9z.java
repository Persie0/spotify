package p204p;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q9z {
    /* JADX INFO: renamed from: a */
    public static FingerprintManager m72412a(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m72413b(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m72414c(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }
}
