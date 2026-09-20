package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pt50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ st50 f181045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f181046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vco f181047c;

    public pt50(st50 st50Var, String str, vco vcoVar) {
        this.f181045a = st50Var;
        this.f181046b = str;
        this.f181047c = vcoVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m70896a(vco vcoVar, xq00 xq00Var, int i) {
        pgv0 pgv0VarM91796v;
        ot50 ot50Var;
        xq00Var.m91775k0(-422036479);
        int i2 = (xq00Var.m91766g(this) ? 32 : 16) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 17) != 16)) {
            st50 st50Var = this.f181045a;
            nt50 nt50Var = (nt50) st50Var.f213815d.get(this.f181046b);
            if (nt50Var == null) {
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v == null) {
                    return;
                } else {
                    ot50Var = new ot50(this, vcoVar, i, 1);
                }
            } else {
                ftf1.m42606g(nt50Var.f157983a, this.f181047c, (ago) st50Var.f213812a.f208051e, new kt60(this.f181047c.f240176g.mo72192a()), null, rkk.m75772x(-34723836, new tl20(17, nt50Var, st50Var), xq00Var), rkk.m75772x(628588395, new nv20(nt50Var, 22), xq00Var), 0, null, xq00Var, 1769472, 200);
            }
            pgv0VarM91796v.f177419d = ot50Var;
        }
        xq00Var.m91757b0();
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            ot50Var = new ot50(this, vcoVar, i, 0);
            pgv0VarM91796v.f177419d = ot50Var;
        }
    }
}
