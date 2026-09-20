package p204p;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class yqs extends g0b1 {
    @Override // p204p.g0b1
    /* JADX INFO: renamed from: y */
    public void mo26964y(fh61 fh61Var, fh61 fh61Var2, Window window, View view, boolean z, boolean z2) {
        ds4.m36749d(window, false);
        window.setStatusBarColor(z ? fh61Var.f69592b : fh61Var.f69591a);
        window.setNavigationBarColor(z2 ? fh61Var2.f69592b : fh61Var2.f69591a);
        gc41 gc41Var = new gc41(window, view);
        gc41Var.m44293i(!z);
        gc41Var.m44292h(!z2);
    }
}
