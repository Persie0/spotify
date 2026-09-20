package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dop0 {

    /* JADX INFO: renamed from: a */
    public final v140 f51099a;

    /* JADX INFO: renamed from: b */
    public final erc1 f51100b;

    /* JADX INFO: renamed from: c */
    public final daj f51101c;

    public dop0(daj dajVar, v140 v140Var, erc1 erc1Var) {
        this.f51099a = v140Var;
        this.f51100b = erc1Var;
        this.f51101c = dajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dop0)) {
            return false;
        }
        dop0 dop0Var = (dop0) obj;
        return wj50.m88271j(this.f51099a, dop0Var.f51099a) && wj50.m88271j(this.f51100b, dop0Var.f51100b) && wj50.m88271j(this.f51101c, dop0Var.f51101c);
    }

    public final int hashCode() {
        v140 v140Var = this.f51099a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f51100b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        daj dajVar = this.f51101c;
        return iHashCode2 + (dajVar != null ? dajVar.hashCode() : 0);
    }
}
