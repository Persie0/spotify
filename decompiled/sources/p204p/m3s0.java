package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m3s0 {

    /* JADX INFO: renamed from: a */
    public final double f139730a;

    /* JADX INFO: renamed from: b */
    public final long f139731b;

    public m3s0(double d, long j) {
        this.f139730a = d;
        this.f139731b = j;
        if (0.0d > d || d > 100.0d) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3s0)) {
            return false;
        }
        m3s0 m3s0Var = (m3s0) obj;
        return Double.compare(this.f139730a, m3s0Var.f139730a) == 0 && this.f139731b == m3s0Var.f139731b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f139731b) + (Double.hashCode(this.f139730a) * 31);
    }
}
