package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n3e0 {

    /* JADX INFO: renamed from: a */
    public final f5r0 f150037a;

    /* JADX INFO: renamed from: b */
    public final x430 f150038b;

    /* JADX INFO: renamed from: c */
    public final v140 f150039c;

    /* JADX INFO: renamed from: d */
    public final yfj f150040d;

    /* JADX INFO: renamed from: e */
    public final erc1 f150041e;

    public n3e0(f5r0 f5r0Var, x430 x430Var, v140 v140Var, yfj yfjVar, erc1 erc1Var) {
        this.f150037a = f5r0Var;
        this.f150038b = x430Var;
        this.f150039c = v140Var;
        this.f150040d = yfjVar;
        this.f150041e = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3e0)) {
            return false;
        }
        n3e0 n3e0Var = (n3e0) obj;
        return wj50.m88271j(this.f150037a, n3e0Var.f150037a) && wj50.m88271j(this.f150038b, n3e0Var.f150038b) && wj50.m88271j(this.f150039c, n3e0Var.f150039c) && wj50.m88271j(this.f150040d, n3e0Var.f150040d) && wj50.m88271j(this.f150041e, n3e0Var.f150041e);
    }

    public final int hashCode() {
        int iHashCode = (this.f150038b.hashCode() + (this.f150037a.hashCode() * 31)) * 31;
        v140 v140Var = this.f150039c;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        yfj yfjVar = this.f150040d;
        int iHashCode3 = (iHashCode2 + (yfjVar == null ? 0 : yfjVar.hashCode())) * 31;
        erc1 erc1Var = this.f150041e;
        return iHashCode3 + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
