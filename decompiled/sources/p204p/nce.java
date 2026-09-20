package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class nce implements ddz0 {

    /* JADX INFO: renamed from: a */
    public final int f152495a;

    /* JADX INFO: renamed from: b */
    public final int[] f152496b;

    /* JADX INFO: renamed from: c */
    public final long[] f152497c;

    /* JADX INFO: renamed from: d */
    public final long[] f152498d;

    /* JADX INFO: renamed from: e */
    public final long[] f152499e;

    /* JADX INFO: renamed from: f */
    public final long f152500f;

    public nce(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f152496b = iArr;
        this.f152497c = jArr;
        this.f152498d = jArr2;
        this.f152499e = jArr3;
        int length = iArr.length;
        this.f152495a = length;
        if (length > 0) {
            this.f152500f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f152500f = 0L;
        }
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        long[] jArr = this.f152499e;
        int iM46309f = h0b1.m46309f(jArr, j, true);
        long j2 = jArr[iM46309f];
        long[] jArr2 = this.f152497c;
        ndz0 ndz0Var = new ndz0(j2, jArr2[iM46309f]);
        if (j2 >= j || iM46309f == this.f152495a - 1) {
            return new cdz0(ndz0Var, ndz0Var);
        }
        int i = iM46309f + 1;
        return new cdz0(ndz0Var, new ndz0(jArr[i], jArr2[i]));
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return true;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        return this.f152500f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f152495a + ", sizes=" + Arrays.toString(this.f152496b) + ", offsets=" + Arrays.toString(this.f152497c) + ", timeUs=" + Arrays.toString(this.f152499e) + ", durationsUs=" + Arrays.toString(this.f152498d) + ")";
    }
}
