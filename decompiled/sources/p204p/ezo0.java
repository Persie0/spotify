package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ezo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ozo0 f64426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f64427c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f64428d;

    public /* synthetic */ ezo0(ozo0 ozo0Var, int i, long j, int i2) {
        this.f64425a = i2;
        this.f64426b = ozo0Var;
        this.f64427c = i;
        this.f64428d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64425a) {
            case 0:
                this.f64426b.mo40615B(this.f64427c, this.f64428d);
                break;
            default:
                this.f64426b.mo61271N(this.f64427c, this.f64428d);
                break;
        }
    }
}
