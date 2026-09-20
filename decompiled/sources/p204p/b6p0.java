package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b6p0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g9c1 f24004b;

    public /* synthetic */ b6p0(g9c1 g9c1Var, int i) {
        this.f24003a = i;
        this.f24004b = g9c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24003a) {
            case 0:
                this.f24004b.mo25348e();
                break;
            case 1:
                this.f24004b.mo24874d();
                break;
            default:
                this.f24004b.mo24871a();
                break;
        }
    }
}
