package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ph5 {

    /* JADX INFO: renamed from: a */
    public final v140 f177471a;

    /* JADX INFO: renamed from: b */
    public final erc1 f177472b;

    public ph5(v140 v140Var, erc1 erc1Var) {
        this.f177471a = v140Var;
        this.f177472b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph5)) {
            return false;
        }
        ph5 ph5Var = (ph5) obj;
        return wj50.m88271j(this.f177471a, ph5Var.f177471a) && wj50.m88271j(this.f177472b, ph5Var.f177472b);
    }

    public final int hashCode() {
        v140 v140Var = this.f177471a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f177472b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
