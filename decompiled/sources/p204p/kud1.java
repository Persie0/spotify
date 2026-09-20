package p204p;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class kud1 {
    /* JADX INFO: renamed from: a */
    public static void m57388a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context.getPackageName(), cls.getName()), z ? 1 : 2, 1);
        } catch (Exception e) {
            na6.m63972t("Failed to set widget component state", e);
        }
    }
}
