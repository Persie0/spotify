package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ukf1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zkf1 f231287b;

    public /* synthetic */ ukf1(zkf1 zkf1Var, int i) {
        this.f231286a = i;
        this.f231287b = zkf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f231286a) {
            case 0:
                this.f231287b.m96325n();
                break;
            default:
                zkf1 zkf1Var = this.f231287b;
                zkf1Var.f283746e.m78953h(zkf1Var);
                break;
        }
    }
}
