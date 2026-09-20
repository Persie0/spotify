package p204p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes9.dex */
public final class xrc1 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final fen0 f265324a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f265325b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f265326c;

    public xrc1(fen0 fen0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.f265324a = fen0Var;
        this.f265325b = scheduler;
        this.f265326c = scheduler2;
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
        ven0 uen0Var = bundleM41108a != null ? (ven0) zn91.m96523K(bundleM41108a, "VM_STATE_KEY", ven0.class) : null;
        if (uen0Var == null) {
            uen0Var = new uen0("", "", lv21.f137205b, null, null);
        }
        vrc1 vrc1Var = new vrc1(this);
        dks dksVar = xsa0.f265551a;
        MobiusLoopViewModel mobiusLoopViewModelM15619e = MobiusLoopViewModel.m15619e(vrc1Var, uen0Var, new nrc1());
        f9y0VarMo34135x.m41110c("VM_STATE_PROVIDER", new sz0(mobiusLoopViewModelM15619e, 7));
        Object objCast = cls.cast(mobiusLoopViewModelM15619e);
        wj50.m88279p(objCast);
        return (mic1) objCast;
    }
}
