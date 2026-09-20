package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hea implements onp {

    /* JADX INFO: renamed from: a */
    public final w6j0 f90389a;

    /* JADX INFO: renamed from: b */
    public final dme f90390b;

    /* JADX INFO: renamed from: c */
    public final voc1 f90391c;

    /* JADX INFO: renamed from: d */
    public final cbm0 f90392d;

    /* JADX INFO: renamed from: e */
    public final z650 f90393e;

    public hea(w6j0 w6j0Var, dme dmeVar, voc1 voc1Var, cbm0 cbm0Var, z650 z650Var) {
        this.f90389a = w6j0Var;
        this.f90390b = dmeVar;
        this.f90391c = voc1Var;
        this.f90392d = cbm0Var;
        this.f90393e = z650Var;
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        voc1 voc1Var = this.f90391c;
        z650 z650Var = this.f90393e;
        b3j0 z2j0Var = z650Var != null ? new z2j0(voc1Var.f243453a, z650Var) : x2j0.f257512a;
        w6j0 w6j0Var = this.f90389a;
        w6j0Var.m87294e(z2j0Var);
        w6j0Var.m87295f(z2j0Var);
        this.f90390b.mo3255V(this.f90392d, voc1Var.m86091c());
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        m2j0 m2j0Var = new m2j0(null);
        w6j0 w6j0Var = this.f90389a;
        w6j0Var.m87294e(m2j0Var);
        w6j0Var.m87295f(m2j0Var);
        this.f90390b.mo3256n(this.f90392d, this.f90391c.m86091c());
    }
}
