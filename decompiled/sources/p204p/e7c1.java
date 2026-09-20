package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e7c1 {

    /* JADX INFO: renamed from: a */
    public final v140 f56908a;

    /* JADX INFO: renamed from: b */
    public final erc1 f56909b;

    public e7c1(v140 v140Var, erc1 erc1Var) {
        this.f56908a = v140Var;
        this.f56909b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7c1)) {
            return false;
        }
        e7c1 e7c1Var = (e7c1) obj;
        return wj50.m88271j(this.f56908a, e7c1Var.f56908a) && wj50.m88271j(this.f56909b, e7c1Var.f56909b);
    }

    public final int hashCode() {
        int iHashCode = this.f56908a.hashCode() * 31;
        erc1 erc1Var = this.f56909b;
        return iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode());
    }
}
