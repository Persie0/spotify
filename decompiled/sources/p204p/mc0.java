package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes.dex */
public final class mc0 implements zqa0 {

    /* JADX INFO: renamed from: a */
    public final cjd1 f141997a;

    /* JADX INFO: renamed from: b */
    public final sc0 f141998b;

    /* JADX INFO: renamed from: c */
    public final q7j0 f141999c;

    /* JADX INFO: renamed from: d */
    public final gyx0 f142000d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f142001e;

    /* JADX INFO: renamed from: f */
    public final CompositeDisposable f142002f = new CompositeDisposable();

    public mc0(cjd1 cjd1Var, sc0 sc0Var, q7j0 q7j0Var, gyx0 gyx0Var, Scheduler scheduler) {
        this.f141997a = cjd1Var;
        this.f141998b = sc0Var;
        this.f141999c = q7j0Var;
        this.f142000d = gyx0Var;
        this.f142001e = scheduler;
    }

    @Override // p204p.zqa0
    /* JADX INFO: renamed from: a */
    public final void mo61431a(gb80 gb80Var) {
        gb80Var.mo31986a(new lc0(this, gb80Var));
    }
}
