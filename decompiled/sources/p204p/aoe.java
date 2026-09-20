package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aoe {

    /* JADX INFO: renamed from: a */
    public final v140 f17668a;

    /* JADX INFO: renamed from: b */
    public final erc1 f17669b;

    public aoe(v140 v140Var, erc1 erc1Var) {
        this.f17668a = v140Var;
        this.f17669b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoe)) {
            return false;
        }
        aoe aoeVar = (aoe) obj;
        return wj50.m88271j(this.f17668a, aoeVar.f17668a) && wj50.m88271j(this.f17669b, aoeVar.f17669b);
    }

    public final int hashCode() {
        v140 v140Var = this.f17668a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f17669b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
