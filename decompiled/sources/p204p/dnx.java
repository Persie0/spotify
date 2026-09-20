package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dnx {

    /* JADX INFO: renamed from: a */
    public final erc1 f50885a;

    /* JADX INFO: renamed from: b */
    public final lar0 f50886b;

    public dnx(erc1 erc1Var, lar0 lar0Var) {
        this.f50885a = erc1Var;
        this.f50886b = lar0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnx)) {
            return false;
        }
        dnx dnxVar = (dnx) obj;
        return wj50.m88271j(this.f50885a, dnxVar.f50885a) && wj50.m88271j(this.f50886b, dnxVar.f50886b);
    }

    public final int hashCode() {
        erc1 erc1Var = this.f50885a;
        int iHashCode = (erc1Var == null ? 0 : erc1Var.hashCode()) * 31;
        lar0 lar0Var = this.f50886b;
        return iHashCode + (lar0Var != null ? lar0Var.hashCode() : 0);
    }
}
