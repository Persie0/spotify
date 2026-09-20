package p204p;

import android.os.Build;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes4.dex */
public final class k19 implements m19 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p19 f118255a;

    public k19(p19 p19Var) {
        this.f118255a = p19Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m55053a() {
        if (Build.VERSION.SDK_INT >= 29) {
            p19 p19Var = this.f118255a;
            WindowInsets rootWindowInsets = p19Var.f172994c.getRootWindowInsets();
            if (rootWindowInsets != null) {
                p19Var.f173002k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                p19Var.m68780f();
            }
        }
    }
}
