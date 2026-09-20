package p204p;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class ygd1 implements ddz0 {

    /* JADX INFO: renamed from: a */
    public final o7f f272565a;

    /* JADX INFO: renamed from: b */
    public final int f272566b;

    /* JADX INFO: renamed from: c */
    public final long f272567c;

    /* JADX INFO: renamed from: d */
    public final long f272568d;

    /* JADX INFO: renamed from: e */
    public final long f272569e;

    public ygd1(o7f o7fVar, int i, long j, long j2) {
        this.f272565a = o7fVar;
        this.f272566b = i;
        this.f272567c = j;
        long j3 = (j2 - j) / ((long) o7fVar.f162533c);
        this.f272568d = j3;
        this.f272569e = m93596h(j3);
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        o7f o7fVar = this.f272565a;
        long j2 = (((long) o7fVar.f162532b) * j) / (((long) this.f272566b) * 1000000);
        long j3 = this.f272568d;
        long jM46319k = h0b1.m46319k(j2, 0L, j3 - 1);
        long j4 = ((long) o7fVar.f162533c) * jM46319k;
        long j5 = this.f272567c;
        long jM93596h = m93596h(jM46319k);
        ndz0 ndz0Var = new ndz0(jM93596h, j4 + j5);
        if (jM93596h >= j || jM46319k == j3 - 1) {
            return new cdz0(ndz0Var, ndz0Var);
        }
        long j6 = jM46319k + 1;
        return new cdz0(ndz0Var, new ndz0(m93596h(j6), (((long) o7fVar.f162533c) * j6) + j5));
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return true;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        return this.f272569e;
    }

    /* JADX INFO: renamed from: h */
    public final long m93596h(long j) {
        long j2 = j * ((long) this.f272566b);
        long j3 = this.f272565a.f162532b;
        String str = h0b1.f86200a;
        return h0b1.m46312g0(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
