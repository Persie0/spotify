package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pe90 {

    /* JADX INFO: renamed from: a */
    public final erc1 f176672a;

    /* JADX INFO: renamed from: b */
    public final v140 f176673b;

    public pe90(v140 v140Var, erc1 erc1Var) {
        this.f176672a = erc1Var;
        this.f176673b = v140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe90)) {
            return false;
        }
        pe90 pe90Var = (pe90) obj;
        return wj50.m88271j(this.f176672a, pe90Var.f176672a) && wj50.m88271j(this.f176673b, pe90Var.f176673b);
    }

    public final int hashCode() {
        erc1 erc1Var = this.f176672a;
        int iHashCode = (erc1Var == null ? 0 : erc1Var.hashCode()) * 31;
        v140 v140Var = this.f176673b;
        return iHashCode + (v140Var != null ? v140Var.hashCode() : 0);
    }
}
