package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aln0 {

    /* JADX INFO: renamed from: a */
    public final v140 f16903a;

    /* JADX INFO: renamed from: b */
    public final erc1 f16904b;

    public aln0(v140 v140Var, erc1 erc1Var) {
        this.f16903a = v140Var;
        this.f16904b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aln0)) {
            return false;
        }
        aln0 aln0Var = (aln0) obj;
        return wj50.m88271j(this.f16903a, aln0Var.f16903a) && wj50.m88271j(this.f16904b, aln0Var.f16904b);
    }

    public final int hashCode() {
        v140 v140Var = this.f16903a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f16904b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
