package p204p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lbm {

    /* JADX INFO: renamed from: a */
    public final pu30 f131687a;

    /* JADX INFO: renamed from: b */
    public final ComponentName f131688b;

    /* JADX INFO: renamed from: c */
    public final Context f131689c;

    public lbm(pu30 pu30Var, ComponentName componentName, Context context) {
        this.f131687a = pu30Var;
        this.f131688b = componentName;
        this.f131689c = context;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m58668a(Context context, String str, mbm mbmVar) {
        mbmVar.f141947a = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, mbmVar, 33);
    }

    /* JADX INFO: renamed from: b */
    public static String m58669b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        List<String> list = lau.f131415a;
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(str);
            arrayList.addAll(list);
            list = arrayList;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : list) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m58670c(Context context, String str) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory("androidx.browser.customtabs.category.EphemeralBrowsing")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final nbm m58671d(oh5 oh5Var, PendingIntent pendingIntent) {
        boolean zM65673v1;
        jbm jbmVar = new jbm(oh5Var);
        pu30 pu30Var = this.f131687a;
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zM65673v1 = ((nu30) pu30Var).m65670a2(jbmVar, bundle);
            } else {
                zM65673v1 = ((nu30) pu30Var).m65673v1(jbmVar);
            }
            if (zM65673v1) {
                return new nbm(pu30Var, jbmVar, this.f131688b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
