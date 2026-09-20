package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r9f0 extends t9f0 {

    /* JADX INFO: renamed from: a */
    public final l0x0 f197051a;

    /* JADX INFO: renamed from: b */
    public final y511 f197052b;

    /* JADX INFO: renamed from: c */
    public final db31 f197053c;

    public r9f0(l0x0 l0x0Var, y511 y511Var, db31 db31Var) {
        this.f197051a = l0x0Var;
        this.f197052b = y511Var;
        this.f197053c = db31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9f0)) {
            return false;
        }
        r9f0 r9f0Var = (r9f0) obj;
        return wj50.m88271j(this.f197051a, r9f0Var.f197051a) && wj50.m88271j(this.f197052b, r9f0Var.f197052b) && wj50.m88271j(this.f197053c, r9f0Var.f197053c);
    }

    public final int hashCode() {
        l0x0 l0x0Var = this.f197051a;
        int iHashCode = (l0x0Var == null ? 0 : l0x0Var.f128529a.hashCode()) * 31;
        y511 y511Var = this.f197052b;
        int iHashCode2 = (iHashCode + (y511Var == null ? 0 : y511Var.f269306a.hashCode())) * 31;
        db31 db31Var = this.f197053c;
        return iHashCode2 + (db31Var != null ? db31Var.f47190a.hashCode() : 0);
    }
}
