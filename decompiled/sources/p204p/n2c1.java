package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class n2c1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rlv0 f149737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o2c1 f149738b;

    public n2c1(rlv0 rlv0Var, o2c1 o2c1Var) {
        this.f149737a = rlv0Var;
        this.f149738b = o2c1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        gb80 lifecycle;
        gb80 lifecycle2;
        rlv0 rlv0Var = this.f149737a;
        hc80 hc80Var = (hc80) rlv0Var.f200373a;
        o2c1 o2c1Var = this.f149738b;
        if (hc80Var != null && (lifecycle2 = hc80Var.getLifecycle()) != null) {
            lifecycle2.mo31988d(o2c1Var);
        }
        hc80 hc80VarM40067h = eug1.m40067h(view);
        rlv0Var.f200373a = hc80VarM40067h;
        hc80 hc80Var2 = hc80VarM40067h;
        if (hc80Var2 == null || (lifecycle = hc80Var2.getLifecycle()) == null) {
            return;
        }
        lifecycle.mo31986a(o2c1Var);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
