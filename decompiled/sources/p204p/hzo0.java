package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hzo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ozo0 f96988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f96989b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f96990c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f96991d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f96992e;

    public hzo0(ozo0 ozo0Var, boolean z, boolean z2, float f, long j) {
        this.f96988a = ozo0Var;
        this.f96989b = z;
        this.f96990c = z2;
        this.f96991d = f;
        this.f96992e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f96988a.mo27128k(this.f96989b, this.f96990c, this.f96991d, this.f96992e);
    }
}
