package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s37 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205189a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f205190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f205191c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f205192d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f205193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s37(long j, long[] jArr, long[] jArr2, vw8 vw8Var) {
        super(1);
        this.f205190b = j;
        this.f205191c = jArr;
        this.f205192d = jArr2;
        this.f205193e = vw8Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f205189a) {
            case 0:
                Throwable th = (Throwable) obj;
                ((di41) this.f205191c).mo26601e(null);
                sir0 sir0Var = (sir0) this.f205192d;
                if (((Number) ((w37) this.f205193e).f247503a.getValue()).longValue() >= this.f205190b) {
                    th = null;
                }
                sir0Var.mo30210A(th);
                break;
            default:
                long jLongValue = (((Number) obj).longValue() - this.f205190b) / 1000000;
                for (int i = 0; i < 24; i++) {
                    long j = ((long[]) this.f205191c)[i];
                    float f = ((((long[]) this.f205192d)[i] + jLongValue) % (((long) 2) * j)) / j;
                    if (f >= 1.0f) {
                        f = 2.0f - f;
                    }
                    ((vw8) this.f205193e).f245427a.set(i, Float.valueOf(gqs.f83525c.mo30276a(f)));
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s37(di41 di41Var, sir0 sir0Var, w37 w37Var, long j) {
        super(1);
        this.f205191c = di41Var;
        this.f205192d = sir0Var;
        this.f205193e = w37Var;
        this.f205190b = j;
    }
}
