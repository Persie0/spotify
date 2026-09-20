package p204p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class oj3 implements mj3 {

    /* JADX INFO: renamed from: a */
    public final ic3 f165940a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f165941b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f165942c;

    /* JADX INFO: renamed from: d */
    public final zv41 f165943d;

    /* JADX INFO: renamed from: e */
    public final nuu0 f165944e;

    /* JADX INFO: renamed from: f */
    public final zv41 f165945f;

    /* JADX INFO: renamed from: g */
    public final nuu0 f165946g;

    /* JADX INFO: renamed from: h */
    public MobiusLoop f165947h;

    /* JADX INFO: renamed from: i */
    public volatile ad3 f165948i;

    public oj3(ic3 ic3Var, Scheduler scheduler, Scheduler scheduler2) {
        this.f165940a = ic3Var;
        this.f165941b = scheduler;
        this.f165942c = scheduler2;
        ad3 ad3Var = ad3.f14499e;
        zv41 zv41VarM52819d = jag1.m52819d(new pj3(ad3Var.f14500a, ad3Var.f14501b, ad3Var.f14502c));
        this.f165943d = zv41VarM52819d;
        this.f165944e = bzf1.m31021m(zv41VarM52819d);
        zv41 zv41VarM52819d2 = jag1.m52819d(null);
        this.f165945f = zv41VarM52819d2;
        this.f165946g = bzf1.m31021m(zv41VarM52819d2);
    }

    /* JADX INFO: renamed from: a */
    public final void m67082a(yiy0 yiy0Var) {
        MobiusLoop mobiusLoop = this.f165947h;
        if (mobiusLoop != null) {
            mobiusLoop.m15600a(new mc3(yiy0Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public final nuu0 m67083b() {
        return this.f165946g;
    }

    /* JADX INFO: renamed from: c */
    public final nuu0 m67084c() {
        return this.f165944e;
    }
}
