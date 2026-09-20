package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class jwe {

    /* JADX INFO: renamed from: a */
    public HashMap f116631a;

    /* JADX INFO: renamed from: a */
    public static int m54436a(Context context, sv6 sv6Var) {
        Bundle extras = ((Intent) ((xvb) sv6Var.f214340c).m92223k().f243701b).getExtras();
        Integer num = extras == null ? null : (Integer) extras.get("androidx.browser.customtabs.extra.COLOR_SCHEME");
        if (num == null || num.intValue() == 0) {
            return (context.getResources().getConfiguration().uiMode & 48) == 32 ? 2 : 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public eh61 m54437b(Context context, String str) {
        IntentFilter intentFilter;
        IntentFilter intentFilter2;
        HashMap map = this.f116631a;
        eh61 eh61Var = (eh61) map.get(str);
        if (eh61Var != null) {
            return eh61Var;
        }
        boolean z = false;
        if (!ebe.f57907a.contains(str) ? false : ebe.m38364a(context.getPackageManager(), str, 380900000)) {
            eh61 eh61Var2 = new eh61(true, true);
            map.put(str, eh61Var2);
            return eh61Var2;
        }
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(str), 64);
        boolean z2 = (resolveInfoResolveService == null || (intentFilter2 = resolveInfoResolveService.filter) == null || !intentFilter2.hasCategory("androidx.browser.customtabs.category.NavBarColorCustomization")) ? false : true;
        if (resolveInfoResolveService != null && (intentFilter = resolveInfoResolveService.filter) != null && intentFilter.hasCategory("androidx.browser.customtabs.category.ColorSchemeCustomization")) {
            z = true;
        }
        eh61 eh61Var3 = new eh61(z2, z);
        map.put(str, eh61Var3);
        return eh61Var3;
    }
}
