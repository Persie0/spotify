package p204p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class w5n0 {

    /* JADX INFO: renamed from: a */
    public final Context f248117a;

    public w5n0(Context context) {
        this.f248117a = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87256a(j6n0 j6n0Var) {
        Object next;
        Iterator<T> it = this.f248117a.getPackageManager().getInstalledPackages(0).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j(((PackageInfo) next).packageName, j6n0Var.m52584a()));
        PackageInfo packageInfo = (PackageInfo) next;
        if (packageInfo != null) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            Boolean boolValueOf = applicationInfo != null ? Boolean.valueOf(applicationInfo.enabled) : null;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }
}
