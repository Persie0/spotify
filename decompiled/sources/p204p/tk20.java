package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tk20 {

    /* JADX INFO: renamed from: a */
    public final v140 f221071a;

    /* JADX INFO: renamed from: b */
    public final erc1 f221072b;

    /* JADX INFO: renamed from: c */
    public final uy80 f221073c;

    public tk20(v140 v140Var, erc1 erc1Var, uy80 uy80Var) {
        this.f221071a = v140Var;
        this.f221072b = erc1Var;
        this.f221073c = uy80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk20)) {
            return false;
        }
        tk20 tk20Var = (tk20) obj;
        return wj50.m88271j(this.f221071a, tk20Var.f221071a) && wj50.m88271j(this.f221072b, tk20Var.f221072b) && wj50.m88271j(this.f221073c, tk20Var.f221073c);
    }

    public final int hashCode() {
        v140 v140Var = this.f221071a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f221072b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        uy80 uy80Var = this.f221073c;
        return iHashCode2 + (uy80Var != null ? uy80Var.hashCode() : 0);
    }
}
