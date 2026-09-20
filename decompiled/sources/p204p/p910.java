package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class p910 implements o910 {

    /* JADX INFO: renamed from: a */
    public final Context f175116a;

    public p910(Context context) {
        this.f175116a = context;
    }

    /* JADX INFO: renamed from: a */
    public final vn70 m69354a() {
        Context context = this.f175116a;
        String strM69355b = m69355b();
        if (strM69355b == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(strM69355b, 0);
            if ((applicationInfo.flags & 1) != 0) {
                return null;
            }
            return new vn70(strM69355b, context.getPackageManager().getApplicationLabel(applicationInfo).toString(), Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(strM69355b, PackageManager.PackageInfoFlags.of(0L)).versionName : context.getPackageManager().getPackageInfo(strM69355b, 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m69355b() {
        ActivityInfo activityInfo;
        try {
            ResolveInfo resolveInfoResolveActivity = this.f175116a.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
                return activityInfo.packageName;
            }
        } catch (SecurityException unused) {
        }
        return null;
    }
}
