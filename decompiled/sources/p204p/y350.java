package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class y350 {

    /* JADX INFO: renamed from: a */
    public final long f268755a;

    /* JADX INFO: renamed from: a */
    public static long m92728a(long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & 4294967295L);
        }
        return (((long) i) << 32) | (((long) i2) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92729b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final long m92730c(long j, long j2) {
        return (((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public static final long m92731d(long j, long j2) {
        return (((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static String m92732e(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return edb.m38567p(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y350) {
            return this.f268755a == ((y350) obj).f268755a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f268755a);
    }

    public final String toString() {
        return m92732e(this.f268755a);
    }
}
