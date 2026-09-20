package p204p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes7.dex */
public final class zae implements vic1 {

    /* JADX INFO: renamed from: a */
    public final e8e f281049a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f281050b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f281051c;

    public zae(e8e e8eVar, Scheduler scheduler, Scheduler scheduler2) {
        this.f281049a = e8eVar;
        this.f281050b = scheduler;
        this.f281051c = scheduler2;
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
        eae eaeVar = bundleM41108a != null ? (eae) zn91.m96523K(bundleM41108a, "VM_STATE_KEY", eae.class) : null;
        if (eaeVar == null) {
            eaeVar = new eae(m9e.f141284a);
        }
        MobiusLoopViewModel mobiusLoopViewModelM15619e = MobiusLoopViewModel.m15619e(new yae(this), eaeVar, new m95(3));
        f9y0VarMo34135x.m41110c("VM_STATE_PROVIDER", new sz0(mobiusLoopViewModelM15619e, 2));
        return mobiusLoopViewModelM15619e;
    }
}
