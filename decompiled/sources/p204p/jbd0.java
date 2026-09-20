package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jbd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ obd0 f110737b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lbd0 f110738c;

    public /* synthetic */ jbd0(obd0 obd0Var, lbd0 lbd0Var, int i) {
        this.f110736a = i;
        this.f110737b = obd0Var;
        this.f110738c = lbd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f110736a) {
            case 0:
                obd0 obd0Var = this.f110737b;
                lbd0 lbd0Var = this.f110738c;
                obd0Var.f163617f = lbd0Var;
                if (obd0Var.f163618g) {
                    obd0Var.m28330u(lbd0Var);
                }
                obd0Var.mo28322a(new jbd0(obd0Var, lbd0Var, 1), new xgi(obd0Var, 2));
                break;
            default:
                if (this.f110737b.isCancelled()) {
                    this.f110738c.m58659b1();
                }
                break;
        }
    }
}
