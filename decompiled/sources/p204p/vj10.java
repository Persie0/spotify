package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class vj10 {

    /* JADX INFO: renamed from: a */
    public static final int f241853a;

    /* JADX INFO: renamed from: b */
    public static final vj10 f241854b;

    static {
        int i = wo10.f253339e;
        f241853a = 12451000;
        f241854b = new vj10();
    }

    /* JADX INFO: renamed from: a */
    public Intent m85678a(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && lqg1.m59757y(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f241853a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                w2y0 w2y0VarM41527a = ffe1.m41527a(context);
                sb.append(w2y0VarM41527a.f247445a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX INFO: renamed from: b */
    public int mo83216b(Context context) {
        return m85679c(context, f241853a);
    }

    /* JADX INFO: renamed from: c */
    public int m85679c(Context context, int i) {
        int iM88620f = wo10.m88620f(context, i);
        boolean zM88622h = true;
        if (iM88620f != 18) {
            zM88622h = iM88620f == 1 ? wo10.m88622h(context) : false;
        }
        if (zM88622h) {
            return 18;
        }
        return iM88620f;
    }
}
