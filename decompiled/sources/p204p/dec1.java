package p204p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class dec1 {
    /* JADX INFO: renamed from: a */
    public static swd1 m35774a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        swd1 swd1VarM79536g = swd1.m79536g(null, rootWindowInsets);
        pwd1 pwd1Var = swd1VarM79536g.f214650a;
        pwd1Var.mo51814t(swd1VarM79536g);
        pwd1Var.mo51804d(view.getRootView());
        return swd1VarM79536g;
    }

    /* JADX INFO: renamed from: b */
    public static void m35775b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
