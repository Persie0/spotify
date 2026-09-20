package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ybs implements Comparable {

    /* JADX INFO: renamed from: a */
    public final float f271238a;

    /* JADX INFO: renamed from: a */
    public static int m93300a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m93301b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m93302c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m93300a(this.f271238a, ((ybs) obj).f271238a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ybs) {
            return Float.compare(this.f271238a, ((ybs) obj).f271238a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f271238a);
    }

    public final String toString() {
        return m93302c(this.f271238a);
    }
}
