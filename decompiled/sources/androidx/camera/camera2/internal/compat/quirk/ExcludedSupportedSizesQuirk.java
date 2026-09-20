package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import p204p.nwt0;

/* JADX INFO: loaded from: classes3.dex */
public class ExcludedSupportedSizesQuirk implements nwt0 {
    /* JADX INFO: renamed from: b */
    public static boolean m179b() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m180c() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }
}
