package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rr81 {

    /* JADX INFO: renamed from: a */
    public final v140 f201986a;

    /* JADX INFO: renamed from: b */
    public final erc1 f201987b;

    public rr81(v140 v140Var, erc1 erc1Var) {
        this.f201986a = v140Var;
        this.f201987b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr81)) {
            return false;
        }
        rr81 rr81Var = (rr81) obj;
        return wj50.m88271j(this.f201986a, rr81Var.f201986a) && wj50.m88271j(this.f201987b, rr81Var.f201987b);
    }

    public final int hashCode() {
        v140 v140Var = this.f201986a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f201987b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
