package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yac0 extends hg0 {

    /* JADX INFO: renamed from: a */
    public final ig0 f270871a;

    public yac0(ig0 ig0Var) {
        this.f270871a = ig0Var;
    }

    @Override // p204p.hg0
    /* JADX INFO: renamed from: a */
    public final void mo24737a(Object obj) throws Exception {
        w2a1 w2a1Var;
        og0 og0Var = this.f270871a.f101853a;
        if (og0Var != null) {
            og0Var.mo24737a(obj);
            w2a1Var = w2a1.f247311a;
        } else {
            w2a1Var = null;
        }
        if (w2a1Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    @Override // p204p.hg0
    /* JADX INFO: renamed from: b */
    public final void mo24738b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
