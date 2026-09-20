package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zgd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dhd0 f282594b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u790 f282595c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tnd0 f282596d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f282597e;

    public /* synthetic */ zgd0(dhd0 dhd0Var, u790 u790Var, tnd0 tnd0Var, int i, int i2) {
        this.f282593a = i2;
        this.f282594b = dhd0Var;
        this.f282595c = u790Var;
        this.f282596d = tnd0Var;
        this.f282597e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f282593a) {
            case 0:
                dhd0 dhd0Var = this.f282594b;
                dhd0Var.getClass();
                ca80 ca80Var = (ca80) dhd0.m36012Q(this.f282595c);
                if (ca80Var != null) {
                    dhd0Var.m36014G(this.f282596d, ca80Var);
                    dhd0.m36013R(this.f282597e, ca80Var);
                }
                break;
            default:
                dhd0 dhd0Var2 = this.f282594b;
                dhd0Var2.getClass();
                ca80 ca80Var2 = (ca80) dhd0.m36012Q(this.f282595c);
                if (ca80Var2 != null) {
                    dhd0Var2.m36014G(this.f282596d, ca80Var2);
                    dhd0.m36013R(this.f282597e, ca80Var2);
                }
                break;
        }
    }
}
