package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wx40 {

    /* JADX INFO: renamed from: a */
    public final v140 f255932a;

    /* JADX INFO: renamed from: b */
    public final erc1 f255933b;

    public wx40(v140 v140Var, erc1 erc1Var) {
        this.f255932a = v140Var;
        this.f255933b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx40)) {
            return false;
        }
        wx40 wx40Var = (wx40) obj;
        return wj50.m88271j(this.f255932a, wx40Var.f255932a) && wj50.m88271j(this.f255933b, wx40Var.f255933b);
    }

    public final int hashCode() {
        v140 v140Var = this.f255932a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f255933b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
