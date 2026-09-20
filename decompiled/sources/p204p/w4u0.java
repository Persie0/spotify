package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w4u0 {

    /* JADX INFO: renamed from: a */
    public static final v4u0 f247890a = new v4u0();

    /* JADX INFO: renamed from: b */
    public static final AbstractC2604y8 f247891b = xtf1.f265861a.m82748r();

    /* JADX INFO: renamed from: a */
    public abstract int mo29120a(int i);

    /* JADX INFO: renamed from: b */
    public double mo84662b() {
        return p1h1.m68795h(mo29120a(26), mo29120a(27));
    }

    /* JADX INFO: renamed from: c */
    public double mo41476c(double d) {
        return mo84663d(0.0d, d);
    }

    /* JADX INFO: renamed from: d */
    public double mo84663d(double d, double d2) {
        double dMo84662b;
        if (d2 <= d) {
            throw new IllegalArgumentException(k0e1.m54991j(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
        double d3 = d2 - d;
        if (!Double.isInfinite(d3) || Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE) {
            dMo84662b = d + (mo84662b() * d3);
        } else {
            double d4 = 2;
            double dMo84662b2 = ((d2 / d4) - (d / d4)) * mo84662b();
            dMo84662b = d + dMo84662b2 + dMo84662b2;
        }
        return dMo84662b >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dMo84662b;
    }

    /* JADX INFO: renamed from: e */
    public float mo84664e() {
        return mo29120a(24) / 1.6777216E7f;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo29121f();

    /* JADX INFO: renamed from: g */
    public int mo84665g(int i) {
        return mo41477h(0, i);
    }

    /* JADX INFO: renamed from: h */
    public int mo41477h(int i, int i2) {
        int iMo29121f;
        int i3;
        int iMo29120a;
        if (i2 <= i) {
            throw new IllegalArgumentException(k0e1.m54991j(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iMo29120a = mo29120a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iMo29121f = mo29121f() >>> 1;
                    i3 = iMo29121f % i4;
                } while ((i4 - 1) + (iMo29121f - i3) < 0);
                iMo29120a = i3;
            }
            return i + iMo29120a;
        }
        while (true) {
            int iMo29121f2 = mo29121f();
            if (i <= iMo29121f2 && iMo29121f2 < i2) {
                return iMo29121f2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public long mo84666i() {
        return (((long) mo29121f()) << 32) + ((long) mo29121f());
    }

    /* JADX INFO: renamed from: j */
    public long mo41478j(long j) {
        return mo41479k(0L, j);
    }

    /* JADX INFO: renamed from: k */
    public long mo41479k(long j, long j2) {
        long jMo84666i;
        long j3;
        long jMo29120a;
        int iMo29121f;
        if (j2 <= j) {
            throw new IllegalArgumentException(k0e1.m54991j(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iMo29121f = mo29120a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iMo29121f = mo29121f();
                } else {
                    jMo29120a = (((long) mo29120a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) mo29121f()) & 4294967295L);
                }
                jMo29120a = ((long) iMo29121f) & 4294967295L;
            } else {
                do {
                    jMo84666i = mo84666i() >>> 1;
                    j3 = jMo84666i % j4;
                } while ((j4 - 1) + (jMo84666i - j3) < 0);
                jMo29120a = j3;
            }
            return j + jMo29120a;
        }
        while (true) {
            long jMo84666i2 = mo84666i();
            if (j <= jMo84666i2 && jMo84666i2 < j2) {
                return jMo84666i2;
            }
        }
    }
}
