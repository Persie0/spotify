package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class brr0 {

    /* JADX INFO: renamed from: a */
    public final v140 f30163a;

    /* JADX INFO: renamed from: b */
    public final erc1 f30164b;

    public brr0(v140 v140Var, erc1 erc1Var) {
        this.f30163a = v140Var;
        this.f30164b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brr0)) {
            return false;
        }
        brr0 brr0Var = (brr0) obj;
        return wj50.m88271j(this.f30163a, brr0Var.f30163a) && wj50.m88271j(this.f30164b, brr0Var.f30164b);
    }

    public final int hashCode() {
        v140 v140Var = this.f30163a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f30164b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
