package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jzo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ozo0 f117768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ clq f117769b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f117770c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f117771d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f117772e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ n95 f117773f;

    public jzo0(ozo0 ozo0Var, clq clqVar, int i, long j, long j2, n95 n95Var) {
        this.f117768a = ozo0Var;
        this.f117769b = clqVar;
        this.f117770c = i;
        this.f117771d = j;
        this.f117772e = j2;
        this.f117773f = n95Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n95 n95Var = this.f117773f;
        try {
            this.f117768a.mo25537Q(this.f117769b, this.f117770c, this.f117771d, this.f117772e);
        } finally {
            n95Var.m63912z();
        }
    }
}
