package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i790 {

    /* JADX INFO: renamed from: a */
    public final String f99470a;

    /* JADX INFO: renamed from: b */
    public final int f99471b;

    /* JADX INFO: renamed from: c */
    public final nt80 f99472c;

    /* JADX INFO: renamed from: d */
    public final int f99473d;

    public i790(int i, int i2, String str, nt80 nt80Var) {
        this.f99470a = str;
        this.f99471b = i;
        this.f99472c = nt80Var;
        this.f99473d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i790)) {
            return false;
        }
        i790 i790Var = (i790) obj;
        return this.f99470a.equals(i790Var.f99470a) && this.f99471b == i790Var.f99471b && this.f99472c.equals(i790Var.f99472c) && this.f99473d == i790Var.f99473d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99473d) + ((this.f99472c.hashCode() + mt60.m62800g(this.f99471b, this.f99470a.hashCode() * 31, 31)) * 31);
    }
}
