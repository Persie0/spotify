package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sa31 implements Iterable, pq60 {

    /* JADX INFO: renamed from: e */
    public static final sa31 f207125e = new sa31(0, 0, 0, null);

    /* JADX INFO: renamed from: a */
    public final long f207126a;

    /* JADX INFO: renamed from: b */
    public final long f207127b;

    /* JADX INFO: renamed from: c */
    public final long f207128c;

    /* JADX INFO: renamed from: d */
    public final long[] f207129d;

    public sa31(long j, long j2, long j3, long[] jArr) {
        this.f207126a = j;
        this.f207127b = j2;
        this.f207128c = j3;
        this.f207129d = jArr;
    }

    /* JADX INFO: renamed from: a */
    public final sa31 m77605a(sa31 sa31Var) {
        sa31 sa31VarM77606b;
        long[] jArr;
        sa31 sa31Var2 = f207125e;
        if (sa31Var == sa31Var2) {
            return this;
        }
        if (this == sa31Var2) {
            return sa31Var2;
        }
        long j = sa31Var.f207128c;
        long j2 = sa31Var.f207128c;
        long[] jArr2 = sa31Var.f207129d;
        long j3 = sa31Var.f207127b;
        long j4 = sa31Var.f207126a;
        long j5 = this.f207128c;
        if (j == j5 && jArr2 == (jArr = this.f207129d)) {
            return new sa31(this.f207126a & (~j4), this.f207127b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            sa31VarM77606b = this;
            for (long j6 : jArr2) {
                sa31VarM77606b = sa31VarM77606b.m77606b(j6);
            }
        } else {
            sa31VarM77606b = this;
        }
        long j7 = 0;
        if (j3 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j3) != j7) {
                    sa31VarM77606b = sa31VarM77606b.m77606b(((long) i) + j2);
                }
                i++;
                j7 = j7;
            }
        }
        long j8 = j7;
        if (j4 != j8) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != j8) {
                    sa31VarM77606b = sa31VarM77606b.m77606b(((long) i2) + j2 + ((long) 64));
                }
            }
        }
        return sa31VarM77606b;
    }

    /* JADX INFO: renamed from: b */
    public final sa31 m77606b(long j) {
        long[] jArr;
        int iM72106p;
        long[] jArr2;
        long j2 = j - this.f207128c;
        long j3 = 0;
        if (wj50.m88283v(j2, j3) >= 0 && wj50.m88283v(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.f207127b;
            if ((j5 & j4) != 0) {
                return new sa31(this.f207126a, j5 & (~j4), this.f207128c, this.f207129d);
            }
        } else if (wj50.m88283v(j2, 64) >= 0 && wj50.m88283v(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.f207126a;
            if ((j7 & j6) != 0) {
                return new sa31(j7 & (~j6), this.f207127b, this.f207128c, this.f207129d);
            }
        } else if (wj50.m88283v(j2, j3) < 0 && (jArr = this.f207129d) != null && (iM72106p = q3d0.m72106p(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM72106p > 0) {
                    bk5.m29633r0(jArr, jArr3, 0, 0, iM72106p);
                }
                if (iM72106p < i) {
                    bk5.m29633r0(jArr, jArr3, iM72106p, iM72106p + 1, length);
                }
                jArr2 = jArr3;
            }
            return new sa31(this.f207126a, this.f207127b, this.f207128c, jArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m77607d(long j) {
        long[] jArr;
        long j2 = j - this.f207128c;
        long j3 = 0;
        if (wj50.m88283v(j2, j3) >= 0 && wj50.m88283v(j2, 64) < 0) {
            return ((1 << ((int) j2)) & this.f207127b) != 0;
        }
        if (wj50.m88283v(j2, 64) < 0 || wj50.m88283v(j2, 128) >= 0) {
            return wj50.m88283v(j2, j3) <= 0 && (jArr = this.f207129d) != null && q3d0.m72106p(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) - 64)) & this.f207126a) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final sa31 m77608e(sa31 sa31Var) {
        sa31 sa31VarM77609f;
        sa31 sa31VarM77609f2;
        long[] jArr;
        sa31 sa31Var2 = f207125e;
        if (sa31Var == sa31Var2) {
            return this;
        }
        if (this == sa31Var2) {
            return sa31Var;
        }
        long j = sa31Var.f207128c;
        long j2 = sa31Var.f207128c;
        long[] jArr2 = sa31Var.f207129d;
        long j3 = sa31Var.f207127b;
        long j4 = sa31Var.f207126a;
        long j5 = this.f207128c;
        long j6 = this.f207127b;
        long j7 = this.f207126a;
        if (j == j5 && jArr2 == (jArr = this.f207129d)) {
            return new sa31(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = this.f207129d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                sa31VarM77609f = this;
                for (long j8 : jArr2) {
                    sa31VarM77609f = sa31VarM77609f.m77609f(j8);
                }
            } else {
                sa31VarM77609f = this;
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        sa31VarM77609f = sa31VarM77609f.m77609f(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        sa31VarM77609f = sa31VarM77609f.m77609f(((long) i) + j2 + ((long) 64));
                    }
                    i++;
                }
            }
            return sa31VarM77609f;
        }
        if (jArr3 != null) {
            sa31VarM77609f2 = sa31Var;
            for (long j9 : jArr3) {
                sa31VarM77609f2 = sa31VarM77609f2.m77609f(j9);
            }
        } else {
            sa31VarM77609f2 = sa31Var;
        }
        long j10 = this.f207128c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    sa31VarM77609f2 = sa31VarM77609f2.m77609f(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    sa31VarM77609f2 = sa31VarM77609f2.m77609f(((long) i) + j10 + ((long) 64));
                }
                i++;
            }
        }
        return sa31VarM77609f2;
    }

    /* JADX INFO: renamed from: f */
    public final sa31 m77609f(long j) {
        long j2;
        long j3;
        long[] jArrM70470l;
        long j4 = this.f207128c;
        long j5 = j - j4;
        long j6 = 0;
        int iM88283v = wj50.m88283v(j5, j6);
        long j7 = this.f207127b;
        if (iM88283v < 0 || wj50.m88283v(j5, 64) >= 0) {
            long j8 = 64;
            int iM88283v2 = wj50.m88283v(j5, j8);
            long j9 = this.f207126a;
            if (iM88283v2 < 0 || wj50.m88283v(j5, 128) >= 0) {
                long j10 = 128;
                int iM88283v3 = wj50.m88283v(j5, j10);
                long[] jArr = this.f207129d;
                if (iM88283v3 >= 0) {
                    if (!m77607d(j)) {
                        long j11 = 1;
                        long j12 = ((j + j11) / j8) * j8;
                        if (wj50.m88283v(j12, j6) < 0) {
                            j12 = (Long.MAX_VALUE - j10) + j11;
                        }
                        po11 po11Var = null;
                        long j13 = j4;
                        long j14 = j9;
                        while (true) {
                            if (wj50.m88283v(j13, j12) >= 0) {
                                j2 = j13;
                                j3 = j7;
                                break;
                            }
                            if (j7 != 0) {
                                if (po11Var == null) {
                                    po11Var = new po11(jArr);
                                }
                                int i = 0;
                                while (i < 64) {
                                    long j15 = j12;
                                    if ((j7 & (1 << i)) != 0) {
                                        po11Var.m70464f(((long) i) + j13);
                                    }
                                    i++;
                                    j12 = j15;
                                }
                            }
                            long j16 = j12;
                            if (j14 == 0) {
                                j2 = j16;
                                j3 = 0;
                                break;
                            }
                            j13 += j8;
                            j7 = j14;
                            j12 = j16;
                            j14 = 0;
                        }
                        return new sa31(j14, j3, j2, (po11Var == null || (jArrM70470l = po11Var.m70470l()) == null) ? jArr : jArrM70470l).m77609f(j);
                    }
                } else {
                    if (jArr == null) {
                        return new sa31(this.f207126a, this.f207127b, this.f207128c, new long[]{j});
                    }
                    int iM72106p = q3d0.m72106p(jArr, j);
                    if (iM72106p < 0) {
                        int i2 = -(iM72106p + 1);
                        int length = jArr.length;
                        long[] jArr2 = new long[length + 1];
                        bk5.m29633r0(jArr, jArr2, 0, 0, i2);
                        bk5.m29633r0(jArr, jArr2, i2 + 1, i2, length);
                        jArr2[i2] = j;
                        return new sa31(this.f207126a, this.f207127b, this.f207128c, jArr2);
                    }
                }
            } else {
                long j17 = 1 << (((int) j5) - 64);
                if ((j9 & j17) == 0) {
                    return new sa31(j9 | j17, this.f207127b, this.f207128c, this.f207129d);
                }
            }
        } else {
            long j18 = 1 << ((int) j5);
            if ((j7 & j18) == 0) {
                return new sa31(this.f207126a, j7 | j18, this.f207128c, this.f207129d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ek5(new ra31(this, null)).iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(i6f.m49804T(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        sb.append(fem.m41464l(arrayList));
        sb.append(']');
        return sb.toString();
    }
}
