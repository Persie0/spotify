package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cnx {

    /* JADX INFO: renamed from: a */
    public final v140 f40116a;

    /* JADX INFO: renamed from: b */
    public final erc1 f40117b;

    public cnx(v140 v140Var, erc1 erc1Var) {
        this.f40116a = v140Var;
        this.f40117b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnx)) {
            return false;
        }
        cnx cnxVar = (cnx) obj;
        return wj50.m88271j(this.f40116a, cnxVar.f40116a) && wj50.m88271j(this.f40117b, cnxVar.f40117b);
    }

    public final int hashCode() {
        v140 v140Var = this.f40116a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f40117b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
