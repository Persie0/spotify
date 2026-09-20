package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class as91 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f19359a;

    public /* synthetic */ as91(long j) {
        this.f19359a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ as91 m27073a(long j) {
        return new as91(j);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m27074b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static int m27075c(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: d */
    public static String m27076d(long j) {
        if (j >= 0) {
            zn91.m96584x(10);
            return Long.toString(j, 10);
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        zn91.m96584x(10);
        String string = Long.toString(j3, 10);
        zn91.m96584x(10);
        return string.concat(Long.toString(j4, 10));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return wj50.m88283v(this.f19359a ^ Long.MIN_VALUE, ((as91) obj).f19359a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof as91) {
            return this.f19359a == ((as91) obj).f19359a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19359a);
    }

    public final String toString() {
        return m27076d(this.f19359a);
    }
}
