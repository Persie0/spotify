package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v6e0 {

    /* JADX INFO: renamed from: a */
    public final lar0 f237821a;

    /* JADX INFO: renamed from: b */
    public final f5r0 f237822b;

    /* JADX INFO: renamed from: c */
    public final f5r0 f237823c;

    /* JADX INFO: renamed from: d */
    public final v140 f237824d;

    /* JADX INFO: renamed from: e */
    public final thj f237825e;

    /* JADX INFO: renamed from: f */
    public final yfj f237826f;

    /* JADX INFO: renamed from: g */
    public final erc1 f237827g;

    /* JADX INFO: renamed from: h */
    public final p9c1 f237828h;

    public v6e0(lar0 lar0Var, f5r0 f5r0Var, f5r0 f5r0Var2, v140 v140Var, thj thjVar, yfj yfjVar, erc1 erc1Var, p9c1 p9c1Var) {
        this.f237821a = lar0Var;
        this.f237822b = f5r0Var;
        this.f237823c = f5r0Var2;
        this.f237824d = v140Var;
        this.f237825e = thjVar;
        this.f237826f = yfjVar;
        this.f237827g = erc1Var;
        this.f237828h = p9c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6e0)) {
            return false;
        }
        v6e0 v6e0Var = (v6e0) obj;
        return wj50.m88271j(this.f237821a, v6e0Var.f237821a) && wj50.m88271j(this.f237822b, v6e0Var.f237822b) && wj50.m88271j(this.f237823c, v6e0Var.f237823c) && wj50.m88271j(this.f237824d, v6e0Var.f237824d) && wj50.m88271j(this.f237825e, v6e0Var.f237825e) && wj50.m88271j(this.f237826f, v6e0Var.f237826f) && wj50.m88271j(this.f237827g, v6e0Var.f237827g) && wj50.m88271j(this.f237828h, v6e0Var.f237828h);
    }

    public final int hashCode() {
        lar0 lar0Var = this.f237821a;
        int iHashCode = (this.f237825e.f220443a.hashCode() + ((this.f237824d.hashCode() + ((this.f237823c.hashCode() + ((this.f237822b.hashCode() + ((lar0Var == null ? 0 : lar0Var.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31;
        yfj yfjVar = this.f237826f;
        int iHashCode2 = (iHashCode + (yfjVar == null ? 0 : yfjVar.hashCode())) * 31;
        erc1 erc1Var = this.f237827g;
        int iHashCode3 = (iHashCode2 + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        p9c1 p9c1Var = this.f237828h;
        return iHashCode3 + (p9c1Var != null ? Long.hashCode(p9c1Var.f175214a) : 0);
    }
}
