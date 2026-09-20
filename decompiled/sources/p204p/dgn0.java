package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dgn0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fgn0 f48840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ double f48841c;

    public /* synthetic */ dgn0(fgn0 fgn0Var, double d, int i) {
        this.f48839a = i;
        this.f48840b = fgn0Var;
        this.f48841c = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48839a) {
            case 0:
                this.f48840b.f69374a.mo74686d(this.f48841c);
                break;
            default:
                this.f48840b.f69374a.mo74685c(this.f48841c);
                break;
        }
    }
}
