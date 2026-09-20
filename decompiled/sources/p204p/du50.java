package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class du50 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ swp0 f52982b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ esq f52983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du50(swp0 swp0Var, esq esqVar, int i) {
        super(0);
        this.f52981a = i;
        this.f52982b = swp0Var;
        this.f52983c = esqVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f52981a) {
            case 0:
                swp0 swp0Var = this.f52982b;
                return new wt50(swp0Var.f214700a, new vxf((c6z0) swp0Var.f214702c.m25126h(this.f52983c), swp0Var.f214701b));
            default:
                swp0 swp0Var2 = this.f52982b;
                return new wt50(swp0Var2.f214700a, new vxf((c6z0) swp0Var2.f214702c.m25126h(this.f52983c), swp0Var2.f214701b));
        }
    }
}
