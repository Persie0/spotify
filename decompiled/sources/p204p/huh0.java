package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class huh0 implements yvh0 {

    /* JADX INFO: renamed from: a */
    public final String f95411a;

    /* JADX INFO: renamed from: b */
    public final yvh0 f95412b;

    public huh0(String str, yvh0 yvh0Var) {
        this.f95411a = str;
        this.f95412b = yvh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huh0)) {
            return false;
        }
        huh0 huh0Var = (huh0) obj;
        return wj50.m88271j(this.f95411a, huh0Var.f95411a) && wj50.m88271j(this.f95412b, huh0Var.f95412b);
    }

    public final int hashCode() {
        return this.f95412b.hashCode() + (this.f95411a.hashCode() * 31);
    }
}
