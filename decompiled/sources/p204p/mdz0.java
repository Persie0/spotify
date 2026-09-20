package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mdz0 {

    /* JADX INFO: renamed from: c */
    public static final mdz0 f142538c;

    /* JADX INFO: renamed from: d */
    public static final mdz0 f142539d;

    /* JADX INFO: renamed from: a */
    public final long f142540a;

    /* JADX INFO: renamed from: b */
    public final long f142541b;

    static {
        mdz0 mdz0Var = new mdz0(0L, 0L);
        new mdz0(Long.MAX_VALUE, Long.MAX_VALUE);
        f142538c = new mdz0(Long.MAX_VALUE, 0L);
        new mdz0(0L, Long.MAX_VALUE);
        f142539d = mdz0Var;
    }

    public mdz0(long j, long j2) {
        c95.m31843i(j >= 0);
        c95.m31843i(j2 >= 0);
        this.f142540a = j;
        this.f142541b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public final long m61531a(long j, long j2, long j3) {
        long j4 = this.f142540a;
        long j5 = this.f142541b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = h0b1.f86200a;
        long j6 = j - j4;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long jM46299a = h0b1.m46299a(j, j5);
        boolean z = j7 <= j2 && j2 <= jM46299a;
        boolean z2 = j7 <= j3 && j3 <= jM46299a;
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z) {
            if (z2) {
                return j3;
            }
            return j7;
        }
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mdz0.class == obj.getClass()) {
            mdz0 mdz0Var = (mdz0) obj;
            if (this.f142540a == mdz0Var.f142540a && this.f142541b == mdz0Var.f142541b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f142540a) * 31) + ((int) this.f142541b);
    }
}
