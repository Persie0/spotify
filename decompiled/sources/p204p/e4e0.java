package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e4e0 {

    /* JADX INFO: renamed from: a */
    public final f5r0 f56062a;

    /* JADX INFO: renamed from: b */
    public final x430 f56063b;

    /* JADX INFO: renamed from: c */
    public final v140 f56064c;

    /* JADX INFO: renamed from: d */
    public final yfj f56065d;

    /* JADX INFO: renamed from: e */
    public final erc1 f56066e;

    /* JADX INFO: renamed from: f */
    public final p9c1 f56067f;

    /* JADX INFO: renamed from: g */
    public final ok11 f56068g;

    /* JADX INFO: renamed from: h */
    public final erc1 f56069h;

    /* JADX INFO: renamed from: i */
    public final g0w f56070i;

    /* JADX INFO: renamed from: j */
    public final thj f56071j;

    public e4e0(f5r0 f5r0Var, x430 x430Var, v140 v140Var, yfj yfjVar, erc1 erc1Var, p9c1 p9c1Var, ok11 ok11Var, erc1 erc1Var2, g0w g0wVar, thj thjVar) {
        this.f56062a = f5r0Var;
        this.f56063b = x430Var;
        this.f56064c = v140Var;
        this.f56065d = yfjVar;
        this.f56066e = erc1Var;
        this.f56067f = p9c1Var;
        this.f56068g = ok11Var;
        this.f56069h = erc1Var2;
        this.f56070i = g0wVar;
        this.f56071j = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4e0)) {
            return false;
        }
        e4e0 e4e0Var = (e4e0) obj;
        return wj50.m88271j(this.f56062a, e4e0Var.f56062a) && wj50.m88271j(this.f56063b, e4e0Var.f56063b) && wj50.m88271j(this.f56064c, e4e0Var.f56064c) && wj50.m88271j(this.f56065d, e4e0Var.f56065d) && wj50.m88271j(this.f56066e, e4e0Var.f56066e) && wj50.m88271j(this.f56067f, e4e0Var.f56067f) && wj50.m88271j(this.f56068g, e4e0Var.f56068g) && wj50.m88271j(this.f56069h, e4e0Var.f56069h) && wj50.m88271j(this.f56070i, e4e0Var.f56070i) && wj50.m88271j(this.f56071j, e4e0Var.f56071j);
    }

    public final int hashCode() {
        int iHashCode = this.f56062a.hashCode() * 31;
        x430 x430Var = this.f56063b;
        int iHashCode2 = (iHashCode + (x430Var == null ? 0 : x430Var.hashCode())) * 31;
        v140 v140Var = this.f56064c;
        int iHashCode3 = (iHashCode2 + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        yfj yfjVar = this.f56065d;
        int iHashCode4 = (iHashCode3 + (yfjVar == null ? 0 : yfjVar.hashCode())) * 31;
        erc1 erc1Var = this.f56066e;
        int iHashCode5 = (iHashCode4 + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        p9c1 p9c1Var = this.f56067f;
        int iHashCode6 = (iHashCode5 + (p9c1Var == null ? 0 : Long.hashCode(p9c1Var.f175214a))) * 31;
        ok11 ok11Var = this.f56068g;
        int iHashCode7 = (iHashCode6 + (ok11Var == null ? 0 : ok11Var.hashCode())) * 31;
        erc1 erc1Var2 = this.f56069h;
        int iHashCode8 = (iHashCode7 + (erc1Var2 == null ? 0 : erc1Var2.hashCode())) * 31;
        g0w g0wVar = this.f56070i;
        int iHashCode9 = (iHashCode8 + (g0wVar == null ? 0 : g0wVar.hashCode())) * 31;
        thj thjVar = this.f56071j;
        return iHashCode9 + (thjVar != null ? thjVar.f220443a.hashCode() : 0);
    }
}
