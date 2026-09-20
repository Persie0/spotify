package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class acs {

    /* JADX INFO: renamed from: a */
    public final long f14417a;

    /* JADX INFO: renamed from: a */
    public static final float m25482a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: b */
    public static final float m25483b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public static String m25484c(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) ybs.m93302c(m25482a(j))) + ", " + ((Object) ybs.m93302c(m25483b(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof acs) {
            return this.f14417a == ((acs) obj).f14417a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14417a);
    }

    public final String toString() {
        return m25484c(this.f14417a);
    }
}
