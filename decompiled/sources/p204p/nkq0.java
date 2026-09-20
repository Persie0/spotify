package p204p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes5.dex */
public final class nkq0 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final yjq0 f154929a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f154930b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f154931c;

    public nkq0(yjq0 yjq0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.f154929a = yjq0Var;
        this.f154930b = scheduler;
        this.f154931c = scheduler2;
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
        ikq0 ikq0Var = bundleM41108a != null ? (ikq0) zn91.m96523K(bundleM41108a, "VM_STATE_KEY", ikq0.class) : null;
        if (ikq0Var == null) {
            ikq0Var = new ikq0(qkq0.f189634a);
        }
        MobiusLoopViewModel mobiusLoopViewModelM15619e = MobiusLoopViewModel.m15619e(new mkq0(this), ikq0Var, new lb5(21));
        f9y0VarMo34135x.m41110c("VM_STATE_PROVIDER", new sz0(mobiusLoopViewModelM15619e, 4));
        return mobiusLoopViewModelM15619e;
    }
}
