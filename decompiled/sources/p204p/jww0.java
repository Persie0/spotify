package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jww0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f116730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kww0 f116731b;

    public /* synthetic */ jww0(kww0 kww0Var, int i) {
        this.f116730a = i;
        this.f116731b = kww0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f116730a) {
            case 0:
                s18 s18Var = this.f116731b.f127256c;
                if (((kww0) s18Var.f204626h) != null) {
                    s18Var.m76921d();
                }
                break;
            default:
                s18 s18Var2 = this.f116731b.f127256c;
                if (((kww0) s18Var2.f204626h) != null && (s18Var2.f204621c & 3) != 0) {
                    s18Var2.m76921d();
                    break;
                }
                break;
        }
    }
}
