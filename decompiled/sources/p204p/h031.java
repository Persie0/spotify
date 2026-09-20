package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h031 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i031 f86122b;

    public /* synthetic */ h031(i031 i031Var, int i) {
        this.f86121a = i;
        this.f86122b = i031Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f86121a) {
            case 0:
                this.f86122b.f97131i.m66678i(fb80.f67754e);
                break;
            default:
                this.f86122b.f97131i.m66678i(fb80.f67752c);
                break;
        }
    }
}
