package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class abq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s861 f14163b;

    public /* synthetic */ abq(s861 s861Var, int i) {
        this.f14162a = i;
        this.f14163b = s861Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14162a) {
            case 0:
                this.f14163b.m77464c();
                break;
            default:
                this.f14163b.f206581f.cancel(true);
                break;
        }
    }
}
