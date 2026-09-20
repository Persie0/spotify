package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class or11 {

    /* JADX INFO: renamed from: a */
    public final v140 f168417a;

    /* JADX INFO: renamed from: b */
    public final daj f168418b;

    /* JADX INFO: renamed from: c */
    public final drc1 f168419c;

    public or11(v140 v140Var, daj dajVar, drc1 drc1Var) {
        this.f168417a = v140Var;
        this.f168418b = dajVar;
        this.f168419c = drc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or11)) {
            return false;
        }
        or11 or11Var = (or11) obj;
        return wj50.m88271j(this.f168417a, or11Var.f168417a) && wj50.m88271j(this.f168418b, or11Var.f168418b) && wj50.m88271j(this.f168419c, or11Var.f168419c);
    }

    public final int hashCode() {
        v140 v140Var = this.f168417a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        daj dajVar = this.f168418b;
        int iHashCode2 = (iHashCode + (dajVar == null ? 0 : dajVar.hashCode())) * 31;
        drc1 drc1Var = this.f168419c;
        return iHashCode2 + (drc1Var != null ? drc1Var.hashCode() : 0);
    }
}
