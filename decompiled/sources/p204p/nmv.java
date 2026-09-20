package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nmv {

    /* JADX INFO: renamed from: a */
    public final v140 f156270a;

    /* JADX INFO: renamed from: b */
    public final erc1 f156271b;

    /* JADX INFO: renamed from: c */
    public final daj f156272c;

    public nmv(daj dajVar, v140 v140Var, erc1 erc1Var) {
        this.f156270a = v140Var;
        this.f156271b = erc1Var;
        this.f156272c = dajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmv)) {
            return false;
        }
        nmv nmvVar = (nmv) obj;
        return wj50.m88271j(this.f156270a, nmvVar.f156270a) && wj50.m88271j(this.f156271b, nmvVar.f156271b) && wj50.m88271j(this.f156272c, nmvVar.f156272c);
    }

    public final int hashCode() {
        v140 v140Var = this.f156270a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f156271b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        daj dajVar = this.f156272c;
        return iHashCode2 + (dajVar != null ? dajVar.hashCode() : 0);
    }
}
