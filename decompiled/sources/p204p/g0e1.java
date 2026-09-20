package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class g0e1 {

    /* JADX INFO: renamed from: a */
    public final long f75347a;

    /* JADX INFO: renamed from: b */
    public final long f75348b;

    public g0e1(long j, long j2) {
        this.f75347a = j;
        this.f75348b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0e1.class.equals(obj.getClass())) {
            g0e1 g0e1Var = (g0e1) obj;
            if (g0e1Var.f75347a == this.f75347a && g0e1Var.f75348b == this.f75348b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f75348b) + (Long.hashCode(this.f75347a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f75347a + ", flexIntervalMillis=" + this.f75348b + '}';
    }
}
