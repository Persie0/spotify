package p204p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes9.dex */
public final class a4s implements onp {

    /* JADX INFO: renamed from: a */
    public final fas f12300a;

    /* JADX INFO: renamed from: b */
    public final g4s f12301b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f12302c;

    /* JADX INFO: renamed from: d */
    public final iwr f12303d = new iwr();

    public a4s(fas fasVar, g4s g4sVar, Scheduler scheduler, hc80 hc80Var) {
        this.f12300a = fasVar;
        this.f12301b = g4sVar;
        this.f12302c = scheduler;
        hc80Var.getLifecycle().mo31986a(this);
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        hc80Var.getLifecycle().mo31988d(this);
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        this.f12303d.m51847a();
        this.f12301b.f76519f.m51847a();
    }
}
