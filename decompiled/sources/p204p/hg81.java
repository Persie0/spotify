package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hg81 {

    /* JADX INFO: renamed from: a */
    public final v140 f91061a;

    /* JADX INFO: renamed from: b */
    public final v140 f91062b;

    /* JADX INFO: renamed from: c */
    public final thj f91063c;

    /* JADX INFO: renamed from: d */
    public final Boolean f91064d;

    public hg81(v140 v140Var, v140 v140Var2, thj thjVar, Boolean bool) {
        this.f91061a = v140Var;
        this.f91062b = v140Var2;
        this.f91063c = thjVar;
        this.f91064d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg81)) {
            return false;
        }
        hg81 hg81Var = (hg81) obj;
        return wj50.m88271j(this.f91061a, hg81Var.f91061a) && wj50.m88271j(this.f91062b, hg81Var.f91062b) && wj50.m88271j(this.f91063c, hg81Var.f91063c) && wj50.m88271j(this.f91064d, hg81Var.f91064d);
    }

    public final int hashCode() {
        v140 v140Var = this.f91061a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        v140 v140Var2 = this.f91062b;
        int iHashCode2 = (iHashCode + (v140Var2 == null ? 0 : v140Var2.hashCode())) * 31;
        thj thjVar = this.f91063c;
        int iHashCode3 = (iHashCode2 + (thjVar == null ? 0 : thjVar.f220443a.hashCode())) * 31;
        Boolean bool = this.f91064d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
