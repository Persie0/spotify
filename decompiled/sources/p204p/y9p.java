package p204p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes6.dex */
public final class y9p implements onp {

    /* JADX INFO: renamed from: a */
    public final uqw f270625a;

    /* JADX INFO: renamed from: b */
    public final hrw f270626b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f270627c;

    /* JADX INFO: renamed from: d */
    public final pqn f270628d;

    /* JADX INFO: renamed from: e */
    public final lwr f270629e = new lwr();

    public y9p(hc80 hc80Var, uqw uqwVar, hrw hrwVar, Scheduler scheduler, pqn pqnVar) {
        this.f270625a = uqwVar;
        this.f270626b = hrwVar;
        this.f270627c = scheduler;
        this.f270628d = pqnVar;
        hc80Var.getLifecycle().mo31986a(this);
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f270629e.m60129c();
    }
}
