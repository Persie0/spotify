package p204p;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class s3m0 {
    static {
        gaz.m44194g("PackageManagerHelper");
    }

    /* JADX INFO: renamed from: a */
    public static void m77136a(Context context, Class cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                gaz.m44190b().getClass();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
                gaz.m44190b().getClass();
            }
        } catch (Exception unused) {
            gaz.m44190b().getClass();
        }
    }
}
