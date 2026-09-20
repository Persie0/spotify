package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class imw0 extends m3t0 {

    /* JADX INFO: renamed from: X */
    public int f103784X;

    /* JADX INFO: renamed from: Y */
    public final long f103785Y;

    public imw0(y1t0 y1t0Var, o3t0 o3t0Var, long j, ktz0 ktz0Var) {
        super(y1t0Var, o3t0Var, ktz0Var);
        this.f103784X = -1;
        if (j == 19500) {
            int iM66207o = o3t0Var.m66207o();
            if (iM66207o < 0) {
                throw new IllegalArgumentException(("Expected positive length for " + ktz0Var + ", but got " + iM66207o).toString());
            }
            j = -iM66207o;
        }
        this.f103785Y = j;
    }

    @Override // p204p.m3t0
    /* JADX INFO: renamed from: f1 */
    public final long mo45307f1(ktz0 ktz0Var, int i) {
        long j = this.f103785Y;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }

    @Override // p204p.m3t0, p204p.frh
    /* JADX INFO: renamed from: p */
    public final int mo29816p(ktz0 ktz0Var) {
        long j = this.f103785Y;
        o3t0 o3t0Var = this.f139753d;
        if (j > 0) {
            if ((this.f103784X == -1 ? o3t0Var.f161439b : o3t0Var.m66214v()) != ((int) (j & 2147483647L))) {
                o3t0Var.m66199g();
                return -1;
            }
            int i = this.f103784X + 1;
            this.f103784X = i;
            return i;
        }
        long j2 = -j;
        int i2 = this.f103784X + 1;
        this.f103784X = i2;
        if (i2 == j2 || o3t0Var.m66196d()) {
            return -1;
        }
        return i2;
    }
}
