package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ywc1 implements axc1 {

    /* JADX INFO: renamed from: a */
    public final double f276946a;

    /* JADX INFO: renamed from: b */
    public final int f276947b;

    public ywc1(double d, int i) {
        this.f276946a = d;
        this.f276947b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywc1)) {
            return false;
        }
        ywc1 ywc1Var = (ywc1) obj;
        return Double.compare(this.f276946a, ywc1Var.f276946a) == 0 && this.f276947b == ywc1Var.f276947b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f276947b) + (Double.hashCode(this.f276946a) * 31);
    }
}
