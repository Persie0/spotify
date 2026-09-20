package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jh71 {

    /* JADX INFO: renamed from: a */
    public final toi0 f112348a;

    /* JADX INFO: renamed from: b */
    public ih71 f112349b;

    /* JADX INFO: renamed from: c */
    public long f112350c;

    /* JADX INFO: renamed from: d */
    public long f112351d;

    /* JADX INFO: renamed from: e */
    public long f112352e;

    /* JADX INFO: renamed from: f */
    public long f112353f;

    /* JADX INFO: renamed from: g */
    public float[] f112354g;

    public jh71() {
        toi0 toi0Var = x350.f257695a;
        this.f112348a = new toi0();
        this.f112350c = -1L;
        this.f112351d = 0L;
        this.f112352e = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static long m53365a(ih71 ih71Var, long j, long j2, float[] fArr, long j3, long j4) {
        long j5 = ih71Var.f102193c;
        if (j5 > 0) {
            long j6 = ih71Var.f102200j;
            if (j6 > 0) {
                if (j3 - j6 < j5) {
                    return Math.min(j4, j6 + j5);
                }
                ih71Var.f102199i = j3;
                ih71Var.f102200j = -1L;
                ih71Var.m50585a(ih71Var.f102197g, ih71Var.f102198h, j, j2, fArr);
                return j4;
            }
        }
        return j4;
    }

    /* JADX INFO: renamed from: b */
    public final void m53366b(ih71 ih71Var, long j, long j2, float[] fArr, long j3) {
        long j4 = ih71Var.f102199i;
        long j5 = ih71Var.f102193c;
        boolean z = j3 - j4 > ih71Var.f102192b || j4 == Long.MIN_VALUE;
        boolean z2 = j5 == 0;
        ih71Var.f102200j = j3;
        if (z && z2) {
            ih71Var.f102199i = j3;
            ih71Var.m50585a(ih71Var.f102197g, ih71Var.f102198h, j, j2, fArr);
        }
        if (z2) {
            return;
        }
        long j6 = this.f112350c;
        long j7 = j3 + j5;
        if (j6 <= 0 || j7 >= j6) {
            return;
        }
        this.f112350c = j6;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m53367c(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (y350.m92729b(j2, this.f112351d)) {
            z = false;
        } else {
            this.f112351d = j2;
            z = true;
        }
        if (!y350.m92729b(j, this.f112352e)) {
            this.f112352e = j;
            z = true;
        }
        if (fArr != null) {
            this.f112354g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f112353f) {
            return z;
        }
        this.f112353f = j3;
        return true;
    }
}
