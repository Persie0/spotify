package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vn40 implements ddz0 {

    /* JADX INFO: renamed from: a */
    public final w1b0 f242993a;

    /* JADX INFO: renamed from: b */
    public final w1b0 f242994b;

    /* JADX INFO: renamed from: c */
    public long f242995c;

    public vn40(long j, long[] jArr, long[] jArr2) {
        c95.m31843i(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f242993a = new w1b0(length);
            this.f242994b = new w1b0(length);
        } else {
            int i = length + 1;
            w1b0 w1b0Var = new w1b0(i);
            this.f242993a = w1b0Var;
            w1b0 w1b0Var2 = new w1b0(i);
            this.f242994b = w1b0Var2;
            w1b0Var.m86983a(0L);
            w1b0Var2.m86983a(0L);
        }
        this.f242993a.m86984b(jArr);
        this.f242994b.m86984b(jArr2);
        this.f242995c = j;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        w1b0 w1b0Var = this.f242994b;
        if (w1b0Var.f247053b == 0) {
            ndz0 ndz0Var = ndz0.f152874c;
            return new cdz0(ndz0Var, ndz0Var);
        }
        int iM46305d = h0b1.m46305d(w1b0Var, j);
        long jM86987e = w1b0Var.m86987e(iM46305d);
        w1b0 w1b0Var2 = this.f242993a;
        ndz0 ndz0Var2 = new ndz0(jM86987e, w1b0Var2.m86987e(iM46305d));
        if (jM86987e == j || iM46305d == w1b0Var.f247053b - 1) {
            return new cdz0(ndz0Var2, ndz0Var2);
        }
        int i = iM46305d + 1;
        return new cdz0(ndz0Var2, new ndz0(w1b0Var.m86987e(i), w1b0Var2.m86987e(i)));
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return this.f242994b.f247053b > 0;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        return this.f242995c;
    }
}
