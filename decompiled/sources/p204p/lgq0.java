package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lgq0 extends w6l0 {

    /* JADX INFO: renamed from: d */
    public xuk f133268d;

    /* JADX INFO: renamed from: e */
    public th00 f133269e;

    /* JADX INFO: renamed from: f */
    public u6l0 f133270f;

    /* JADX INFO: renamed from: g */
    public boolean f133271g;

    @Override // p204p.w6l0
    /* JADX INFO: renamed from: a */
    public final void mo42560a() {
        u6l0 u6l0Var = this.f133270f;
        if (u6l0Var != null) {
            u6l0Var.m82450a();
        }
        u6l0 u6l0Var2 = this.f133270f;
        if (u6l0Var2 != null) {
            u6l0Var2.f227382a = false;
        }
        this.f133271g = false;
    }

    @Override // p204p.w6l0
    /* JADX INFO: renamed from: b */
    public final void mo42561b() {
        u6l0 u6l0Var = this.f133270f;
        if (u6l0Var != null && !u6l0Var.f227382a) {
            u6l0Var.m82450a();
            this.f133270f = null;
        }
        if (this.f133270f == null) {
            this.f133270f = new u6l0(this.f133268d, false, this.f133269e, this);
        }
        u6l0 u6l0Var2 = this.f133270f;
        if (u6l0Var2 != null) {
            ((bqa) u6l0Var2.f227383b).mo30210A(null);
        }
        u6l0 u6l0Var3 = this.f133270f;
        if (u6l0Var3 != null) {
            u6l0Var3.f227382a = false;
        }
        this.f133271g = false;
    }

    @Override // p204p.w6l0
    /* JADX INFO: renamed from: c */
    public final void mo42562c(fi8 fi8Var) {
        u6l0 u6l0Var = this.f133270f;
        if (u6l0Var != null) {
            ((bqa) u6l0Var.f227383b).mo30231j(fi8Var);
        }
    }

    @Override // p204p.w6l0
    /* JADX INFO: renamed from: d */
    public final void mo42563d(fi8 fi8Var) {
        u6l0 u6l0Var = this.f133270f;
        if (u6l0Var != null) {
            u6l0Var.m82450a();
        }
        if (this.f248420a) {
            this.f133270f = new u6l0(this.f133268d, true, this.f133269e, this);
        }
        this.f133271g = true;
    }
}
