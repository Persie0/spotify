package p204p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes7.dex */
public final class sl10 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final ok10 f210240a;

    /* JADX INFO: renamed from: b */
    public final l72 f210241b;

    /* JADX INFO: renamed from: c */
    public final yk10 f210242c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f210243d;

    public sl10(ok10 ok10Var, l72 l72Var, yk10 yk10Var, Scheduler scheduler) {
        this.f210240a = ok10Var;
        this.f210241b = l72Var;
        this.f210242c = yk10Var;
        this.f210243d = scheduler;
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
        nl10 nl10Var = bundleM41108a != null ? (nl10) zn91.m96523K(bundleM41108a, "VM_STATE_KEY", nl10.class) : null;
        if (nl10Var == null) {
            nl10Var = new nl10(this.f210240a, false, jl10.f113460a, fm10.f70921a);
        }
        MobiusLoopViewModel mobiusLoopViewModelM15619e = MobiusLoopViewModel.m15619e(new rl10(this), nl10Var, new iw3(13));
        f9y0VarMo34135x.m41110c("VM_STATE_PROVIDER", new sz0(mobiusLoopViewModelM15619e, 3));
        return mobiusLoopViewModelM15619e;
    }
}
