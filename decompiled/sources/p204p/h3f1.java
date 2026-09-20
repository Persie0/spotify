package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h3f1 extends d3f1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f0f1 f87222b;

    public h3f1(f0f1 f0f1Var) {
        this.f87222b = f0f1Var;
    }

    @Override // p204p.d3f1
    /* JADX INFO: renamed from: b */
    public final void mo24430b() {
        synchronized (this.f87222b.f64637f) {
            try {
                if (this.f87222b.f64643l.get() > 0 && this.f87222b.f64643l.decrementAndGet() > 0) {
                    this.f87222b.f64633b.m31382b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                f0f1 f0f1Var = this.f87222b;
                if (f0f1Var.f64645n != null) {
                    f0f1Var.f64633b.m31382b("Unbind from service.", new Object[0]);
                    f0f1 f0f1Var2 = this.f87222b;
                    f0f1Var2.f64632a.unbindService(f0f1Var2.f64644m);
                    f0f1 f0f1Var3 = this.f87222b;
                    f0f1Var3.f64638g = false;
                    f0f1Var3.f64645n = null;
                    f0f1Var3.f64644m = null;
                }
                this.f87222b.m40480d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
