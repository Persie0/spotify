package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vfz0 implements r4b, j5b1 {

    /* JADX INFO: renamed from: a */
    public final int f241071a;

    /* JADX INFO: renamed from: b */
    public int f241072b;

    /* JADX INFO: renamed from: c */
    public final long f241073c;

    /* JADX INFO: renamed from: d */
    public long f241074d;

    /* JADX INFO: renamed from: e */
    public final Object f241075e;

    public vfz0(g7s g7sVar, long j, int i, long j2, int i2) {
        this.f241075e = g7sVar;
        this.f241073c = j;
        this.f241071a = i;
        this.f241074d = j2;
        this.f241072b = i2;
    }

    @Override // p204p.r4b
    /* JADX INFO: renamed from: a */
    public void mo43540a(long j, long j2, long j3) {
        long j4 = this.f241074d + j3;
        this.f241074d = j4;
        ((g7s) this.f241075e).m43926f(m85385c(), this.f241073c, j4);
    }

    /* JADX INFO: renamed from: c */
    public float m85385c() {
        long j = this.f241073c;
        if (j != -1 && j != 0) {
            return h0b1.m46300a0(this.f241074d, j);
        }
        int i = this.f241071a;
        if (i != 0) {
            return h0b1.m46300a0(this.f241072b, i);
        }
        return -1.0f;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: d */
    public long mo35620d(w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return (((long) this.f241071a) * this.f241073c) - this.f241074d;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: f */
    public w05 mo35621f(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return ((i5b1) this.f241075e).mo35621f(m85386g(j), w05Var, w05Var2, m85387h(j, w05Var, w05Var3, w05Var2));
    }

    /* JADX INFO: renamed from: g */
    public long m85386g(long j) {
        long j2 = j + this.f241074d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.f241073c;
        long jMin = Math.min(j2 / j3, ((long) this.f241071a) - 1);
        return (this.f241072b == 1 || jMin % ((long) 2) == 0) ? j2 - (jMin * j3) : ((jMin + 1) * j3) - j2;
    }

    /* JADX INFO: renamed from: h */
    public w05 m85387h(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        long j2 = this.f241074d;
        long j3 = j + j2;
        long j4 = this.f241073c;
        return j3 > j4 ? mo35621f(j4 - j2, w05Var, w05Var2, w05Var3) : w05Var2;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: m */
    public w05 mo35624m(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return ((i5b1) this.f241075e).mo35624m(m85386g(j), w05Var, w05Var2, m85387h(j, w05Var, w05Var3, w05Var2));
    }

    public vfz0(int i, i5b1 i5b1Var, int i2, long j) {
        this.f241071a = i;
        this.f241075e = i5b1Var;
        this.f241072b = i2;
        if (i >= 1) {
            this.f241073c = ((long) (i5b1Var.mo49774e() + i5b1Var.mo49775k())) * 1000000;
            this.f241074d = j * 1000000;
            return;
        }
        throw new IllegalArgumentException("Iterations count can't be less than 1");
    }
}
