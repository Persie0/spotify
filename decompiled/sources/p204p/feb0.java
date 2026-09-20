package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class feb0 implements heb0 {

    /* JADX INFO: renamed from: a */
    public final ng70 f68737a;

    /* JADX INFO: renamed from: b */
    public final d850 f68738b;

    public feb0(ng70 ng70Var, d850 d850Var) {
        this.f68737a = ng70Var;
        this.f68738b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof feb0)) {
            return false;
        }
        feb0 feb0Var = (feb0) obj;
        return wj50.m88271j(this.f68737a, feb0Var.f68737a) && wj50.m88271j(this.f68738b, feb0Var.f68738b);
    }

    public final int hashCode() {
        int iHashCode = this.f68737a.hashCode() * 31;
        d850 d850Var = this.f68738b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
