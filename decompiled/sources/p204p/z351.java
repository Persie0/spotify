package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z351 {

    /* JADX INFO: renamed from: a */
    public final k251 f278781a;

    /* JADX INFO: renamed from: b */
    public final v140 f278782b;

    /* JADX INFO: renamed from: c */
    public final erc1 f278783c;

    public z351(k251 k251Var, v140 v140Var, erc1 erc1Var) {
        this.f278781a = k251Var;
        this.f278782b = v140Var;
        this.f278783c = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z351)) {
            return false;
        }
        z351 z351Var = (z351) obj;
        return wj50.m88271j(this.f278781a, z351Var.f278781a) && wj50.m88271j(this.f278782b, z351Var.f278782b) && wj50.m88271j(this.f278783c, z351Var.f278783c);
    }

    public final int hashCode() {
        int iHashCode = this.f278781a.hashCode() * 31;
        v140 v140Var = this.f278782b;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        erc1 erc1Var = this.f278783c;
        return iHashCode2 + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
