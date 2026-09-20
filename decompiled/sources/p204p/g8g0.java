package p204p;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class g8g0 implements xez0 {

    /* JADX INFO: renamed from: a */
    public final long[] f77487a;

    /* JADX INFO: renamed from: b */
    public final long[] f77488b;

    /* JADX INFO: renamed from: c */
    public final long f77489c;

    public g8g0(long j, long[] jArr, long[] jArr2) {
        this.f77487a = jArr;
        this.f77488b = jArr2;
        this.f77489c = j == -9223372036854775807L ? h0b1.m46295W(jArr2[jArr2.length - 1]) : j;
    }

    /* JADX INFO: renamed from: h */
    public static Pair m43950h(long j, long[] jArr, long[] jArr2) {
        int iM46309f = h0b1.m46309f(jArr, j, true);
        long j2 = jArr[iM46309f];
        long j3 = jArr2[iM46309f];
        int i = iM46309f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        Pair pairM43950h = m43950h(h0b1.m46326n0(h0b1.m46319k(j, 0L, this.f77489c)), this.f77488b, this.f77487a);
        ndz0 ndz0Var = new ndz0(h0b1.m46295W(((Long) pairM43950h.first).longValue()), ((Long) pairM43950h.second).longValue());
        return new cdz0(ndz0Var, ndz0Var);
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: c */
    public final long mo25848c() {
        return -1L;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return true;
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: e */
    public final long mo25850e(long j) {
        return h0b1.m46295W(((Long) m43950h(j, this.f77487a, this.f77488b).second).longValue());
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: f */
    public final int mo25851f() {
        return -2147483647;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        return this.f77489c;
    }
}
