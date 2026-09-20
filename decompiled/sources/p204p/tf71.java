package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tf71 {

    /* JADX INFO: renamed from: a */
    public final long f219878a;

    /* JADX INFO: renamed from: a */
    public static final boolean m80605a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m80606b(long j) {
        if (m80605a(j, 0L)) {
            return "Unspecified";
        }
        if (m80605a(j, 4294967296L)) {
            return "Sp";
        }
        return m80605a(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tf71) {
            return this.f219878a == ((tf71) obj).f219878a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f219878a);
    }

    public final String toString() {
        return m80606b(this.f219878a);
    }
}
