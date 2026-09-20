package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g6x extends luk {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f77135f = 0;

    /* JADX INFO: renamed from: c */
    public long f77136c;

    /* JADX INFO: renamed from: d */
    public boolean f77137d;

    /* JADX INFO: renamed from: e */
    public hj5 f77138e;

    @Override // p204p.luk
    /* JADX INFO: renamed from: Q */
    public final luk mo40637Q(int i) {
        jh3.m53313d(i);
        return this;
    }

    /* JADX INFO: renamed from: U */
    public final void m43767U(boolean z) {
        long j = this.f77136c - (z ? 4294967296L : 1L);
        this.f77136c = j;
        if (j <= 0 && this.f77137d) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m43768V(nsr nsrVar) {
        hj5 hj5Var = this.f77138e;
        if (hj5Var == null) {
            hj5Var = new hj5();
            this.f77138e = hj5Var;
        }
        hj5Var.addLast(nsrVar);
    }

    /* JADX INFO: renamed from: X */
    public abstract Thread mo43769X();

    /* JADX INFO: renamed from: c0 */
    public final void m43770c0(boolean z) {
        this.f77136c = (z ? 4294967296L : 1L) + this.f77136c;
        if (z) {
            return;
        }
        this.f77137d = true;
    }

    /* JADX INFO: renamed from: e0 */
    public abstract long mo40886e0();

    /* JADX INFO: renamed from: g0 */
    public final boolean m43771g0() {
        hj5 hj5Var = this.f77138e;
        if (hj5Var == null) {
            return false;
        }
        nsr nsrVar = (nsr) (hj5Var.isEmpty() ? null : hj5Var.removeFirst());
        if (nsrVar == null) {
            return false;
        }
        nsrVar.run();
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public void mo43772h0(long j, d6x d6xVar) {
        ygp.f272616t.m40891n0(j, d6xVar);
    }

    public abstract void shutdown();
}
