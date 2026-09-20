package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final dy1 f266943a;

    /* JADX INFO: renamed from: b */
    public final boolean f266944b;

    /* JADX INFO: renamed from: c */
    public final double f266945c;

    /* JADX INFO: renamed from: d */
    public final Double f266946d;

    public xxc1(dy1 dy1Var, boolean z, double d, Double d2) {
        this.f266943a = dy1Var;
        this.f266944b = z;
        this.f266945c = d;
        this.f266946d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxc1)) {
            return false;
        }
        xxc1 xxc1Var = (xxc1) obj;
        return wj50.m88271j(this.f266943a, xxc1Var.f266943a) && this.f266944b == xxc1Var.f266944b && Double.compare(this.f266945c, xxc1Var.f266945c) == 0 && wj50.m88271j(this.f266946d, xxc1Var.f266946d);
    }

    public final int hashCode() {
        int iM91399h = xl81.m91399h(this.f266945c, s571.m77245d(this.f266943a.hashCode() * 31, 31, this.f266944b), 31);
        Double d = this.f266946d;
        return iM91399h + (d == null ? 0 : d.hashCode());
    }
}
