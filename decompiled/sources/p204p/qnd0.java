package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qnd0 implements pnd0 {

    /* JADX INFO: renamed from: a */
    public final luk f190564a;

    /* JADX INFO: renamed from: b */
    public final vqd0 f190565b;

    /* JADX INFO: renamed from: c */
    public final g12 f190566c = new g12(12);

    public qnd0(luk lukVar, vqd0 vqd0Var) {
        this.f190564a = lukVar;
        this.f190565b = vqd0Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m73345a(qnd0 qnd0Var, Context context, List list) {
        Logger.m3965a("MBS: Setting component states: %s", list);
        try {
            if (Build.VERSION.SDK_INT < 33) {
                Logger.m3965a("MBS: Using setComponentEnabledSetting (non-atomic).", new Object[0]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pqm0 pqm0Var = (pqm0) it.next();
                    context.getPackageManager().setComponentEnabledSetting((ComponentName) pqm0Var.f180350a, ((Number) pqm0Var.f180351b).intValue(), 1);
                }
                return;
            }
            Logger.m3965a("MBS: Using setComponentEnabledSettings (atomic).", new Object[0]);
            PackageManager packageManager = context.getPackageManager();
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                pqm0 pqm0Var2 = (pqm0) it2.next();
                ComponentName componentName = (ComponentName) pqm0Var2.f180350a;
                int iIntValue = ((Number) pqm0Var2.f180351b).intValue();
                x9a.m90241c();
                arrayList.add(x9a.m90239a(iIntValue, componentName));
            }
            packageManager.setComponentEnabledSettings(arrayList);
        } catch (Exception e) {
            na6.m63972t("Failed to set component states: " + list, e);
        }
    }
}
