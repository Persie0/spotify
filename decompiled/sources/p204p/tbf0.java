package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tbf0 {

    /* JADX INFO: renamed from: a */
    public final double f218844a;

    /* JADX INFO: renamed from: b */
    public final long f218845b;

    public tbf0(double d, long j) {
        this.f218844a = d;
        this.f218845b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbf0)) {
            return false;
        }
        tbf0 tbf0Var = (tbf0) obj;
        return Double.compare(this.f218844a, tbf0Var.f218844a) == 0 && this.f218845b == tbf0Var.f218845b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f218845b) + (Double.hashCode(this.f218844a) * 31);
    }
}
