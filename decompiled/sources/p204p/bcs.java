package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bcs {

    /* JADX INFO: renamed from: a */
    public final long f25936a;

    /* JADX INFO: renamed from: a */
    public static final float m28781a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public static final float m28782b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static String m28783c(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) ybs.m93302c(m28782b(j))) + " x " + ((Object) ybs.m93302c(m28781a(j)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcs) {
            return this.f25936a == ((bcs) obj).f25936a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25936a);
    }

    public final String toString() {
        return m28783c(this.f25936a);
    }
}
