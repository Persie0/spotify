package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xe70 {

    /* JADX INFO: renamed from: a */
    public final y6s0 f260653a;

    /* JADX INFO: renamed from: b */
    public final r8x0 f260654b;

    public xe70(y6s0 y6s0Var, r8x0 r8x0Var) {
        this.f260653a = y6s0Var;
        this.f260654b = r8x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe70)) {
            return false;
        }
        xe70 xe70Var = (xe70) obj;
        return wj50.m88271j(this.f260653a, xe70Var.f260653a) && wj50.m88271j(this.f260654b, xe70Var.f260654b);
    }

    public final int hashCode() {
        int iHashCode = this.f260653a.hashCode() * 31;
        r8x0 r8x0Var = this.f260654b;
        return iHashCode + (r8x0Var == null ? 0 : r8x0Var.f196848a.hashCode());
    }
}
