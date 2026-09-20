package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lvz0 {

    /* JADX INFO: renamed from: a */
    public final v140 f137424a;

    /* JADX INFO: renamed from: b */
    public final erc1 f137425b;

    public lvz0(v140 v140Var, erc1 erc1Var) {
        this.f137424a = v140Var;
        this.f137425b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvz0)) {
            return false;
        }
        lvz0 lvz0Var = (lvz0) obj;
        return wj50.m88271j(this.f137424a, lvz0Var.f137424a) && wj50.m88271j(this.f137425b, lvz0Var.f137425b);
    }

    public final int hashCode() {
        v140 v140Var = this.f137424a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f137425b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
