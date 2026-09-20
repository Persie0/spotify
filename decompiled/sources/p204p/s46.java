package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s46 {

    /* JADX INFO: renamed from: a */
    public final v140 f205502a;

    /* JADX INFO: renamed from: b */
    public final erc1 f205503b;

    public s46(v140 v140Var, erc1 erc1Var) {
        this.f205502a = v140Var;
        this.f205503b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s46)) {
            return false;
        }
        s46 s46Var = (s46) obj;
        return wj50.m88271j(this.f205502a, s46Var.f205502a) && wj50.m88271j(this.f205503b, s46Var.f205503b);
    }

    public final int hashCode() {
        v140 v140Var = this.f205502a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f205503b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
