package p204p;

import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ebe {

    /* JADX INFO: renamed from: a */
    public static final List f57907a = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.android.chrome");

    /* JADX INFO: renamed from: b */
    public static final List f57908b = Arrays.asList("com.chrome.beta", "com.android.chrome");

    /* JADX INFO: renamed from: c */
    public static final List f57909c = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome");

    /* JADX INFO: renamed from: a */
    public static boolean m38364a(PackageManager packageManager, String str, int i) {
        return f57909c.contains(str) || m38365b(packageManager, str) >= i;
    }

    /* JADX INFO: renamed from: b */
    public static int m38365b(PackageManager packageManager, String str) {
        try {
            return Build.VERSION.SDK_INT >= 28 ? (int) packageManager.getPackageInfo(str, 0).getLongVersionCode() : packageManager.getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }
}
