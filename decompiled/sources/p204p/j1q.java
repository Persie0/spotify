package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j1q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107815a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k1q f107816b;

    public /* synthetic */ j1q(k1q k1qVar, int i) {
        this.f107815a = i;
        this.f107816b = k1qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f107815a) {
            case 0:
                this.f107816b.m55123e(null);
                break;
            default:
                this.f107816b.m55124f();
                break;
        }
    }
}
