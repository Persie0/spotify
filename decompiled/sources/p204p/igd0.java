package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class igd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101962a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t601 f101963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u790 f101964c;

    public /* synthetic */ igd0(t601 t601Var, u790 u790Var, int i) {
        this.f101962a = i;
        this.f101963b = t601Var;
        this.f101964c = u790Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f101962a) {
            case 0:
                if (this.f101963b.isCancelled()) {
                    this.f101964c.cancel(false);
                }
                break;
            default:
                if (this.f101963b.isCancelled()) {
                    this.f101964c.cancel(false);
                }
                break;
        }
    }
}
