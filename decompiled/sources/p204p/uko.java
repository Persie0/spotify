package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uko {

    /* JADX INFO: renamed from: a */
    public final v140 f231323a;

    /* JADX INFO: renamed from: b */
    public final erc1 f231324b;

    /* JADX INFO: renamed from: c */
    public final daj f231325c;

    /* JADX INFO: renamed from: d */
    public final jcl0 f231326d;

    /* JADX INFO: renamed from: e */
    public final y7t0 f231327e;

    /* JADX INFO: renamed from: f */
    public final byv f231328f;

    /* JADX INFO: renamed from: g */
    public final uff0 f231329g;

    /* JADX INFO: renamed from: h */
    public final uy80 f231330h;

    /* JADX INFO: renamed from: i */
    public final bob1 f231331i;

    /* JADX INFO: renamed from: j */
    public final thj f231332j;

    /* JADX INFO: renamed from: k */
    public final Boolean f231333k;

    public uko(v140 v140Var, erc1 erc1Var, daj dajVar, jcl0 jcl0Var, y7t0 y7t0Var, byv byvVar, uff0 uff0Var, uy80 uy80Var, bob1 bob1Var, thj thjVar, Boolean bool) {
        this.f231323a = v140Var;
        this.f231324b = erc1Var;
        this.f231325c = dajVar;
        this.f231326d = jcl0Var;
        this.f231327e = y7t0Var;
        this.f231328f = byvVar;
        this.f231329g = uff0Var;
        this.f231330h = uy80Var;
        this.f231331i = bob1Var;
        this.f231332j = thjVar;
        this.f231333k = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uko)) {
            return false;
        }
        uko ukoVar = (uko) obj;
        return wj50.m88271j(this.f231323a, ukoVar.f231323a) && wj50.m88271j(this.f231324b, ukoVar.f231324b) && wj50.m88271j(this.f231325c, ukoVar.f231325c) && wj50.m88271j(this.f231326d, ukoVar.f231326d) && wj50.m88271j(this.f231327e, ukoVar.f231327e) && wj50.m88271j(this.f231328f, ukoVar.f231328f) && wj50.m88271j(this.f231329g, ukoVar.f231329g) && wj50.m88271j(this.f231330h, ukoVar.f231330h) && wj50.m88271j(this.f231331i, ukoVar.f231331i) && wj50.m88271j(this.f231332j, ukoVar.f231332j) && wj50.m88271j(this.f231333k, ukoVar.f231333k);
    }

    public final int hashCode() {
        int iHashCode = this.f231323a.hashCode() * 31;
        erc1 erc1Var = this.f231324b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        daj dajVar = this.f231325c;
        int iHashCode3 = (iHashCode2 + (dajVar == null ? 0 : dajVar.hashCode())) * 31;
        jcl0 jcl0Var = this.f231326d;
        int iHashCode4 = (iHashCode3 + (jcl0Var == null ? 0 : jcl0Var.hashCode())) * 31;
        y7t0 y7t0Var = this.f231327e;
        int iHashCode5 = (iHashCode4 + (y7t0Var == null ? 0 : y7t0Var.hashCode())) * 31;
        byv byvVar = this.f231328f;
        int iM38547C = (iHashCode5 + (byvVar == null ? 0 : edb.m38547C(byvVar.f32324a))) * 31;
        uff0 uff0Var = this.f231329g;
        int iHashCode6 = (iM38547C + (uff0Var == null ? 0 : Boolean.hashCode(uff0Var.f229810a))) * 31;
        uy80 uy80Var = this.f231330h;
        int iHashCode7 = (iHashCode6 + (uy80Var == null ? 0 : uy80Var.hashCode())) * 31;
        bob1 bob1Var = this.f231331i;
        int iHashCode8 = (iHashCode7 + (bob1Var == null ? 0 : bob1Var.f29064a.hashCode())) * 31;
        thj thjVar = this.f231332j;
        int iHashCode9 = (iHashCode8 + (thjVar == null ? 0 : thjVar.f220443a.hashCode())) * 31;
        Boolean bool = this.f231333k;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }
}
