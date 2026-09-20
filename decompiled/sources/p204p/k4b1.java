package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k4b1 implements xez0 {

    /* JADX INFO: renamed from: a */
    public final long[] f119179a;

    /* JADX INFO: renamed from: b */
    public final long[] f119180b;

    /* JADX INFO: renamed from: c */
    public final long f119181c;

    /* JADX INFO: renamed from: d */
    public final long f119182d;

    /* JADX INFO: renamed from: e */
    public final int f119183e;

    public k4b1(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.f119179a = jArr;
        this.f119180b = jArr2;
        this.f119181c = j;
        this.f119182d = j3;
        this.f119183e = nxf1.m65829h(j3 - j2, j);
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        long[] jArr = this.f119179a;
        int iM46309f = h0b1.m46309f(jArr, j, true);
        long j2 = jArr[iM46309f];
        long[] jArr2 = this.f119180b;
        ndz0 ndz0Var = new ndz0(j2, jArr2[iM46309f]);
        if (j2 >= j || iM46309f == jArr.length - 1) {
            return new cdz0(ndz0Var, ndz0Var);
        }
        int i = iM46309f + 1;
        return new cdz0(ndz0Var, new ndz0(jArr[i], jArr2[i]));
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: c */
    public final long mo25848c() {
        return this.f119182d;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return true;
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: e */
    public final long mo25850e(long j) {
        return this.f119179a[h0b1.m46309f(this.f119180b, j, true)];
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: f */
    public final int mo25851f() {
        return this.f119183e;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        return this.f119181c;
    }
}
