package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class hez {

    /* JADX INFO: renamed from: a */
    public long f90552a;

    /* JADX INFO: renamed from: b */
    public long f90553b;

    /* JADX INFO: renamed from: c */
    public long f90554c;

    /* JADX INFO: renamed from: d */
    public long f90555d;

    /* JADX INFO: renamed from: e */
    public long f90556e;

    /* JADX INFO: renamed from: f */
    public long f90557f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f90558g = new boolean[15];

    /* JADX INFO: renamed from: h */
    public int f90559h;

    /* JADX INFO: renamed from: a */
    public final boolean m47313a() {
        return this.f90555d > 15 && this.f90559h == 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m47314b(long j) {
        long j2 = this.f90555d;
        if (j2 == 0) {
            this.f90552a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f90552a;
            this.f90553b = j3;
            this.f90557f = j3;
            this.f90556e = 1L;
        } else {
            long j4 = j - this.f90554c;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.f90553b);
            boolean[] zArr = this.f90558g;
            if (jAbs <= 1000000) {
                this.f90556e++;
                this.f90557f += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f90559h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f90559h++;
            }
        }
        this.f90555d++;
        this.f90554c = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m47315c() {
        this.f90555d = 0L;
        this.f90556e = 0L;
        this.f90557f = 0L;
        this.f90559h = 0;
        Arrays.fill(this.f90558g, false);
    }
}
