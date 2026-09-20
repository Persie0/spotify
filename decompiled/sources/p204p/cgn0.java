package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cgn0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fgn0 f37751b;

    public /* synthetic */ cgn0(fgn0 fgn0Var, int i) {
        this.f37750a = i;
        this.f37751b = fgn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37750a) {
            case 0:
                this.f37751b.f69374a.mo74690i();
                break;
            case 1:
                this.f37751b.f69374a.mo74684b();
                break;
            default:
                this.f37751b.f69374a.mo74687e();
                break;
        }
    }
}
