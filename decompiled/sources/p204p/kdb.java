package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kdb extends hzd0 {

    /* JADX INFO: renamed from: L0 */
    public final jy7 f121652L0;

    /* JADX INFO: renamed from: Z */
    public ck90 f121653Z;

    public kdb(jy7 jy7Var) {
        this.f121652L0 = jy7Var;
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: e */
    public final Object mo33098e() {
        ck90 ck90Var = this.f121653Z;
        return ck90Var == null ? this.f121652L0 : ck90Var.mo33098e();
    }

    @Override // p204p.hzd0
    /* JADX INFO: renamed from: n */
    public final void mo49264n(ck90 ck90Var, dqk0 dqk0Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: o */
    public final void m56169o(xoi0 xoi0Var) {
        gzd0 gzd0Var;
        ck90 ck90Var = this.f121653Z;
        if (ck90Var != null && (gzd0Var = (gzd0) this.f96902Y.mo84313b(ck90Var)) != null) {
            gzd0Var.f85897a.mo33102k(gzd0Var);
        }
        this.f121653Z = xoi0Var;
        super.mo49264n(xoi0Var, new jdb(this, 0));
    }
}
