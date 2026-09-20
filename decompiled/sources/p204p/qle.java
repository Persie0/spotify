package p204p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qle {
    /* JADX INFO: renamed from: a */
    public static boolean m73179a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                return wj50.m88271j(context.getPackageManager().getInstallSourceInfo(str).getUpdateOwnerPackageName(), "com.sec.android.app.samsungapps");
            } catch (PackageManager.NameNotFoundException e) {
                na6.m63972t("Failed to get installer package", e);
            }
        }
        return false;
    }
}
