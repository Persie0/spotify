package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hl41 {

    /* JADX INFO: renamed from: a */
    public final erc1 f92613a;

    /* JADX INFO: renamed from: b */
    public final pob f92614b;

    /* JADX INFO: renamed from: c */
    public final daj f92615c;

    /* JADX INFO: renamed from: d */
    public final cvb1 f92616d;

    public hl41(erc1 erc1Var, pob pobVar, daj dajVar, cvb1 cvb1Var) {
        this.f92613a = erc1Var;
        this.f92614b = pobVar;
        this.f92615c = dajVar;
        this.f92616d = cvb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl41)) {
            return false;
        }
        hl41 hl41Var = (hl41) obj;
        return wj50.m88271j(this.f92613a, hl41Var.f92613a) && wj50.m88271j(this.f92614b, hl41Var.f92614b) && wj50.m88271j(this.f92615c, hl41Var.f92615c) && this.f92616d == hl41Var.f92616d;
    }

    public final int hashCode() {
        erc1 erc1Var = this.f92613a;
        int iHashCode = (erc1Var == null ? 0 : erc1Var.hashCode()) * 31;
        pob pobVar = this.f92614b;
        int iHashCode2 = (iHashCode + (pobVar == null ? 0 : pobVar.hashCode())) * 31;
        daj dajVar = this.f92615c;
        return this.f92616d.hashCode() + ((iHashCode2 + (dajVar != null ? dajVar.hashCode() : 0)) * 31);
    }
}
