package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i591 {

    /* JADX INFO: renamed from: b */
    public static final long f98849b = b9m.m28515o(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f98850c = 0;

    /* JADX INFO: renamed from: a */
    public final long f98851a;

    public /* synthetic */ i591(long j) {
        this.f98851a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m49768a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final float m49769b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m49770c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static String m49771d(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i591) {
            return this.f98851a == ((i591) obj).f98851a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f98851a);
    }

    public final String toString() {
        return m49771d(this.f98851a);
    }
}
