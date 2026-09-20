package p204p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tpf {

    /* JADX INFO: renamed from: a */
    public static final vi10 f222526a = new vi10("CommonUtils", "");

    /* JADX INFO: renamed from: a */
    public static String m81256a(Context context) {
        String str;
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            vi10 vi10Var = f222526a;
            if (!Log.isLoggable(vi10Var.f241586a, 6) || (str = vi10Var.f241587b) == null) {
                return "";
            }
            str.concat(strConcat);
            return "";
        }
    }
}
