package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e0f1 extends d3f1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i8v f54965b;

    public e0f1(i8v i8vVar) {
        this.f54965b = i8vVar;
    }

    @Override // p204p.d3f1
    /* JADX INFO: renamed from: b */
    public final void mo24430b() {
        f0f1 f0f1Var = (f0f1) this.f54965b.f99849b;
        f0f1Var.f64633b.m31382b("unlinkToDeath", new Object[0]);
        f0f1Var.f64645n.asBinder().unlinkToDeath(f0f1Var.f64642k, 0);
        f0f1Var.f64645n = null;
        f0f1Var.f64638g = false;
    }
}
