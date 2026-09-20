package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k5b1 implements g5b1 {

    /* JADX INFO: renamed from: a */
    public final i5b1 f119468a;

    /* JADX INFO: renamed from: b */
    public final int f119469b;

    /* JADX INFO: renamed from: c */
    public final long f119470c;

    /* JADX INFO: renamed from: d */
    public final long f119471d;

    public k5b1(i5b1 i5b1Var, int i, long j) {
        this.f119468a = i5b1Var;
        this.f119469b = i;
        this.f119470c = ((long) (i5b1Var.mo49774e() + i5b1Var.mo49775k())) * 1000000;
        this.f119471d = j * 1000000;
    }

    /* JADX INFO: renamed from: a */
    public final long m55435a(long j) {
        long j2 = j + this.f119471d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.f119470c;
        long j4 = j2 / j3;
        return (this.f119469b == 1 || j4 % ((long) 2) == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: b */
    public final boolean mo42324b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final w05 m55436c(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        long j2 = this.f119471d;
        long j3 = j + j2;
        long j4 = this.f119470c;
        return j3 > j4 ? this.f119468a.mo35621f(j4 - j2, w05Var, w05Var3, w05Var2) : w05Var2;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: d */
    public final long mo35620d(w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return Long.MAX_VALUE;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: f */
    public final w05 mo35621f(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return this.f119468a.mo35621f(m55435a(j), w05Var, w05Var2, m55436c(j, w05Var, w05Var3, w05Var2));
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: m */
    public final w05 mo35624m(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return this.f119468a.mo35624m(m55435a(j), w05Var, w05Var2, m55436c(j, w05Var, w05Var3, w05Var2));
    }
}
