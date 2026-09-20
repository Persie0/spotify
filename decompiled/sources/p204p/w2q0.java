package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w2q0 {

    /* JADX INFO: renamed from: a */
    public final double f247410a;

    /* JADX INFO: renamed from: b */
    public final long f247411b;

    /* JADX INFO: renamed from: c */
    public final boolean f247412c;

    public w2q0(double d, long j, boolean z) {
        this.f247410a = d;
        this.f247411b = j;
        this.f247412c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2q0)) {
            return false;
        }
        w2q0 w2q0Var = (w2q0) obj;
        return Double.compare(this.f247410a, w2q0Var.f247410a) == 0 && this.f247411b == w2q0Var.f247411b && this.f247412c == w2q0Var.f247412c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247412c) + dq60.m36605e(Double.hashCode(this.f247410a) * 31, this.f247411b, 31);
    }
}
