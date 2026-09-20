package p204p;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class st3 implements InterfaceC2088lf {

    /* JADX INFO: renamed from: a */
    public final AccessibilityManager f213767a;

    public st3(Context context) {
        this.f213767a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    /* JADX INFO: renamed from: a */
    public final long m79229a(long j, boolean z) {
        if (j >= 2147483647L) {
            return j;
        }
        int i = z ? 7 : 3;
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f213767a;
        if (i2 >= 29) {
            int iM60331I = lzj.m60331I(accessibilityManager, (int) j, i);
            if (iM60331I != Integer.MAX_VALUE) {
                return iM60331I;
            }
        } else if (!z || !accessibilityManager.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
