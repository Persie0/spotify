package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b1z0 {

    /* JADX INFO: renamed from: a */
    public final int f22450a;

    /* JADX INFO: renamed from: b */
    public final ra01 f22451b;

    /* JADX INFO: renamed from: c */
    public final zt20 f22452c;

    /* JADX INFO: renamed from: d */
    public final boolean f22453d;

    public b1z0(int i, ra01 ra01Var, zt20 zt20Var, boolean z) {
        this.f22450a = i;
        this.f22451b = ra01Var;
        this.f22452c = zt20Var;
        this.f22453d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1z0)) {
            return false;
        }
        b1z0 b1z0Var = (b1z0) obj;
        return this.f22450a == b1z0Var.f22450a && wj50.m88271j(this.f22451b, b1z0Var.f22451b) && wj50.m88271j(this.f22452c, b1z0Var.f22452c) && this.f22453d == b1z0Var.f22453d;
    }

    public final int hashCode() {
        int iHashCode = (this.f22451b.hashCode() + (Integer.hashCode(this.f22450a) * 31)) * 31;
        zt20 zt20Var = this.f22452c;
        return Boolean.hashCode(this.f22453d) + ((iHashCode + (zt20Var == null ? 0 : zt20Var.hashCode())) * 31);
    }
}
