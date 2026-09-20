package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b0u0 {

    /* JADX INFO: renamed from: a */
    public final gl50 f22102a;

    /* JADX INFO: renamed from: b */
    public final ogt0 f22103b;

    /* JADX INFO: renamed from: c */
    public final ykx0 f22104c;

    /* JADX INFO: renamed from: d */
    public final n8x0 f22105d;

    public b0u0(gl50 gl50Var, ogt0 ogt0Var, ykx0 ykx0Var, n8x0 n8x0Var) {
        this.f22102a = gl50Var;
        this.f22103b = ogt0Var;
        this.f22104c = ykx0Var;
        this.f22105d = n8x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0u0)) {
            return false;
        }
        b0u0 b0u0Var = (b0u0) obj;
        return wj50.m88271j(this.f22102a, b0u0Var.f22102a) && wj50.m88271j(this.f22103b, b0u0Var.f22103b) && wj50.m88271j(this.f22104c, b0u0Var.f22104c) && wj50.m88271j(this.f22105d, b0u0Var.f22105d);
    }

    public final int hashCode() {
        return this.f22105d.hashCode() + ((this.f22104c.hashCode() + ((this.f22103b.hashCode() + (this.f22102a.hashCode() * 31)) * 31)) * 31);
    }
}
