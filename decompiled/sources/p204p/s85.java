package p204p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class s85 {

    /* JADX INFO: renamed from: a */
    public final String f206548a;

    /* JADX INFO: renamed from: b */
    public final String f206549b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f206550c;

    /* JADX INFO: renamed from: d */
    public final String f206551d;

    /* JADX INFO: renamed from: e */
    public final String f206552e;

    /* JADX INFO: renamed from: f */
    public final String f206553f;

    /* JADX INFO: renamed from: g */
    public final String f206554g;

    /* JADX INFO: renamed from: h */
    public final n95 f206555h;

    public s85(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, n95 n95Var) {
        this.f206548a = str;
        this.f206549b = str2;
        this.f206550c = arrayList;
        this.f206551d = str3;
        this.f206552e = str4;
        this.f206553f = str5;
        this.f206554g = str6;
        this.f206555h = n95Var;
    }

    /* JADX INFO: renamed from: a */
    public static s85 m77461a(Context context, vz30 vz30Var, String str, String str2, ArrayList arrayList, n95 n95Var) {
        String packageName = context.getPackageName();
        String strM52909a = vz30Var.f246368a.m52909a(vz30Var.f246369b);
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new s85(str, str2, arrayList, strM52909a, packageName, string, str3, n95Var);
    }
}
