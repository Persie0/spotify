package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e281 {

    /* JADX INFO: renamed from: a */
    public f571 f55391a;

    /* JADX INFO: renamed from: b */
    public int f55392b = 1;

    /* JADX INFO: renamed from: a */
    public final void m37594a() {
        di41 di41Var;
        f571 f571Var = this.f55391a;
        if (f571Var == null || (di41Var = f571Var.f65968S0) == null) {
            return;
        }
        di41Var.mo26601e(null);
        f571Var.f65968S0 = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m37595b() {
        z471 z471Var;
        if (this.f55392b == 1) {
            pt40.m70893c("ToolbarRequester is not initialized.");
        }
        f571 f571Var = this.f55391a;
        if (f571Var == null || !f571Var.f63766L0) {
            return;
        }
        di41 di41Var = f571Var.f65968S0;
        if ((di41Var == null || !di41Var.isActive()) && (z471Var = (z471) oqg1.m67639h(f571Var, a571.f12456b)) != null) {
            f571Var.f65968S0 = x0h1.m89578u(f571Var.m40262v1(), null, 4, new h431(f571Var, z471Var, (fbk) null, 24), 1);
        }
    }
}
