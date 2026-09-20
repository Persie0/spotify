package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v26 {

    /* JADX INFO: renamed from: a */
    public final v140 f236554a;

    /* JADX INFO: renamed from: b */
    public final erc1 f236555b;

    public v26(v140 v140Var, erc1 erc1Var) {
        this.f236554a = v140Var;
        this.f236555b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v26)) {
            return false;
        }
        v26 v26Var = (v26) obj;
        return wj50.m88271j(this.f236554a, v26Var.f236554a) && wj50.m88271j(this.f236555b, v26Var.f236555b);
    }

    public final int hashCode() {
        v140 v140Var = this.f236554a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f236555b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
