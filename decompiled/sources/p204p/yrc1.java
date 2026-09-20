package p204p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes9.dex */
public final class yrc1 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final sdn0 f275455a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f275456b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f275457c;

    public yrc1(sdn0 sdn0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.f275455a = sdn0Var;
        this.f275456b = scheduler;
        this.f275457c = scheduler2;
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
        ebb ebbVar = bundleM41108a != null ? (ebb) zn91.m96523K(bundleM41108a, "VM_STATE_KEY", ebb.class) : null;
        if (ebbVar == null) {
            ebbVar = dbb.f47269a;
        }
        MobiusLoopViewModel mobiusLoopViewModelM15619e = MobiusLoopViewModel.m15619e(new wrc1(this), ebbVar, new orc1());
        f9y0VarMo34135x.m41110c("VM_STATE_PROVIDER", new p55(mobiusLoopViewModelM15619e, 2));
        Object objCast = cls.cast(mobiusLoopViewModelM15619e);
        wj50.m88279p(objCast);
        return (mic1) objCast;
    }
}
