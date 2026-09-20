package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d57 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fw40 f45358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hro f45359c;

    public /* synthetic */ d57(fw40 fw40Var, hro hroVar, int i) {
        this.f45357a = i;
        this.f45358b = fw40Var;
        this.f45359c = hroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45357a) {
            case 0:
                fw40 fw40Var = this.f45358b;
                hro hroVar = this.f45359c;
                synchronized (hroVar) {
                }
                j57 j57Var = (j57) fw40Var.f73935c;
                String str = h0b1.f86200a;
                j57Var.mo29558k(hroVar);
                break;
            default:
                fw40 fw40Var2 = this.f45358b;
                hro hroVar2 = this.f45359c;
                j57 j57Var2 = (j57) fw40Var2.f73935c;
                String str2 = h0b1.f86200a;
                j57Var2.mo29569y(hroVar2);
                break;
        }
    }
}
