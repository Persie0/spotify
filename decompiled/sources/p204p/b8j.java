package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes.dex */
public final class b8j {

    /* JADX INFO: renamed from: a */
    public final long f24596a;

    public /* synthetic */ b8j(long j) {
        this.f24596a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final long m28422a(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            ot40.m67767a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return e8j.m38117h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m28423b(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = m28432k(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m28430i(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m28431j(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m28429h(j);
        }
        return m28422a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m28424c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m28425d(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m28426e(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << klh.m56829a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m28427f(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i5 - 1);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m28428g(long j) {
        int i = (int) (3 & j);
        int iM56829a = (1 << klh.m56829a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j >> 2)) & iM56829a;
        int i3 = ((int) (j >> 33)) & iM56829a;
        return i2 == (i3 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i3 - 1);
    }

    /* JADX INFO: renamed from: h */
    public static final int m28429h(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        return i3 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i3 - 1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m28430i(long j) {
        int i = (int) (3 & j);
        int iM56829a = ((int) (j >> 33)) & ((1 << klh.m56829a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        return iM56829a == 0 ? Alert.DURATION_SHOW_INDEFINITELY : iM56829a - 1;
    }

    /* JADX INFO: renamed from: j */
    public static final int m28431j(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: k */
    public static final int m28432k(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << klh.m56829a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m28433l(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    /* JADX INFO: renamed from: m */
    public static String m28434m(long j) {
        int iM28430i = m28430i(j);
        String strValueOf = iM28430i == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM28430i);
        int iM28429h = m28429h(j);
        String strValueOf2 = iM28429h != Integer.MAX_VALUE ? String.valueOf(iM28429h) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m28432k(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m28431j(j));
        sb.append(", maxHeight = ");
        return dq60.m36617q(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b8j) {
            return this.f24596a == ((b8j) obj).f24596a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24596a);
    }

    public final String toString() {
        return m28434m(this.f24596a);
    }
}
