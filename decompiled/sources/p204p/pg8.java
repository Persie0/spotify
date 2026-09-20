package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pg8 {

    /* JADX INFO: renamed from: a */
    public final double f177244a;

    /* JADX INFO: renamed from: b */
    public final fg8 f177245b;

    public pg8(double d, fg8 fg8Var) {
        this.f177244a = d;
        this.f177245b = fg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg8)) {
            return false;
        }
        pg8 pg8Var = (pg8) obj;
        return Double.compare(this.f177244a, pg8Var.f177244a) == 0 && this.f177245b == pg8Var.f177245b;
    }

    public final int hashCode() {
        return this.f177245b.hashCode() + (Double.hashCode(this.f177244a) * 31);
    }
}
