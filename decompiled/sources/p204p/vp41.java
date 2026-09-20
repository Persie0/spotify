package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vp41 {

    /* JADX INFO: renamed from: a */
    public final uku f243595a;

    /* JADX INFO: renamed from: b */
    public final qf40 f243596b;

    public vp41(uku ukuVar, qf40 qf40Var) {
        this.f243595a = ukuVar;
        this.f243596b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp41)) {
            return false;
        }
        vp41 vp41Var = (vp41) obj;
        return wj50.m88271j(this.f243595a, vp41Var.f243595a) && wj50.m88271j(this.f243596b, vp41Var.f243596b);
    }

    public final int hashCode() {
        return this.f243596b.hashCode() + (this.f243595a.hashCode() * 31);
    }
}
