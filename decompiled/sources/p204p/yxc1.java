package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final n601 f277224a;

    /* JADX INFO: renamed from: b */
    public final boolean f277225b;

    /* JADX INFO: renamed from: c */
    public final double f277226c;

    /* JADX INFO: renamed from: d */
    public final Double f277227d;

    public yxc1(n601 n601Var, boolean z, double d, Double d2) {
        this.f277224a = n601Var;
        this.f277225b = z;
        this.f277226c = d;
        this.f277227d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxc1)) {
            return false;
        }
        yxc1 yxc1Var = (yxc1) obj;
        return wj50.m88271j(this.f277224a, yxc1Var.f277224a) && this.f277225b == yxc1Var.f277225b && Double.compare(this.f277226c, yxc1Var.f277226c) == 0 && wj50.m88271j(this.f277227d, yxc1Var.f277227d);
    }

    public final int hashCode() {
        int iM91399h = xl81.m91399h(this.f277226c, s571.m77245d(this.f277224a.hashCode() * 31, 31, this.f277225b), 31);
        Double d = this.f277227d;
        return iM91399h + (d == null ? 0 : d.hashCode());
    }
}
