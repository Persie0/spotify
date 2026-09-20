package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nzd0 {

    /* JADX INFO: renamed from: a */
    public final f5r0 f160064a;

    /* JADX INFO: renamed from: b */
    public final x430 f160065b;

    /* JADX INFO: renamed from: c */
    public final v140 f160066c;

    /* JADX INFO: renamed from: d */
    public final y7t0 f160067d;

    /* JADX INFO: renamed from: e */
    public final erc1 f160068e;

    /* JADX INFO: renamed from: f */
    public final yfj f160069f;

    public nzd0(f5r0 f5r0Var, x430 x430Var, v140 v140Var, y7t0 y7t0Var, erc1 erc1Var, yfj yfjVar) {
        this.f160064a = f5r0Var;
        this.f160065b = x430Var;
        this.f160066c = v140Var;
        this.f160067d = y7t0Var;
        this.f160068e = erc1Var;
        this.f160069f = yfjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzd0)) {
            return false;
        }
        nzd0 nzd0Var = (nzd0) obj;
        return wj50.m88271j(this.f160064a, nzd0Var.f160064a) && wj50.m88271j(this.f160065b, nzd0Var.f160065b) && wj50.m88271j(this.f160066c, nzd0Var.f160066c) && wj50.m88271j(this.f160067d, nzd0Var.f160067d) && wj50.m88271j(this.f160068e, nzd0Var.f160068e) && wj50.m88271j(this.f160069f, nzd0Var.f160069f);
    }

    public final int hashCode() {
        int iHashCode = (this.f160065b.hashCode() + (this.f160064a.hashCode() * 31)) * 31;
        v140 v140Var = this.f160066c;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        y7t0 y7t0Var = this.f160067d;
        int iHashCode3 = (iHashCode2 + (y7t0Var == null ? 0 : y7t0Var.hashCode())) * 31;
        erc1 erc1Var = this.f160068e;
        int iHashCode4 = (iHashCode3 + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        yfj yfjVar = this.f160069f;
        return iHashCode4 + (yfjVar != null ? yfjVar.hashCode() : 0);
    }
}
