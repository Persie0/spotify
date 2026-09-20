package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oj20 {

    /* JADX INFO: renamed from: a */
    public final v140 f165938a;

    /* JADX INFO: renamed from: b */
    public final erc1 f165939b;

    public oj20(v140 v140Var, erc1 erc1Var) {
        this.f165938a = v140Var;
        this.f165939b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj20)) {
            return false;
        }
        oj20 oj20Var = (oj20) obj;
        return wj50.m88271j(this.f165938a, oj20Var.f165938a) && wj50.m88271j(this.f165939b, oj20Var.f165939b);
    }

    public final int hashCode() {
        v140 v140Var = this.f165938a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f165939b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
