package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a1n0 {

    /* JADX INFO: renamed from: a */
    public final v140 f11444a;

    /* JADX INFO: renamed from: b */
    public final erc1 f11445b;

    /* JADX INFO: renamed from: c */
    public final daj f11446c;

    public a1n0(daj dajVar, v140 v140Var, erc1 erc1Var) {
        this.f11444a = v140Var;
        this.f11445b = erc1Var;
        this.f11446c = dajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1n0)) {
            return false;
        }
        a1n0 a1n0Var = (a1n0) obj;
        return wj50.m88271j(this.f11444a, a1n0Var.f11444a) && wj50.m88271j(this.f11445b, a1n0Var.f11445b) && wj50.m88271j(this.f11446c, a1n0Var.f11446c);
    }

    public final int hashCode() {
        int iHashCode = this.f11444a.hashCode() * 31;
        erc1 erc1Var = this.f11445b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        daj dajVar = this.f11446c;
        return iHashCode2 + (dajVar != null ? dajVar.hashCode() : 0);
    }
}
