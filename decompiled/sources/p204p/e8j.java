package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class e8j {
    /* JADX INFO: renamed from: a */
    public static final long m38110a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            ot40.m67767a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m38117h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m38111b(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m38110a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static final int m38112c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: d */
    public static final long m38113d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM28432k = b8j.m28432k(j);
        int iM28430i = b8j.m28430i(j);
        if (i < iM28432k) {
            i = iM28432k;
        }
        if (i <= iM28430i) {
            iM28430i = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM28431j = b8j.m28431j(j);
        int iM28429h = b8j.m28429h(j);
        if (i2 < iM28431j) {
            i2 = iM28431j;
        }
        if (i2 <= iM28429h) {
            iM28429h = i2;
        }
        return (((long) iM28430i) << 32) | (((long) iM28429h) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static final long m38114e(long j, long j2) {
        int iM28432k = b8j.m28432k(j);
        int iM28430i = b8j.m28430i(j);
        int iM28431j = b8j.m28431j(j);
        int iM28429h = b8j.m28429h(j);
        int iM28432k2 = b8j.m28432k(j2);
        if (iM28432k2 < iM28432k) {
            iM28432k2 = iM28432k;
        }
        if (iM28432k2 > iM28430i) {
            iM28432k2 = iM28430i;
        }
        int iM28430i2 = b8j.m28430i(j2);
        if (iM28430i2 >= iM28432k) {
            iM28432k = iM28430i2;
        }
        if (iM28432k <= iM28430i) {
            iM28430i = iM28432k;
        }
        int iM28431j2 = b8j.m28431j(j2);
        if (iM28431j2 < iM28431j) {
            iM28431j2 = iM28431j;
        }
        if (iM28431j2 > iM28429h) {
            iM28431j2 = iM28429h;
        }
        int iM28429h2 = b8j.m28429h(j2);
        if (iM28429h2 >= iM28431j) {
            iM28431j = iM28429h2;
        }
        if (iM28431j <= iM28429h) {
            iM28429h = iM28431j;
        }
        return m38110a(iM28432k2, iM28430i, iM28431j2, iM28429h);
    }

    /* JADX INFO: renamed from: f */
    public static final int m38115f(int i, long j) {
        int iM28431j = b8j.m28431j(j);
        int iM28429h = b8j.m28429h(j);
        if (i < iM28431j) {
            i = iM28431j;
        }
        return i > iM28429h ? iM28429h : i;
    }

    /* JADX INFO: renamed from: g */
    public static final int m38116g(int i, long j) {
        int iM28432k = b8j.m28432k(j);
        int iM28430i = b8j.m28430i(j);
        if (i < iM28432k) {
            i = iM28432k;
        }
        return i > iM28430i ? iM28430i : i;
    }

    /* JADX INFO: renamed from: h */
    public static final long m38117h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM38112c = m38112c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM38112c2 = m38112c(i6);
        if (iM38112c + iM38112c2 > 31) {
            m38120k(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM38112c2 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM38112c2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM38112c2 + 33));
    }

    /* JADX INFO: renamed from: i */
    public static final long m38118i(int i, long j, int i2) {
        int iM28432k = b8j.m28432k(j) + i;
        if (iM28432k < 0) {
            iM28432k = 0;
        }
        int iM28430i = b8j.m28430i(j);
        if (iM28430i != Integer.MAX_VALUE && (iM28430i = iM28430i + i) < 0) {
            iM28430i = 0;
        }
        int iM28431j = b8j.m28431j(j) + i2;
        if (iM28431j < 0) {
            iM28431j = 0;
        }
        int iM28429h = b8j.m28429h(j);
        return m38110a(iM28432k, iM28430i, iM28431j, (iM28429h == Integer.MAX_VALUE || (iM28429h = iM28429h + i2) >= 0) ? iM28429h : 0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ long m38119j(long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m38118i(i, j, i2);
    }

    /* JADX INFO: renamed from: k */
    public static final void m38120k(int i, int i2) {
        throw new IllegalArgumentException(edb.m38560i(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    /* JADX INFO: renamed from: l */
    public static final Void m38121l(int i) {
        throw new IllegalArgumentException(edb.m38563l("Can't represent a size of ", i, " in Constraints"));
    }
}
