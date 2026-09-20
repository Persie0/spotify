package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ox6 implements ozo0 {

    /* JADX INFO: renamed from: a */
    public final qe0 f170894a;

    /* JADX INFO: renamed from: b */
    public final yzo0 f170895b;

    /* JADX INFO: renamed from: c */
    public final noo0 f170896c;

    /* JADX INFO: renamed from: d */
    public boolean f170897d;

    public ox6(qe0 qe0Var, yzo0 yzo0Var, noo0 noo0Var) {
        this.f170894a = qe0Var;
        this.f170895b = yzo0Var;
        this.f170896c = noo0Var;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: G */
    public final void mo29149G(long j, long j2) {
        m68195a(true);
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: M */
    public final void mo29150M(long j, long j2) {
        m68195a(false);
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: Q */
    public final void mo25537Q(clq clqVar, int i, long j, long j2) {
        m68195a(false);
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: R */
    public final void mo29151R(long j, long j2) {
        m68195a(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m68195a(boolean z) {
        if (z != this.f170897d) {
            this.f170897d = z;
            yzo0 yzo0Var = this.f170895b;
            qe0 qe0Var = this.f170894a;
            if (z) {
                qe0Var.f187799a.add(yzo0Var);
            } else {
                qe0Var.f187799a.remove(yzo0Var);
            }
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: k */
    public final void mo27128k(boolean z, boolean z2, float f, long j) {
        m68195a(this.f170896c.f156768c);
    }
}
