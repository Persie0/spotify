package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class age1 implements xez0 {

    /* JADX INFO: renamed from: a */
    public final long f15353a;

    /* JADX INFO: renamed from: b */
    public final int f15354b;

    /* JADX INFO: renamed from: c */
    public final long f15355c;

    /* JADX INFO: renamed from: d */
    public final int f15356d;

    /* JADX INFO: renamed from: e */
    public final long f15357e;

    /* JADX INFO: renamed from: f */
    public final long f15358f;

    /* JADX INFO: renamed from: g */
    public final long[] f15359g;

    public age1(long j, int i, long j2, long j3, long[] jArr) {
        this.f15353a = j;
        this.f15354b = i;
        this.f15355c = j2;
        this.f15356d = nxf1.m65829h(j3 - ((long) i), j2);
        this.f15357e = j3;
        this.f15359g = jArr;
        this.f15358f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        double d;
        double d2;
        boolean zMo25849d = mo25849d();
        int i = this.f15354b;
        long j2 = this.f15353a;
        if (!zMo25849d) {
            ndz0 ndz0Var = new ndz0(0L, j2 + ((long) i));
            return new cdz0(ndz0Var, ndz0Var);
        }
        long jM46319k = h0b1.m46319k(j, 0L, this.f15355c);
        double d3 = (jM46319k * 100.0d) / this.f15355c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.f15359g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.f15357e;
        ndz0 ndz0Var2 = new ndz0(jM46319k, j2 + h0b1.m46319k(Math.round((d4 / d) * j3), i, j3 - 1));
        return new cdz0(ndz0Var2, ndz0Var2);
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: c */
    public final long mo25848c() {
        return this.f15358f;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return this.f15359g != null;
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: e */
    public final long mo25850e(long j) {
        long j2 = j - this.f15353a;
        if (!mo25849d() || j2 <= this.f15354b) {
            return 0L;
        }
        long[] jArr = this.f15359g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.f15357e;
        int iM46309f = h0b1.m46309f(jArr, (long) d, true);
        long j3 = this.f15355c;
        long j4 = (((long) iM46309f) * j3) / 100;
        long j5 = jArr[iM46309f];
        int i = iM46309f + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iM46309f == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: f */
    public final int mo25851f() {
        return this.f15356d;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        return this.f15355c;
    }
}
