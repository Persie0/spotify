package p204p;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class ars extends zqs {
    @Override // p204p.yqs, p204p.g0b1
    /* JADX INFO: renamed from: y */
    public void mo26964y(fh61 fh61Var, fh61 fh61Var2, Window window, View view, boolean z, boolean z2) {
        int i;
        int i2;
        ds4.m36749d(window, false);
        if (fh61Var.f69593c == 0) {
            i = 0;
        } else {
            i = z ? fh61Var.f69592b : fh61Var.f69591a;
        }
        window.setStatusBarColor(i);
        if (fh61Var2.f69593c == 0) {
            i2 = 0;
        } else {
            i2 = z2 ? fh61Var2.f69592b : fh61Var2.f69591a;
        }
        window.setNavigationBarColor(i2);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(fh61Var2.f69593c == 0);
        gc41 gc41Var = new gc41(window, view);
        gc41Var.m44293i(!z);
        gc41Var.m44292h(true ^ z2);
    }
}
