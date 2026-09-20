package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bhd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27143a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dhd0 f27144b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ te40 f27145c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tnd0 f27146d;

    public /* synthetic */ bhd0(dhd0 dhd0Var, te40 te40Var, tnd0 tnd0Var, int i) {
        this.f27143a = i;
        this.f27144b = dhd0Var;
        this.f27145c = te40Var;
        this.f27146d = tnd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27143a) {
            case 0:
                dhd0 dhd0Var = this.f27144b;
                dhd0Var.getClass();
                ca80 ca80Var = (ca80) dhd0.m36012Q(this.f27145c);
                if (ca80Var != null) {
                    dhd0Var.m36014G(this.f27146d, ca80Var);
                }
                break;
            default:
                dhd0 dhd0Var2 = this.f27144b;
                dhd0Var2.getClass();
                ca80 ca80Var2 = (ca80) dhd0.m36012Q(this.f27145c);
                if (ca80Var2 != null) {
                    dhd0Var2.m36014G(this.f27146d, ca80Var2);
                }
                break;
        }
    }
}
