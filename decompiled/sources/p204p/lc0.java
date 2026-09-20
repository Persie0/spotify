package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes5.dex */
public final class lc0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mc0 f131783a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gb80 f131784b;

    public lc0(mc0 mc0Var, gb80 gb80Var) {
        this.f131783a = mc0Var;
        this.f131784b = gb80Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f131784b.mo31988d(this);
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        k4n0 k4n0VarM55393a;
        q7j0 q7j0Var = this.f131783a.f141999c;
        k4n0 k4n0Var = q7j0Var.f186145c;
        if (k4n0Var != null) {
            ((wy3) q7j0Var.f186144b).getClass();
            k4n0VarM55393a = k4n0.m55393a(k4n0Var, 0L, System.currentTimeMillis(), 0L, 191);
        } else {
            k4n0VarM55393a = null;
        }
        q7j0Var.f186145c = k4n0VarM55393a;
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        mc0 mc0Var = this.f131783a;
        sc0 sc0Var = mc0Var.f141998b;
        iqp0 iqp0Var = sc0Var.f207615c;
        iqp0Var.f104825f = new nc0(sc0Var, 0);
        iqp0Var.f104824e = ((gyx0) iqp0Var.f104821b).f85788a.map(pnq0.f179497Y0).distinctUntilChanged().observeOn((Scheduler) iqp0Var.f104822c).subscribe(new fjd1(iqp0Var, 0), new fjd1(iqp0Var, 1));
        ejd1 ejd1Var = (ejd1) mc0Var.f141997a;
        ejd1Var.f60207h.m23395f(ejd1Var.f60200a.f85788a.subscribe(new gzc1(ejd1Var, 5), fxc1.f74337d));
        CompositeDisposable compositeDisposable = mc0Var.f142002f;
        if (compositeDisposable.m23397i() > 0) {
            na6.m63971s("Lifecycle mismatch detected: onStart called without matching onStop");
            compositeDisposable.m23396g();
        }
        compositeDisposable.mo23393b(mc0Var.f142000d.f85788a.filter(njy0.f154694b).distinctUntilChanged().filter(kqd1.f125282b).observeOn(mc0Var.f142001e).subscribe(new C1666ag(mc0Var, 6)));
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        mc0 mc0Var = this.f131783a;
        q7j0 q7j0Var = mc0Var.f141999c;
        k4n0 k4n0Var = q7j0Var.f186145c;
        q7j0Var.f186145c = k4n0Var != null ? k4n0.m55393a(k4n0Var, 0L, 0L, q7j0Var.m72291a(), 127) : null;
        mc0Var.f142002f.m23396g();
        sc0 sc0Var = mc0Var.f141998b;
        sc0Var.f207617e.m51847a();
        ((Disposable) sc0Var.f207615c.f104824e).dispose();
        ((ejd1) mc0Var.f141997a).f60207h.m23396g();
    }
}
