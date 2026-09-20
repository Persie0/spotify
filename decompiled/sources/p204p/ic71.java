package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ic71 {

    /* JADX INFO: renamed from: b */
    public static final long f100750b = dvg1.m37111m(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f100751c = 0;

    /* JADX INFO: renamed from: a */
    public final long f100752a;

    public /* synthetic */ ic71(long j) {
        this.f100752a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m50233a(long j, long j2) {
        return (m50239g(j) <= m50239g(j2)) & (m50238f(j2) <= m50238f(j));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m50234b(long j, Object obj) {
        return (obj instanceof ic71) && j == ((ic71) obj).f100752a;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m50235c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m50236d(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: e */
    public static final int m50237e(long j) {
        return m50238f(j) - m50239g(j);
    }

    /* JADX INFO: renamed from: f */
    public static final int m50238f(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final int m50239g(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m50240h(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: i */
    public static String m50241i(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return edb.m38567p(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return m50234b(this.f100752a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f100752a);
    }

    public final String toString() {
        return m50241i(this.f100752a);
    }
}
