package p204p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes5.dex */
public final class bc41 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final ub41 f25775a;

    /* JADX INFO: renamed from: b */
    public final wqt f25776b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f25777c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f25778d;

    public bc41(ub41 ub41Var, wqt wqtVar, Scheduler scheduler, Scheduler scheduler2) {
        this.f25775a = ub41Var;
        this.f25776b = wqtVar;
        this.f25777c = scheduler;
        this.f25778d = scheduler2;
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
        bwh0 bwh0Var = bundleM41108a != null ? (bwh0) zn91.m96523K(bundleM41108a, "VM_STATE_KEY", bwh0.class) : null;
        if (bwh0Var == null) {
            bwh0Var = fvh0.f73798a;
        }
        MobiusLoopViewModel mobiusLoopViewModelM15619e = MobiusLoopViewModel.m15619e(new ac41(this), bwh0Var, new iry0(this, 17));
        f9y0VarMo34135x.m41110c("VM_STATE_PROVIDER", new sz0(mobiusLoopViewModelM15619e, 5));
        return mobiusLoopViewModelM15619e;
    }
}
