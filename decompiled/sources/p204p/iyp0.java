package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iyp0 {

    /* JADX INFO: renamed from: a */
    public final double f107040a;

    /* JADX INFO: renamed from: b */
    public final int f107041b;

    public iyp0(double d, int i) {
        this.f107040a = d;
        this.f107041b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyp0)) {
            return false;
        }
        iyp0 iyp0Var = (iyp0) obj;
        return Double.compare(this.f107040a, iyp0Var.f107040a) == 0 && this.f107041b == iyp0Var.f107041b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f107041b) + (Double.hashCode(this.f107040a) * 31);
    }
}
