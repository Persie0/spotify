package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g450 {

    /* JADX INFO: renamed from: a */
    public final long f76347a;

    /* JADX INFO: renamed from: a */
    public static boolean m43519a(long j, Object obj) {
        return (obj instanceof g450) && j == ((g450) obj).f76347a;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m43520b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static String m43521c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return m43519a(this.f76347a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f76347a);
    }

    public final String toString() {
        return m43521c(this.f76347a);
    }
}
