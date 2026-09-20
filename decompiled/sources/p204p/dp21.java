package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dp21 {

    /* JADX INFO: renamed from: a */
    public final ac20 f51158a;

    /* JADX INFO: renamed from: b */
    public final ac20 f51159b;

    /* JADX INFO: renamed from: c */
    public final bwt0 f51160c;

    public dp21(ac20 ac20Var, ac20 ac20Var2, bwt0 bwt0Var) {
        this.f51158a = ac20Var;
        this.f51159b = ac20Var2;
        this.f51160c = bwt0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m36562a() {
        if (this.f51160c.m30717m()) {
            ac20 ac20Var = this.f51158a;
            if (ac20Var.mo25416d()) {
                ac20Var.mo25414b();
                return;
            }
            ac20 ac20Var2 = this.f51159b;
            if (ac20Var2.mo25416d()) {
                ac20Var2.mo25414b();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36563b() {
        return this.f51159b.mo25416d() || this.f51158a.mo25416d();
    }
}
