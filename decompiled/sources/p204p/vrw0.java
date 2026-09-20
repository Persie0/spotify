package p204p;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class vrw0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m86300a(Activity activity, ta80 ta80Var) {
        if (activity instanceof hc80) {
            gb80 lifecycle = ((hc80) activity).getLifecycle();
            if (lifecycle instanceof oc80) {
                ((oc80) lifecycle).m66676g(ta80Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m86301b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            xrw0.C2586a.Companion.getClass();
            wrw0.m88870a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new xrw0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
