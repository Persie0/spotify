package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fpd0 implements epd0 {

    /* JADX INFO: renamed from: a */
    public ha80 f71824a;

    /* JADX INFO: renamed from: b */
    public dpd0 f71825b = new dpd0();

    /* JADX INFO: renamed from: a */
    public final void m42330a(boolean z) {
        dpd0 dpd0Var = this.f71825b;
        if (dpd0Var.f51282a != z) {
            dpd0 dpd0VarM36570a = dpd0.m36570a(dpd0Var, z, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2);
            this.f71825b = dpd0VarM36570a;
            ha80 ha80Var = this.f71824a;
            if (ha80Var != null) {
                ((rg50) ha80Var.f89153b).setExtras(dpd0VarM36570a.m36571b());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m42331b(ha80 ha80Var) {
        this.f71824a = ha80Var;
        if (ha80Var != null) {
            ((rg50) ha80Var.f89153b).setExtras(this.f71825b.m36571b());
        }
    }
}
