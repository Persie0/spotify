package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zml {

    /* JADX INFO: renamed from: a */
    public final xnl f284313a;

    /* JADX INFO: renamed from: b */
    public final erc1 f284314b;

    /* JADX INFO: renamed from: c */
    public final v140 f284315c;

    public zml(xnl xnlVar, erc1 erc1Var, v140 v140Var) {
        this.f284313a = xnlVar;
        this.f284314b = erc1Var;
        this.f284315c = v140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zml)) {
            return false;
        }
        zml zmlVar = (zml) obj;
        return wj50.m88271j(this.f284313a, zmlVar.f284313a) && wj50.m88271j(this.f284314b, zmlVar.f284314b) && wj50.m88271j(this.f284315c, zmlVar.f284315c);
    }

    public final int hashCode() {
        xnl xnlVar = this.f284313a;
        int iHashCode = (xnlVar == null ? 0 : xnlVar.hashCode()) * 31;
        erc1 erc1Var = this.f284314b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        v140 v140Var = this.f284315c;
        return iHashCode2 + (v140Var != null ? v140Var.hashCode() : 0);
    }
}
