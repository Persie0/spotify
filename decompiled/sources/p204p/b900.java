package p204p;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class b900 implements ddz0 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f24730a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f24731b;

    /* JADX INFO: renamed from: c */
    public final long f24732c;

    /* JADX INFO: renamed from: d */
    public final long f24733d;

    /* JADX INFO: renamed from: e */
    public final int f24734e;

    public b900(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i) {
        this.f24730a = sparseArray;
        this.f24731b = sparseArray2;
        this.f24732c = j;
        this.f24733d = j2;
        this.f24734e = i;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        SparseArray sparseArray = this.f24730a;
        int i = this.f24734e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.f24731b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            int i2 = this.f24734e;
            jArr = (long[]) sparseArray.get(i2);
            jArr2 = (long[]) sparseArray2.get(i2);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            ndz0 ndz0Var = new ndz0(0L, this.f24733d);
            return new cdz0(ndz0Var, ndz0Var);
        }
        int iM46309f = h0b1.m46309f(jArr, j, true);
        ndz0 ndz0Var2 = new ndz0(jArr[iM46309f], jArr2[iM46309f]);
        return new cdz0(ndz0Var2, ndz0Var2);
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return true;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        return this.f24732c;
    }
}
