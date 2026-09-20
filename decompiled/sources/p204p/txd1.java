package p204p;

import android.os.Looper;
import android.view.View;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class txd1 {
    /* JADX INFO: renamed from: a */
    public final wgv0 m81908a(View view) {
        juk jukVarM62959v;
        ct4 ct4Var;
        cqi0 cqi0Var = wxd1.f256013a;
        juk jukVar = dau.f47107a;
        mly mlyVar = mly.f144949O0;
        wg61 wg61Var = ys4.f275671Z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jukVarM62959v = mvl0.m62959v();
        } else {
            jukVarM62959v = (juk) ys4.f275670L0.get();
            if (jukVarM62959v == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        juk jukVarMo26608y = jukVarM62959v.mo26608y(jukVar);
        cyh0 cyh0Var = (cyh0) jukVarMo26608y.mo26595B(mlyVar);
        if (cyh0Var != null) {
            ct4 ct4Var2 = new ct4(cyh0Var);
            nqr nqrVar = (nqr) ct4Var2.f41766c;
            synchronized (nqrVar.f157321b) {
                nqrVar.f157320a = false;
            }
            ct4Var = ct4Var2;
        } else {
            ct4Var = null;
        }
        rlv0 rlv0Var = new rlv0();
        juk f1i0Var = (e1i0) jukVarMo26608y.mo26595B(jsy.f115603O0);
        if (f1i0Var == null) {
            f1i0Var = new f1i0(view.getContext().getApplicationContext());
            rlv0Var.f200373a = f1i0Var;
        }
        if (ct4Var != null) {
            jukVar = ct4Var;
        }
        juk jukVarMo26608y2 = jukVarMo26608y.mo26608y(jukVar).mo26608y(f1i0Var);
        wgv0 wgv0Var = new wgv0(jukVarMo26608y2);
        synchronized (wgv0Var.f251168d) {
            wgv0Var.f251185u = true;
        }
        c9k c9kVarM56661c = kk40.m56661c(jukVarMo26608y2);
        hc80 hc80VarM40067h = eug1.m40067h(view);
        gb80 lifecycle = hc80VarM40067h != null ? hc80VarM40067h.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new rrp(17, view, wgv0Var));
            lifecycle.mo31986a(new mxd0(c9kVarM56661c, ct4Var, wgv0Var, rlv0Var, 2));
            return wgv0Var;
        }
        mt40.m62792d("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }
}
