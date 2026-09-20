package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final n601 f159439a;

    /* JADX INFO: renamed from: b */
    public final boolean f159440b;

    /* JADX INFO: renamed from: c */
    public final double f159441c;

    /* JADX INFO: renamed from: d */
    public final Double f159442d;

    public nxc1(n601 n601Var, boolean z, double d, Double d2) {
        this.f159439a = n601Var;
        this.f159440b = z;
        this.f159441c = d;
        this.f159442d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxc1)) {
            return false;
        }
        nxc1 nxc1Var = (nxc1) obj;
        return this.f159439a.equals(nxc1Var.f159439a) && this.f159440b == nxc1Var.f159440b && Double.compare(this.f159441c, nxc1Var.f159441c) == 0 && wj50.m88271j(this.f159442d, nxc1Var.f159442d);
    }

    public final int hashCode() {
        int iM91399h = xl81.m91399h(this.f159441c, s571.m77245d(this.f159439a.hashCode() * 31, 31, this.f159440b), 31);
        Double d = this.f159442d;
        return iM91399h + (d == null ? 0 : d.hashCode());
    }
}
