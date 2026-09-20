package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class en8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dy0 f61092b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f61093c;

    public /* synthetic */ en8(dy0 dy0Var, Object obj, int i) {
        this.f61091a = i;
        this.f61092b = dy0Var;
        this.f61093c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61091a) {
            case 0:
                dy0 dy0Var = this.f61092b;
                if (dy0Var.f54136a == 0) {
                    dy0Var.m37288J(this.f61093c);
                }
                break;
            default:
                dy0 dy0Var2 = this.f61092b;
                int i = dy0Var2.f54136a - 1;
                dy0Var2.f54136a = i;
                if (i == 0) {
                    dy0Var2.m37288J(this.f61093c);
                }
                break;
        }
    }
}
