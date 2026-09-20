package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oj9 {

    /* JADX INFO: renamed from: a */
    public final v140 f166011a;

    /* JADX INFO: renamed from: b */
    public final erc1 f166012b;

    public oj9(v140 v140Var, erc1 erc1Var) {
        this.f166011a = v140Var;
        this.f166012b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj9)) {
            return false;
        }
        oj9 oj9Var = (oj9) obj;
        return wj50.m88271j(this.f166011a, oj9Var.f166011a) && wj50.m88271j(this.f166012b, oj9Var.f166012b);
    }

    public final int hashCode() {
        v140 v140Var = this.f166011a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f166012b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
