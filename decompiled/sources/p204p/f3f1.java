package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class f3f1 extends d3f1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ev61 f65493b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c1f1 f65494c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ f0f1 f65495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3f1(f0f1 f0f1Var, ev61 ev61Var, ev61 ev61Var2, c1f1 c1f1Var) {
        super(ev61Var);
        this.f65493b = ev61Var2;
        this.f65494c = c1f1Var;
        this.f65495d = f0f1Var;
    }

    @Override // p204p.d3f1
    /* JADX INFO: renamed from: b */
    public final void mo24430b() {
        synchronized (this.f65495d.f64637f) {
            try {
                f0f1 f0f1Var = this.f65495d;
                ev61 ev61Var = this.f65493b;
                f0f1Var.f64636e.add(ev61Var);
                ev61Var.f63172a.mo1510b(new y3d1(13, f0f1Var, ev61Var));
                if (this.f65495d.f64643l.getAndIncrement() > 0) {
                    this.f65495d.f64633b.m31382b("Already connected to the service.", new Object[0]);
                }
                f0f1.m40477b(this.f65495d, this.f65494c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
