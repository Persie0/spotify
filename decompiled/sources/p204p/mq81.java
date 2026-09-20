package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mq81 {

    /* JADX INFO: renamed from: a */
    public final ob81 f146212a;

    /* JADX INFO: renamed from: b */
    public final int f146213b;

    /* JADX INFO: renamed from: c */
    public final long[] f146214c;

    /* JADX INFO: renamed from: d */
    public final int[] f146215d;

    /* JADX INFO: renamed from: e */
    public final int f146216e;

    /* JADX INFO: renamed from: f */
    public final long[] f146217f;

    /* JADX INFO: renamed from: g */
    public final int[] f146218g;

    /* JADX INFO: renamed from: h */
    public final int[] f146219h;

    /* JADX INFO: renamed from: i */
    public final long f146220i;

    /* JADX INFO: renamed from: j */
    public final boolean f146221j;

    public mq81(ob81 ob81Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        c95.m31843i(iArr.length == jArr2.length);
        c95.m31843i(jArr.length == jArr2.length);
        c95.m31843i(iArr2.length == jArr2.length);
        this.f146212a = ob81Var;
        this.f146214c = jArr;
        this.f146215d = iArr;
        this.f146216e = i;
        this.f146217f = jArr2;
        this.f146218g = iArr2;
        this.f146219h = iArr3;
        this.f146221j = z;
        this.f146220i = j;
        this.f146213b = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m62529a(long j) {
        long[] jArr = this.f146217f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i = 0;
        if (this.f146221j) {
            return h0b1.m46309f(jArr, j, false);
        }
        int[] iArr = this.f146219h;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int iM38556e = edb.m38556e(length, i, 2, i);
            if (jArr[iArr[iM38556e]] <= j) {
                i = iM38556e + 1;
                i2 = iM38556e;
            } else {
                length = iM38556e - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0 && jArr[iArr[i2 - 1]] == j2) {
                i2--;
            }
        }
        return iArr[i2];
    }

    /* JADX INFO: renamed from: b */
    public final int m62530b(long j) {
        long[] jArr = this.f146217f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.f146221j) {
            return h0b1.m46301b(jArr, j, true);
        }
        int[] iArr = this.f146219h;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int iM38556e = edb.m38556e(length, i, 2, i);
            if (jArr[iArr[iM38556e]] >= j) {
                length = iM38556e - 1;
                i2 = iM38556e;
            } else {
                i = iM38556e + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                if (jArr[iArr[i3]] != j2) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr[i2];
    }
}
