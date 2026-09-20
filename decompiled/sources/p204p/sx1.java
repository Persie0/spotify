package p204p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class sx1 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final qw1 f214745a;

    /* JADX INFO: renamed from: b */
    public final xqt f214746b;

    /* JADX INFO: renamed from: c */
    public final luk f214747c;

    /* JADX INFO: renamed from: d */
    public final luk f214748d;

    public sx1(qw1 qw1Var, xqt xqtVar, luk lukVar, luk lukVar2) {
        this.f214745a = qw1Var;
        this.f214746b = xqtVar;
        this.f214747c = lukVar;
        this.f214748d = lukVar2;
    }

    @Override // p204p.vic1
    /* JADX INFO: renamed from: c */
    public final mic1 mo28672c(Class cls, koi0 koi0Var) {
        h9y0 h9y0Var = (h9y0) koi0Var.f58545a.get(gyf1.f85601a);
        f9y0 f9y0VarMo34135x = h9y0Var != null ? h9y0Var.mo34135x() : null;
        if (f9y0VarMo34135x == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle bundleM41108a = f9y0VarMo34135x.m41108a("VM_STATE_PROVIDER");
        vvh0 vvh0Var = bundleM41108a != null ? (vvh0) zn91.m96523K(bundleM41108a, "VM_STATE_KEY", vvh0.class) : null;
        if (vvh0Var == null) {
            vvh0Var = gvh0.f84758a;
        }
        MobiusLoopViewModel mobiusLoopViewModelM15619e = MobiusLoopViewModel.m15619e(new rx1(this), vvh0Var, new fw40(9, vvh0Var, this));
        f9y0VarMo34135x.m41110c("VM_STATE_PROVIDER", new sz0(mobiusLoopViewModelM15619e, 1));
        return mobiusLoopViewModelM15619e;
    }
}
