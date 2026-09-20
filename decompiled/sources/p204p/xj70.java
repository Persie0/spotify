package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xj70 {

    /* JADX INFO: renamed from: a */
    public final double f262058a;

    /* JADX INFO: renamed from: b */
    public final double f262059b;

    public xj70(double d, double d2) {
        this.f262058a = d;
        this.f262059b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj70)) {
            return false;
        }
        xj70 xj70Var = (xj70) obj;
        return Double.compare(this.f262058a, xj70Var.f262058a) == 0 && Double.compare(this.f262059b, xj70Var.f262059b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f262059b) + (Double.hashCode(this.f262058a) * 31);
    }
}
