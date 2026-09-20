package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yj70 {

    /* JADX INFO: renamed from: a */
    public final double f273306a;

    /* JADX INFO: renamed from: b */
    public final double f273307b;

    public yj70(double d, double d2) {
        this.f273306a = d;
        this.f273307b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj70)) {
            return false;
        }
        yj70 yj70Var = (yj70) obj;
        return Double.compare(this.f273306a, yj70Var.f273306a) == 0 && Double.compare(this.f273307b, yj70Var.f273307b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f273307b) + (Double.hashCode(this.f273306a) * 31);
    }
}
