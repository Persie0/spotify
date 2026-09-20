package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xcz0 implements ocz0 {

    /* JADX INFO: renamed from: a */
    public final ocz0 f260320a;

    /* JADX INFO: renamed from: b */
    public final xre f260321b;

    /* JADX INFO: renamed from: c */
    public long f260322c = -1;

    public xcz0(ocz0 ocz0Var, xre xreVar) {
        this.f260320a = ocz0Var;
        this.f260321b = xreVar;
    }

    @Override // p204p.ocz0
    /* JADX INFO: renamed from: a */
    public final ncz0 mo66728a(int i, long j, int i2) {
        ((wy3) this.f260321b).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f260322c;
        if (j2 != -1 && jCurrentTimeMillis - j2 < 50) {
            return null;
        }
        this.f260322c = jCurrentTimeMillis;
        return this.f260320a.mo66728a(i, j, i2);
    }
}
