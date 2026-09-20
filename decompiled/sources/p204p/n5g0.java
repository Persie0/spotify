package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n5g0 {

    /* JADX INFO: renamed from: a */
    public final m5g0 f150544a;

    /* JADX INFO: renamed from: b */
    public final v140 f150545b;

    /* JADX INFO: renamed from: c */
    public final erc1 f150546c;

    public n5g0(m5g0 m5g0Var, v140 v140Var, erc1 erc1Var) {
        this.f150544a = m5g0Var;
        this.f150545b = v140Var;
        this.f150546c = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5g0)) {
            return false;
        }
        n5g0 n5g0Var = (n5g0) obj;
        return wj50.m88271j(this.f150544a, n5g0Var.f150544a) && wj50.m88271j(this.f150545b, n5g0Var.f150545b) && wj50.m88271j(this.f150546c, n5g0Var.f150546c);
    }

    public final int hashCode() {
        int iHashCode = this.f150544a.hashCode() * 31;
        v140 v140Var = this.f150545b;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        erc1 erc1Var = this.f150546c;
        return iHashCode2 + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
