package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j4i0 implements ddz0 {

    /* JADX INFO: renamed from: a */
    public final long f108708a;

    /* JADX INFO: renamed from: b */
    public final k4i0[] f108709b;

    /* JADX INFO: renamed from: c */
    public final int f108710c;

    public j4i0(long j, k4i0[] k4i0VarArr, int i) {
        this.f108708a = j;
        this.f108709b = k4i0VarArr;
        this.f108710c = i;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        long j2;
        long jMin;
        long j3;
        long[] jArr;
        long j4;
        int iM62530b;
        long j5 = j;
        k4i0[] k4i0VarArr = this.f108709b;
        int length = k4i0VarArr.length;
        ndz0 ndz0Var = ndz0.f152874c;
        if (length == 0) {
            return new cdz0(ndz0Var, ndz0Var);
        }
        int i = this.f108710c;
        int i2 = -1;
        if (i != -1) {
            mq81 mq81Var = k4i0VarArr[i].f119228b;
            int iM62529a = mq81Var.m62529a(j5);
            if (iM62529a == -1) {
                iM62529a = mq81Var.m62530b(j5);
            }
            long[] jArr2 = mq81Var.f146214c;
            long[] jArr3 = mq81Var.f146217f;
            if (iM62529a == -1) {
                return new cdz0(ndz0Var, ndz0Var);
            }
            long j6 = jArr3[iM62529a];
            j2 = jArr2[iM62529a];
            if (j6 >= j5 || iM62529a >= mq81Var.f146213b - 1 || (iM62530b = mq81Var.m62530b(j5)) == -1 || iM62530b == iM62529a) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = jArr3[iM62530b];
                j4 = jArr2[iM62530b];
            }
            jMin = j4;
            j5 = j6;
        } else {
            j2 = Long.MAX_VALUE;
            jMin = -1;
            j3 = -9223372036854775807L;
        }
        int i3 = 0;
        long jMin2 = j2;
        while (i3 < k4i0VarArr.length) {
            if (i3 != i) {
                mq81 mq81Var2 = k4i0VarArr[i3].f119228b;
                long[] jArr4 = mq81Var2.f146214c;
                int iM62529a2 = mq81Var2.m62529a(j5);
                if (iM62529a2 == i2) {
                    iM62529a2 = mq81Var2.m62530b(j5);
                }
                if (iM62529a2 == i2) {
                    jArr = jArr4;
                } else {
                    jArr = jArr4;
                    jMin2 = Math.min(jArr[iM62529a2], jMin2);
                }
                if (j3 != -9223372036854775807L) {
                    int iM62529a3 = mq81Var2.m62529a(j3);
                    if (iM62529a3 == -1) {
                        iM62529a3 = mq81Var2.m62530b(j3);
                    }
                    if (iM62529a3 != -1) {
                        jMin = Math.min(jArr[iM62529a3], jMin);
                    }
                }
            }
            i3++;
            i2 = -1;
        }
        ndz0 ndz0Var2 = new ndz0(j5, jMin2);
        return j3 == -9223372036854775807L ? new cdz0(ndz0Var2, ndz0Var2) : new cdz0(ndz0Var2, new ndz0(j3, jMin));
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return true;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        return this.f108708a;
    }
}
